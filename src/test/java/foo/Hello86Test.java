package foo;
import org.junit.Test;
import static org.junit.Assert.*;

public class Hello86Test {
    @Test public void one() {
        if (Math.random() < 0.015) {
            fail("oops");
        }
    }
    @Test public void two() {}
    @Test public void three() throws Exception {
        Thread.sleep(860);
    }
    @Test public void four() throws Exception {
        Thread.sleep(1000);
    }
}
