import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZizZagStringTest {

ZizZagString sol = new ZizZagString();

    @Test
    void convert() {
        String input = "PAYPALISHIRING";
        int B = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, sol.convert(input, B));
    }
    @Test
    void convert2() {
        String input = "B";
        int B = 1;
        String expected = "B";
        assertEquals(expected, sol.convert(input, B));
    }
    @Test
    void convert3() {
        String input = "ABCD";
        int B = 2;
        String expected = "ACBD";
        assertEquals(expected, sol.convert(input, B));
    }
}