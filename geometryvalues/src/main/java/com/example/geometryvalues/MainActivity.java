package com.example.geometryvalues;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static java.lang.Math.*;

public class MainActivity extends AppCompatActivity {

    EditText eTlado1, eTlado2, eTlado3, eCradio, eCdlado, eCblado;
    TextView tMostrar;
    RadioGroup rElige;
    Button bCalcular;
    Double lado1, lado2, lado3, semiperimetro, perimetro, area, volumen;
    CharSequence text1 = "Ingrese los campos requeridos";
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTlado1 = (EditText) findViewById(R.id.Tlado1);
        eTlado2 = (EditText) findViewById(R.id.Tlado2);
        eTlado3 = (EditText) findViewById(R.id.Tlado3);
        eCradio = (EditText) findViewById(R.id.Cradio);
        eCdlado = (EditText) findViewById(R.id.Cdlado);
        eCblado = (EditText) findViewById(R.id.Cblado);
        tMostrar = (TextView) findViewById(R.id.Mostrar);
        rElige = (RadioGroup) findViewById(R.id.Elige);
        bCalcular = (Button) findViewById(R.id.Calcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int selectedId = rElige.getCheckedRadioButtonId();

                switch (selectedId) {
                    case R.id.Triangulo:
                        if (eTlado1.getText().toString().equals("") || eTlado2.getText().toString().equals("") || eTlado3.getText().toString().equals("")) {
                            Toast toast1 = Toast.makeText(getApplicationContext(), text1, duration);
                            toast1.show();}

                        else if (!eTlado1.getText().toString().equals("") && !eTlado2.getText().toString().equals("") && !eTlado3.getText().toString().equals("")) {
                            lado1 = Double.parseDouble(eTlado1.getText().toString());
                            lado2 = Double.parseDouble(eTlado2.getText().toString());
                            lado3 = Double.parseDouble(eTlado3.getText().toString());
                            perimetro = lado1 + lado2 + lado3;
                            semiperimetro = perimetro / 2;
                            if (lado1 > semiperimetro || lado2 > semiperimetro || lado3 > semiperimetro) {
                                tMostrar.setText("Con los valores ingresados no se puede construir un triangulo");
                            } else if (!(lado1 > semiperimetro || lado2 > semiperimetro || lado3 > semiperimetro)) {
                                area = sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
                                tMostrar.setText("El perimetro del triangulo es " + perimetro + " cm,  y el area es " + area + " cm^2");
                            }
                        }
                        break;

                    case R.id.Cuadrado:
                        if (eCdlado.getText().toString().equals("")) {
                            Toast toast1 = Toast.makeText(getApplicationContext(), text1, duration);
                            toast1.show();}

                        else if (!eCdlado.getText().toString().equals("")){
                            lado1 = Double.parseDouble(eCdlado.getText().toString());
                            perimetro = lado1 * 4;
                            area = lado1 * lado1;
                            tMostrar.setText("El perimetro del cuadrado es " + perimetro + " cm,  y el area es " + area + " cm^2");}
                        break;

                    case R.id.Circulo:
                        if (eCradio.getText().toString().equals("")) {
                            Toast toast1 = Toast.makeText(getApplicationContext(), text1, duration);
                            toast1.show();}

                        else if (!eCradio.getText().toString().equals("")) {
                            lado1 = Double.parseDouble(eCradio.getText().toString());
                            perimetro = lado1 * 2 * 3.14159;
                            area = lado1 * lado1 * 3.14159;
                            tMostrar.setText("El perimetro del circulo es " + perimetro + " cm,  y el area es " + area + " cm^2");}
                        break;

                    case R.id.Cubo:
                        if (eCblado.getText().toString().equals("")) {
                            Toast toast1 = Toast.makeText(getApplicationContext(), text1, duration);
                            toast1.show();}

                        else if (!eCblado.getText().toString().equals("")) {
                        lado1 = Double.parseDouble(eCblado.getText().toString());
                        volumen = lado1 * lado1 * lado1;
                        area = lado1 * lado1 * 6;
                        tMostrar.setText("El area del cubo es " + area + " cm^2,  y el volumen es " + volumen + " cm^3");}
                        break;
                }
            }

        });
    }
}
