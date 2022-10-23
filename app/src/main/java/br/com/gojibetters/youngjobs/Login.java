package br.com.gojibetters.youngjobs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AppCompatButton btnEntrar = findViewById(R.id.btn_entrar);
        btnEntrar.setOnClickListener(view -> {
            startActivity(new Intent(this, Vagas.class));
        });

        AppCompatButton btnCadCandidato = findViewById(R.id.btn_cadastro_candidato);
        btnCadCandidato.setOnClickListener(view -> {
            startActivity(new Intent(this, Candidato.class));
        });

        AppCompatButton btnCadEmpresa = findViewById(R.id.btn_cadastro_empresa);
        btnCadEmpresa.setOnClickListener(view -> {
            startActivity(new Intent(this, Empresa.class));
        });

        ImageView imgBack = findViewById(R.id.back_button_login);
        imgBack.setOnClickListener(view -> {
            this.finish();
        });



    }
}
