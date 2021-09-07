package Declarative;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*
accepts 1 or 2 arguments and returns a boolean
 */
public class _Predicate {


    public static void main(String[] args) {
        String phoneNumberTrue = "19234567895";
        String phoneNumberFalse = "09234567895";
        String name = "Mary";

        boolean test = isPhoneNumberValidPredicate.test(phoneNumberTrue);
        boolean test2 = isPhoneNumberValidPredicate.test(phoneNumberFalse);

        boolean test3 = isPhoneNumberValidPredicate.and(areaCodeValid).test(phoneNumberFalse);
        boolean test4 = isPhoneNumberValidAndNameMary.test(phoneNumberTrue, name);

        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

    }


    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("1") && phoneNumber.length() == 11;
    }


    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("1") && phoneNumber.length() == 11;

    static Predicate<String> areaCodeValid = phoneNumber ->
            phoneNumber.contains("923");

    static BiPredicate<String, String> isPhoneNumberValidAndNameMary = (phoneNumber, name) ->
            isPhoneNumberValidPredicate.test(phoneNumber) && name.contains("Mary");
}
