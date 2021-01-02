
public class Book extends Util {

    private String title;
    private Author author;


    public Book(Book book) {
        this.title = new String(book.title);
        this.author = new Author(book.author);
    }

    //default constructor
    public Book() {
        title = "Unknown";
        author = new Author();
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.print("Author: ");
        author.display();
    }

    //Reads a book from the user and returns the book read in
    public Book read() {

        //String tempTitle = new String();

        System.out.print("Enter Title: ");
        //tempTitle = input.nextLine();
        title = input.nextLine();
        title = toTitleCase(title);

        author.read();

        return this;
    }

    //Lexicographically compares this books author and title with the arg books title and author and title
    //Returns 1 if this is greater than arg
    //Returns -1 if this is less than arg
    int compareTo(Book book) {
        if (this.author.compareTo(book.author) >= 0) {
            //author doesnt already exist or we reached this authors section
            //now compare the title
            if (this.title.compareTo(book.title) > 0)
                return 1;
        }
        return -1;
    }
}
