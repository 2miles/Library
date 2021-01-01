public class Menu extends Util {

    protected String choice;  //users menu choice

    static final String MAIN_MENU = (
        " ------------------------------------- \n" +
        "|              MAIN MENU              |\n" +
        "|-------------------------------------|\n" +
        "|   0. Exit                           |\n" +
        "|   1. Add book                       |\n" +
        "|   2. Display all books              |\n" +
        " ------------------------------------- \n"
    );


    public void menuInterface(String prompt) {

        System.out.println(MAIN_MENU);
        System.out.print( "Enter your choice: ");
        this.choice = input.nextLine();
        clearScreen();
    }


    public void mainMenu(Library library) {
        String response = new String();

        do {
            menuInterface(MAIN_MENU);
            switch (choice) {

                case "0": //EXIT PROGRAM
                    break;

                case "1": { //ADD BOOK
                    library.addBook(library.readBook());
                    break;
                }
                case "2": { //DISPLAY ALL BOOKS
                    library.displayAll();
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        } while (!choice.equals("0"));

    }

}
