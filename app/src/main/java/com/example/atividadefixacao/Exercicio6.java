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
    TextView qtd;
    TextView result2;
    Button btncalcular2;

    double qtd2, rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio6);

        rbCods = findViewById(R.id.rbCods); // instanciando rbCods
        qtd = (TextView) findViewById(R.id.txtqtd); // instanciando txtqtd
        btncalcular2 = (Button) findViewById(R.id.btncalcular2); // instanciando btncalcular2
        result2 = (TextView) findViewById(R.id.txtresult2); // instanciando resul2

        Cods cods = new Cods(); // instanciando obj


        // Click do Botão
        btncalcular2.setOnClickListener (new View.OnClickListener);{


        int itemRadioGroupSelecionado = rbCods.getCheckedRadioButtonId();

        if (itemRadioGroupSelecionado != -1){

            //algum RadioButton foi selecionado

            // Regra de negócio
            RadioButton rbCodSelecioado = findViewById(itemRadioGroupSelecionado);
        }

            // processamento
            if(rbCods == "rbC"){
                qtd2 = Double.parseDouble(qtd.getText().toString()); // pegando e transformando o valor
                rs = (qtd2 * 2); // fazendo a conta

                result2.setText(Double.toString(rs)); // passando msg
            }
                else if(rbCods == "rbR"){
                    qtd2 = Double.parseDouble(qtd.getText().toString()); // pegando e transformando o valor
                    rs = (qtd2 * 2.50); // fazendo a conta

                    result2.setText(Double.toString(rs)); // passando msg
                }
                    else(rbCods == "rbS"){
                    qtd2 = Double.parseDouble(qtd.getText().toString()); // pegando e transformando o valor
                    rs = (qtd2 * 1.50); // fazendo a conta

                    result2.setText(Double.toString(rs)); // passando msg
                         }
        }
        };
    }
