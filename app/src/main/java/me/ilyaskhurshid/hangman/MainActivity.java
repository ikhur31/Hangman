package me.ilyaskhurshid.hangman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
import java.util.Stack;

public class MainActivity extends AppCompatActivity
{
    Stack stack = new Stack();

    //10
    final String animals[] = {"ELEPHANT", "ALLIGATOR", "GIRAFFE", "CROCODILE", "HAMSTER", "OSTRICH", "VULTURE", "RHINOCEROS", "GORILLA", "ZEBRA"};;
    //10
    final String cities[] = {"HOUSTON", "BANGKOK", "SINGAPORE", "LONDON", "ORLANDO", "BARCELONA", "ISTANBUL", "AMSTERDAM", "SHANGHAI", "JERUSALEM"};;
    //10
    final String countries[] = {"FRANCE", "CHINA", "SPAIN", "ITALY", "TURKEY", "GERMANY", "MALAYSIA", "MEXICO", "AUSTRALIA", "THAILAND"};;
    //22
    final String fruits[] = {"STRAWBERRY" , "GRAPE", "WATERMELON", "BANANA", "ORANGE", "PEACH", "PINEAPPLE", "MANGO", "APPLE", "CHERRY",
            "BLUEBERRY", "RASPBERRY", "BLACKBERRY", "TANGERINE", "POMEGRANATE", "APRICOT", "NECTARINE", "GRAPEFRUIT", "HONEYDEW", "COCONUT", "CANTALOUPE", "LYCHEE"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView wintv = (TextView) findViewById(R.id.wintv);
        TextView losstv = (TextView) findViewById(R.id.losstv);

        Bundle extrasEnd = getIntent().getExtras();

        if(getIntent().hasExtra("END"))
        {
            wintv.setText("Wins: " + extrasEnd.getInt("WINCOUNTER"));
            losstv.setText(" Losses: " + extrasEnd.getInt("LOSSCOUNTER"));
            stack.push(extrasEnd.getInt("WINCOUNTER"));
            stack.push(extrasEnd.getInt("LOSSCOUNTER"));

        }
        else
        {
            stack.push(0);
            stack.push(0);
        }
    }

    public void categoryClicked(View view)
    {
        Random rand = new Random();

        Intent startIntent = new Intent(getApplicationContext(), GameStart.class);
        Bundle extrasMain = new Bundle();

        switch (view.getId())
        {
            case R.id.AnimalsBtn:
            {
                int randomNum = rand.nextInt(10);
                String word = animals[randomNum];

                extrasMain.putString("CATEGORY", "Animals");
                extrasMain.putString("WORD", word);
                extrasMain.putInt("LOSSCOUNTER", (int) stack.pop());
                extrasMain.putInt("WINCOUNTER", (int) stack.pop());
                startIntent.putExtras(extrasMain);
                startActivity(startIntent);

                break;
            }
            case R.id.CitiesBtn:
            {
                int randomNum = rand.nextInt(10);
                String word = cities[randomNum];

                extrasMain.putString("CATEGORY", "Cities");
                extrasMain.putString("WORD", word);
                extrasMain.putInt("LOSSCOUNTER", (int) stack.pop());
                extrasMain.putInt("WINCOUNTER", (int) stack.pop());
                startIntent.putExtras(extrasMain);
                startActivity(startIntent);

                break;
            }
            case R.id.CountriesBtn:
            {
                int randomNum = rand.nextInt(10);
                String word = countries[randomNum];

                extrasMain.putString("CATEGORY", "Countries");
                extrasMain.putString("WORD", word);
                extrasMain.putInt("LOSSCOUNTER", (int) stack.pop());
                extrasMain.putInt("WINCOUNTER", (int) stack.pop());
                startIntent.putExtras(extrasMain);
                startActivity(startIntent);

                break;
            }
            case R.id.FruitsBtn:
            {
                int randomNum = rand.nextInt(22);
                String word = fruits[randomNum];

                extrasMain.putString("CATEGORY", "Fruits");
                extrasMain.putString("WORD", word);
                extrasMain.putInt("LOSSCOUNTER", (int) stack.pop());
                extrasMain.putInt("WINCOUNTER", (int) stack.pop());
                startIntent.putExtras(extrasMain);
                startActivity(startIntent);

                break;
            }
        }
    }
}