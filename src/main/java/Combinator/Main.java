package Combinator;

import java.time.LocalDate;

import static Combinator.CustomerRegistrationValidator.*;
import static Combinator.CustomerRegistrationValidator.ValidationResult.SUCESS;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alex",
                "Alex@gmail.com",
                "12345678901",
                LocalDate.of(2012, 1, 1));

        //Not combinator
        if (new CustomerValidatorService().isValid(customer)) {
            System.out.println(customer.getName() + " was added to the db");
        } else {
            System.out.println(customer.getName() + " was not added to the db");
        }

        //        Combinator
        ValidationResult result =
                isEmailValid()
                        .and(isPhoneNumberValid())
                        .and(isAdult())
                        .apply(customer);

        if (result != SUCESS) {
            throw new IllegalStateException(result.name());
        } else
            System.out.println(customer.getName() + " was added to the db");


    }


}

