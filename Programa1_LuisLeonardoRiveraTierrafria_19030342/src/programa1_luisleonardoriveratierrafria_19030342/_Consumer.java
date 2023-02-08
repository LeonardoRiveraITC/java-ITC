
package programa1_luisleonardoriveratierrafria_19030342;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer ("Maria","46144255");
        greetCostumer(maria);
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, false);
    }
    
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> 
         System.out.println("Hola "+customer.customerName+", gracias por registrar el número "
        + (showPhoneNumber ? customer.customerPhoneNumber : "******"));
    
    
    static Consumer<Customer> greetCustomerConsumer = customer -> 
         System.out.println("Hola "+customer.customerName+", gracias por registrar el número "
        + customer.customerPhoneNumber);
    
    static void greetCostumer(Customer customer){
        System.out.println("Hola "+customer.customerName+", gracias por registrar el número "
        + customer.customerPhoneNumber);
    }
    static class Customer{
    private final String customerName;
    private final String customerPhoneNumber;

    public Customer(String customerName, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
}    
}
