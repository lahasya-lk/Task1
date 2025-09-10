package sys.library;

import java.util.Scanner;

public class Home
{  
	    public static void main(String[] args)
	    {
	        LibraryManagement library = new LibraryManagement();
	        Scanner sc = new Scanner(System.in);

	        while (true)
	        {
	            System.out.println("\n.... Library Menu ....");
	            System.out.println("1. Add Book");
	            System.out.println("2. Issue Book");
	            System.out.println("3. Return Book");
	            System.out.println("4. Check Availability");
	            System.out.println("5. Show All Books");
	            System.out.println("6. Search by Author");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice: ");

	            if (!sc.hasNextInt())
	            {
	                System.out.println("Please enter a valid number.");
	                sc.nextLine();
	                continue;
	            }

	            int ch = sc.nextInt();
	            sc.nextLine();
                try
	            {
	                if (ch == 1)
	                {
	                    String t = "", a = "", i = "";
	                    System.out.print("Enter Title: "); 
	                    t = sc.nextLine();
	                    System.out.print("Enter Author: "); 
	                    a = sc.nextLine();
	                    System.out.print("Enter ISBN: "); 
	                    i = sc.nextLine();
	                    library.addNewBook(new RecordBooks(t, a, i));
	                    System.out.println("Book is added .");
	                }
	                else if (ch == 2)
	                {
	                	System.out.print("Enter ISBN to issue: ");
	                    String isbn = sc.nextLine();
	                    library.issueBook(isbn);
	                    System.out.println("Book is issued.");
	                } 
	                else if (ch == 3) 
	                {
	                	System.out.print("Enter ISBN to return: ");
	                    String isbn = sc.nextLine();
	                    library.returnBook(isbn);
	                    System.out.println("Book is returned.");
	                } 
	                else if (ch == 4)
	                {
	                	System.out.print("Enter ISBN to check availability: ");
	                    String isbn = sc.nextLine();
	                    System.out.println("Available: " + library.isBookAvailable(isbn));
	                }
	                else if (ch == 5) 
	                	library.showAllBooks();
	                else if (ch == 6) 
	                {
	                	System.out.print("Enter author name: ");
	                	library.searchByAuthor(sc.nextLine());}
	                else if (ch == 7) 
	                { 
	                	System.out.println("Exiting..");
	                	break;}
	                else
	                {
	                	System.out.print("Invalid choice");
	                }
	            }
	                
	            catch (Exception e) 
	            {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }
	        sc.close();
	    }
	}


