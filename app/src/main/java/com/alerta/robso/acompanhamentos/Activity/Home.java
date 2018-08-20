package com.alerta.robso.acompanhamentos.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.alerta.robso.acompanhamentos.R;

public class Home extends AppCompatActivity {
    private Button botaoCadastrese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botaoCadastrese = (Button)findViewById(R.id.botaocadastreseId);

        botaoCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Cadastro.class);
                startActivity(i);
            }
        });
    }
}
