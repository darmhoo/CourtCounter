package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointA = 0;
    int pointB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a3 = findViewById(R.id.a_3points);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pointA += 3;
                TextView textView = findViewById(R.id.team_a_score);
                textView.setText("" + pointA);

            }
        });

        Button a2 = findViewById(R.id.a_2points);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pointA += 2;
                TextView textView = findViewById(R.id.team_a_score);
                textView.setText("" + pointA);

            }
        });

        Button a1 = findViewById(R.id.a_free);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pointA += 1;
                TextView textView = findViewById(R.id.team_a_score);
                textView.setText("" + pointA);

            }
        });

        Button b3 = findViewById(R.id.b_3points);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pointB +=3;
                TextView textView = findViewById(R.id.team_b_score);
                textView.setText("" + pointB);
            }
        });

        Button b2 = findViewById(R.id.b_2points);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pointB +=2;
                TextView textView = findViewById(R.id.team_b_score);
                textView.setText("" + pointB);
            }
        });

        Button b1 = findViewById(R.id.b_free);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pointB +=1;
                TextView textView = findViewById(R.id.team_b_score);
                textView.setText("" + pointB);
            }
        });
        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pointA = pointB = 0;
                TextView textView = findViewById(R.id.team_a_score);
                textView.setText("" + pointA);
                TextView textView1 = findViewById(R.id.team_b_score);
                textView1.setText("" + pointB);
            }
        });











//
    }

    private void display(int number, int x) {
        TextView quantityTextView = (TextView) findViewById(x);
        quantityTextView.setText("" + number);
    }
    private void setButton(Button b, final int n){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
