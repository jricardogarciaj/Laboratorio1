package com.example.calculadoraderesistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    EditText eBandas;
    TextView tResultado;
    RadioGroup rElige1, rElige2, rElige3, rElige4, rElige5, rElige6;
    Button bCalcular;
    int bandas;
    Double cuenta;
    String resultado;
    CharSequence text1 = "Ingrese el numero de bandas (4-6)";
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eBandas = (EditText) findViewById(R.id.Bandas);
        tResultado = (TextView) findViewById(R.id.Resultado);
        rElige1 = (RadioGroup) findViewById(R.id.Elige1);
        rElige2 = (RadioGroup) findViewById(R.id.Elige2);
        rElige3 = (RadioGroup) findViewById(R.id.Elige3);
        rElige4 = (RadioGroup) findViewById(R.id.Elige4);
        rElige5 = (RadioGroup) findViewById(R.id.Elige5);
        rElige6 = (RadioGroup) findViewById(R.id.Elige6);
        bCalcular = (Button) findViewById(R.id.Calcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId1 = rElige1.getCheckedRadioButtonId();
                int selectedId2 = rElige2.getCheckedRadioButtonId();
                int selectedId3 = rElige3.getCheckedRadioButtonId();
                int selectedId4 = rElige4.getCheckedRadioButtonId();
                int selectedId5 = rElige5.getCheckedRadioButtonId();
                int selectedId6 = rElige6.getCheckedRadioButtonId();

                if (eBandas.getText().toString().equals("")) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), text1, duration);
                    toast1.show();
                }

                else if (!eBandas.getText().toString().equals("")) {
                    bandas = Integer.parseInt(eBandas.getText().toString());

                    if (bandas<4 || bandas>6) {
                        Toast toast1 = Toast.makeText(getApplicationContext(), text1, duration);
                        toast1.show();
                    }

                    else if (bandas==4){

                        switch (selectedId1) {
                            case R.id.Ne1:
                                cuenta=0.0;
                                break;
                            case R.id.Ca1:
                                cuenta=10.0;
                                break;
                            case R.id.Ro1:
                                cuenta=20.0;
                                break;
                            case R.id.Na1:
                                cuenta=30.0;
                                break;
                            case R.id.Am1:
                                cuenta=40.0;
                                break;
                            case R.id.Ve1:
                                cuenta=50.0;
                                break;
                            case R.id.Az1:
                                cuenta=60.0;
                                break;
                            case R.id.Mo1:
                                cuenta=70.0;
                                break;
                            case R.id.Gr1:
                                cuenta=80.0;
                                break;
                            case R.id.Bl1:
                                cuenta=90.0;
                                break;
                            case R.id.Do1:
                                cuenta=0.0;
                                break;
                            case R.id.Pl1:
                                cuenta=0.0;
                                break;
                        }

                        switch (selectedId2) {
                            case R.id.Ne2:
                                cuenta+=0.0;
                                break;
                            case R.id.Ca2:
                                cuenta+=1.0;
                                break;
                            case R.id.Ro2:
                                cuenta+=2.0;
                                break;
                            case R.id.Na2:
                                cuenta+=3.0;
                                break;
                            case R.id.Am2:
                                cuenta+=4.0;
                                break;
                            case R.id.Ve2:
                                cuenta+=5.0;
                                break;
                            case R.id.Az2:
                                cuenta+=6.0;
                                break;
                            case R.id.Mo2:
                                cuenta+=7.0;
                                break;
                            case R.id.Gr2:
                                cuenta+=8.0;
                                break;
                            case R.id.Bl2:
                                cuenta+=9.0;
                                break;
                            case R.id.Do2:
                                cuenta+=0.0;
                                break;
                            case R.id.Pl2:
                                cuenta+=0.0;
                                break;
                        }

                        switch (selectedId3) {
                            case R.id.Ne3:
                                cuenta=cuenta*1;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Ca3:
                                cuenta=cuenta*10.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Ro3:
                                cuenta=cuenta*100.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Na3:
                                cuenta=cuenta*1.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Am3:
                                cuenta=cuenta*10.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Ve3:
                                cuenta=cuenta*100.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Az3:
                                cuenta=cuenta*1000.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Mo3:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Gr3:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Bl3:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Do3:
                                cuenta=cuenta/10.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Pl3:
                                cuenta=cuenta/100.0;
                                resultado = cuenta + " ";
                                break;
                        }

                        switch (selectedId4) {
                            case R.id.Ne4:
                                tResultado.setText(resultado + "Ω");
                                break;
                            case R.id.Ca4:
                                tResultado.setText(resultado + "Ω ± 1%");
                                break;
                            case R.id.Ro4:
                                tResultado.setText(resultado + "Ω ± 2%");
                                break;
                            case R.id.Na4:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Am4:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Ve4:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Az4:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Mo4:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Gr1:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Bl1:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Do1:
                                tResultado.setText(resultado + "Ω  ± 5%");
                                break;
                            case R.id.Pl1:
                                tResultado.setText(resultado + "Ω ± 10%");
                                break;
                        }

                    }

                    else if (bandas==5){

                        switch (selectedId1) {
                            case R.id.Ne1:
                                cuenta=0.0;
                                break;
                            case R.id.Ca1:
                                cuenta=100.0;
                                break;
                            case R.id.Ro1:
                                cuenta=200.0;
                                break;
                            case R.id.Na1:
                                cuenta=300.0;
                                break;
                            case R.id.Am1:
                                cuenta=400.0;
                                break;
                            case R.id.Ve1:
                                cuenta=500.0;
                                break;
                            case R.id.Az1:
                                cuenta=600.0;
                                break;
                            case R.id.Mo1:
                                cuenta=700.0;
                                break;
                            case R.id.Gr1:
                                cuenta=800.0;
                                break;
                            case R.id.Bl1:
                                cuenta=900.0;
                                break;
                            case R.id.Do1:
                                cuenta=0.0;
                                break;
                            case R.id.Pl1:
                                cuenta=0.0;
                                break;
                        }

                        switch (selectedId2) {
                            case R.id.Ne2:
                                cuenta+=0.0;
                                break;
                            case R.id.Ca2:
                                cuenta+=10.0;
                                break;
                            case R.id.Ro2:
                                cuenta+=20.0;
                                break;
                            case R.id.Na2:
                                cuenta+=30.0;
                                break;
                            case R.id.Am2:
                                cuenta+=40.0;
                                break;
                            case R.id.Ve2:
                                cuenta+=50.0;
                                break;
                            case R.id.Az2:
                                cuenta+=60.0;
                                break;
                            case R.id.Mo2:
                                cuenta+=70.0;
                                break;
                            case R.id.Gr2:
                                cuenta+=80.0;
                                break;
                            case R.id.Bl2:
                                cuenta+=90.0;
                                break;
                            case R.id.Do2:
                                cuenta+=0.0;
                                break;
                            case R.id.Pl2:
                                cuenta+=0.0;
                                break;
                        }

                        switch (selectedId3) {
                            case R.id.Ne3:
                                cuenta+=0.0;
                                break;
                            case R.id.Ca3:
                                cuenta+=1.0;
                                break;
                            case R.id.Ro3:
                                cuenta+=2.0;
                                break;
                            case R.id.Na3:
                                cuenta+=3.0;
                                break;
                            case R.id.Am3:
                                cuenta+=4.0;
                                break;
                            case R.id.Ve3:
                                cuenta+=5.0;
                                break;
                            case R.id.Az3:
                                cuenta+=6.0;
                                break;
                            case R.id.Mo3:
                                cuenta+=7.0;
                                break;
                            case R.id.Gr3:
                                cuenta+=8.0;
                                break;
                            case R.id.Bl3:
                                cuenta+=9.0;
                                break;
                            case R.id.Do3:
                                cuenta+=0.0;
                                break;
                            case R.id.Pl3:
                                cuenta+=0.0;
                                break;
                        }

                        switch (selectedId4) {
                            case R.id.Ne4:
                                cuenta=cuenta*1;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Ca4:
                                cuenta=cuenta*10.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Ro4:
                                cuenta=cuenta*100.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Na4:
                                cuenta=cuenta*1.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Am4:
                                cuenta=cuenta*10.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Ve4:
                                cuenta+=0.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Az4:
                                cuenta+=0.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Mo4:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Gr4:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Bl4:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Do4:
                                cuenta+=cuenta/10;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Pl4:
                                cuenta+=cuenta/100;
                                resultado = cuenta + " ";
                                break;
                        }

                        switch (selectedId5) {
                            case R.id.Ne5:
                                tResultado.setText(resultado + "Ω");
                                break;
                            case R.id.Ca5:
                                tResultado.setText(resultado + "Ω ± 1%");
                                break;
                            case R.id.Ro5:
                                tResultado.setText(resultado + "Ω ± 2%");
                                break;
                            case R.id.Na5:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Am5:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Ve5:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Az5:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Mo5:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Gr5:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Bl5:
                                tResultado.setText(resultado + " Ω");
                                break;
                            case R.id.Do5:
                                tResultado.setText(resultado + "Ω  ± 5%");
                                break;
                            case R.id.Pl5:
                                tResultado.setText(resultado + "Ω ± 10%");
                                break;
                        }
                    }

                    else if (bandas==6){

                        switch (selectedId1) {
                            case R.id.Ne1:
                                cuenta=0.0;
                                break;
                            case R.id.Ca1:
                                cuenta=100.0;
                                break;
                            case R.id.Ro1:
                                cuenta=200.0;
                                break;
                            case R.id.Na1:
                                cuenta=300.0;
                                break;
                            case R.id.Am1:
                                cuenta=400.0;
                                break;
                            case R.id.Ve1:
                                cuenta=500.0;
                                break;
                            case R.id.Az1:
                                cuenta=600.0;
                                break;
                            case R.id.Mo1:
                                cuenta=700.0;
                                break;
                            case R.id.Gr1:
                                cuenta=800.0;
                                break;
                            case R.id.Bl1:
                                cuenta=900.0;
                                break;
                            case R.id.Do1:
                                cuenta=0.0;
                                break;
                            case R.id.Pl1:
                                cuenta=0.0;
                                break;
                        }

                        switch (selectedId2) {
                            case R.id.Ne2:
                                cuenta+=0.0;
                                break;
                            case R.id.Ca2:
                                cuenta+=10.0;
                                break;
                            case R.id.Ro2:
                                cuenta+=20.0;
                                break;
                            case R.id.Na2:
                                cuenta+=30.0;
                                break;
                            case R.id.Am2:
                                cuenta+=40.0;
                                break;
                            case R.id.Ve2:
                                cuenta+=50.0;
                                break;
                            case R.id.Az2:
                                cuenta+=60.0;
                                break;
                            case R.id.Mo2:
                                cuenta+=70.0;
                                break;
                            case R.id.Gr2:
                                cuenta+=80.0;
                                break;
                            case R.id.Bl2:
                                cuenta+=90.0;
                                break;
                            case R.id.Do2:
                                cuenta+=0.0;
                                break;
                            case R.id.Pl2:
                                cuenta+=0.0;
                                break;
                        }

                        switch (selectedId3) {
                            case R.id.Ne3:
                                cuenta+=0.0;
                                break;
                            case R.id.Ca3:
                                cuenta+=1.0;
                                break;
                            case R.id.Ro3:
                                cuenta+=2.0;
                                break;
                            case R.id.Na3:
                                cuenta+=3.0;
                                break;
                            case R.id.Am3:
                                cuenta+=4.0;
                                break;
                            case R.id.Ve3:
                                cuenta+=5.0;
                                break;
                            case R.id.Az3:
                                cuenta+=6.0;
                                break;
                            case R.id.Mo3:
                                cuenta+=7.0;
                                break;
                            case R.id.Gr3:
                                cuenta+=8.0;
                                break;
                            case R.id.Bl3:
                                cuenta+=9.0;
                                break;
                            case R.id.Do3:
                                cuenta+=0.0;
                                break;
                            case R.id.Pl3:
                                cuenta+=0.0;
                                break;
                        }

                        switch (selectedId4) {
                            case R.id.Ne4:
                                cuenta=cuenta*1;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Ca4:
                                cuenta=cuenta*10.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Ro4:
                                cuenta=cuenta*100.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Na4:
                                cuenta=cuenta*1.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Am4:
                                cuenta=cuenta*10.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Ve4:
                                cuenta+=0.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Az4:
                                cuenta+=0.0;
                                resultado = cuenta + " K";
                                break;
                            case R.id.Mo4:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Gr4:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Bl4:
                                cuenta+=0.0;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Do4:
                                cuenta+=cuenta/10;
                                resultado = cuenta + " ";
                                break;
                            case R.id.Pl4:
                                cuenta+=cuenta/100;
                                resultado = cuenta + " ";
                                break;
                        }

                        switch (selectedId5) {
                            case R.id.Ne5:
                                resultado=resultado + "Ω";
                                break;
                            case R.id.Ca5:
                                resultado = resultado + "Ω ± 1%";
                                break;
                            case R.id.Ro5:
                                resultado = resultado + "Ω ± 2%";
                                break;
                            case R.id.Na5:
                                resultado=resultado + "Ω";
                                break;
                            case R.id.Am5:
                                resultado=resultado + "Ω";
                                break;
                            case R.id.Ve5:
                                resultado=resultado + "Ω";
                                break;
                            case R.id.Az5:
                                resultado=resultado + "Ω";
                                break;
                            case R.id.Mo5:
                                resultado=resultado + "Ω";
                                break;
                            case R.id.Gr5:
                                resultado=resultado + "Ω";
                                break;
                            case R.id.Bl5:
                                resultado=resultado + "Ω";
                                break;
                            case R.id.Do5:
                                resultado=resultado + "Ω  ± 5%";
                                break;
                            case R.id.Pl5:
                                resultado=resultado + "Ω ± 10%";
                                break;
                        }

                        switch (selectedId6) {
                            case R.id.Ne6:
                                tResultado.setText(resultado);
                                break;
                            case R.id.Ca6:
                                tResultado.setText(resultado + " PPM = 100");
                                break;
                            case R.id.Ro6:
                                tResultado.setText(resultado + " PPM = 50");
                                break;
                            case R.id.Na6:
                                tResultado.setText(resultado + " PPM = 15");
                                break;
                            case R.id.Am6:
                                tResultado.setText(resultado + " PPM = 25");
                                break;
                            case R.id.Ve6:
                                tResultado.setText(resultado);
                                break;
                            case R.id.Az6:
                                tResultado.setText(resultado + " PPM = 10");
                                break;
                            case R.id.Mo6:
                                tResultado.setText(resultado + " PPM = 5");
                                break;
                            case R.id.Gr6:
                                tResultado.setText(resultado);
                                break;
                            case R.id.Bl6:
                                tResultado.setText(resultado + " PPM = 1");
                                break;
                            case R.id.Do6:
                                tResultado.setText(resultado);
                                break;
                            case R.id.Pl6:
                                tResultado.setText(resultado);
                                break;
                        }
                    }
                }
            }
        });
    }
}
