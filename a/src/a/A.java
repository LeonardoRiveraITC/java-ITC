
package a;

import java.util.Scanner;
import java.util.Stack;


public class a {

    public static void main(String[] args) {
        String input[];
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        int temp1,temp2,temp3;
        temp3=0;
        int veces = scanner.nextInt();
    //    try{
        for(int i=0;i<veces;i++){
            input=scanner.next().split(" ");
            for (int k=0;k<input.length-1;k++){
                if((Integer.valueOf(input[i]) instanceof Integer)){
                    stack.add(input[i]);
                }else{
                  if(!stack.empty()){  
                  temp1=Integer.valueOf(String.valueOf(stack.pop()));
                  temp2=Integer.valueOf(String.valueOf(stack.pop()));
                  temp3 =operacion((input[i]),temp1,temp2);
                  stack.add(temp3);
                }
                    System.out.println(temp3);
                }
                
            }
        }
     //   }catch(Exception e){
     //       System.out.println("error");
     //   } 
    }
    public static int operacion(char a,int num1, int num2){
        switch (a){
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
            case '>' :
                //return (int)Math.pow(num1, num2);
                return num1*num2;
        }
        return 0;        
    }  
}
