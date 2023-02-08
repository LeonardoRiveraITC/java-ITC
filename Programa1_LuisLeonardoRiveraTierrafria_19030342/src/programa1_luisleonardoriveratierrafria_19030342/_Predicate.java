
package programa1_luisleonardoriveratierrafria_19030342;

import java.util.function.Predicate;


public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("090909090"));
        System.out.println(isPhoneNumberValid("07000300000"));
        
        System.out.println(isPhoneNumberValidPredicate.test("090909090"));
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));      
        System.out.println("es valido y tiene un 3"+isPhoneNumberValidPredicate.and(containsNumber3).test("07000300000"));
    }
   
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07")&&phoneNumber.length()==11;
    }
    static Predicate <String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07")&&phoneNumber.length()==11;
    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
   
