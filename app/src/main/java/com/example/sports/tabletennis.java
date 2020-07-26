package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class tabletennis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabletennis);
        View ttTerm= findViewById(R.id.tt_Terms);
        ttTerm.setVisibility(View.GONE);
    }
}
