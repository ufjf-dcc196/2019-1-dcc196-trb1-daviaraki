package com.example.trabalho1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisciplinasCursadasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas_cursadas);

        String nomeDisciplina = (String) getIntent().getExtras().get("nomeDisciplina");

        System.out.println("nome da matéria!" + nomeDisciplina);
    }
}
