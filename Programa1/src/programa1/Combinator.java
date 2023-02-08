
package programa1;

public class Combinator {
 private final String name;
 private final String email;
 private final String honeNumber;
 private final String dateOfBirth;

    public Combinator(String name, String email, String honeNumber, String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.honeNumber = honeNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getHoneNumber() {
        return honeNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

 
 
}
