package com.example.ricardo.coversion;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText eThePesos, eLosDolares;
    Button bConvertir;
    CharSequence text1 = "Por favor ingrese una cantidad";
    CharSequence text2 = "Por favor ingrese solo un valor";
    int duration = Toast.LENGTH_SHORT;
    Double pesos, dolares;
    String cop, usd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eLosDolares=(EditText) findViewById(R.id.LosDolares);
        eThePesos=(EditText) findViewById(R.id.ThePesos);
        bConvertir=(Button) findViewById(R.id.Convertir);
        final DecimalFormat formateador = new DecimalFormat("#.##");

        bConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (eThePesos.getText().toString().equals("") && !eLosDolares.getText().toString().equals("")) {
                    dolares = Double.parseDouble(eLosDolares.getText().toString());
                    pesos = dolares * 3000;
                    cop = formateador.format(pesos);
                    eThePesos.setText(cop);
                }

                else if (!eThePesos.getText().toString().equals("") && eLosDolares.getText().toString().equals("")){
                    pesos = Double.parseDouble(eThePesos.getText().toString());
                    dolares = pesos / 3000;
                    usd = formateador.format(dolares);
                    eLosDolares.setText(usd);
                }

                else if (eThePesos.getText().toString().equals("") && eLosDolares.getText().toString().equals("")){
                    Toast toast1 = Toast.makeText(getApplicationContext(), text1, duration);
                    toast1.show();
                }

                else if (!eThePesos.getText().toString().equals("") && !eLosDolares.getText().toString().equals("")){
                    Toast toast2 = Toast.makeText(getApplicationContext(), text2, duration);
                    toast2.show();
                }
            }
        });
    }

}
