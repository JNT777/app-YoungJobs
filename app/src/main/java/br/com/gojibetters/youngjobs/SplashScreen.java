package br.com.gojibetters.youngjobs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler h = new Handler();
        h.postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));
        }, 3000);

    }
}
