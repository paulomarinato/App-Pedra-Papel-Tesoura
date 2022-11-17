package com.criandoapps.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pedraSelecionada (View view){
        this.escolhaJogador("pedra");
    }
    public void papelSelecionada (View view){
        this.escolhaJogador("papel");
    }
    public void tesouraSelecionada (View view){
        this.escolhaJogador("tesoura");
    }
    public void escolhaJogador(String escolhaJogador){
        ImageView figResultado = findViewById(R.id.figResultado);
        int numero = new Random().nextInt(3);
        String[] opcaoUsuario = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcaoUsuario [numero];
        switch ( opcaoApp ){
            case "pedra" : figResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel" : figResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura" : figResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        System.out.println( "Voce escolheu: " + opcaoApp);


    }

}