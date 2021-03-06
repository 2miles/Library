import java.io.Serializable;

public class Author extends Util implements Serializable {

    private String firstName;
    private String middleName;
    private String lastName;



    public Author()
    {
        this("","", "");
    }

    public Author(Author author)
    {
        this(author.lastName, author.firstName ,author.middleName );
    }

    public Author(String last, String first)
    {
        this(last,first, "");
    }

    public Author(String last, String first, String middle)
    {
        lastName = new String(last);
        firstName = new String(first);
        middleName = new String(middle);
    }


    public void display()
    {
        if(!middleName.equals(""))
            System.out.println(firstName + ' ' + middleName + ' ' + lastName);
        else
            System.out.println(firstName + ' ' + lastName);
    }


    public void read()
    {
        System.out.print("Enter authors first name, or initial: ");
        firstName = input.nextLine();
        System.out.print("Enter authors middle name, or initial (press enter if none): ");
        middleName = input.nextLine();
        System.out.print("Enter authors last name, or initial: ");
        lastName = input.nextLine();
        this.capitalizeName();
    }


    // capitalize first letter of each name
    public void capitalizeName()
    {
        lastName = toTitleCase(lastName);
        middleName = toTitleCase(middleName);
        firstName = toTitleCase(firstName);
    }


    public int compareTo(Author author)
    {
        String thisLastNameFirst = lastName + firstName + middleName;
        String thatLastNameFirst = author.lastName + author.firstName + author.middleName;
        return thisLastNameFirst.compareTo(thatLastNameFirst);
    }

}


