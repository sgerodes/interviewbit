package challengeTester.interviewBit;

import java.util.ArrayList;
import java.util.Random;

public class RandomListFactory {

    static Random random = new Random();

    public static ArrayList<Integer> generateRandomIntegerList(int length, int minVAl, int maxVal){
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            lst.add(random.nextInt(maxVal-minVAl) + minVAl);
        }
        return lst;
    }
}
