package com.example.trabalho1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] planejamentoDisciplinas = new String[]{"Matemática", "Física", "História", "Geografia", "Português", "Filosofia"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listaDisciplinas);

        ArrayAdapter<String> discAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1, planejamentoDisciplinas);

        listView.setAdapter(discAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent moveToDisciplinasIntent = new Intent(getBaseContext(),DisciplinasCursadasActivity.class);
        moveToDisciplinasIntent.putExtra("nomeDisciplina", planejamentoDisciplinas[position]);
        startActivity(moveToDisciplinasIntent);

    }
}
