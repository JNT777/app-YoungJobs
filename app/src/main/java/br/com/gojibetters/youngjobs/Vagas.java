package br.com.gojibetters.youngjobs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Vagas extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vagas);

        ImageView imgBack = findViewById(R.id.back_button_vagas);
        imgBack.setOnClickListener(view -> this.finish());

        Button btnJovemAprendiz = findViewById(R.id.btn_jovem_aprendiz);
        Button btnAuxManu = findViewById(R.id.btn_aux_manutencao);
        Button btnOpTelemarke = findViewById(R.id.btn_op_marketing);
        Button btnTecEletro = findViewById(R.id.btn_tec_eletro);
        Button btnDevWebJun = findViewById(R.id.dev_junior);
        Button btnAuxLog = findViewById(R.id.aux_logistica);
        Button btnAuxAdm = findViewById(R.id.aux_adm);
        Button btnAuxContab = findViewById(R.id.aux_contabil);
        Button btnEstagQuim = findViewById(R.id.quimica);
        Button btnVendedor = findViewById(R.id.vendedor);

        btnJovemAprendiz.setOnClickListener(view -> reqLink());
        btnAuxManu.setOnClickListener(view -> reqLink());
        btnOpTelemarke.setOnClickListener(view -> reqLink());
        btnTecEletro.setOnClickListener(view -> reqLink());
        btnDevWebJun.setOnClickListener(view -> reqLink());
        btnAuxLog.setOnClickListener(view -> reqLink());
        btnAuxAdm.setOnClickListener(view -> reqLink());
        btnAuxContab.setOnClickListener(view -> reqLink());
        btnEstagQuim.setOnClickListener(view -> reqLink());
        btnVendedor.setOnClickListener(view -> reqLink());

    }

    public void reqLink() {
        String url = "https://www.trabalhabrasil.com.br/login?tipoPerfil=Candidato&url=vagas-empregos-em-sao-paulo-sp/estoquista/9127471/candidaturaAutomatica";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
