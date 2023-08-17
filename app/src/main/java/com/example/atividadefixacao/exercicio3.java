package com.example.atividadefixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

class Exercicio3 extends AppCompatActivity {
    // declarando variáveis
    CheckBox btncalcular2;
    EditText numextra;
    EditText numfalta;
    TextView premio;
    TextView numHextra;
    TextView numHfalta;
    int numex, numft; // h para cálculo

    // cálculo do H
    @SuppressLint("SetTextI18n")
    public void calcular() {
        int h = (numex) - (2 / 3 * (numft));

        //cálculo do H
        btncalcular2.setOnClickListener(view -> {
            numex = Integer.parseInt(String.valueOf(numextra.getText()));
            numft = Integer.parseInt(String.valueOf(numfalta.getText()));

            //cálculo de verificação da gratificação
            if (btncalcular2.isChecked()) {
                if (h > 2400) {

                }
                premio.setText("O prêmio é de R$500,00");
            } else if (h >= 1801 && h <= 2400) {
                premio.setText("O prêmio é de R$400,00");
            } else if (h >= 1201 && h <= 1800) {
                premio.setText("O prêmio é de R$300,00");
            } else if (h >= 600 && h <= 1200) {
                premio.setText("O prêmio é de R$200,00");
            } else if (h < 600) {
                premio.setText("O prêmio é de R$100,00");
            } else {
                premio.setText("");
            }
        });

        {
            int numextra = numex / 60;
            int numfalta = numft / 60;

            if (btncalcular2.isChecked()) {
                numHextra.setText(valueOf(numex));
                numHfalta.setText(valueOf(numft));
            } else {
                numHextra.setText("");
                numHfalta.setText("");
            }

        }
    }

    private int valueOf(int numex) {

        return numex;
    }

};