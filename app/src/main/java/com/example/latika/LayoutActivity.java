package com.example.latika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        //initiate view's
        ImageButton buttonperkalian = (ImageButton)findViewById(R.id.buttonperkalian);
        ImageButton buttonbilanganbulat = (ImageButton)findViewById(R.id.buttonbilanganbulat);
        ImageButton buttonfpb = (ImageButton)findViewById(R.id.buttonfpb);


        //perform click event on button's
        buttonperkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Perkalian Button",Toast.LENGTH_LONG).show();// display the toast on home button click
            }
        });

        buttonbilanganbulat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Bilangan Bulat Button",Toast.LENGTH_LONG).show();// display the toast on home button click
            }
        });

        buttonfpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"fpbButton",Toast.LENGTH_LONG).show();// display the toast on home button click
            }
        });
    }
}
