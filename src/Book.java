
import java.util.Scanner;

public class Book {

    private Scanner input;
    private String title;
    private String author;
    private int pageCount;
    private final String[] statusList = new String[]{ "Unread", "Reading", "Read"};
    private int status;
    private int bookmark;


    public Book(Book to_copy) {
        this.title = to_copy.title;
        this.author = to_copy.author;
        this.pageCount = to_copy.pageCount;
        this.status = to_copy.status;
        this.bookmark = to_copy.bookmark;
    }

    public Book(String title, String author, int pageCount, int status, int bookmark) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.status = status;
        this.bookmark = bookmark;
    }

    public Book(String title, String author, int pageCount, int status) {
        this(title, author, pageCount, status, 0);
    }
    public Book(String title, String author, int pageCount) {
        this(title, author, pageCount, 0);
    }
    public Book(String title, String author){
        this(title, author, -1);
    }
    public Book(String title) {
        this(title, "Unknown");
    }
    public Book() {
        this("Unknown");
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pageCount);
        System.out.println("Status: " + this.statusList[status]);
        System.out.println("Bookmark: " + this.bookmark);
    }

    //Reads a book from the user and returns the book read in
    public Book read() {

        input = new Scanner(System.in);

        System.out.print("Enter Title: ");
        this.title = input.nextLine();

        System.out.print("Enter Author: ");
        this.author = input.nextLine();

        System.out.print("Enter number of pages: ");
        this.pageCount = input.nextInt();
        input.nextLine();

        System.out.print("Enter status (0-2)(0: Unread, 1: read ,2: reading): ");
        this.status = input.nextInt();
        input.nextLine();

        System.out.print("Enter Bookmark page number: ");
        this.bookmark = input.nextInt();
        input.nextLine();

        return this;
    }

    //Lexicographically compares this books author and title with the arg books title and author
    //Returns positive if arg is greater than this
    //Returns negative if arg is less than this
    //Returns 0 is same title and author
    int compareTo (Book to_compare) {
        String thisTitleAndAuthor = this.author + this.title;
        String thatTitleAndAuthor = to_compare.author + to_compare.title;
        return thisTitleAndAuthor.compareTo(thatTitleAndAuthor);
    }


}
