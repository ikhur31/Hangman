package me.ilyaskhurshid.hangman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class GameStart extends AppCompatActivity
{
    private String word;
    private int guessCounter = 5;
    private char[] userGuesses = new char[20];
    private Character[] wordArray;
    private int correct = 0;
    private int z = 0;
    private boolean correctAnswer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);

        Bundle extrasMain = getIntent().getExtras();
        String category = extrasMain.getString("CATEGORY");
        word = extrasMain.getString("WORD");
        String guessWord = " ";

        startGame(word);

        for (int i = 0; i < word.length(); i++)
        {
            guessWord = guessWord + "_ ";
        }

        TextView ctv = (TextView) findViewById(R.id.CategoryTextView);
        ctv.setText(category);

        TextView wtv = (TextView) findViewById(R.id.wordTextView);
        wtv.setText(guessWord);
    }

    private void startGame(String word)
    {
        drawing(6);

        Arrays.fill(userGuesses, ' ');

        guessCounter = 6;
        correct = 0;
        z = 0;
        wordArray = new Character[word.length()];

        for (int i = 0; i < word.length() ; i++)
        {
            wordArray[i] = new Character(word.charAt(i));
        }
    }

    public void letterClicked(View view)
    {
        final Button ABtn = (Button) findViewById(R.id.ABtn);
        final Button BBtn = (Button) findViewById(R.id.BBtn);
        final Button CBtn = (Button) findViewById(R.id.CBtn);
        final Button DBtn = (Button) findViewById(R.id.DBtn);
        final Button EBtn = (Button) findViewById(R.id.EBtn);
        final Button FBtn = (Button) findViewById(R.id.FBtn);
        final Button GBtn = (Button) findViewById(R.id.GBtn);
        final Button HBtn = (Button) findViewById(R.id.HBtn);
        final Button IBtn = (Button) findViewById(R.id.IBtn);
        final Button JBtn = (Button) findViewById(R.id.JBtn);
        final Button KBtn = (Button) findViewById(R.id.KBtn);
        final Button LBtn = (Button) findViewById(R.id.LBtn);
        final Button MBtn = (Button) findViewById(R.id.MBtn);
        final Button NBtn = (Button) findViewById(R.id.NBtn);
        final Button OBtn = (Button) findViewById(R.id.OBtn);
        final Button PBtn = (Button) findViewById(R.id.PBtn);
        final Button QBtn = (Button) findViewById(R.id.QBtn);
        final Button RBtn = (Button) findViewById(R.id.RBtn);
        final Button SBtn = (Button) findViewById(R.id.SBtn);
        final Button TBtn = (Button) findViewById(R.id.TBtn);
        final Button UBtn = (Button) findViewById(R.id.UBtn);
        final Button VBtn = (Button) findViewById(R.id.VBtn);
        final Button WBtn = (Button) findViewById(R.id.WBtn);
        final Button XBtn = (Button) findViewById(R.id.XBtn);
        final Button YBtn = (Button) findViewById(R.id.YBtn);
        final Button ZBtn = (Button) findViewById(R.id.ZBtn);
        final Button HintBtn = (Button) findViewById(R.id.HintBtn);

        switch (view.getId())
        {
            case R.id.ABtn:
                ABtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'A';
                processLetter();
                break;
            case R.id.BBtn:
                BBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'B';
                processLetter();
                break;
            case R.id.CBtn:
                CBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'C';
                processLetter();
                break;
            case R.id.DBtn:
                DBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'D';
                processLetter();
                break;
            case R.id.EBtn:
                EBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'E';
                processLetter();
                break;
            case R.id.FBtn:
                FBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'F';
                processLetter();
                break;
            case R.id.GBtn:
                GBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'G';
                processLetter();
                break;
            case R.id.HBtn:
                HBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'H';
                processLetter();
                break;
            case R.id.IBtn:
                IBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'I';
                processLetter();
                break;
            case R.id.JBtn:
                JBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'J';
                processLetter();
                break;
            case R.id.KBtn:
                KBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'K';
                processLetter();
                break;
            case R.id.LBtn:
                LBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'L';
                processLetter();
                break;
            case R.id.MBtn:
                MBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'M';
                processLetter();
                break;
            case R.id.NBtn:
                NBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'N';
                processLetter();
                break;
            case R.id.OBtn:
                OBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'O';
                processLetter();
                break;
            case R.id.PBtn:
                PBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'P';
                processLetter();
                break;
            case R.id.QBtn:
                QBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'Q';
                processLetter();
                break;
            case R.id.RBtn:
                RBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'R';
                processLetter();
                break;
            case R.id.SBtn:
                SBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'S';
                processLetter();
                break;
            case R.id.TBtn:
                TBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'T';
                processLetter();
                break;
            case R.id.UBtn:
                UBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'U';
                processLetter();
                break;
            case R.id.VBtn:
                VBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'V';
                processLetter();
                break;
            case R.id.WBtn:
                WBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'W';
                processLetter();
                break;
            case R.id.XBtn:
                XBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'X';
                processLetter();
                break;
            case R.id.YBtn:
                YBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'Y';
                processLetter();
                break;
            case R.id.ZBtn:
                ZBtn.setVisibility(View.INVISIBLE);
                userGuesses[z] = 'Z';
                processLetter();
                break;
            case R.id.HintBtn:
                //HintBtn.setVisibility(View.INVISIBLE);
                Random r = new Random();

                userGuesses[z] = word.charAt(r.nextInt(word.length()));

                for(int i = 0; i < z; i++)
                {
                    if(userGuesses[z] == userGuesses[i])
                    {
                        userGuesses[z] = word.charAt(r.nextInt(word.length()));
                        i=-1;
                    }
                }

                switch (userGuesses[z])
                {
                    case 'A':
                        ABtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'B':
                        BBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'C':
                        CBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'D':
                        DBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'E':
                        EBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'F':
                        FBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'G':
                        GBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'H':
                        HBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'I':
                        IBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'J':
                        JBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'K':
                        KBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'L':
                        LBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'M':
                        MBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'N':
                        NBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'O':
                        OBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'P':
                        PBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'Q':
                        QBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'R':
                        RBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'S':
                        SBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'T':
                        TBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'U':
                        UBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'V':
                        VBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'W':
                        WBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'X':
                        XBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'Y':
                        YBtn.setVisibility(View.INVISIBLE);
                        break;
                    case 'Z':
                        ZBtn.setVisibility(View.INVISIBLE);
                        break;
                }
                processLetter();
        }
    }

    private void processLetter()
    {
        for(int j = 0; j < word.length(); j++)
        {
            if(wordArray[j] == userGuesses[z])
            {
                correctAnswer = true;
                correct++;
            }
        }

        z++;

        if(correctAnswer == false)
        {
            guessCounter--;

            if(guessCounter == 1)
            {
                Bundle extrasMain = getIntent().getExtras();

                Intent startIntent = new Intent(getApplicationContext(), GameEnd.class);
                Bundle extrasEnd = new Bundle();

                extrasEnd.putString("END", "You Lose!");
                extrasEnd.putInt("WINCOUNTER", extrasMain.getInt("WINCOUNTER"));
                extrasEnd.putInt("LOSSCOUNTER", extrasMain.getInt("LOSSCOUNTER") + 1);
                startIntent.putExtras(extrasEnd);
                startActivity(startIntent);
            }
            else
            {
                TextView wtv = (TextView) findViewById(R.id.wordTextView);
                drawing(guessCounter);
                String displayT = "";

                for(int j = 0; j < word.length(); j++)
                {
                    boolean underscore = true;

                    for(int k=0; k<z; k++)
                    {
                        if(wordArray[j].equals(userGuesses[k]))
                        {
                            displayT = displayT + wordArray[j] + " ";
                            underscore = false;
                        }
                    }

                    if(underscore == true)
                    {
                        displayT = displayT + "_ ";
                    }
                }

                wtv.setText(displayT);
            }
        }
        else if(correctAnswer == true)
        {
            if(correct == word.length())
            {
                Bundle extrasMain = getIntent().getExtras();

                Intent startIntent = new Intent(getApplicationContext(), GameEnd.class);
                Bundle extrasEnd = new Bundle();
                extrasEnd.putString("END", "You Win!");
                extrasEnd.putInt("WINCOUNTER", extrasMain.getInt("WINCOUNTER") + 1);
                extrasEnd.putInt("LOSSCOUNTER", extrasMain.getInt("LOSSCOUNTER"));
                startIntent.putExtras(extrasEnd);
                startActivity(startIntent);
            }
            else
            {
                TextView wtv = (TextView) findViewById(R.id.wordTextView);
                drawing(guessCounter);
                String displayT = "";

                for(int j = 0; j < word.length(); j++)
                {
                    boolean underscore = true;

                    for(int k=0; k<z; k++)
                    {
                        if(wordArray[j].equals(userGuesses[k]))
                        {
                            displayT = displayT + wordArray[j] + " ";
                            underscore = false;
                        }
                    }

                    if(underscore == true)
                    {
                        displayT = displayT + "_ ";
                    }
                }

                wtv.setText(displayT);
            }
        }
        correctAnswer = false;
    }



    private void drawing(int position)
    {
        final ImageView Stage1 = (ImageView) findViewById(R.id.Stage1);
        final ImageView Stage2 = (ImageView) findViewById(R.id.Stage2);
        final ImageView Stage3 = (ImageView) findViewById(R.id.Stage3);
        final ImageView Stage4 = (ImageView) findViewById(R.id.Stage4);
        final ImageView Stage5 = (ImageView) findViewById(R.id.Stage5);

        Stage1.setVisibility(View.INVISIBLE);
        Stage2.setVisibility(View.INVISIBLE);
        Stage3.setVisibility(View.INVISIBLE);
        Stage4.setVisibility(View.INVISIBLE);
        Stage5.setVisibility(View.INVISIBLE);

        switch(position)
        {
            case 6:
                Stage1.setVisibility(View.VISIBLE);
                break;
            case 5:
                Stage2.setVisibility(View.VISIBLE);
                break;
            case 4:
                Stage3.setVisibility(View.VISIBLE);
                break;
            case 3:
                Stage4.setVisibility(View.VISIBLE);
                break;
            case 2:
                Stage5.setVisibility(View.VISIBLE);
                break;
            case 1:
                //Stage2.setVisibility(View.VISIBLE);
                break;
            case 0:
                //Stage1.setVisibility(View.VISIBLE);
        }
    }
}