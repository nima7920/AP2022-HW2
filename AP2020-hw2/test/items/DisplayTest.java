package items;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;
// 2 tests
public class DisplayTest {
    private Display display = new Display(10, 1.5, 20);
    @Rule
    public Timeout time = new Timeout(2000);
    @Test
    public void testDisplayConstructor() {
        checkDouble(10, display.getSize());
        checkDouble(1.5, display.getRatio());
        checkDouble(20, display.getDensity());

    }

    @Test
    public void testDisplaysSurfaceArea() {
        double width =  Math.cos(Math.atan(display.getRatio())) * display.getSize();
        double height =  Math.sin(Math.atan(display.getRatio())) * display.getSize();
        double expected = width * height;
        checkDouble(expected, display.getSurfaceArea());
    }

    private void checkDouble(double expected, double actual){
        assertEquals(expected, actual, expected * 1e-6);
    }
}