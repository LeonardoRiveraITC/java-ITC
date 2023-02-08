
package metodoinsercion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MetodoInsercion {


    public static void main(String[] args) {
     long TInicio, TFin, tiempo; 
     String valo="10";
     for(int i=0; i<5;i++){
     Integer valores[]=arrayMil(Integer.valueOf(valo));         
     TInicio = System.currentTimeMillis();           
     bubbleSort(valores);
     TFin = System.currentTimeMillis(); 
     tiempo = TFin - TInicio;
     System.out.println("tiempo de bubble sort con " +valo+" valores : "+tiempo);
     TInicio = System.currentTimeMillis(); 
     shellSort(valores);
     TFin = System.currentTimeMillis(); 
     tiempo = TFin - TInicio;
     System.out.println("tiempo de shell sort con " +valo+ " valores : "+tiempo); 
     valo+="0";
     }
        
    }
public static Integer[] bubbleSort (Integer[] lista) {
	int i,j,temp = 0;
	for (i=0; i<lista.length-1;i++) {
		for (j=0;j<lista.length-1 -i;j++) {
			if (lista[j]>lista[j+1]) {
				temp = lista[j];
				lista[j] =lista[j+1];
				lista[j+1] = temp;
			}
		}
	}
	return lista;
        
}
    public static Integer[] arrayMil(int n) {
        Integer array[]=new Integer[n];
        for (int i=0;i<n;i++){
            array[i]=i;
        }

        List<Integer> intList = Arrays.asList(array);
        Collections.shuffle(intList);
        intList.toArray(array);
       return array;        
     }   

    public static Integer[] shellSort(Integer arr[])
    {
        int n = arr.length;
 
        for (int gap=n/2;gap>0;gap/= 2)
        {
            for (int i=gap;i<n;i+=1)
            {
                int temp = arr[i];
                int j;
                for (j=i; j>=gap&&arr[j-gap]> temp; j-=gap)
                    arr[j] = arr[j-gap];
                arr[j] = temp;
            }
        }
        return arr;
    }                
}
