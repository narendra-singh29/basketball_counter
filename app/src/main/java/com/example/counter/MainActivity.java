package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int FinalScoreA;
    int FinalScoreB;

    public void DisplayA(int num){
        TextView TotalScoreA = (TextView) findViewById(R.id.TotalTeamA);
        TotalScoreA.setText(String.valueOf(num));
    }
    public void DisplayB(int num){
        TextView TotalScoreB = (TextView) findViewById(R.id.TotalTeamB);
        TotalScoreB.setText(String.valueOf(num));
    }

    public void PlusThreeA(View view){
        FinalScoreA = FinalScoreA+3;
        DisplayA(FinalScoreA);
    }
    public void PlusThreeB(View view){
        FinalScoreB = FinalScoreB+3;
        DisplayB(FinalScoreB);
    }
    public void PlusTwoA(View view){
        FinalScoreA = FinalScoreA+2;
        DisplayA(FinalScoreA);
    }
    public void PlusTwoB(View view){
        FinalScoreB = FinalScoreB+2;
        DisplayB(FinalScoreB);
    }
    public void PlusOneA(View view){
        FinalScoreA = FinalScoreA+1;
        DisplayA(FinalScoreA);
    }
    public void PlusOneB(View view) {
        FinalScoreB = FinalScoreB + 1;
        DisplayB(FinalScoreB);
    }
    public void Reset(View view){
        FinalScoreA = FinalScoreB = 0;
        DisplayB(FinalScoreB);
        DisplayA(FinalScoreA);
    }

}