package com.marcusberger.calculamediaunipnovo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaSemestreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_semestre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] semestre = {"1º Semestre", "2° Semestre", "3° Semestre", "4° Semestre", "5° Semestre", "6° Semestre", "7° Semestre", "8° Semestre"};
        ListView listaSemestre = (ListView)findViewById(R.id.lista_semestre);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, semestre);
        listaSemestre.setAdapter(adapter);

        FloatingActionButton addSemestre = (FloatingActionButton)findViewById(R.id.add_semestre);
        addSemestre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFormuSeme = new Intent(ListaSemestreActivity.this, FormularioSemestreActivity.class);
                startActivity(intentFormuSeme);
            }
        });

    }



}
