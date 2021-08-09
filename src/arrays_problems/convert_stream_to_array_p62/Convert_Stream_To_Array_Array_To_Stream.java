package arrays_problems.convert_stream_to_array_p62;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Convert_Stream_To_Array_Array_To_Stream {
    public static void main(String[] args) {
        //Converting array to stream
        // String array
        String[] arr = {"One", "Two", "Three", "Four", "Five"};

        // array to Stream
        //3 ways to display stream elements 1. By using forEach method  2. By converting to list and collecting elements
        // 3. by using  peek method
        Stream<String> stream1 = Arrays.stream(arr);
        System.out.println(stream1.collect(Collectors.toList()));
        Stream<String> stream2 = Arrays.stream(arr, 0, 2);
        System.out.println(stream2.collect(Collectors.toList()));
        Stream<String> stream3 = Arrays.asList(arr).stream();
        System.out.println(stream3.collect(Collectors.toList()));
        Stream<String> stream4 = Arrays.asList(arr).subList(0, 2).stream();
        System.out.println(stream4.collect(Collectors.toList()));
        Stream<String> stream5 = Stream.of(arr);
        System.out.println(stream5.collect(Collectors.toList()));
        Stream<String> stream6 = Stream.of("One", "Two", "Three");
        System.out.println(stream6.collect(Collectors.toList()));

        // Stream to array
        //String[] array1 = stream1.toArray(String[]::new);

        // integers array
        int[] integers = {2, 3, 4, 1};
        Integer[] boxedInt = {2, 3, 4, 1};

        IntStream intStream1 = Arrays.stream(integers);
        IntStream intStream2 = IntStream.of(integers);
        IntStream intStream3 = IntStream.range(0, integers.length);
        IntStream intStream4 = IntStream.rangeClosed(0, integers.length);
        Stream<Integer> intStream5 = Stream.of(boxedInt);

        //Converting stream to array
        int[] intArray1 = intStream1.toArray();
        int[] intArray2 = intStream5.mapToInt(i -> i).toArray();
    }
}
