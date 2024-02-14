import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> contactBook = new ArrayList<>();

    public void addContact(Contact a){
        contactBook.add(a);
    }


    @Override
    public String toString() {
        return "AddressBook{" +
                "contactBook=" + contactBook +
                '}';
    }
}
