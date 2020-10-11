package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon>pokeball = new ArrayList<>();

        Pokemon p1 = new Pokemon("Charizard", R.drawable.charizard, 1000, 500, 1500);
        Pokemon p2 = new Pokemon("Pikachu", R.drawable.pikachu, 500, 250, 750);
        Pokemon p3 = new Pokemon("Blastoise", R.drawable.blastoise, 250, 750, 1000);
        Pokemon p4 = new Pokemon("Arbok", R.drawable.arbok, 400, 300, 700);
        Pokemon p5 = new Pokemon("Bayleef", R.drawable.bayleef, 100, 300, 400);

        pokeball.add(p1);
        pokeball.add(p2);
        pokeball.add(p3);
        pokeball.add(p4);
        pokeball.add(p5);

        RecyclerView rv = findViewById(R.id.RecyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        PokemonAdapter pa = new PokemonAdapter(pokeball, this);
        rv.setAdapter(pa);

    }
}