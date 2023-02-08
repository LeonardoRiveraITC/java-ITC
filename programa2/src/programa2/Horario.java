
package programa2;

import java.time.LocalTime;


public class Horario {
    private String nombreEvento;
    private String urlDelEvento;
    private LocalTime schedules;
    private LocalTime schedulesEnd;
    private Evento event;

    public Horario(String nombreEvento, String urlDelEvento, LocalTime schedules, Evento event,LocalTime schedulesEnd) {
        this.nombreEvento = nombreEvento;

        this.urlDelEvento = urlDelEvento;
        this.schedules = schedules;
        this.event = event;
        this.schedulesEnd=schedulesEnd;
    }
    
    public String getNombreEvento() {
        return nombreEvento;
    }

    public LocalTime getSchedules() {
        return schedules;
    }

    public LocalTime getSchedulesEnd() {
        return schedulesEnd;
    }

    public Evento getEvent() {
        return event;
    }


    public String getUrlDelEvento() {
        return urlDelEvento;
    }

    @Override
    public String toString() {
        return "Horario{" + "nombreEvento=" + nombreEvento + ", urlDelEvento=" + urlDelEvento + ", schedules=" + schedules + ", schedulesEnd=" + schedulesEnd + ", event=" + event + '}';
    }
    
}
