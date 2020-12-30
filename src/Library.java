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


    //Add book into library in alphabetical order
    public void addBook(Book to_add) {
        if(books.size() == 0)
            books.add(to_add);
        else {
            for (int i = 0; i < books.size(); ++i) {
                if (to_add.compareTo(books.get(i)) < 0) {
                    books.add(i, to_add);
                    return;
                }
            }
            books.add(to_add);
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


