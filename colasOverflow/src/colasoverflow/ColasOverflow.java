
package colasoverflow;

public class ColasOverflow {
    public static frame Frame;
    public static frame cola [] = new frame [0];
    public static void main(String[] args) {
        for (int i=0;i<=1000000000;i++){
              expanderCola(new frame("a","a","a","a","a","a","a","a",i));
        }
    }
    public static void expanderCola(frame Fram){
        frame colaTemp[] = new frame [cola.length+1];
        colaTemp[cola.length]=Fram;
        cola = colaTemp.clone();
    }    
}
