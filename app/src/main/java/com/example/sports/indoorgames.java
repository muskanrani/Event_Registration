package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class indoorgames extends AppCompatActivity {
Button carrom,chess,tennis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indoorgames);
        carrom=findViewById(R.id.ca);
        chess=findViewById(R.id.ch);
        tennis=findViewById(R.id.tt);
        carrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crr=new Intent(indoorgames.this,carromTerms.class);
                startActivity(crr);
            }
        });
        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chterm=new Intent(indoorgames.this,carromTerms.class);
                startActivity(chterm);
            }
        });
        tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teterm=new Intent(indoorgames.this,carromTerms.class);
                startActivity(teterm);
            }
        });
    }
}
