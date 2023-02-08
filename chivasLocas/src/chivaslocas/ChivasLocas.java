
package chivaslocas;

import java.util.Scanner;

public class ChivasLocas {
    static Scanner scanner = new Scanner (System.in);
    static int corral [][];
    static String [] valorescabras;
    static int contador;
    
    public static void main(String[] args) {
      String [] valores = scanner.nextLine().split(" ");
      valorescabras = scanner.nextLine().split(" ");
      contador=2;
      int renglones = Integer.valueOf(valores[0]);
      int columnas = Integer.valueOf(valores[1]);
      int cabras = Integer.valueOf(valorescabras[0]);
      
      if (validar(renglones, columnas, cabras)==true){
      corral = new int[renglones][columnas];
      for (int i=1;i<=cabras;i++){
          if(!(corral[Integer.valueOf(valorescabras[contador-1])][Integer.valueOf(valorescabras[contador])]==1)){
              if(pelea()==true){
              corral[Integer.valueOf(valorescabras[contador-1])][Integer.valueOf(valorescabras[contador])]=1;
              contador+=2;
                  
              }
              else{
                  System.out.println("NO");
                  contador = cabras+1;
              }
          }
          else{
              System.out.println("NO");
              contador=cabras+1;
          }
      }
      }
      else {
          System.out.println("NO");
      }
    }
    private static boolean validar(int renglones, int columnas, int cabras){
        if (((renglones>=1)&&(renglones<=10))&&((columnas>=1)&&(columnas<=10))){
          if((cabras>=1)&&(cabras<=5)) return true;
        }
        return false;
        
    }
    private static boolean pelea (){
        if ((Integer.valueOf(valorescabras[contador-1])==0)&&(Integer.valueOf(valorescabras[contador])==0)){
        if(!((corral[Integer.valueOf(valorescabras[contador-1])][Integer.valueOf(valorescabras[contador])+1])==1)||((corral[Integer.valueOf((valorescabras[contador-1])+1)][Integer.valueOf(valorescabras[contador])])==1));
        return true;
        }
        if ((Integer.valueOf(valorescabras[contador-1])==0)){
        if(!((corral[Integer.valueOf(valorescabras[contador-1])+1][Integer.valueOf(valorescabras[contador])-1])==1)||((corral[Integer.valueOf(valorescabras[contador-1])+1][Integer.valueOf(valorescabras[contador]+1)])==1)||((corral[Integer.valueOf((valorescabras[contador-1])+1)][Integer.valueOf(valorescabras[contador])])==1)); 
        return true;
        }
        if ((Integer.valueOf(valorescabras[contador])==0)){
        if(!((corral[Integer.valueOf(valorescabras[contador-1])-1][Integer.valueOf(valorescabras[contador])])==1)||((corral[Integer.valueOf(valorescabras[contador-1])+1][Integer.valueOf(valorescabras[contador])])==1)||((corral[Integer.valueOf(valorescabras[contador-1])][Integer.valueOf(valorescabras[contador])+1])==1));
        return true;
        }
        if(!((corral[Integer.valueOf(valorescabras[contador-1])-1][Integer.valueOf(valorescabras[contador])])==1)||((corral[Integer.valueOf(valorescabras[contador-1])+1][Integer.valueOf(valorescabras[contador])])==1)||((corral[Integer.valueOf(valorescabras[contador-1])][Integer.valueOf(valorescabras[contador])-1])==1)||((corral[Integer.valueOf(valorescabras[contador-1])][Integer.valueOf(valorescabras[contador])+1])==1)){
            return true;
        }
        if (!(((corral[corral.length-1][corral[0].length]-1))==1)){
            return true;
        }
        if (!(((corral.length-1)==contador-1))){
        if(!((corral[Integer.valueOf(valorescabras[contador-1])-1][Integer.valueOf(valorescabras[contador])])==1)||((corral[Integer.valueOf(valorescabras[contador-1])][Integer.valueOf(valorescabras[contador])-1])==1)||((corral[Integer.valueOf(valorescabras[contador-1])][Integer.valueOf(valorescabras[contador])+1])==1));
        return true;
        }
        if (!(((corral[0].length-1)==contador))){
        if(!((corral[Integer.valueOf(valorescabras[contador])][Integer.valueOf(valorescabras[contador])-1])==1)||((corral[Integer.valueOf(valorescabras[contador])+1][Integer.valueOf(valorescabras[contador])])==1)||((corral[Integer.valueOf(valorescabras[contador])-1][Integer.valueOf(valorescabras[contador])])==1));
        return true;
        }
        else{
            return false;
        }
    }
}
