package com.example.kuba.generatortest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class Logowanie extends AppCompatActivity implements View.OnClickListener{
    Button btn_Zaloguj;
    EditText et_login,et_haslo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logowanie);
        btn_Zaloguj = (Button)findViewById(R.id.btn_Zalogj);
        et_login=(EditText)findViewById(R.id.et_Nazwa);
        et_haslo=(EditText)findViewById(R.id.et_Haslo);
        btn_Zaloguj.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //Zapytanie o poprawność danych na serwerze i ewentualne zalogowanie lub błąd logowania
        //Jeśli poprawne dane
        Intent intent = new Intent(this, Plan.class);
        startActivity(intent);

    }
}

