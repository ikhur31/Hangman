package me.ilyaskhurshid.hangman;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class GameEnd extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_end);

        Bundle extrasEnd = getIntent().getExtras();

        String winlose = extrasEnd.getString("END");

        TextView winlosetv = (TextView) findViewById(R.id.winlosetv);
        winlosetv.setText(winlose);

        final ImageView Stage6 = (ImageView) findViewById(R.id.Stage6);
        Stage6.setVisibility(View.INVISIBLE);

        final VideoView videov = (VideoView) findViewById(R.id.fireworks);
        videov.setVisibility(View.INVISIBLE);

        if(winlose.equals("You Lose!"))
        {
            Stage6.setVisibility(View.VISIBLE);
        }
        else
        {
            videov.setVisibility(View.VISIBLE);

            String videopath = "android.resource://me.ilyaskhurshid.hangman/" + R.raw.fireworks;
            Uri uri = Uri.parse(videopath);
            videov.setVideoPath(videopath);
            videov.start();
        }
    }

    public void EndBtnClicked(View view)
    {
        Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);

        switch (view.getId())
        {
            case R.id.NewGame:
            {
                Bundle extrasEnd = getIntent().getExtras();

                Bundle extrasMain = new Bundle();
                extrasMain.putString("END", "You Win!");
                extrasMain.putInt("WINCOUNTER", extrasEnd.getInt("WINCOUNTER"));
                extrasMain.putInt("LOSSCOUNTER", extrasEnd.getInt("LOSSCOUNTER"));
                startIntent.putExtras(extrasMain);

                startActivity(startIntent);
                break;
            }
        }
    }
}