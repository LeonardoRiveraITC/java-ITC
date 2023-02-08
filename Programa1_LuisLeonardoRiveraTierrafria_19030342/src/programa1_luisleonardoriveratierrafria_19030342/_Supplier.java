
package programa1_luisleonardoriveratierrafria_19030342;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionSupplier);
    }
    public String getGBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
    
    static Supplier<String> getDBConnectionSupplier=()
            -> ("jdbc://localhost:5432/users").toString();
}
