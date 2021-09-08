package Combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static Combinator.CustomerRegistrationValidator.ValidationResult;
import static Combinator.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ?
                SUCESS : EMAIL_INVALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("1") && customer.getPhoneNumber().length() == 10 ?
                SUCESS : PHONE_NUMBER_INVALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ?
                SUCESS : AGE_INVALID;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            final ValidationResult result = this.apply(customer);
            return result.equals(SUCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCESS,
        PHONE_NUMBER_INVALID,
        EMAIL_INVALID,
        AGE_INVALID
    }
}
