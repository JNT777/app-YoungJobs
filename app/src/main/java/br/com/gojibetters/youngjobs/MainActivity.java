package br.com.gojibetters.youngjobs;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        AppCompatButton btnCad = findViewById(R.id.cadastro);
        btnCad.setOnClickListener(view -> {
            startActivity(new Intent(this, Login.class));
        });

        AppCompatButton btnLogin = findViewById(R.id.login);
        btnLogin.setOnClickListener(view -> {
                startActivity(new Intent(this, Login.class));
        });

    }
}