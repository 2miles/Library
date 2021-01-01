
public class Book extends Util {

    private String title;
    private Author author;


    public Book(Book book) {
        title = new String(book.title);
        author = new Author(book.author);
    }

    //default constructor
    public Book(){
        title = "Unknown";
        author = new Author();
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.print("Author: ");
        author.display();
    }

    //Reads a book from the user and returns the book read in
    public Book read() {

        System.out.print("Enter Title: ");
        this.title = input.nextLine();

        this.author.read();
        this.capitalizeTitle();

        return this;
    }

    //Lexicographically compares this books author and title with the arg books title and author and title
    //Returns 1 if this is greater than arg
    //Returns -1 if this is less than arg
    int compareTo (Book book) {
        if(this.author.compareTo(book.author) >= 0)
        {
            //author doesnt already exist or we reached this authors section
            //now compare the title
            if(this.title.compareTo(book.title) > 0)
                return 1;
        }
        return -1;
    }

    private void capitalizeTitle() {

        if (!title.equals(""))
            title = title.substring(0, 1).toUpperCase() + title.substring(1);

        //need to exclude these words from capitalization
        //to , of , a , an, as, and, is, are,
        
        for(int i = 0; i < title.length() - 1; ++i) {
            if(title.charAt(i) == 32) {
                title =  title.substring(0, i + 1) +
                         title.substring(i + 1, i + 2).toUpperCase() +
                         title.substring(i + 2);
            }
        }
    }



}
