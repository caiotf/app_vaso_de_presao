package com.caiotf.appbruno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoT extends AppCompatActivity {

    private EditText valorP, valorR, valorS, valorE;
    private Button botaoCalcularT;
    private TextView textoResultadoT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_calculo_t);

        valorP = findViewById(R.id.editText_t_P);
        valorR = findViewById(R.id.editText_t_R);
        valorS = findViewById(R.id.editText_t_S);
        valorE = findViewById(R.id.editText_t_E);
        botaoCalcularT = findViewById(R.id.botaoT);
        textoResultadoT = findViewById(R.id.textView_resultado_T);

        botaoCalcularT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recuperar valores digitados
                String textoP = valorP.getText().toString();
                String textoR = valorR.getText().toString();
                String textoS = valorS.getText().toString();
                String textoE = valorE.getText().toString();

                //Converter valores strings para numeros
                Double varP = Double.parseDouble(textoP);
                Double varR = Double.parseDouble(textoR);
                Double varS = Double.parseDouble(textoS);
                Double varE = Double.parseDouble(textoE);

                Double resultado = (varP * varR) / ((varS * varE) - (0.6 * varP));

                textoResultadoT.setText("Espessura mín. = "+String.valueOf(resultado)+" mm");
            }
        });

    }
}
