//Luis Leonardo Rivera Tierrafria 19030342
package casosrecursividad;

import java.util.Scanner;

public class CasosRecursividad {

    public static Scanner scanner = new Scanner(System.in);
    public static int n;
    public static void main(String[] args) {
    n =scanner.nextInt();
    recursividad(n);
    }
    public static int recursividad (int num){
        if(num==1){
            return 1;
        }
        int residuo = num%2;
        if ((residuo)==0){
            num = num/2;
            System.out.println(num);
            return recursividad(num);
        }
        else {
            num = (3*num)+1;
            System.out.println(num);
            return recursividad(num);
        }
    }
}
