
package programa1.Optionals;

import java.util.Optional;
public class Main {
    public static void main(String[] args) {
            Optional.ofNullable(args).ifPresent(value ->{
            System.out.println(value);    
            
        }
        );
    }
    
}
