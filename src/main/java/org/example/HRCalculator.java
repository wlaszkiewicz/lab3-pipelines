package org.example;

public class HRCalculator {

    public HRCalculator() {
        // just for jacoco coverage
    }

    public static int calculateMaxHR(int age) {
        if (age > 120 || age < 0) {
            throw new IllegalArgumentException("Age out of bounds");
        }
        return 220 - age;
    }

    public static String getWorkoutZone(int age, int bpm){
        int maxHR = 220 - age;
        double percent = (bpm / (double) maxHR) * 100;

        if (percent < 50)
            return "Below target zone";
        else if (percent < 60)
            return "Moderate Activity (Maintenance / warm up)";
        else if (percent < 70)
            return "Weight Control (Fitness training / fat burning)";
        else if (percent < 80)
            return "Aerobic (Cardio / endurance training)";
        else if (percent < 90)
            return "Anaerobic (Hardcore training)";
        else
            return "VO2 Max (Maximum effort)";
    }
}
