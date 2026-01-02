package com.example.juego2d;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Establecer la vista del juego como la vista principal
        GameView gameView = new GameView(this, null);
        setContentView(gameView);
    }
}