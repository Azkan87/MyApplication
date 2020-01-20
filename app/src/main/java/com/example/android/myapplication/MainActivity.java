package com.example.android.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Scanner;

import static com.example.android.myapplication.R.id.buttMinusPlayer1;
import static com.example.android.myapplication.R.id.buttMinusPlayer2;
import static com.example.android.myapplication.R.id.buttPlusPlayer1;
import static com.example.android.myapplication.R.id.buttPlusPlayer2;
import static com.example.android.myapplication.R.id.buttPlusPlayer3;
import static com.example.android.myapplication.R.id.buttPlusPlayer4;
import static com.example.android.myapplication.R.id.message;
import static com.example.android.myapplication.R.id.scoreOne;
import static java.lang.String.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


/*
private ImageButton buttonPlus2 = findViewById(buttPlusPlayer2);

private ImageButton buttonPlus3 = findViewById(buttPlusPlayer3);
private ImageButton buttonPlus4 = findViewById(buttPlusPlayer4);

private ImageButton buttonMinus1 = findViewById(buttMinusPlayer1);
private ImageButton buttonMinus2 = findViewById(R.id.buttMinusPlayer2);
private ImageButton buttonMinus3 = findViewById(R.id.buttMinusPlayer3);
private ImageButton buttonMinus4 = findViewById(R.id.buttMinusPlayer4);

*/


/*    typeFirstPlayer = findViewById(R.id.firstPlayer);
        Editable firstPlayerName = typeFirstPlayer.getText();

        typeSecondPlayer = findViewById(R.id.secondPlayer);
        Editable secondPlayerName = typeSecondPlayer.getText();

        typeThirdPlayer =  findViewById(R.id.thirdPlayer);
        Editable thirdPlayerName = typeThirdPlayer.getText();

        typeFourthPlayer = findViewById(R.id.fourthPlayer);
        Editable fourthPlayerName = typeFourthPlayer.getText();
*/
    private TextView mFirstScore;
    private TextView mSecondscore;
    private TextView mThirdScore;
    private TextView mFourthscore;


    private int calculatioResult ;
    int a;
    int b;
    private String firstScore1;
    private     String test;




EditText typeFirstPlayer ;
EditText typeSecondPlayer;
EditText typeThirdPlayer;
EditText typeFourthPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFirstScore = findViewById(scoreOne);
        mSecondscore = findViewById(R.id.score2);
        mThirdScore = findViewById(R.id.score3);
        mFourthscore = findViewById(R.id.score4);



        findViewById(buttPlusPlayer1).setOnClickListener(this);
        findViewById(buttPlusPlayer2).setOnClickListener(this);
        findViewById(buttPlusPlayer3).setOnClickListener(this);
        findViewById(buttPlusPlayer4).setOnClickListener(this);
        findViewById(buttMinusPlayer1).setOnClickListener(this);
        findViewById(R.id.buttMinusPlayer2).setOnClickListener(this);
        findViewById(R.id.buttMinusPlayer3).setOnClickListener(this);
        findViewById(R.id.buttMinusPlayer4).setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {

            switch (v.getId()) {
                case buttPlusPlayer1:

                    Intent i = new Intent(this, SecondActivity.class);
                    startActivityForResult(i, 1);

                    firstScore();

                    break;

                case buttPlusPlayer2:
                    Intent i2 = new Intent(this, ThirdPlusActivity.class);
                    startActivityForResult(i2, 2);
                    break;

                case buttPlusPlayer3:
                    Intent i3 = new Intent(this, FourthPlusActivity.class);
                    startActivityForResult(i3, 3);
                    break;

                case buttPlusPlayer4:
                    Intent i4 = new Intent(this, FifthPlusActivity.class);
                    startActivityForResult(i4, 4);
                    break;

                case buttMinusPlayer1:
                    Intent i5 = new Intent(this, FirstMinusActivity.class);
                    startActivityForResult(i5, 5);
                    calculatioResult = 0;

                    calculatioResult = b - a;
                    firstScore1 = valueOf(calculatioResult);
                    mFirstScore.setText(firstScore1);

                    break;

                case  buttMinusPlayer2:
                    // CODE inc
                    break;
            }
            }


/*
        //option wich already worked but it doesnt anymore
        buttonPlus1 = findViewById(R.id.buttPlusPlayer1);
        buttonPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               startActivityForResult(new Intent(getApplicationContext(),SecondActivity.class),0);


            }
        });

        buttonPlus2 = findViewById(R.id.buttPlusPlayer2);
        buttonPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivityForResult(new Intent(getApplicationContext(), ThirdPlusActivity.class), 0);

            }
        });

*/





    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {



        if (requestCode == 1  && resultCode == RESULT_OK) {

            test = data.getStringExtra("message");
            a = Integer.parseInt(test);
   /*        String b = data.getStringExtra("message5");
             int z = Integer.parseInt(b);
             int fResult = i - z;
            String firstResult = Integer.toString(fResult);

  */

 //           textV.setText(data.getStringExtra("message"));
 //            a = data.getIntExtra("message",0);


 //           mFirstScore.setText(String.valueOf(a));


        }

        if (requestCode == 2 && resultCode == RESULT_OK) {
            b = data.getIntExtra("message2",0);
//            mSecondscore.setText(data.getStringExtra("message2"));
        }
        if (requestCode == 3 && resultCode == RESULT_OK) {
            mThirdScore.setText(data.getStringExtra("message3"));
        }

        if (requestCode == 4 && resultCode == RESULT_OK) {
            mFourthscore.setText(data.getStringExtra("message4"));
        }


    }

    public void firstScore(){
        calculatioResult = a + b;
        firstScore1 = valueOf(calculatioResult);
        mFirstScore.setText(firstScore1);

    }


    }






