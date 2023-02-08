package Chapter1;
//https://howtodoinjava.com/java8/java-streams-by-examples/
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MiTry1VideoPOO {

    List<Empleados> employeeList = Empleados.getEmpleados();
    
    public static void main(String[] args) {
        new MiTry1VideoPOO().main2();
    }

    public  void main2() {        
           Double totalSalaryExpense = employeeList
                .stream()
                .map(emp -> emp.getSalary())
                .reduce(0.0, (a, b) -> a + b);
        System.out.println("Total salary expense: " + totalSalaryExpense+"\n");
        
      Map<String, List<Empleados>> empDept = 
        employeeList
                .stream()
                .collect( Collectors.groupingBy ( x -> x.getDept() ) ); 
      
        Set<Map.Entry<String, List<Empleados>>> entrySet = empDept.entrySet();
     
        System.out.println("");
        entrySet
                .stream()
                .forEach( 
                        entry1 -> System.out.println(" "
                                + entry1.getKey() + " "+entry1.getValue())
                );
        
        // Compute sum of salaries by department
        Map<String, Double> totalByDept
                = employeeList.stream()
                .collect(Collectors.groupingBy( x -> x.getDept(),
                          Collectors.summingDouble( x -> x.getSalary() ) )
                        );
       System.out.println("\n");
            totalByDept
                .entrySet()
                .stream()
                .forEach( 
                        entry1 -> System.out.printf(" %s %5.2f \n"
                            ,entry1.getKey() ,entry1.getValue())
                );
            System.out.println("");
    }//main2
    
    
}//class

/*

   for( Entry<String, List<Empleados> > etrSet : entrySet)
        {
            System.out.println(" "+ etrSet);
        }// for

*/