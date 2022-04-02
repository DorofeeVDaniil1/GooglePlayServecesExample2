package com.example.googleplayservecesexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.games.PlayGames;
import com.google.android.gms.games.PlayGamesSdk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlayGamesSdk.initialize(this);
    }
}