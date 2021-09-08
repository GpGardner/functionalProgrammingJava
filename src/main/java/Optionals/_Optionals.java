package Optionals;

import java.util.Optional;

public class _Optionals {

    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending Email to " + email),
                        () -> {
                            throw new IllegalArgumentException("Line 12 null");
                        });
    }
}
