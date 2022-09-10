package com.example.projetointegrador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView valor;
    Button addValor;
    Button saldo;
    Button DiminuirValor;
    ImageView iconAddValor;
    ImageView iconRelatorio;
    ImageView visibility;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        valor= findViewById(R.id.valor);
        addValor = findViewById(R.id.addValor);
        saldo = findViewById(R.id.saldo);
        DiminuirValor = findViewById(R.id.DiminuirValor);
        iconAddValor = findViewById(R.id.iconAddValor);
        iconRelatorio = findViewById(R.id.iconAddValor);
        visibility = findViewById(R.id.visibility);


        iconAddValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chamar tela de adicionar valor
            }
        });
        addValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chama tela de adicionar valor
            }
        });
        iconRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tela do relatorio
            }
        });
        saldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // chamar tela Saldo
            }
        });

        visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualizar();
            }

            private void visualizar() {
                //apagar o valor principal
            }
        });

    }



}