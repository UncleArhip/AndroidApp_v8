package com.example.user.newshooter;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

/**
 * Created by user on 6/9/2016.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.zv);
        mPlayer.start(); // no need to call prepare(); create() does that for you
        SpaceShooterView.score = 0;
        SpaceShooterView.lives = 3;
    }

    public void onStartButton(View v) {
        Intent intent = new Intent(this, SpaceShooterActivity.class);
        startActivity(intent);
        this.finish();
    }
}