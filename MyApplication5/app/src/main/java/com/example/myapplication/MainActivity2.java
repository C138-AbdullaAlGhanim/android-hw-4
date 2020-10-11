package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        Pokemon p = (Pokemon) b.getSerializable("pokemon");

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        ImageView img = findViewById(R.id.imageView3);
        TextView name = findViewById(R.id.textView);
        TextView attack = findViewById(R.id.textView5);
        TextView def = findViewById(R.id.textView6);

        img.setImageResource(p.getImage());
        name.setText(p.getName());
        attack.setText("Attack" + p.getAttack());
        def.setText("Defence" + p.getDefence());

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}