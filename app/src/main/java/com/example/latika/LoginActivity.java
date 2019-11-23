package com.example.latika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    Button btLogin;
    TextView eUser, epass;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btLogin = (Button)findViewById(R.id.MaLogin); //dari button login agar dapat dieksekusi ke coding
        eUser = (TextView)findViewById(R.id.eUser); //dari textview user
        epass = (TextView)findViewById(R.id.epass); //digunakan untuk coding dari desain layout agar dapat dieksekusi

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = eUser.getText().toString();
                pass = epass.getText().toString();

                Bundle b = new Bundle();
                b.putString("u", user);
                b.putString("p", pass);

                Intent in = new Intent(LoginActivity.this, MenuActivity.class);
                in.putExtras(b);
                startActivity(in);
            }
        });
    }
}
