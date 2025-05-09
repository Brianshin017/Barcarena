package com.example.barcarena;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ProblemasActivity extends AppCompatActivity {

    RecyclerView recyclerProblemas;
    ProblemaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problemas);

        recyclerProblemas = findViewById(R.id.recyclerProblemas);
        recyclerProblemas.setLayoutManager(new GridLayoutManager(this, 3)); // 3 colunas


        List<problema> problemas = new ArrayList<>();
        problemas.add(new problema("LÂMPADAS APAGADAS", R.drawable.lampada_apagada));
        problemas.add(new problema("FIO/CABO ROMPIDO", R.drawable.fio_rompido));
        problemas.add(new problema("LÂMPADA ACESA DURANTE O DIA", R.drawable.lampada_dia));
        problemas.add(new problema("UMA ÚNICA LÂMPADA APAGADA", R.drawable.uma_apagada));
        problemas.add(new problema("FIO/CABO CAÍDO", R.drawable.fio_caido));
        problemas.add(new problema("APAGÃO", R.drawable.apagao));
        problemas.add(new problema("LÂMPADA QUEBRADA", R.drawable.lampada_quebrada));

        adapter = new ProblemaAdapter(problemas);
        recyclerProblemas.setAdapter(adapter);
    }
}
