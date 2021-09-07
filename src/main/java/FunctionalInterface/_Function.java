package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int number = 1;

        int number2 = incrementByOneFunction.apply(number);
        System.out.println(number2);

        Function<Integer, Integer> add1AndThenMultiplyBy10 = incrementByOneFunction
                .andThen(multiplyBy10Function);

        System.out.println(incrementByOneAndMultiplyByAValue.apply(2, 10));


    }

    //functions
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    //bifunctions
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByAValue =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
