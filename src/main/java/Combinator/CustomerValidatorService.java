package Combinator;

import java.time.LocalDate;
import java.time.Period;

//Non combinator, doesn't currently show reason for invalid
public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        //validate email
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        //validate #
        return phoneNumber.startsWith("1") && phoneNumber.length() > 10;
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(
                customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDob()
                );
    }
}
