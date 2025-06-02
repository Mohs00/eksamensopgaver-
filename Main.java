import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Opretter User-objekter med forskellige konstruktører
        User u1 = new User("Anders", "abc123");
        User u2 = new User("Bo", "pass123", "bo@email.dk");
        User u3 = new User("Clara", "123456", "clara@email.dk", "12345678");
        User u4 = new User("david", "kode"); // Skal vise fejl (starter ikke med stort)

        // Vi Udskriver brugere
        System.out.println("\nBruger info:");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4); // måske ikke valid

        // Opretter en liste og sorter den
        ArrayList<User> userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);

        // Sorter alfabetisk efter navn
        userList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));

        System.out.println("\nSorterede brugere:");
        for (User u : userList) {
            System.out.println(u.getName());
        }
    }
}
