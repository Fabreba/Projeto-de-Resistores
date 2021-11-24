package br.com.fabreba.projetoresistores;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }
    public void irCorRes(View view){
        Intent i = new Intent(TelaInicial.this, br.com.fabreba.projetoresistores.MainActivity.class);
        startActivity(i);
    }
    public void irResCor(View view){
        Intent i = new Intent(TelaInicial.this,MainActivity2.class);
        startActivity(i);
    }

}