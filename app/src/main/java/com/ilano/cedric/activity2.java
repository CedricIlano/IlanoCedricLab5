package com.ilano.cedric;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }

    public void activity1 (View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

