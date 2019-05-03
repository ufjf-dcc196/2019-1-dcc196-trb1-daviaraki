package com.example.trabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class DisciplinasCursadasActivity extends AppCompatActivity {

    String[] listaDisciplinas = new String[]{"a","b"};
    ListView listView;

    Button mudarPlanejamento;
    Button adicionarDisciplina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas_cursadas);

        String semestre = (String) getIntent().getExtras().get("semestre");

        if(semestre.equals("Ano: 2017 Semestre: 1 100% de 40 horas")){
            listaDisciplinas[0]= "Calculo - Horas: 4 Área: Exatas";
            listaDisciplinas[1]= "Filosofia - Horas: 4 Área: Humanas";
        }
        if(semestre.equals("Ano: 2017 Semestre: 1 90% de 40 horas")){
            listaDisciplinas[0]= "Calculo 2 - Horas: 4 Área: Exatas";
            listaDisciplinas[1]= "Anatomia - Horas: 4 Área: Saúde";
        }
        if(semestre.equals("Ano: 2018 Semestre: 1 80% de 40 horas")){
            listaDisciplinas[0]= "Calculo 3 - Horas: 4 Área: Exatas";
            listaDisciplinas[1]= "Biologia - Horas: 4 Área: Biológicas";
        }


        listView = (ListView) findViewById(R.id.listaDisciplinas);
        ArrayAdapter<String> discAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1, listaDisciplinas);
        listView.setAdapter(discAdapter);

        mudarPlanejamento = (Button) findViewById(R.id.buttonMudarPlanejamento);
        mudarPlanejamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaDetalhes = new Intent(getApplicationContext(), DetalhesPlanejamentoActivity.class);
                startActivity(irParaDetalhes);
            }
        });

        adicionarDisciplina = (Button) findViewById(R.id.buttonAdicionarDisciplina);
        adicionarDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaAdicao = new Intent(getApplicationContext(), NovaDisciplinaCursadaActivity.class);
                irParaAdicao.putExtra("listaDeDisciplinas", listaDisciplinas);
                startActivity(irParaAdicao);
            }
        });



    }
}
