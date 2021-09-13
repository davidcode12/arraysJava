import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayContacts {

    public static void main(String[] args) {

        int[] numbers = {32174838, 31165383, 312773828, 35034276, 312465778};
        String[] contacts = {"Aleja", "Santiago", "Nicole", "David", "Pipe"};
        boolean validation = true;

        while (validation) {

            System.out.println("Available contacts");
            for (int i = 0; i < contacts.length; i++) {
                System.out.println("\t" + contacts[i]);
            }
            System.out.println("Please, type a contact name");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();


            for (int i = 0; i < contacts.length; i++) {
                if (name.equals(contacts[i])) {
                    System.out.println(contacts[i] + "'s number is " + numbers[i]);
                }
            }
        }

    }
}
