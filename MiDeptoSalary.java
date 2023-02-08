package Chapter1;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MiDeptoSalary {

    public static void main(String[] args) {

        List<Person> listPersons = Person.createRoster1();
        List<Empleados> listEmp = Empleados.getEmpleados();
//        // Accumulate names into a List
        List<String> names = listPersons
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(" " + names);

//        // Accumulate names into a TreeSet elimina duplicates
        Set<String> setNames = listPersons
                .stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(" " + setNames);

//  Convert elements to strings and concatenate them, separated by commas
        String namesString = listPersons
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println(" " + namesString);

        // Compute sum of salaries of employee
        Double sumSalary = listEmp
                .stream()
                .collect(Collectors.summingDouble(e -> e.getSalary()));
        System.out.printf("Total Salarios %5.2f \n", sumSalary);
//
        // Group employees by department
        Map<String, List<Empleados>> mapDeptEMps = listEmp
                .stream()
                .collect(Collectors.groupingBy(Empleados::getDept));
        System.out.println(" " + mapDeptEMps);

        // Compute sum of salaries by department
        Map<String, Double> salaryDept = listEmp
                .stream()
                .collect(Collectors.groupingBy(Empleados::getDept,
                        Collectors.summingDouble(e -> e.getSalary())));

        salaryDept
                .entrySet() // entrySet trae la Key y el Value
                .stream()
                .forEach(
                  dept -> {  // lambda {}
                    System.out.printf(" %3s %5.2f \n"
                            , dept.getKey(), dept.getValue());
                        });

//      Map de salrios que ganan >= 10M y los menores 10M
        Map<Boolean, List<Empleados>> empBySalary = listEmp
                .stream()
                .collect(Collectors.partitioningBy(
                                s -> s.getSalary() >= 10000.0));
        empBySalary
                .entrySet() // entrySet trae la Key y el Value
                .stream()
                .forEach(
                        dept -> {  // lambda {}
                            String val = dept.getKey() ? "Salrio >=10M"
                                    : "Salario <10M";
                            System.out.printf(" %s  ", val);
                            List<Empleados> liEmp = dept.getValue();
                            liEmp
                                    .stream()
                                    .forEach( 
                                           emp -> {
                                    System.out.printf(" %s %5.2f ",
                                        emp.getName(), emp.getSalary()); }
                                    );  // for each Interno                         
                            System.out.println("");
                        }); // foreach externo
    }//main
}//class

/*
 for (Empleados emp : liEmp) {
                                System.out.printf(" %s %5.2f ",
                                        emp.getName(), emp.getSalary());
                            }
*/