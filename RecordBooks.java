package sys.library;

public class RecordBooks
{

    private String title;
    private String author;
    private String isbn;
    private boolean issued;

    public RecordBooks(String title, String author, String IsBn)
    {
        this.title = title;
        this.author = author;
        this.isbn = IsBn;
        this.issued = false;
    }

    public String getTitle()
    { 
    	return title; 
    }
    public String getAuthor()
    { 
    	return author; 
    }
    public String getIsbn()
    { 
    	return isbn; 
    }
    public boolean isIssued()
    { 
    	return issued; 
    }
    public void setIssued(boolean status)
    { 
    	this.issued = status; 
    }

    @Override
    public String toString()
    {
        return title + " by " + author + " (ISBN: " + isbn + ") " + (issued ? "[Taken]" : "[Available]");
    }
}

