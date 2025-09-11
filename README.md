 Library Management System 
A simple **console-based Library Management System** built in Java.  
It supports adding books, issuing/returning them, checking availability, and searching by author.  
Unit testing is implemented using **JUnit 5**.

## 🚀 Features
- Add new books to the library (with validation for duplicate ISBN or duplicate title).
- Issue books (prevents double-issuing).
- Return books (ensures only issued books can be returned).
- Check availability of a book by ISBN.
- Show all books with status (Available/Taken).
- Search books by author.
- Exception handling with custom `UnavailableException`.
