
package domino;

public class Nodo {
    int ladoizq, ladoder;
    boolean orientation;

    public Nodo(int ladoizq, int ladoder, boolean orientation) {
        this.ladoizq = ladoizq;
        this.ladoder = ladoder;
        this.orientation = orientation; //true original, false volteada
    }

    public int getLadoizq() {
        return ladoizq;
    }

    public void setLadoizq(int ladoizq) {
        this.ladoizq = ladoizq;
    }

    public int getLadoder() {
        return ladoder;
    }

    public void setLadoder(int ladoder) {
        this.ladoder = ladoder;
    }

    public boolean isOrientation() {
        return orientation;
    }

    public void setOrientation(boolean orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
         if(orientation==false){
         return ladoder + "/"+ ladoizq;   
        }
        return ladoizq + "/"+ ladoder;
       
    }
    
}
