package com.example.latika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LatihanActivity extends AppCompatActivity {

    Button Mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);

        Mulai = (Button) findViewById(R.id.Mulai);

        Mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LatihanActivity.this, SoalActivity.class);
                startActivity(intent);
            }
        });
    }
}
