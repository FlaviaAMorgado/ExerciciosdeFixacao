package com.example.atividadefixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnentrar2(View view) { // Intent do botão "Exercício 6" para abrir a tela do exercício 6
        Intent intent = new Intent(this, Exercicio6.class);
        startActivity(intent); //
    }
}