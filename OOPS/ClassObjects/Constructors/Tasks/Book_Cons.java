class Book{
    String title;
    String author;
    double pub_year;

    Book(String title , String author , double pub_year){
        this.title = title;
        this.author = author;
        this.pub_year = pub_year;
    }
    void getBookdetails(){
        System.out.println("Book Title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book Publication Year: " + pub_year);
    }

}

public class Book_Cons {
    public static void main(String[] args) {
        Book b1 = new Book("Wings Of Fire", "APJ Abdul Kalam", 1996);

        b1.getBookdetails();
    }
}
