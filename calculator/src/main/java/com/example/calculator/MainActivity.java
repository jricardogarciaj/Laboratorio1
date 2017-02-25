package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView eNumero;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bmas, bmenos, bpor, bdividir, bpunto, bborrar, bigual;
    String variable1 = "0", variable2 = "0";
    Double valor1, valor2, resultado;
    int dominio = 1, funcion, alerta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumero = (TextView) findViewById(R.id.eNumero);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bmas = (Button) findViewById(R.id.bmas);
        bmenos = (Button) findViewById(R.id.bmenos);
        bpor = (Button) findViewById(R.id.bpor);
        bdividir = (Button) findViewById(R.id.bdividir);
        bpunto = (Button) findViewById(R.id.bpunto);
        bborrar = (Button) findViewById(R.id.bborrar);
        bigual = (Button) findViewById(R.id.bigual);
    }

    public void click(View view) {
        int id = view.getId();
        switch (id){
            case R.id.b1:
                if (dominio==1){
                    variable1 = "1";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "1";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "1";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "1";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b2:
                if (dominio==1){
                    variable1 = "2";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "2";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "2";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "2";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b3:
                if (dominio==1){
                    variable1 = "3";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "3";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "3";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "3";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b4:
                if (dominio==1){
                    variable1 = "4";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "4";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "4";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "4";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b5:
                if (dominio==1){
                    variable1 = "5";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "5";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "5";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "5";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b6:
                if (dominio==1){
                    variable1 = "6";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "6";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "6";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "6";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b7:
                if (dominio==1){
                    variable1 = "7";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "7";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "7";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "7";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b8:
                if (dominio==1){
                    variable1 = "8";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "8";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "8";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "8";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b9:
                if (dominio==1){
                    variable1 = "9";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "9";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "9";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "9";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.b0:
                if (dominio==1){
                    variable1 = "0";
                    eNumero.setText(variable1);
                    dominio++;}
                else if (dominio==2){
                    variable1 = variable1 + "0";
                    eNumero.setText(variable1);
                    alerta=0;}
                else if (dominio==3){
                    variable2 = "0";
                    eNumero.setText(variable2);
                    dominio++;}
                else if (dominio==4){
                    variable2 = variable2 + "0";
                    eNumero.setText(variable2);
                    alerta=0;}
                break;
            case R.id.bmas:
                if (dominio<2 || alerta==1) {
                    eNumero.setText("Ingrese un valor antes");}
                else if (dominio==2 && alerta==0) {
                    valor1 = Double.parseDouble(variable1);
                    eNumero.setText("+");
                    dominio = 3;
                    funcion = 1;}
                break;
            case R.id.bmenos:
                if (dominio<2 || alerta==1) {
                    eNumero.setText("Ingrese un valor antes");}
                else if (dominio==2 && alerta==0) {
                    valor1 = Double.parseDouble(variable1);
                    eNumero.setText("-");
                    dominio = 3;
                    funcion = 2;}
                break;
            case R.id.bpor:
                if (dominio<2 || alerta==1) {
                    eNumero.setText("Ingrese un valor antes");}
                else if (dominio==2 && alerta==0) {
                    valor1 = Double.parseDouble(variable1);
                    eNumero.setText("*");
                    dominio = 3;
                    funcion = 3;}
                break;
            case R.id.bdividir:
                if (dominio<2 || alerta==1) {
                    eNumero.setText("Ingrese un valor antes");}
                else if (dominio==2 && alerta==0) {
                    valor1 = Double.parseDouble(variable1);
                    eNumero.setText("÷");
                    dominio = 3;
                    funcion = 4;}
                break;
            case R.id.bpunto:
                if (dominio==1){
                    variable1 = ".";
                    eNumero.setText(variable1);
                    dominio++;
                    alerta=1;}
                else if (dominio==2){
                    if(alerta==1){
                        eNumero.setText("Inconsistencia");
                        dominio = 1;
                        variable1 = "0";
                        variable2 = "0";
                        valor1 = 0.0;
                        valor2 = 0.0;
                        alerta=0;}
                    else if (alerta == 0){
                        variable1 = variable1 + ".";
                        eNumero.setText(variable1);
                        alerta=1;}
                }
                else if (dominio==3){
                    variable2 = ".";
                    eNumero.setText(variable2);
                    dominio++;
                    alerta=1;}
                else if (dominio==4) {
                    if (alerta == 1) {
                        eNumero.setText("Inconsistencia");
                        dominio = 1;
                        variable1 = "0";
                        variable2 = "0";
                        valor1 = 0.0;
                        valor2 = 0.0;
                        alerta=0;}
                    else if (alerta == 0) {
                        variable2 = variable2 + ".";
                        eNumero.setText(variable2);
                        alerta = 1;}
                }
                break;
            case R.id.bborrar:
                dominio = 1;
                variable1 = "0";
                variable2 = "0";
                valor1 = 0.0;
                valor2 = 0.0;
                eNumero.setText("0");
                alerta=0;
                break;
            case R.id.bigual:
                if (dominio<4 || alerta==1) {
                    eNumero.setText("Ingrese un valor antes");
                    dominio = 1;
                    variable1 = "0";
                    variable2 = "0";
                    valor1 = 0.0;
                    valor2 = 0.0;}
                else if (dominio==4 && alerta==0) {
                    valor2 = Double.parseDouble(variable2);
                    switch (funcion){
                        case 1:
                            resultado = valor1 + valor2;
                            eNumero.setText(resultado + "");
                            dominio = 1;
                            variable1 = "0";
                            variable2 = "0";
                            valor1 = 0.0;
                            valor2 = 0.0;
                            alerta=0;
                            break;
                        case 2:
                            resultado = valor1 - valor2;
                            eNumero.setText(resultado + "");
                            dominio = 1;
                            variable1 = "0";
                            variable2 = "0";
                            valor1 = 0.0;
                            valor2 = 0.0;
                            alerta=0;
                            break;
                        case 3:
                            resultado = valor1 * valor2;
                            eNumero.setText(resultado + "");
                            dominio = 1;
                            variable1 = "0";
                            variable2 = "0";
                            valor1 = 0.0;
                            valor2 = 0.0;
                            alerta=0;
                            break;
                        case 4:
                            if (valor2==0.0) {
                                eNumero.setText("Inconsistencia");
                                dominio = 1;
                                variable1 = "0";
                                variable2 = "0";
                                valor1 = 0.0;
                                valor2 = 0.0;
                                alerta=0;}

                            else if (valor2!=0.0) {
                                resultado = valor1 / valor2;
                                eNumero.setText(resultado + "");
                                dominio = 1;
                                variable1 = "0";
                                variable2 = "0";
                                valor1 = 0.0;
                                valor2 = 0.0;
                                alerta=0;}
                            break;
                    }
                }
                break;
        }
    }
}
