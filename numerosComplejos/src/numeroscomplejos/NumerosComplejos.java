
package numeroscomplejos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosComplejos {

    public static void main(String[] args) {
        int opc;
        numero array[];
        boolean input=true;
        int numero1a,numero1b,numero2a,numero2b;
        numero numero1 = new numero();
        numero numero2 = new numero();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Se define cada número complejo z como un par ordenado de números reales: z = (a, b)");
        System.out.println("A su vez el primer elemento a se define como parte real de z");
        System.out.println("El segundo elemento b se define como parte imaginaria de z");
        System.out.println("Ingresa solo los valores númericos (el segundo valor es imaginario por definición)");
        while (input){
        try{    
        System.out.println("Ingrese el primer elemento de z1");
        numero1a=scanner.nextInt();
        System.out.println("Ingrese el segundo elemento de z1");
        numero1b=scanner.nextInt();
        System.out.println("Ingrese el primer elemento de z2");
        numero2a=scanner.nextInt();
        System.out.println("Ingrese el segundo elemento de z2");
        numero2b=scanner.nextInt();

        numero1.setReal(numero1a);
        numero1.setImaginario(numero1b);
        numero2.setReal(numero1b);
        numero2.setReal(numero2b);
        input= false;
        }catch(InputMismatchException ex){
        } finally{
            scanner.nextLine();
        }
        }
        input = true;
        System.out.println("¿Que desea hacer?");
        while (input){
        try{
            System.out.println("1: sumar");
            System.out.println("2: restar");
            System.out.println("3: multiplicar");
            System.out.println("4: dividir");
//            System.out.println("5: agregar otro número");
//            System.out.println("6: ver números");
//            System.out.println("7: Terminar la ejecución");
            opc=scanner.nextInt();
            switch(opc){
                case 1:
                    System.out.println(suma(numero1,numero2).toString());
                case 2:
                    resta(numero1,numero2).toString();
                case 3:
                    multiplicacion(numero1,numero2).toString();
                case 4:
                    division(numero1,numero2).toString();                    
            }
            
        }catch(InputMismatchException ex){
        } finally{
            scanner.nextLine();
        }    
        }        
    }
    //(a,b)+(c,d)=(a+c,b+d)
    public static numero suma(numero numero1, numero numero2) {
        numero resultado = new numero ();
        resultado.setReal(numero1.getReal()+numero2.getReal());
        resultado.setImaginario(numero1.getImaginario()+numero2.getImaginario());       
        return resultado;
    }    
    //(a,b)-(c,d)=(a-c),(b-d)
    public static numero resta (numero numero1, numero numero2) {
        numero resultado = new numero ();
        resultado.setReal(numero1.getReal()-numero2.getReal());
        resultado.setImaginario(numero1.getImaginario()-numero2.getImaginario());       
        return resultado;    
    }
    //(a,b)*(c,d)=(ac-bd,ad+bc)
    public static numero multiplicacion (numero numero1, numero numero2) {
        double real,imaginario; 
        numero resultado = new numero ();
        real= (numero1.getReal()*numero2.getReal())- (numero1.getImaginario()*numero2.getImaginario());
        imaginario=(numero1.getReal()*numero2.getImaginario())+(numero1.getImaginario()*numero2.getReal());
        resultado.setReal(real);
        resultado.setImaginario(imaginario);
        return resultado;    
    }    
    //(a,b)/(c,d)=(ac+bd/c^2-d^2, bc-ad/c^2-d^2)
    public static numero division (numero numero1, numero numero2){
        double real, imaginario;   
        numero resultado = new numero ();
        real= ((numero1.getReal()*numero2.getReal())+ (numero1.getImaginario()*numero2.getImaginario()))/((numero2.getReal()*numero2.getReal())+(numero2.getImaginario()*numero2.getImaginario()));
        imaginario=(numero1.getImaginario()*numero2.getReal()-(numero1.getReal()*numero2.getImaginario()))/((numero2.getReal()*numero2.getReal())+(numero2.getImaginario()*numero2.getImaginario()));
        resultado.setReal(real);
        resultado.setImaginario(imaginario);
        return resultado;
    }
}
