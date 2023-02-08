/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p231;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author AndroidB
 */
public class P231 {
    static int numerocasos;
    static Scanner teclado;
    public static void main(String[] args) {
       teclado = new Scanner(System.in);
       Stack<Integer> pila = new Stack<>();
        String entrada;
        boolean error = false;
        char[] expresion;

        entrada = teclado.nextLine();
        numerocasos = Integer.parseInt(entrada);
        for (int i = 0; i < numerocasos; i++) {
            pila.clear();
            error = false;

            entrada = teclado.nextLine();
            expresion = entrada.toCharArray();
            for (int j = 0; j < expresion.length ; j++) {
                if (expresion[j] == '(')
                    pila.push(1);
                if (expresion[j] == ')')
                    if (!pila.isEmpty())
                        pila.pop();
                    else
                        error = true;
            }
            if (error)
                System.out.println("incorrecto");
            else if (!pila.isEmpty())
                System.out.println("incorrecto");
            else
                System.out.println("correcto");
        }
    }
    
}
