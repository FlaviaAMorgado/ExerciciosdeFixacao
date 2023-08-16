package com.example.atividadefixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class Exercicio6 extends AppCompatActivity {

    // criando strings e variaveis
    String cod;
    RadioGroup rbCods;
    RadioButton rbC;
    RadioButton rbR;
    RadioButton rbS;
    TextView qtd;
    TextView result2;
    Button btncalcular2;

    double qtd2, rs, rsc, rsr, rss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio6);

        rbCods = findViewById(R.id.rbCods); // instanciando rbCods
        rbC = findViewById(R.id.rbC); // instanciando rbC
        rbR = findViewById(R.id.rbR); // instanciando rbR
        rbS = findViewById(R.id.rbS); // instanciando rbS

        qtd = (TextView) findViewById(R.id.txtqtd); // instanciando txtqtd
        btncalcular2 = (Button) findViewById(R.id.btncalcular2); // instanciando btncalcular2
        result2 = (TextView) findViewById(R.id.txtresult2); // instanciando resul2

        Cods cods = new Cods(); // instanciando obj


        rbCods.setOnCheckedChangeListener((rbCods, checkedId)->{
            RadioButton get_Cod = findViewById(checkedId);
            cod = (String) get_Cod.getText();
        }
    );

        // Click do Botão
        btncalcular2.setOnClickListener (v-> {
            qtd2 = Double.parseDouble(qtd.getText().toString()); // pegando e transformando o valor

            // veficando qual cod foi selecionado
            if (cod == "C") {
                rs = (qtd2 * 2.00); // fazendo a conta
                result2.setText(Double.toString(rs)); // passando msg

            }
                else if (cod == "R") {
                rs = (qtd2 * 2.50); // fazendo a conta
                result2.setText(Double.toString(rs)); // passando msg
            }
                    else if (cod == "S"){
                rs = (qtd2 * 1.50); // fazendo a conta
                result2.setText(Double.toString(rs)); // passando msg
            }

        });
    };
}