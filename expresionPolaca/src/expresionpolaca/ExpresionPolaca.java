
package expresionpolaca;


import java.util.Scanner;
import java.util.Stack;


public class ExpresionPolaca {

public static void main(String[] args) {
 
        String input[];
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        Double temp1,temp2,temp3;
        temp3=0.0;
        temp1=0.0;
        temp2=0.0;
        int veces = Integer.valueOf(scanner.nextLine());
        try{
        for(int i=0;i<veces;i++){
            input=scanner.nextLine().split(" ");
            for (int k=0;k<input.length;k++){
                if((revisar(input[k]))){
                    stack.add(Double.valueOf(input[k]));
                }else{
                  if(!stack.empty()){  
                  temp1=Double.valueOf(String.valueOf(stack.pop()));
                  temp2=Double.valueOf(String.valueOf(stack.pop()));
                  temp3 =operacion((input[k]),temp1,temp2);
                  stack.add(temp3);
                }

                }
               
            }
            stack.pop();
            System.out.println(Math.round(temp3));
        }
        }catch(Exception e){
            System.out.println("error");
        } 
    }
    public static double operacion(String a,double num1, double num2){
        switch (a){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
            case ">" :
                return Math.pow(num1, num2);
                
                
        }
        return 0;        
    }  
    public static boolean revisar(String a){
        try{
        if(Double.valueOf(a).getClass() == Double.TYPE){
        }
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
