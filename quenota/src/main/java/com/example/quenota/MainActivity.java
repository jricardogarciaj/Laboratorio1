package com.example.quenota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText ePracticas, ePavance, eSavance, eTavance, eAplicacion;
    Button bCalcular;
    CharSequence texto;
    int duration = Toast.LENGTH_SHORT;
    Double practicas, pavance, savance, tavance, aplicacion, nota;
    String notar;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePracticas = (EditText) findViewById(R.id.Practicas);
        ePavance = (EditText) findViewById(R.id.Pavance);
        eSavance = (EditText) findViewById(R.id.Savance);
        eTavance = (EditText) findViewById(R.id.Tavance);
        eAplicacion = (EditText) findViewById(R.id.Aplicacion);
        bCalcular = (Button) findViewById(R.id.calcular);
        final DecimalFormat formateador = new DecimalFormat("#.##");

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ePracticas.getText().toString().equals("") || ePavance.getText().toString().equals("") || eSavance.getText().toString().equals("") || eTavance.getText().toString().equals("") || eAplicacion.getText().toString().equals("")) {
                    texto = "Ingrese todas las notas";
                    Toast toast1 = Toast.makeText(getApplicationContext(), texto, duration);
                    toast1.show();
                }

                else if (!(ePracticas.getText().toString().equals("") || ePavance.getText().toString().equals("") || eSavance.getText().toString().equals("") || eTavance.getText().toString().equals("") || eAplicacion.getText().toString().equals(""))){
                    practicas = Double.parseDouble(ePracticas.getText().toString());
                    pavance = Double.parseDouble(ePavance.getText().toString());
                    savance = Double.parseDouble(eSavance.getText().toString());
                    tavance = Double.parseDouble(eTavance.getText().toString());
                    aplicacion = Double.parseDouble(eAplicacion.getText().toString());

                    nota = (practicas*0.6)+(pavance*0.05)+(savance*0.07)+(tavance*0.08)+(aplicacion*0.2);
                    notar = formateador.format(nota);

                    if (nota<1.05 && nota>=0){
                        texto = "Estas en el lugar equivocado: "+notar;
                        Toast toast1 = Toast.makeText(getApplicationContext(), texto, duration);
                        toast1.show();
                    }

                    else if (nota<2.05 && nota>=1.05 ){
                        texto = "Remal: "+notar;
                        Toast toast1 = Toast.makeText(getApplicationContext(), texto, duration);
                        toast1.show();
                    }

                    else if (nota<3.05 && nota>=2.05){
                        texto = "Es posible recuperarse: "+notar;
                        Toast toast1 = Toast.makeText(getApplicationContext(), texto, duration);
                        toast1.show();
                    }

                    else if (nota<4.05 && nota>=3.05){
                        texto = "Normalito: "+notar;
                        Toast toast1 = Toast.makeText(getApplicationContext(), texto, duration);
                        toast1.show();
                    }

                    else if (nota<4.55 && nota>=4.05){
                        texto = "Muy bien: "+notar;
                        Toast toast1 = Toast.makeText(getApplicationContext(), texto, duration);
                        toast1.show();
                    }

                    else if (nota<=5 && nota>=4.55){
                        texto = "Excelente estudiante: "+notar;
                        Toast toast1 = Toast.makeText(getApplicationContext(), texto, duration);
                        toast1.show();
                    }

                    else if (nota<0 || nota>5){
                        texto = "Algo no tiene sentido con tus notas: "+notar;
                        Toast toast1 = Toast.makeText(getApplicationContext(), texto, duration);
                        toast1.show();
                    }

                }
            }
        });
    }
}
