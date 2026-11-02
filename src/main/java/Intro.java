import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Intro {
    public static void main(String[] args) {
        // java 27

        // 11, 15, 17 , 21, 25

        // java 7
        //  java Script , Functional style programming
        //  Imperative programming : tells computer  how to do something , using class, loop , condition , and statement

        // Function , focus more what need to be done , not how
        //

        // java 8  version :

        List<Integer> list = Arrays.asList(10,15,20,25,30);


        List<Integer> result = new ArrayList<>();


        // loop

        for (Integer num : list){
            if(num>=20){
                result.add(num);
            }
        }

        System.out.println(result);






        // java 8 style



        List<Integer> result2 = list.stream()
                .filter(num -> num>=20)
                .toList();
        System.out.println(result2);

// Functional interface : contains only one abstract method . SAM (single abstract method)

    // 4 type of functional interface

        // 1 - Predicate  , accept 1 parameter and return boolean (true/false)
        // 2- Function : Represents a function that takes one argument and produces a result.
        // 3 Consumer : represents an operation that accepts a single input argument and returns no result.
        // 4. Supplier : Represents a supplier of results. Does not take any argument and produces a result.



 Operation o = new OperationImpl();
        System.out.println(o.add(25, 23.4));


        // lambda

        // (String name) -> System.out.println(name)


Greeting  go =  name -> System.out.println("Hi: "+name);

go.hi("Friba");

// (parameter list ) -> lambda body


/*
double getPiValue() {
    return 3.1415;
}
 */


     Supplier<Double>  s =  () -> {
         double pi = 3.14;
         return pi;
     };


    }


}
