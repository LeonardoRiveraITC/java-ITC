
package programa1luisleonardoriveratierrafria19030342;

import java.time.LocalDate;

public class Games {
   private String name;
   private String plataform;
   private String format;
   private LocalDate releaseDate;
   private Company company;

    public Games(String name, String plataform, String format, LocalDate releaseDate, Company company) {
        this.name = name;
        this.plataform = plataform;
        this.format = format;
        this.releaseDate = releaseDate;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getPlataform() {
        return plataform;
    }

    public String getFormat() {
        return format;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Juegos{" + "name=" + name + ", plataform=" + plataform + ", format=" + format + ", releaseDate=" + releaseDate + ", company=" + company + '}';
    }
   
}

enum Company {
    CAPCOM,TEAM_SHANGAI_ALICE,BETHESDA,INDIE_DEVELOPER,STEAM
}