
package Chapter1;
import java.util.Arrays;
import java.util.List;
public class Empleados{
        private String name;   private Integer age; 
        private Double salary; private String dept;
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Double getSalary() {
        return salary;
    }
    public String getDept() {
        return dept;
    }
    public Empleados(String name, Integer age, Double salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }
  @Override
  public String toString(){
    return this.name
      +"  "+this.age
      +"  "+this.salary;
  } 
  public static List<Empleados> getEmpleados(){   
      List<Empleados> empleados = Arrays.asList(
       new Empleados("Tom Jones",     45,  7000.6, "A"),
       new Empleados("Harry Major",   25, 14000.7, "A"),
       new Empleados("Ethan Hardy",   65,  8000.0, "B"),
       new Empleados("Nancy Smith",   22, 12000.6, "C"),
       new Empleados("Deborah Trust", 29,  9000.7, "B") );
      return empleados;
  };
}