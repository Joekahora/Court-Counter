package example.com.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      int scoreTeamA = 0;
      int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void teamAAddThree(View v) {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void teamAAddTwo(View v) {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void teamAAddOne(View v) {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBAddThree(View v) {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void teamBAddTwo(View v) {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void teamBAddOne(View v) {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);

    }

    public void displaySummary(View view){
        if(scoreTeamA>scoreTeamB)
        Toast.makeText(this, "Philly has won the game", Toast.LENGTH_SHORT).show();

         else if (scoreTeamA==scoreTeamB)
           Toast.makeText(this, "It is a tie between Philly and the warriors", Toast.LENGTH_SHORT).show();

        else{
          Toast.makeText(this, "The Golden State Warriors has won the game", Toast.LENGTH_SHORT).show();
        }

    }
}
