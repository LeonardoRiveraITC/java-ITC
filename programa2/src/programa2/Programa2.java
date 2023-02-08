
package programa2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Programa2 {

    
    public static void main(String[] args) {
        List<Personas> hosts = Arrays.asList(new Personas("Carlos López", "Programador junior", "CarlosLopez@gmail.com", "Host"),
                new Personas("Maria Perez", "Pentester", "Mariapez@itcelaya.edu.mx", "Host")
               ,new Personas("Leonardo Sanchez", "Investigador", "LrdSchz@yahoo.com", "Host"));
        List<Evento> eventos= Arrays.asList(
                new Evento("Seguridad informatica en las instituciones", "Seguridad", LocalDate.of(2020, 8, 14), "Auditorio tres guerras", hosts.get(0)),
                new Evento("Programación para todos", "Programación", LocalDate.of(2020, 8, 14), "Auditorio tres guerras", hosts.get(1)),
                new Evento("Futuro de las computadoras cuánticas ", "Computación cuántica", LocalDate.of(2020, 8, 15), "Auditorio tres guerras", hosts.get(2)));
        List<Horario> horarios = Arrays.asList(new Horario("Seguridad informatica en las instituciones", "itcelaya.edu.mx/evento", LocalTime.of(12, 0), eventos.get(0),LocalTime.of(14, 0)),
                new Horario("Programación para todos", "itcelaya.edu.mx/evento", LocalTime.of(14, 0), eventos.get(1),LocalTime.of(16, 0)),
                new Horario("Futuro de las computadoras cuánticas", "Solo Presencial", LocalTime.of(12, 0), eventos.get(2),LocalTime.of(14, 0)));
         hosts.stream().forEach(System.out::println);
         eventos.stream().forEach(System.out::println);
         horarios.stream().forEach(System.out::println);
         
         Predicate <Evento>  isAHost = host -> host.getName().equals(hosts.stream().map(hos->hos.getName()));
         Predicate <Horario> isHourValid = hour-> hour.getSchedules().toSecondOfDay()==hour.getSchedulesEnd().toSecondOfDay();
         horarios.stream().forEach((t) -> {
         if (isHourValid.test(t))
             System.out.println("No hay Problemas con la organiazación");
             else
             System.out.println("Revisa los horarios, Hay conflictos con las horas!");
         });
         System.out.println("Días y horas de los eventos");
         eventos.stream().map(event-> event.getScheduled()).forEach(System.out::println);
         horarios.stream().map(str->str.getSchedules()).forEach(System.out::println);
         
   
         
         
    }
    
}
