
class Book{
    int bookId;
    String title;
    String author;
    String genre;
    int publicationYear;
    boolean isAvailable;
    String shelfLocation;
    
    void setbookdetails(int bookId,String title,String author, String genre , int publicationYear, boolean isAvailable , String shelfLocation ){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
        this.shelfLocation = shelfLocation;
    }
    void getbookdetails(){
        System.out.println("Book Id: "+ bookId);
        System.out.println("Book Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Genre: "+ genre);
        System.out.println("Publication Year: "+ publicationYear);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));        
        System.out.println("Shelf Location: "+ shelfLocation);
        
    }
    
}

class Library{
    private Book[] books = new Book[10];
    private int bookcnt = 0;

    void addBook(Book book){
        if (bookcnt < books.length) {
            books[bookcnt] = book;
            bookcnt++;
            System.out.println("Book added Successfully");
            System.out.println("\n");
        }else{
            System.out.println("Library Is full.Cannot add more books.");
        }
    }
    void removebook(int bookId){
        for (int i = 0; i < bookcnt; i++) {
            if (books[i].bookId == bookId) {
                for (int j = 0; j < bookcnt; j++) {
                    books[j] = books[j+1];
                }
                books[bookcnt - 1] = null;
                bookcnt--;
                System.out.println("Book removed Successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
    void display(){
        if(bookcnt == 0){
            System.out.println("No books is available in the library");
        }else {
            for (int i = 0; i < bookcnt; i++) {
                books[i].getbookdetails();
                System.out.println("\n");
                System.out.println("-------------------------------------------");
            }
        }
    }
}
 
public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book();
        book1.setbookdetails(1001, "Wings Of Fire", "APJ Abdul Kalam", "Real Life Story", 2005, true, "A10");

        Book book2 = new Book();
        book2.setbookdetails(1002, "1984", "George Orwell", "Fiction", 1949, true, "B5");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Displaying all Books\n");
        library.display();

        library.removebook(1002);

        System.out.println("Displaying after removing books");
        library.display();
    }
    
}