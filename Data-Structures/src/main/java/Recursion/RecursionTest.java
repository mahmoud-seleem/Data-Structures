package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionTest {
    public static void main(String[] args) {
        printAllPer("",Arrays.asList("a","b","c","d","e"));
    }
    public static void printAllPer(String s ,List<String> array){
        if (array.size() > 1) {
            for(String c : array){
                List<String> temp = copy(array);
                temp.remove(c);
                printAllPer(s+c,temp);
            }
        }else if (array.size() == 1){
            System.out.println(s.concat(String.valueOf(array.get(0))));
        }
    }

    private static <T> List<T> copy(List<T> source){
        return new ArrayList<>(source);
    }
}
