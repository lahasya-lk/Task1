package sys.test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sys.library.*;
import static org.junit.jupiter.api.Assertions.*;
//testing using JUnits
public class test
{
    private LibraryManagement library;

    @BeforeEach
    public void setUp() throws Exception 
    {
        library = new LibraryManagement();
        library.addNewBook(new RecordBooks("God Of Wrath", "SKH", "135"));
    }

    @Test
    public void testIssueBook() throws Exception
    {
        library.issueBook("135");
        assertFalse(library.isBookAvailable("135"));
    }

    @Test
    public void testReturnBook() throws Exception
    {
        library.issueBook("135");
        library.returnBook("135");
        assertTrue(library.isBookAvailable("135"));
    }

    @Test
    public void testIsAvailableInitially()
    {
        boolean available = library.isBookAvailable("135");
        assertTrue(available);
    }
}