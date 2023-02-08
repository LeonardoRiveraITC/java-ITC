
package javaapplication11;

public class JavaApplication11 {

  
    public static void main(String[] args) {
        f(10,3);
    }
    static void f(int num, int num2){
        if (num>1){
            if((num%num2)==0){
                System.out.println(num2);
                f(num/num2,num2);
            }
            else f(num,num2+1);
        }
    }
}
