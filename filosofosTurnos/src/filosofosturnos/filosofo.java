package filosofosturnos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class filosofo extends Thread {

    boolean tenedorIzq, tenedorDer;
    String estado = "pensando";
    int hambre = 100;
    boolean turno;
    String nombre = "";
    filosofo derecha;

    filosofo(boolean turn, boolean tenedoriz, boolean tenedorde, String nombr) {
        turno = turn;
        tenedorIzq = tenedoriz;
        tenedorDer = tenedorde;
        nombre = nombr;
    }

    boolean comer() {
        if (tenedorIzq && tenedorDer && turno) {
            tenedorIzq = false;
            tenedorDer = false;
            estado = "comer";
            turno = false;
            return true;
        } else {
            estado = "esperando";
            return false;
        }
    }

    void setDerecha(filosofo der) {
        derecha = der;
    }

    String getEstado() {
        return ("Hambre de " + nombre + " " + String.valueOf(hambre) + " estado de " + nombre + " " + estado);
    }

    public synchronized void run() {
        while (true) {
            hambre -= 1;
            System.out.println(hambre + " " + nombre + " " + estado);
            if (hambre <= 20) {
                System.out.println(hambre + " " + nombre + " " + estado);
                if (!comer()) {
                    if (hambre <= 0) {
                        estado = "muerto";
                        System.out.println("Ha muerto " + nombre);
                        System.exit(0);
                    }
                } else {
                    tenedorIzq = true;
                    tenedorDer = true;
                    hambre = 100;
                    derecha.turno = true;
                    estado = "pensando";

                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(filosofo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
