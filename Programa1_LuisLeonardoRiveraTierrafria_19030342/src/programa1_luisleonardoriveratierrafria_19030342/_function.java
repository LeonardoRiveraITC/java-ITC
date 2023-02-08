
package programa1_luisleonardoriveratierrafria_19030342;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _function {
    public static void main(String[] args) {
        int increment=incrementByOne(1);
        System.out.println(increment);
        Function<Integer,Integer> 
                incrementByOneFunction= num -> num+1; 
        Function<Integer,Integer>
                multiplyBy10=num-> num*10;
        int increment2= incrementByOneFunction.apply(2);
        int multiply = multiplyBy10.apply(increment2);
        System.out.println(increment2);
        System.out.println(multiply);
        Function<Integer,Integer> addAndMultiply = 
                incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addAndMultiply.apply(4));
        
        
        BiFunction<Integer,Integer,Integer> 
                addAndMultiplyBiFunction = (numberToIncrementByOne
                ,numberToMultiplyBy)-> (numberToIncrementByOne+1)
                *numberToMultiplyBy;
        System.out.println("Bi"+addAndMultiplyBiFunction.apply(4,100));
        
    }
    
    Function<Integer,Integer> incrementByOneFunction=num -> num++; 
    
    static int incrementByOne (int num){
        return num+1;
    }
}
