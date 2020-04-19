package com.everton.appcaricatura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Caricatura> listacaricaturas;
    CaricaturaAdapter caricaturaAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        listacaricaturas = new ArrayList<>();

        listacaricaturas.add(new Caricatura(R.drawable.foto1,"Stallone","55","Ator"));
        listacaricaturas.add(new Caricatura(R.drawable.foto2,"Palha","39","Palhaço"));
        listacaricaturas.add(new Caricatura(R.drawable.foto3,"Tico","75","Ator"));
        listacaricaturas.add(new Caricatura(R.drawable.foto4,"Leticia","55","Atriz"));
        listacaricaturas.add(new Caricatura(R.drawable.foto5,"Joelma","46","Cozinheira"));
        listacaricaturas.add(new Caricatura(R.drawable.foto6,"Nicinha","29","Modelor"));
        listacaricaturas.add(new Caricatura(R.drawable.foto7,"Trump","74","Presidente"));
        listacaricaturas.add(new Caricatura(R.drawable.foto8,"Elvis","100","Cantor"));
        listacaricaturas.add(new Caricatura(R.drawable.foto9,"Bacon","65","Ator"));
        listacaricaturas.add(new Caricatura(R.drawable.foto10,"Tom Cruise","50","Ator"));
        listacaricaturas.add(new Caricatura(R.drawable.foto11,"Robin","100","Ator"));
        listacaricaturas.add(new Caricatura(R.drawable.foto12,"Doido","77","Comediante"));

        caricaturaAdapter = new CaricaturaAdapter(listacaricaturas);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(caricaturaAdapter);
    }
}
