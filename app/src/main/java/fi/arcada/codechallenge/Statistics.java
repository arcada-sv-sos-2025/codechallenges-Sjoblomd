package fi.arcada.codechallenge;

import java.util.ArrayList;

public class Statistics {
    public static double calcMean(ArrayList<Double> data) {
        if (data == null || data.isEmpty()) return 0;

        double sum = 0;
        for (double num : data) {
            sum += num;
        }

        return sum / data.size();
    }
}
