import java.util.Scanner;

public class Author {

    private String firstName;
    private String middleName;
    private String lastName;
    private Scanner input;



    public Author() {
        this("","", "");
    }
    public Author(Author author) {
        this(author.lastName, author.firstName ,author.middleName );
    }

    public Author(String last, String first){
        this(last,first, "");
    }

    public Author(String last, String first, String middle) {
        lastName = new String(last);
        firstName = new String(first);
        middleName = new String(middle);
    }


    public void display() {
        if(!middleName.equals(""))
            System.out.print(firstName + ' ' + middleName + ' ' + lastName);
        else
            System.out.print(firstName + ' ' + lastName);
    }


    public void read(Scanner input) {

        System.out.print("Enter authors first name, or initial: ");
        firstName = input.nextLine();
        System.out.print("Enter authors middle name, or initial (press enter if none): ");
        middleName = input.nextLine();
        System.out.print("Enter authors last name, or initial: ");
        lastName = input.nextLine();
        this.capitalizeName();
    }


    public void capitalizeName() {
        // capitalize first letter of each name
        if(!lastName.equals(""))
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        if(!firstName.equals(""))
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        if(!middleName.equals(""))
            middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
    }



    public int compareTo(Author author) {
        String thisLastNameFirst = lastName + firstName + middleName;
        String thatLastNameFirst = author.lastName + author.firstName + author.middleName;
        return thisLastNameFirst.compareTo(thatLastNameFirst);
    }

}


