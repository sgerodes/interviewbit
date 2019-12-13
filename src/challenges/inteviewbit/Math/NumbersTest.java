package challenges.inteviewbit.Math;

import challenges.inteviewbit.JavaLists;
import challenges.inteviewbit.Timer;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class NumbersTest {

    Random random = new Random();

    @Test
    void primeFactors() {
        int num = 15;
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("[3 5]");

        ArrayList<Integer> actual = Numbers.primeFactors(num);
        assertIterableEquals(expected, actual, errorMessage(expected, actual));
    }

    @Test
    void primeFactors2() {
        int num = 21;
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("[3 7]");

        ArrayList<Integer> actual = Numbers.primeFactors(num);
        assertIterableEquals(expected, actual, errorMessage(expected, actual));
    }

    @Test
    void primeFactors3() {
        int num = 20;
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("[2 2 5]");

        ArrayList<Integer> actual = Numbers.primeFactors(num);
        assertIterableEquals(expected, actual, errorMessage(expected, actual));
    }

    @Test
    void primeFactors4() {
        int num = 7;
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("[7]");

        ArrayList<Integer> actual = Numbers.primeFactors(num);
        assertIterableEquals(expected, actual, errorMessage(expected, actual));
    }


    private String errorMessage(ArrayList<Integer> expected, ArrayList<Integer> actual) {
        return String.format("Expected %s\nActual %s", expected, actual);
    }

    @Test
    void getCounter() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 1 1 2 2]");
        ArrayList<Integer> expectedKeySet = JavaLists.fromStringWithSpaceSeparatedToList("[1 2]");

        Map<Integer, Integer> actual = Numbers.getCounter(initial);

        assertIterableEquals(actual.keySet(), expectedKeySet);
        for (int key : actual.keySet()) {
            assertEquals(Collections.frequency(initial, key), actual.get(key));
        }
    }

    @Test
    void getCounter2() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[]");
        ArrayList<Integer> expectedKeySet = JavaLists.fromStringWithSpaceSeparatedToList("[]");

        Map<Integer, Integer> actual = Numbers.getCounter(initial);

        assertIterableEquals(actual.keySet(), expectedKeySet);
        for (int key : actual.keySet()) {
            assertEquals(Collections.frequency(initial, key), actual.get(key));
        }
    }

    @Test
    void getCounter3() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 1 1 3 5 5 5 4 4 3 3]");
        ArrayList<Integer> expectedKeySet = JavaLists.fromStringWithSpaceSeparatedToList("[1 3 4 5]");

        Map<Integer, Integer> actual = Numbers.getCounter(initial);

        assertIterableEquals(actual.keySet(), expectedKeySet);
        for (int key : actual.keySet()) {
            assertEquals(Collections.frequency(initial, key), actual.get(key));
        }
    }


    @Test
    void gcd() {
        for (int i = 0; i < 10000; i++) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            assertEquals(Numbers.gcdEuclidean(a, b), Numbers.gcdStein(a, b));
        }
        for (int i = 0; i < 10000; i++) {
            int a = random.nextInt(1000000);
            int b = random.nextInt(1000000);
            assertEquals(Numbers.gcdEuclidean(a, b), Numbers.gcdStein(a, b));
        }
        for (int i = 0; i < 10000; i++) {
            int a = random.nextInt(Integer.MAX_VALUE);
            int b = random.nextInt(Integer.MAX_VALUE);
            assertEquals(Numbers.gcdEuclidean(a, b), Numbers.gcdStein(a, b));
        }
    }
    @Test
    void gcdTimer() {
        int iterations = Integer.MAX_VALUE / 50;
        int a = 1000010101;
        int b = 1023034107;
        //warm up
        long stein = Timer.timeIt(iterations, Numbers::gcdStein, a, b);
        long euclidedan = Timer.timeIt(iterations, Numbers::gcdEuclidean, a, b);
        // real test
        stein = Timer.timeIt(iterations, Numbers::gcdStein, a, b);
        euclidedan = Timer.timeIt(iterations, Numbers::gcdEuclidean, a, b);
        System.out.println(String.format("Euclidean: %d; Stein: %d", euclidedan, stein));
    }
}