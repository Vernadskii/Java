import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SheepCounterTest {
    Boolean[] array1 = {
            true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true
    };

    Boolean[] array2 = {
            true,  null,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true
    };

    @Test
    public void test() {
        assertEquals(17, new SheepCounter().countSheeps(array1), "There are 17 sheeps in total");
    }

    @Test
    public void testWithNull(){
        assertEquals(16, new SheepCounter().countSheeps(array2), "There are 16 sheeps in total");
    }
}
