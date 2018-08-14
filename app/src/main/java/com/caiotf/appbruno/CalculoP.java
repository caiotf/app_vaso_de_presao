package com.caiotf.appbruno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoP extends AppCompatActivity {

    private EditText valorT, valorR, valorS, valorE;
    private Button botaoCalcularP;
    private TextView textoResultadoP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_calculo_p);

        valorT = findViewById(R.id.editText_p_T);
        valorR = findViewById(R.id.editText_p_R);
        valorS = findViewById(R.id.editText_p_S);
        valorE = findViewById(R.id.editText_p_E);
        botaoCalcularP = findViewById(R.id.botaoP);
        textoResultadoP = findViewById(R.id.textView_resultado_P);

        botaoCalcularP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recuperar valores digitados
                String textoT = valorT.getText().toString();
                String textoR = valorR.getText().toString();
                String textoS = valorS.getText().toString();
                String textoE = valorE.getText().toString();

                //Converter valores strings para numeros
                Double varT = Double.parseDouble(textoT);
                Double varR = Double.parseDouble(textoR);
                Double varS = Double.parseDouble(textoS);
                Double varE = Double.parseDouble(textoE);

                Double resultado = 0.0;

                /*
                if(varT == 0){
                    resultado = (varP * varR) / ((varS * varE) - (0.6 * varP));
                }*/

                resultado = (varS * varE * varT) / (varR + (0.6 * varT));

                textoResultadoP.setText("Pressão = " +String.valueOf(resultado)+" MPa");
            }
        });

    }
}
