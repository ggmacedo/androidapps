package com.example.ex2.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Button bExibir;
    private EditText eCod;
    private EditText eNome;
    private EditText eEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eCod = findViewById(R.id.editCod);
        eNome = findViewById(R.id.editNome);
        eEndereco = findViewById(R.id.editEndereco);
        bExibir = findViewById(R.id.btnExibir);

        bExibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Codigo: " + eCod + "Nome: " + eNome + "Endereço: " + eEndereco , Toast.LENGTH_LONG).show();

            }
        });

    }
}

