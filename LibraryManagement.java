package sys.library;
import java.util.*;

public class LibraryManagement implements Action
{

	    private Map<String, RecordBooks> catalog = new HashMap<>();

	    public void addNewBook(RecordBooks book) throws Exception
	    {
	        if (catalog.containsKey(book.getIsbn())) throw new Exception("Duplicate ISBN found!");
	        for (RecordBooks b : catalog.values())
	        {
	            if (b.getTitle().equalsIgnoreCase(book.getTitle())) throw new Exception("Book with same title exists!");
	        }
	        catalog.put(book.getIsbn(), book);
	    }

	    @Override
	    public void issueBook(String isbn) throws UnavailableException 
	    {
	        RecordBooks b = catalog.get(isbn);
	        if (b == null) throw new UnavailableException("No book found with this ISBN.");
	        if (b.isIssued()) throw new UnavailableException("Book is already issued!");
	        b.setIssued(true);
	    }

	    @Override
	    public void returnBook(String isbn) throws Exception 
	    {
	        RecordBooks b = catalog.get(isbn);
	        if (b == null) throw new Exception("This ISBN does not exist in library.");
	        if (!b.isIssued()) throw new Exception("This book was never issued.");
	        b.setIssued(false);
	    }

	    public boolean isBookAvailable(String isbn)
	    {
	        RecordBooks b = catalog.get(isbn);
	        if (b == null) return false;
	        return !b.isIssued();
	    }

	    public void showAllBooks()
	    {
	        if (catalog.isEmpty()) System.out.println("No books in library yet.");
	        else for (RecordBooks b : catalog.values()) System.out.println(b);
	    }

	    public void searchByAuthor(String author)
	    {
	        boolean found = false;
	        for (RecordBooks b : catalog.values())
	        {
	            if (b.getAuthor().equalsIgnoreCase(author))
	            {
	                System.out.println(b);
	                found = true;
	            }
	        }
	        if (!found) System.out.println("No books found for this author.");
	    }
    }



 
