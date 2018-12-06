package com.example.android.courtpoints;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.courtpoints.R;


/**
 * This app displays scores for a basketball game.
 */

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    /**
     * This method displays background image.
     */
    public void display(View view) {
        RelativeLayout layout = findViewById(R.id.RelativeLayoutImage);
        layout.setBackgroundResource(R.drawable.ball);
    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the +3 Points button is clicked on Team A.
     */
    public void threePoints(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the +2 Points button is clicked on Team A.
     */
    public void twoPoints(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the free throw button is clicked on Team A.
     */
    public void onePoint(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the fouls button is clicked on Team A.
     */
    public void oneFoulA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFoulTeamA(int foul) {
        TextView foulView = findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +3 Points button is clicked on Team B.
     */
    public void threePointsB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the +2 Points button is clicked on Team B  .
     */
    public void twoPointsB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the free throw button is clicked on Team B.
     */
    public void onePointB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the fouls button is clicked on Team B.
     */
    public void oneFoulB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB(foulTeamB);
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayFoulTeamB(int foul) {
        TextView foulView = findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }


    /**
     * This method is called when the Reset button is clicked.
     */
    public void Reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
    }

}
