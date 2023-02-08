
package mcd;

import java.util.Scanner;


public class Mcd {

    public static int asplit;
    public static int bsplit;
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();
        String numeros = scanner.nextLine();
        split (numeros);
        //int a = Integer.parseInt(numeros.split(" ")[0]);
    }
    public static int maximoComunDivisor(int a, int b){
        int residuo;
        if (b==0){
            return a;
        }
        if (a>b){
            residuo= a%b;
            return maximoComunDivisor(b,residuo);
        }
        if (b>a){
            return maximoComunDivisor(b,a);
        }
        else{
          return 0;
        }
        
    }
    public static void split(String cadena){
        char next='f';
        String a="";
        String b="";
        int contador=0;
        while (next!=' '){
           next = cadena.charAt(contador); 
           a+= next;
           contador++;
        }
        contador++;
        while (next!=' '){
           next = cadena.charAt(contador); 
           b+= next;
           contador++;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
