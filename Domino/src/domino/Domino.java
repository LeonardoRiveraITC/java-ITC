
package domino;

import java.util.LinkedList;
import java.util.Scanner;


public class Domino {


    public static void main(String[] args) {
        LinkedList <Nodo> tablero = new LinkedList<>();
        boolean flag=true;
        int rep=0;
        int piezaizq,piezader;
        String []input;
        Scanner scanner = new Scanner(System.in);
        rep=Integer.valueOf(scanner.nextLine());
        for(int i = 0;i<rep;i++){
            input=scanner.nextLine().split(" ");
            flag=true;
            for(int n = 1;n<input.length;n+=2){
                int size= tablero.size();
                piezaizq=Integer.valueOf(input[n-1]);
                piezader=Integer.valueOf(input[n]);
            

                if(tablero.size()>=2){
                   comprobar(new Nodo(piezaizq,piezader,true),tablero.getFirst(),tablero);
                   comprobar(new Nodo(piezaizq,piezader,true),tablero.getLast(),tablero);
                }

                if(tablero.size()<2&&tablero.size()>0){
                    comprobar(new Nodo(piezaizq,piezader,true),tablero.get(0),tablero);
                }                
                if(tablero.isEmpty()){
                    tablero.add(new Nodo(piezaizq,piezader,true));
                } 
                if(size==tablero.size()){
                    System.out.println("NOK");
                    flag=false;
                    break;
                }
            }
        if(iguales(tablero));else if(flag){
            System.out.println("OK");
        }        
        
        tablero.clear();
        }


        }
    
    public static void comprobar(Nodo a, Nodo b,LinkedList<Nodo> lista){
        boolean flag=true;
        if(a.getLadoder()==b.getLadoizq()){
            lista.addFirst(a);
            flag=false;
        } else
        if(a.getLadoizq()==b.getLadoder()){
            lista.addLast(a);
            flag=false;
        } else
        if(a.getLadoder()==b.getLadoder()){
            a.setOrientation(false);
            lista.addLast(a);
            flag=false;
        } else
        if(a.getLadoizq()==b.getLadoizq()){
            a.setOrientation(false);
            lista.addFirst(a);
            flag=false;
        } 

    }
    public static boolean iguales(LinkedList<Nodo> lista){
        for(int i=0;i<lista.size();i++){
            for(int n=i+1;n<lista.size();n++){
                if((lista.get(i).getLadoder()==lista.get(n).getLadoder())&&(lista.get(i).getLadoizq())==lista.get(n).getLadoizq()){
                    System.out.println("REP");
                    return true;
                }
                
              
            }
        }
       return false;
    }
}


