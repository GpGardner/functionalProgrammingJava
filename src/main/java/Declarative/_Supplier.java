package Declarative;

import java.util.List;
import java.util.function.Supplier;

/* a supplier takes no arguments,
 but will return a value
*/
public class _Supplier {


    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        getDBConnectionUrlSupplier.get().forEach(System.out::println);

    }


    static String getDBConnectionUrl() {
        return "jdbc://localhost:8000/users";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = () ->
            List.of("jdbc://localhost:8000/users",
                    "jdbc://localhost:8000/phoneNumbers",
                    "jdbc://localhost:8000/addresses");

}
