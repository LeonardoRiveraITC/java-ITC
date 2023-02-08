
package programa2;

import java.time.LocalDate;
import java.time.LocalTime;


public class Evento {
    private String name;
    private String theme;
    private LocalDate scheduled;
    private String location;
    private Personas host;

    public Evento(String name, String theme, LocalDate scheduled, String location, Personas host) {
        this.name = name;
        this.theme = theme;
        this.scheduled = scheduled;
        this.location = location;
        this.host = host;
    }



    public String getName() {
        return name;
    }

    public String getTheme() {
        return theme;
    }

    public LocalDate getScheduled() {
        return scheduled;
    }

    @Override
    public String toString() {
        return "Evento{" + "name=" + name + ", theme=" + theme + ", scheduled=" + scheduled + ", location=" + location + ", host=" + host + '}';
    }

    public String getLocation() {
        return location;
    }
    
    
}
