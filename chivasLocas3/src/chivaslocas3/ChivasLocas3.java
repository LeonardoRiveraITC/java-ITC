
package chivaslocas3;

import java.util.Scanner;


public class ChivasLocas3 {
static Scanner scanner = new Scanner  (System.in);
static int corral[][];  
static String inputstatic[];
    public static void main(String[] args) {
        int temp1,temp2,rejas;
        String temp3[];
        //obtener valores iniciales
        String[] inputrengcol=scanner.nextLine().split(" ");
        int renglones = Integer.valueOf(inputrengcol[0]);
        int columnas = Integer.valueOf(inputrengcol[1]);
        String input1[]=scanner.nextLine().split(" ");
        inputstatic=input1;
        int casos=scanner.nextInt();
        int cabras=Integer.valueOf(input1[0]);
        comprobarCorral(renglones,columnas,cabras);
        //hacer el array doble y llenarlo
        corral=new int[renglones][columnas];
        for(int i=2;i<cabras*2;i+=2){
            temp1=Integer.valueOf(input1[i-1]);
            temp2=Integer.valueOf(input1[i]);
            if(!(corral[temp1][temp2]==1)||(!(corral[temp1][temp2]==2))){
                corral[temp1][temp2]=1;
            }
        }
        //llenar las rejas que separan las chivas
        scanner.nextLine();
        for (int i=0;i<casos;i++){
            temp3=scanner.nextLine().split(" ");
            llenarRejas(temp3);   
            buscar(renglones,columnas);
        }
        //busqueda
            
        
    }
    public static void comprobarCorral(int renglones, int columnas,int cabras){
        if((renglones<1&renglones>10)&&(columnas<1&columnas>10)){
            System.out.println("NO");
        }
        if((cabras<1&cabras>5)){
            System.out.println("NO");
        }
        
    }
    public static void llenarRejas(String[] temp){
        int temp2,temp3,temp4,temp5,tempreng,tempcol;
        for(int i=4;i<=Integer.valueOf(temp[0])*4;i+=4){
            temp2=Integer.valueOf(temp[i-3]);
            temp3=Integer.valueOf(temp[i-2]);
            temp4=Integer.valueOf(temp[i-1]);
            temp5=Integer.valueOf(temp[i]);
            corral[temp4][temp5]=2;
            corral[temp2][temp3]=2;
            do{
                 if((temp2==temp4)&&(temp3>temp5)){
                    temp3-=1;
                    corral[temp2][temp3]=2;
                }
                 if((temp2>temp4)&&(temp3==temp5)){
                    temp2-=1;
                    corral[temp2][temp3]=2;
                }              
                 if((temp2==temp4)&&(temp3<temp5)){
                    temp3+=1;
                    corral[temp2][temp3]=2;
                }
                 if((temp2<temp4)&&(temp3==temp5)){
                    temp2+=1;
                    corral[temp2][temp3]=2;
                }                 
                 if((temp2>temp4)&&(temp3>temp5)){
                    temp2-=1;
                    temp3-=1;
                    corral[temp2][temp3]=2;
                }
                if((temp2<temp4)&&(temp3<temp5)){
                    temp2+=1;
                    temp3+=1;
                    corral[temp2][temp3]=2;
                } 
                if((temp2>temp4)&&(temp3<temp5)){
                    temp2-=1;
                    temp3+=1;
                    corral[temp2][temp3]=2;
                }
                if((temp2<temp4)&&(temp3>temp5)){
                    temp2+=1;
                    temp3-=1;
                    corral[temp2][temp3]=2;
                }                 
                
            }while((temp2!=temp4)||((temp3!=temp5)));
            
            }
        
        }
    public static void buscar(int renglones, int columnas){
        
        int tempx,tempy;
        int tempz=0;
        int contador=0;
        boolean flag=false;
        
        for(int i=2;i<inputstatic.length-1;i+=2){
            tempx=Integer.valueOf(inputstatic[i-1]);
            tempy=Integer.valueOf(inputstatic[i]);
            while (!flag){
                
            }
            

        }


//    try{    
//    int tempcont=0;
//    String string="";
//    String[] string2;
//    for (int[] x : corral){
//         for (int y : x){
//         for(int i=0;i<=5;i++){             
//             System.out.print(y);
//          
//         }
//        }
//    
//    }
//    }catch(Exception e){
//        System.out.println("NO");
//    }

//    try{  
//    for(int i=0;i<columnas-1;i++){
//        tempcont=0;int tempx,tempy;
//       for(int n=0;n<renglones-1;n++){
//           while(!(corral[i][n]==2)){
//               n++;
//               if(corral[i][n]==1){
//                   tempcont+=1;
//               }
//           }
//       }
//    }
//    if(tempcont>1){
//        System.out.println("NO");
//    }else{
//        System.out.println("SI");
//    }
//    }catch(Exception e){
//        System.out.println("NO");   
//    }
    }
    }

