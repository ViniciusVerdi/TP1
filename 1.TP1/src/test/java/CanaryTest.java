import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanaryTest {

    @Test
    void func() {
        boolean passed = true;
        Assertions.assertTrue(passed);
        Assertions.assertEquals(true, passed);
    }
}