
package programa1luisleonardoriveratierrafria19030342;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Developer {
    private String name;
    private String nationality;
    private LocalDate birthDate;
    private Company company;
    
    public Developer(String name, String nationality, LocalDate birthDate, Company company) {
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.company= company;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Company getCompany() {
        return company;
    }

        public String getCompanyString() {
        return company.toString();
    }
    @Override
    public String toString() {
        return "Developer{" + "name=" + name + ", nationality=" + nationality + ", Birth Date=" + birthDate + ", company=" + company + '}';
    }
   

enum Company{
    CAPCOM,TEAM_SHANGAI_ALICE,BETHESDA,INDIE_DEVELOPER,STEAM
    
}
}