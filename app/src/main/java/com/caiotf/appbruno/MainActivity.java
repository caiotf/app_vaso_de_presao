package com.caiotf.appbruno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagem_form_P, imagem_form_T, imagemInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        imagem_form_T = findViewById(R.id.imageView_T);
        imagem_form_P = findViewById(R.id.imageView_P);
        imagemInfo = findViewById(R.id.imageView_Info);

        imagem_form_T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CalculoT.class));
            }
        });

        imagem_form_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CalculoP.class));
            }
        });

        imagemInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Info.class));
            }
        });

    }
}
