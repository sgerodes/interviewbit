package challenges.inteviewbit.Math;

import challenges.inteviewbit.JavaLists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void primeFactors() {
        int num = 15;
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("[3 5]");

        ArrayList<Integer> actual = Numbers.primeFactors(num);
        assertIterableEquals(expected, actual, errorMessage(expected,actual));
    }
    @Test
    void primeFactors2() {
        int num = 21;
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("[3 7]");

        ArrayList<Integer> actual = Numbers.primeFactors(num);
        assertIterableEquals(expected, actual, errorMessage(expected,actual));
    }
    @Test
    void primeFactors3() {
        int num = 20;
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("[2 2 5]");

        ArrayList<Integer> actual = Numbers.primeFactors(num);
        assertIterableEquals(expected, actual, errorMessage(expected,actual));
    }
    @Test
    void primeFactors4() {
        int num = 7;
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("[7]");

        ArrayList<Integer> actual = Numbers.primeFactors(num);
        assertIterableEquals(expected, actual, errorMessage(expected,actual));
    }


    private String errorMessage(ArrayList<Integer> expected, ArrayList<Integer> actual){
        return String.format("Expected %s\nActual %s", expected, actual);
    }
}