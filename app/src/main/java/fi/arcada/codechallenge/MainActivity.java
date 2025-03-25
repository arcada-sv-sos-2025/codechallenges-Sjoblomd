package fi.arcada.codechallenge;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Double> numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultText = findViewById(R.id.resultText);
        Button calculateBtn = findViewById(R.id.calculateBtn);

        numbers = new ArrayList<>();
        numbers.add(4.0);
        numbers.add(7.0);
        numbers.add(10.0);

        calculateBtn.setOnClickListener(view -> {
            double mean = Statistics.calcMean(numbers);
            String formatted = String.format(Locale.US, "Mean: %.2f", mean);
            resultText.setText(formatted);
        });
    }
}
