package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class carromTerms extends AppCompatActivity {
Button agree;
CheckBox agreed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrom_terms);
        agree=findViewById(R.id.ag);
        agreed=findViewById(R.id.che);

            agree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (agreed.isChecked() == true) {
                        Intent gotocarrom = new Intent(carromTerms.this, carrom.class);
                        startActivity(gotocarrom);
                    }
                    else{
                        Toast.makeText(carromTerms.this, "Agree to the terms and conditions", Toast.LENGTH_LONG).show();
                    }
                }
            });


    }
}
