package com.example.ricardo.coversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eThePesos, eLosDolares;
    Button bConvertir;

    Double pesos, dolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eLosDolares=(EditText) findViewById(R.id.LosDolares);
        eThePesos=(EditText) findViewById(R.id.ThePesos);
        bConvertir=(Button) findViewById(R.id.Convertir);

        bConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //pesos = Double.parseDouble(eThePesos.getText().toString());
                //dolares = Double.parseDouble(eLosDolares.getText().toString());

                if (eThePesos.getText().toString().equals("") && !eLosDolares.getText().toString().equals("")) {
                    dolares = Double.parseDouble(eLosDolares.getText().toString());
                    pesos = dolares * 3000;
                    eThePesos.setText(pesos.toString());
                }
            }
        });
    }

}
