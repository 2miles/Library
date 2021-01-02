import java.io.*;

public class LibraryProject {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "save.bin";
        Library library1 = new Library();

        try {
            ObjectInputStream iStream = new ObjectInputStream(new FileInputStream(fileName));
            library1 = (Library) iStream.readObject();
            iStream.close();



        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Menu menu = new Menu();

        menu.mainMenu(library1);


        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            os.writeObject(library1);
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
