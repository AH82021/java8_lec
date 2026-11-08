import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stream_Lec {

    // Collections , Array , Files
    //

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        // create a new empty list
        // loop through original list
        //  use if state  to find even numbers
        // we add even to new list

        List<Integer> evenList = new ArrayList<>();
        for(Integer num: list){
            if(num %2==0){
                evenList.add(num);
            }
        }

        System.out.println(evenList);// Eager evaluation



        // stream is a sequence of elements supporting operation such as filtering , mapping ,sorting ,reducing
        // it does not store data, it processes data from a source , such , Collections , Array , Files

            // now using stream

      List<Integer> result =
               list.stream()//[1,2,3,4,5,6,7,8,9,10]
                .filter(n -> n%2==0)//[2,4,6,8,10]
                .toList();

        System.out.println(result);

        // 1-convert source t0 stream
        //2. intermediate operations (transform or filter stream and return a new stream), lazy evaluation , +chaining , (filter, map, sorted, distinct, limit , skip)

        //3. terminal operation : end of stream pipeline , trigger code execution , result no stream (toList, Collect, forEach, count, reduce, findFirst, findLast)

        List<String> names = new ArrayList<>();

        names.add("Omid");
        names.add("Friba");
        names.add("Jeena");
        names.add("Fatma");
        names.add("Fatma");
        names.add("Frouqh");
        names.add("Frida");

        List<String> result1 = names.stream()
                .filter(name -> name.startsWith("F"))
                .map(name -> name.toUpperCase())
                .sorted()
                .distinct()
                .toList();
        System.out.println(result1);




    }
}
