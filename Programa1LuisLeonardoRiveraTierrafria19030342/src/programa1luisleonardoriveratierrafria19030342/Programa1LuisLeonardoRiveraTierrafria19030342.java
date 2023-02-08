
package programa1luisleonardoriveratierrafria19030342;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import programa1luisleonardoriveratierrafria19030342.Developer.Company;



public class Programa1LuisLeonardoRiveraTierrafria19030342 {


    public static void main(String[] args) {
        ArrayList<Developer> devs = new ArrayList<>();
        devs.add(new Developer("ZUN", "Japanese",LocalDate.ofYearDay(1977, 77), Developer.Company.TEAM_SHANGAI_ALICE));
        devs.add(new Developer("Toby Fox", "American",LocalDate.ofYearDay(1991, 284), Developer.Company.INDIE_DEVELOPER));
        devs.add(new Developer("Todd Howard", "American",LocalDate.ofYearDay(1971, 115), Developer.Company.BETHESDA));
        devs.add(new Developer("Gabe Newell", "American",LocalDate.ofYearDay(1971, 115), Developer.Company.STEAM));     
        System.out.println(devs.get(0).getCompany());

              
    }
    
}
