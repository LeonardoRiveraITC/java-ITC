
package arraymillon;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMillon {

    public static void main(String[] args) {
         long TInicio, TFin, tiempo; 
         TInicio = System.currentTimeMillis();
        Integer array[]=new Integer[1000000];
        for (int i=0;i<1000000;i++){
            array[i]=i;
        }

        List<Integer> intList = Arrays.asList(array);
        Collections.shuffle(intList);
        intList.toArray(array);
        for(int i=0;i<=100;i++){
            System.out.println(array[i]);
        }        
        

        TFin = System.currentTimeMillis(); 
        tiempo = TFin - TInicio; 
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); 
     }           
 }
    

