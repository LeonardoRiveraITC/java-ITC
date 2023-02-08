package Chapter1;
import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;
class Employee {
  public static enum Gender {  MALE, FEMALE   }
  private long id; private String name; private Gender gender;
  private LocalDate dob;  private double income;
  public Employee(long id,String name,Gender gender,LocalDate dob,double income) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.dob = dob;
    this.income = income;
  }
  public long getId() {
        return id;
    }
  public Gender getGender() {
    return gender;
  }
  public boolean isMale() {
    return this.gender == Gender.MALE;
  }
  public boolean isFemale() {
    return this.gender == Gender.FEMALE;
  }
  public void setGender(Gender gender) {
    this.gender = gender;
  }
  public String getName() {
        return name;
    }
  public double getIncome() {
    return income;
  }
  public void setIncome(double income) {
    this.income = income;
  }  
  public LocalDate getDob() {
    return dob;
  }
 // public static List<Employee> persons() {
      public static Map <Long,Employee >   persons() {
    Employee p1 = new Employee(1, "Jake", Gender.MALE,
            LocalDate.of(1971, Month.JANUARY, 1), 2343.0);
    Employee p2 = new Employee(2, "Liz", Gender.FEMALE, 
            LocalDate.of(1972, Month.JULY, 21), 7100.0);
    Employee p3 = new Employee(3, "Pedro", Gender.MALE, 
            LocalDate.of(1973, Month.MAY, 29), 5455.0);
    Employee p4 = new Employee(4, "Luz", Gender.FEMALE,
            LocalDate.of(1974, Month.OCTOBER, 16), 1800.0);
    Employee p5 = new Employee(5, "Jesus", Gender.MALE,
            LocalDate.of(1975, Month.DECEMBER, 13), 1234.0);
    Employee p6 = new Employee(6, "Jason", Gender.MALE, 
            LocalDate.of(1976, Month.JUNE, 9), 3211.0);
  //  List<Employee> persons = Arrays.asList
    //    (p1, p2, p3, p4, p5, p6);
    Map <Long,Employee > map1 = new TreeMap<>();
    map1.put(p1.id, p1);map1.put(p2.id, p2);map1.put(p3.id, p3);
    map1.put(p4.id, p4);map1.put(p5.id, p5);map1.put(p6.id, p6);
    return map1;
  }
  @Override
  public String toString() {
    String str = String.format("(%s, %s,  %s,  %s,  %.2f)\n", id, name, gender,
        dob, income);
    return str;
  }
}
