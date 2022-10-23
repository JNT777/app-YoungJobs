package br.com.gojibetters.youngjobs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Candidato extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidato);

        AppCompatButton btnEnviar = findViewById(R.id.btn_cadastro_candidato);
        btnEnviar.setOnClickListener(view -> {
            startActivity(new Intent(this, Vagas.class));
        });

        ImageView imgBack = findViewById(R.id.back_button_candidato);
        imgBack.setOnClickListener(view -> {
            this.finish();
        });


    }
}
