package com.criandoapps.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
        TextView textResutado = findViewById(R.id.textResultado);
        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes [numero];
        switch ( escolhaApp ){
            case "pedra" : figResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel" : figResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura" : figResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        if (
                (escolhaApp == "pedra" && escolhaJogador == "tesoura") ||
                (escolhaApp == "papel" && escolhaJogador == "pedra") ||
                (escolhaApp == "tesoura" && escolhaJogador == "papel")

        ){ //Aplicativo Ganhou
            textResutado.setText("Que Pena!! Voce Perdeu!! Jogue novamente e mude a sua sorte :(");

        }else if (
                (escolhaJogador == "pedra" && escolhaApp == "tesoura") ||
                (escolhaJogador == "papel" && escolhaApp == "pedra") ||
                (escolhaJogador == "tesoura" && escolhaApp == "papel")
        ){//Usuário Ganhou
            textResutado.setText("Parabéns!! Voce Ganhou!! Jogue novamente e Prove a tua sorte :)");

        }else {//Empate
            textResutado.setText("Empatamos!! Vamos jogar novamente!!");

        }

        System.out.println( "Voce escolheu: " + escolhaApp);


    }

}