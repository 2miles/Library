public class LibraryProject {
    public static void main(String[] args) {

        Library library1 = new Library();

        library1.addBook(library1.readBook());
        //library1.addBook(library1.readBook());


        library1.displayAll();

    }
}
