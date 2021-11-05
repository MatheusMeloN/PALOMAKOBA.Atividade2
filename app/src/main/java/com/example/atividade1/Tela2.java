package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.atividade1.databinding.ActivityMainBinding;
import com.example.atividade1.databinding.ActivityTela2Binding;

public class Tela2 extends AppCompatActivity {

    ActivityTela2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTela2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Tela2.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}