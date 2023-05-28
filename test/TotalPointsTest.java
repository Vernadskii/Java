import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TotalPointsTest {
    @Test
    @DisplayName("Basic tests")
    public void basicTests() {
        assertEquals(30, TotalPoints.points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));

        assertEquals(10, TotalPoints.points(new String[]
                {"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}));

        assertEquals(6, TotalPoints.points(new String[]
                {"19:12", "12:10"}));

    }
}