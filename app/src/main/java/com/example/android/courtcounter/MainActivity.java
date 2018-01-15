package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.a_3points);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                points += 3;
                display(points);
            }
        });
        Button b2 = findViewById(R.id.b_3points);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                points += 3;
                display(points);
            }
        });
        Button b3 = findViewById(R.id.a_2points);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                points += 2;
                display(points);
            }
        });
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + number);
    }
}
