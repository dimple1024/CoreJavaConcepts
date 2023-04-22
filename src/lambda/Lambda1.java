package lambda;
// lambda's are created from functional interfaces ,
// meaning the interfaces which have only one method to implement


import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

//Example of custom interface and lambda from that interface
public class Lambda1 {
    public static void main(String[] args) {
        // By default in a single liner lambda this operation returns after performing operation
        System.out.println(doStringConcat(((s1, s2) -> s1.concat(s2)), "Hello", " World!"));
        // However if u want to have a multiliner lambda method , u can return the value using
        // return statement
        System.out.println(doStringConcat(((s1, s2) -> {
            String s3 = s1.concat(s2);
            return s3;
        }), "Hello", " World!"));
        Supplier<Integer> randomString = () -> (new Random().nextInt());
        System.out.println(randomString.get());
        Consumer

    }

    public static String doStringConcat(Concat c, String s1, String s2) {
        return c.concatStrings(s1,s2);
    }




    public interface Concat {
        public String concatStrings(String s1, String s2);
    }
}
