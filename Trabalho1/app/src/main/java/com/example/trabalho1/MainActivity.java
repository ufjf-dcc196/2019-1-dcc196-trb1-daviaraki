package com.example.trabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] planejamentoSemestral = new String[]{"Ano: 2017 Semestre: 1 100% de 40 horas", "Ano: 2017 Semestre: 1 90% de 40 horas","Ano: 2018 Semestre: 1 80% de 40 horas", "Ano: 19 Semestre: 2 40% de 40 horas", "Ano: 19 Semestre: 2 40% de 40 horas"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listaSemestres);

        ArrayAdapter<String> discAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1, planejamentoSemestral);

        listView.setAdapter(discAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent moveToDisciplinasIntent = new Intent(getBaseContext(),DisciplinasCursadasActivity.class);
        moveToDisciplinasIntent.putExtra("semestre", planejamentoSemestral[position]);
        startActivity(moveToDisciplinasIntent);

    }
}
