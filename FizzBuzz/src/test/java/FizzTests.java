import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class FizzTests {

    @Test
    public void test() {
        Fizzbuzz tester = new Fizzbuzz();

        ArrayList totest = tester.fizzbuzz(50);

        assert(totest.get(0).equals("1"));
        assert(totest.get(2).equals("Lucky"));
        assert(totest.get(4).equals("Buzz"));
        assert(totest.get(5).equals("Fizz"));
        assert(totest.get(14).equals("Fizzbuzz"));

        assert(tester.count(totest).equals("FizzBuzz: 2 Buzz: 6 Fizz: 9 Lucky: 14 Int: 19"));
    }
}
