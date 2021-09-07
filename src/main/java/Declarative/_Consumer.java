package Declarative;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//"Consume the provided data"
//Doesn't return anything
public class _Consumer {

    public static void main(String[] args) {
        Customer mark = new Customer("Mark", 123456789);
        Customer steve = new Customer("Steve", 123456789);

        greetCustomerConsumer.accept(steve);
        greetCustomerConsumerV2.accept(mark, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, aBoolean) ->
            System.out.printf(
                    "%n%s phone number %s",
                    customer.customerName,
                    (aBoolean ? customer.customerPhoneNumber : "*********")
            );


    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.printf("%s phone number %s", customer.customerName, customer.customerPhoneNumber);

    static class Customer {

        private final String customerName;

        private final Integer customerPhoneNumber;

        Customer(String customerName, Integer customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public String getCustomerName() {
            return customerName;
        }

        public Integer getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }
    }
}
