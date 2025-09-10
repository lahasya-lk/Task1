package sys.library;

public interface Action
{
	 void issueBook(String IsBn) throws Exception;
	 void returnBook(String IsBn) throws Exception;
}
