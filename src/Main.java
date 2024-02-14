import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AddressBook myBook = new AddressBook();

        Contact person1 = new Contact("Mohannad Hussein", "109028@swcscd.us");
        myBook.addContact(person1);

        Contact person2 = new Contact("Killoran", "Killoran@gmail.com");
        myBook.addContact(person2);

        System.out.println("What is the person name");
        String name = input.nextLine();

        System.out.println("What is their email?");
        String email = input.nextLine();

        Contact person3 = new Contact(name,email);
        myBook.addContact(person3);
        System.out.println(myBook);





    }

}