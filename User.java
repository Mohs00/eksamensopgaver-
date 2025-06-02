public class User {
    private String name;
    private String password;
    private String email;
    private String phoneNumber;

    // person 1 – name og password
    public User(String name, String password) {
        setName(name);
        this.password = password;
    }

    // person 2 – name, password, email
    public User(String name, String password, String email) {
        setName(name);
        this.password = password;
        setEmail(email);
    }

    // person 3 – name, password, email, phoneNumber
    public User(String name, String password, String email, String phoneNumber) {
        setName(name);
        this.password = password;
        setEmail(email);
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null && name.length() <= 12 && Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        } else {
            System.out.println("Navn skal starte med stort bogstav og være max 12 tegn.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // Validering: skal indeholde '@'
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email skal indeholde '@'");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString-metode
    public String toString() {
        String result = "Navn: " + name + ", Password: " + password;
        if (email != null) {
            result += ", Email: " + email;
        }
        if (phoneNumber != null) {
            result += ", Telefon: " + phoneNumber;
        }
        return result;
    }
}
