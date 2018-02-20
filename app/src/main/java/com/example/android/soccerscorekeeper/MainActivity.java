package com.example.android.soccerscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;

    TextView scoreA;
    TextView scoreB;
    TextView foulsA;
    TextView foulsB;
    TextView yellowA;
    TextView yellowB;
    TextView redA;
    TextView redB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA = findViewById(R.id.team_a_score);
        scoreB = findViewById(R.id.team_b_score);
        foulsA = findViewById(R.id.team_a_fouls);
        foulsB = findViewById(R.id.team_b_fouls);
        yellowA = findViewById(R.id.team_a_yellow_cards);
        yellowB = findViewById(R.id.team_b_yellow_cards);
        redA = findViewById(R.id.team_a_red_cards);
        redB = findViewById(R.id.team_b_red_cards);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
            foulsTeamA = savedInstanceState.getInt("foulsTeamA");
            foulsTeamB = savedInstanceState.getInt("foulsTeamB");
            yellowTeamA = savedInstanceState.getInt("yellowTeamA");
            yellowTeamB = savedInstanceState.getInt("yellowTeamB");
            redTeamA = savedInstanceState.getInt("redTeamA");
            redTeamB = savedInstanceState.getInt("redTeamB");
            displayScoreTeamA(scoreTeamA);
            displayScoreTeamB(scoreTeamB);
            displayFoulsTeamA(foulsTeamA);
            displayFoulsTeamB(foulsTeamB);
            displayYellowCardsTeamA(yellowTeamA);
            displayYellowCardsTeamB(yellowTeamB);
            displayRedCardsTeamA(redTeamA);
            displayRedCardsTeamB(redTeamB);
        }


    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
        outState.putInt("foulsTeamA", foulsTeamA);
        outState.putInt("foulsTeamB", foulsTeamB);
        outState.putInt("yellowTeamA", yellowTeamA);
        outState.putInt("yellowTeamB", yellowTeamB);
        outState.putInt("redTeamA", redTeamA);
        outState.putInt("redTeamB", redTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow cards for Team A.
     */
    public void displayYellowCardsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow cards for Team B.
     */
    public void displayYellowCardsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team A.
     */
    public void displayRedCardsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team B.
     */
    public void displayRedCardsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases score for Team A by 1 point
     */
    public void goalTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Increases score for Team B by 1 point
     */
    public void goalTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Increases fouls for Team A by 1 point
     */
    public void foulTeamA(View view){
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
    }

    /**
     * Increases fouls for Team B by 1 point
     */
    public void foulTeamB(View view){
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamB);
    }

        /**
     * Increases yellow cards for Team A by 1 point
     */
    public void yellowCardsTeamA(View view){
        yellowTeamA = yellowTeamA + 1;
        displayYellowCardsTeamA(yellowTeamA);
    }

    /**
     * Increases yellow cards for Team B by 1 point
     */
    public void yellowCardsTeamB(View view){
        yellowTeamB = yellowTeamB + 1;
        displayYellowCardsTeamB(yellowTeamB);
    }

    /**
     * Increases red cards for Team A by 1 point
     */
    public void redCardsTeamA(View view){
        redTeamA = redTeamA + 1;
        displayRedCardsTeamA(redTeamA);
    }

    /**
     * Increases red cards for Team B by 1 point
     */
    public void redCardsTeamB(View view){
        redTeamB = redTeamB + 1;
        displayRedCardsTeamB(redTeamB);
    }

    /**
     * This method resets all scores to 0 and it displays them
     */
    public void resetAll(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        displayScoreTeamA (scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
        displayYellowCardsTeamA(yellowTeamA);
        displayYellowCardsTeamB(yellowTeamB);
        displayRedCardsTeamA(redTeamA);
        displayRedCardsTeamB(redTeamB);
    }
}

