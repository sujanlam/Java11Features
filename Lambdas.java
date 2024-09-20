package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> reverse = (var str) -> new StringBuilder(str).reverse().toString();
        Function<String, String> reverse1 = (str) -> new StringBuilder(str).reverse().toString();
        String string1 = "Hello World";
        String string2 = "Hello World2";
        System.out.println(string1);
        System.out.println(reverse.apply(string1));
        System.out.println(reverse1.apply(string2));
        String s = "eyes";
        Predicate<String> isPalindrome = (ss) -> new StringBuilder(ss).reverse().toString().equals(ss) ? true : false;
        System.out.println("Is palindrome: "+isPalindrome.test(s));
    }
}
