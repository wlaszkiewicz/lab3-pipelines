import org.example.HRCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HRCalculatorTest {
    @Test
    public void testValidMaxHR(){
        var result = HRCalculator.calculateMaxHR(25);
        assertEquals(195, result);
    }

    @Test
    public void testInvalidMinHR_ageTooHigh() {
        assertThrows(IllegalArgumentException.class,
            () -> HRCalculator.calculateMaxHR(500));
    }

    @Test
    public void testInvalidMinHR_ageTooLow() {
        assertThrows(IllegalArgumentException.class,
            () -> HRCalculator.calculateMaxHR(-1));
    }

    @Test
    public void testBelowZone() {
        assertEquals("Below target zone", HRCalculator.getWorkoutZone(40, 80));
    }

    @Test
    public void testModerateZone() {
        assertEquals("Moderate Activity (Maintenance / warm up)", HRCalculator.getWorkoutZone(40, 100));
    }

    @Test
    public void testWeightControlZone() {
        assertEquals("Weight Control (Fitness training / fat burning)", HRCalculator.getWorkoutZone(40, 120));
    }

    @Test
    public void testAerobicZone() {
        assertEquals("Aerobic (Cardio / endurance training)", HRCalculator.getWorkoutZone(40, 130));
    }

    @Test
    public void testAnaerobicZone() {
        assertEquals("Anaerobic (Hardcore training)", HRCalculator.getWorkoutZone(40, 150));
    }

    @Test
    public void testVO2Zone() {
        assertEquals("VO2 Max (Maximum effort)", HRCalculator.getWorkoutZone(40, 170));
    }

    @Test
    public void testConstructorCoverage() {
        new HRCalculator(); // to cover the constructor for jacoco
    }




}
