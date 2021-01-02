import java.io.Serializable;

public class Book extends Util implements Serializable {

    private String title;
    private Author author;
    private int year;


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
        System.out.println("Year: " + year);
    }

    //Reads a book from the user and returns the book read in
    public Book read() {

        //String tempTitle = new String();

        System.out.print("Enter Title: ");
        //tempTitle = input.nextLine();
        title = input.nextLine();
        title = toTitleCase(title);

        author.read();
        this.readYear();


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

    public void readYear() {

        boolean valid = false   ;
        while(!valid) {
            System.out.println("Enter the year (4 digits):  ");
            String tempYear = input.nextLine();
            year = isYearValid(tempYear);
            if(year == -1) {
                System.out.println("That was not a valid year");
                valid = false;
            }
            else valid = true;
        }

    }

    //returns -1 if the year entered was not valid
    private int isYearValid (String tempYear) {
        int year;
        for(int i = 0; i < tempYear.length(); ++i) {
            if(!Character.isDigit(tempYear.charAt(i))) {
                return -1;
            }
        }
        year = Integer.parseInt(tempYear);
        return year;
    }

}


