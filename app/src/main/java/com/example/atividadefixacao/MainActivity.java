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

import java.security.Principal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnEntrar1(View view) {
        Intent intent = new Intent(this, Exercicio3.class);
        startActivity(intent);
    }
    public void btnEntrar2(View view) {
        Intent intent = new Intent(this, Exercicio6.class);
        startActivity(intent);}
}