
package chivaslocas2;

import java.util.Scanner;


public class ChivasLocas2 {
static int corral[][];
static String jaulas[];
static Scanner scanner = new Scanner(System.in);
//llenar valores corral
    public static void main(String[] args) {
    boolean x=true,y=true;
    String[] valores = scanner.nextLine().split(" ");
    String []cabras = scanner.nextLine().split(" ");
    int repeticiones = scanner.nextInt();    
    int columnas = Integer.valueOf(valores[0]);
    int renglones = Integer.valueOf(valores[1]);
    int pos1 [][] = new int[columnas][renglones];
    int pos2[][]=new int [columnas][renglones];    
    int tempy=0,tempx=0;

    if(validarcorral(columnas,renglones)){
        corral = new int [columnas][renglones];
        //llenar cabras
        
        int numcabras=Integer.valueOf(cabras[0]);
       
        if(5>=numcabras||numcabras<=1){
            for(int i=2;i<=numcabras*2;i+=2){
                if(!((corral[Integer.valueOf(cabras[i-1])][Integer.valueOf(cabras[i])])==1)){
                      corral[Integer.valueOf(cabras[i-1])][Integer.valueOf(cabras[i])]=1;
                }else System.out.println("NO");
            }
        }else System.out.println("NO");
        
    }else System.out.println("NO");
    for(int n=0;n<=repeticiones;n++){
    jaulas=scanner.next().split(" ");
    int numjaula=Integer.valueOf(jaulas[0]);

    for(int i=4;i<=numjaula*4;i+=4){
        
        if(!((corral[Integer.valueOf(jaulas[i-3])][Integer.valueOf(jaulas[i-2])])==1)){
            corral[Integer.valueOf(jaulas[i-3])][Integer.valueOf(jaulas[i-2])]=2;
        if(!((corral[Integer.valueOf(jaulas[i-1])][Integer.valueOf(jaulas[i])])==1)){
            corral[Integer.valueOf(jaulas[i-1])][Integer.valueOf(jaulas[i])]=2;

            
            if(Integer.valueOf(jaulas[i-3])>=Integer.valueOf(jaulas[i-1])) y=true; 
            if((Integer.valueOf(jaulas[i-2])>=Integer.valueOf(jaulas[i]))) x=true;
            tempy=Integer.valueOf(jaulas[i-1]);
            tempx=Integer.valueOf(jaulas[i]);
            while(!(corral[Integer.valueOf(jaulas[i-3])][Integer.valueOf(jaulas[i-2])]==corral[tempy][tempx])){
                if(x==true&&y==true){
                    corral[Integer.valueOf(jaulas[i-1])-1][Integer.valueOf(jaulas[i])-1]=2;
                    tempy=Integer.valueOf(jaulas[i-1])-1;
                    tempx=Integer.valueOf(jaulas[i])-1;
                }
                if (x==false&&y==false){
                    corral[Integer.valueOf(jaulas[i-1])+1][Integer.valueOf(jaulas[i])+1]=2;
                    tempy=Integer.valueOf(jaulas[i-1])+1;
                    tempx=Integer.valueOf(jaulas[i])+1;                    
                }
                if(y==true&&x==false){
                    corral[Integer.valueOf(jaulas[i-1])+1][Integer.valueOf(jaulas[i])-1]=2;
                    tempy=Integer.valueOf(jaulas[i-1])+1;
                    tempx=Integer.valueOf(jaulas[i])-1;                    
                }
                if(x==true&&y==false){
                    corral[Integer.valueOf(jaulas[i-1])-1][Integer.valueOf(jaulas[i])+1]=2;
                    tempy=Integer.valueOf(jaulas[i-1])-1;
                    tempx=Integer.valueOf(jaulas[i])+1;                    
                }                
            }
            
            
        }else System.out.println("NO");
        
    }else System.out.println("NO");
    }
    regiones();
    }
    }
    public static boolean validarcorral(int columna, int renglon){
        if((columna>=10&&columna<=1)||((renglon>=10&&renglon<=1))) return false;
        else return true;
    }
    public static void regiones (){
        try{
        for (int i=0;i<=corral.length;i++){
         for (int n=0;n<=corral[0].length;i++){
            if(corral[i][n]==2){
                if(corral[i-1][n]==2){
                    System.out.println("NO");
                }
                if(corral[i+1][n]==2){
                    System.out.println("NO");
                }
                if(corral[i][n-1]==2){
                    System.out.println("NO");
                }
                if(corral[i][n+1]==2){
                    System.out.println("NO");
                }
            }
        }   
        }
        }catch(Exception e){
            
        }
    }
    public static void regionescabras(){
        int res=0;
        int contador=1;
        int cords=0;        
        try{
        for (int i=0;i<=corral.length;i++){
         for (int n=0;n<=corral[0].length;i++){
             cords=corral[i][n];
             if(cords==1){
               while(!(res==1)){
                 res=corral[i+contador][n];

               }
             }
        }   
        }
        }catch(Exception e){
            
        }        
    }
    
}
