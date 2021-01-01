import java.util.ArrayList;

public class Library {

    private String name;     //Name for this library
    private String location;  //home address, computer
    private String kindOfLibrary;  //physical, digital, audio

    private ArrayList<Book> books;


    public Library() {

        name = "Main Collection";
        location = "69420 ne Fremont st";
        kindOfLibrary = "Physical";
        books = new ArrayList<Book>();
    }

    //read book info from user into a new book
    //Retrun reference to that new book.
    public Book readBook() {
        Book toAdd = new Book();
        return toAdd.read();
    }


    //Add book into library in alphabetical order
    public void addBook(Book book) {

        //if the library is empty add the first book
        if(books.size() == 0)
            books.add(book);
        //lexogaphly compare bookToAdd author and title with each book
        //when bookToAdd is greater than current book,inset after current book
        else {
            for (int i = 0; i < books.size(); ++i) {
                if (book.compareTo(books.get(i)) < 0) {
                    books.add(i, book);
                    return;
                }
            }
            //bookToAdd is greater than any book ih the library, so append it to the list
            books.add(book);
        }
    }


    public void displayAll() {

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Type: " + kindOfLibrary);
        System.out.println("---------------------------------");
        System.out.println("Books: ");
        for (int i = 0; i < books.size(); ++i) {
            System.out.println("book " + (i + 1));
            books.get(i).display();
            System.out.println();
        }


    }
}


