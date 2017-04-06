package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int Dallas = 0;
    int Opponent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Dallas
     */
    public void displayDallas(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_dc_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Opponent
     */
    public void displayOpponent(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_op_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 6 point button dallas is clicked.
     */
    public void addSixForDc(View v) {
        Dallas = Dallas + 6;
        displayDallas(Dallas);

    }

    /**
     * This method is called when the 2 point button Dallas is clicked.
     */
    public void addTwoForDc(View v) {
        Dallas = Dallas + 2;
        displayDallas(Dallas);
    }

    /**
     * This method is called when the extra point Dallas button is clicked.
     */
    public void addOneForDc(View view) {
        Dallas = Dallas + 1;
        displayDallas(Dallas);
    }

    /**
     * This method is called when the field goal Dallas button is clicked.
     */
    public void addThreeForDc(View view) {
        Dallas = Dallas + 3;
        displayDallas(Dallas);
    }

    /**
     * This method displays the given 3 points value on the screen.
     */
    private void display(int number) {
        TextView scoreTextView = (TextView) findViewById(
                R.id.team_dc_score);
        scoreTextView.setText("" + number);
    }

    /**
     * This method is called when the 6 point button Opponent is clicked.
     */
    public void addSixForOp(View v) {
        Opponent = Opponent + 6;
        displayOpponent(Opponent);

    }

    /**
     * This method is called when the 2 point button Opponent is clicked.
     */
    public void addTwoForOp(View v) {
        Opponent = Opponent + 2;
        displayOpponent(Opponent);
    }

    /**
     * This method is called when the extra point Opponent button is clicked.
     */
    public void addOneForOp(View view) {
        Opponent = Opponent + 1;
        displayOpponent(Opponent);
    }

    /**
     * This method is called when the field goal Opponent button is clicked.
     */
    public void addThreeForOp(View view) {
        Opponent = Opponent + 3;
        displayOpponent(Opponent);
    }

    /**
     * This method displays the given 3 points value on the screen.
     */
    private void displayOp(int number) {
        TextView scoreTextView = (TextView) findViewById(
                R.id.team_op_score);
        scoreTextView.setText("" + number);
    }

    /**
     * This method resets score with reset button.
     */
    public void resetScore(View v) {
        Dallas = 0;
        Opponent = 0;
        displayDallas(Dallas);
        displayOpponent(Opponent);
    }


}
