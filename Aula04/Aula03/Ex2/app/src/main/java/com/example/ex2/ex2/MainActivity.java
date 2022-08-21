package com.example.ex2.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Vector;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Button bInserir;
    private Button bAlterar;
    private Button bExcluir;
    private Button bPrimeiro;
    private Button bSegundo;
    private Button bTerceiro;
    private Button bQuarto;
    private EditText eCod;
    private EditText eNome;
    private EditText eEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Vector<String> vAlu = new Vector<String>();
        eCod = findViewById(R.id.editCod);
        eNome = findViewById(R.id.editNome);
        eEndereco = findViewById(R.id.editEndereco);
        bInserir = findViewById(R.id.btnInserir);
        bAlterar = findViewById(R.id.btnAlterar);
        bExcluir = findViewById(R.id.btnExcluir);
        int x=0;

        bInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vAlu.add(eCod.getText().toString()+", " + eNome.getText().toString() + ", " + eEndereco.getText().toString()) ;


                Toast.makeText(getApplicationContext(), "Total: \n" + vAlu, Toast.LENGTH_LONG).show();
            }

        });

        bAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i = 0; i < vAlu.size(); i++){

                    vAlu.add(eCod.getText().toString());
                    vAlu.add(eNome.getText().toString());
                    vAlu.add(eEndereco.getText().toString());

                }

                Toast.makeText(getApplicationContext(), "Total: " + vAlu, Toast.LENGTH_LONG).show();
            }

        });

        bExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i = 0; i < vAlu.size(); i++){

                    vAlu.remove(i);

                }

                Toast.makeText(getApplicationContext(), "Total: " + vAlu, Toast.LENGTH_LONG).show();
            }

        });

    }
}

