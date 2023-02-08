
package programa2;


public class Personas {
    private String name;
    private String profession;
    private String contact;
    private String role;

    public Personas(String name, String profession, String contact, String role) {
        this.name = name;
        this.profession = profession;
        this.contact = contact;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getContact() {
        return contact;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Personas{" + "name=" + name + ", profession=" + profession + ", contact=" + contact + ", role=" + role + '}';
    }
    
}
