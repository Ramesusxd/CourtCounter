package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // tracks for team a
    int scoreTeamA = 0;
    //tracks for team b
    int scoreTeamB = 0;
    // Time outs for team a
    int timeOutsTeamA = 0;
    // time outs for team b
    int TimeOutForTeamB = 0;
    // fouls for team a
    int foulsForTeamA = 0;
    // fouls for team b
    int FoulsForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * increase score by 3 points.
     */

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * increase score by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase score by 1 points.
     */

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score, timeout and fouls for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    // fouls for team a

    public void displayForTeamAFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForTeamATime(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_timeout);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * time outs for team a
     */
    public void timeOutForTeamA(View v) {

        if (timeOutsTeamA == 6) {
            // team A used max time outs which is 6
            Toast.makeText(this, "The home team has used max amout of timeouts ", Toast.LENGTH_SHORT).show();
            // exit this method nothing else to do
            return;
        }
        timeOutsTeamA = timeOutsTeamA + 1;
        displayForTeamATime(timeOutsTeamA);

    }

    /**
     * fouls for team a
     */

    public void foulForTeamA(View v) {

        if (foulsForTeamA == 5) {
            // team A max team fouls which is 5
            Toast.makeText(this, "Max amout of teamfouls used is 5", Toast.LENGTH_SHORT).show();
            // exit this method nothing else to do
            return;
        }
        foulsForTeamA = foulsForTeamA + 1;
        displayForTeamAFoul(foulsForTeamA);
    }

    /**
     * ......................Displays the given score, foul, and timeouts for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForTeamBTime(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_timeout);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increase score by 3 points.
     */

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    /**
     * increase score by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase score by 1 points.
     */

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase timeout count up to max time outs 6
     */
    public void TimeOutsForTeamB(View v) {

        if (TimeOutForTeamB == 6) {
            // show max time out is 6
            Toast.makeText(this, "The away team has used max amout of timeouts", Toast.LENGTH_SHORT).show();
            // Exit this method nothing else to do
            return;
        }
        TimeOutForTeamB = TimeOutForTeamB + 1;
        displayForTeamBTime(TimeOutForTeamB);
    }

    /**
     * increase teamfouls count up to max teamfoul 5
     */

    public void FoulForTeamB(View v) {

        if (FoulsForTeamB == 5) {
            // max team fouls allowed are 5
            Toast.makeText(this, "Max amout of teamfouls used is 5", Toast.LENGTH_SHORT).show();
            // exit this method nothing else to do
            return;
        }
        FoulsForTeamB = FoulsForTeamB + 1;
        displayForTeamBFoul(FoulsForTeamB);
    }


    /**
     * resetScore code below makes values 0 when reset button is pressed
     */


    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        timeOutsTeamA = 0;
        TimeOutForTeamB = 0;
        foulsForTeamA = 0;
        FoulsForTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamBFoul(FoulsForTeamB);
        displayForTeamAFoul(foulsForTeamA);
        displayForTeamATime(TimeOutForTeamB);
        displayForTeamBTime(timeOutsTeamA);
    }


}


