package com.example.barcarena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class SelecioneProblemaActivity extends AppCompatActivity {


    Button btnNumeroPoste, btnReclamacoesDetalhadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Certifique-se de que o nome do arquivo XML é activity_main.xml

        btnNumeroPoste = findViewById(R.id.btn_numero_poste);
        btnReclamacoesDetalhadas = findViewById(R.id.btnReclamacoesDetalhadas);

        // Ação para o botão "Número do Poste"
        btnNumeroPoste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aqui você pode abrir outra activity, ou mostrar um Toast
                Toast.makeText(SelecioneProblemaActivity.this, "Número do poste selecionado", Toast.LENGTH_SHORT).show();


                // Exemplo de abertura de uma nova activity (descomente se tiver outra Activity)
                // Intent intent = new Intent(MainActivity.this, NumeroPosteActivity.class);
                // startActivity(intent);
            }
        });

        // Ação para o botão "Reclamações Mais Detalhadas"
        btnReclamacoesDetalhadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SelecioneProblemaActivity.this, "Reclamações detalhadas selecionadas", Toast.LENGTH_SHORT).show();

                // Exemplo de abertura de uma nova activity
                // Intent intent = new Intent(MainActivity.this, ReclamacoesDetalhadasActivity.class);
                // startActivity(intent);
            }
        });
    }
}
