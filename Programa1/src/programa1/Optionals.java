
package programa1;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Optional.
        ofNullable(null).ifPresentOrElse
        (email -> System.out.println("Sending email to "+email), ()-> {
            System.out.println("Cannot send email");
        });
        
    }
    
}
