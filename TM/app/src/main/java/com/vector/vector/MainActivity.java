package com.vector.vector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    private Vector<Cliente> clientes;
    private int pos;
    private EditText edtCodigo;
    private EditText edtNome;
    private EditText edtEndereco;
    private EditText edtTelefone;

    private Button btnPrimeiro;
    private Button btnAnterior;
    private Button btnProximo;
    private Button btnUltimo;

    private Button btnInserir;
    private Button btnAlterar;
    private Button btnExcluir;

    private Button btnAddTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clientes = new Vector<Cliente>();
        pos = -1;

        edtCodigo = findViewById(R.id.edtCodigo);
        edtNome = findViewById(R.id.edtNome);
        edtEndereco = findViewById(R.id.edtEndereco);
        edtTelefone = findViewById(R.id.edtTelefone);

        btnInserir = findViewById(R.id.btnInserir);
        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cliente c = new Cliente();
                c.setCodigo(Integer.parseInt(edtCodigo.getText().toString()));
                c.setNome(edtNome.getText().toString());
                c.setEndereco(edtEndereco.getText().toString());
                clientes.add(c);
                pos = clientes.size() - 1;
            }
        });

        btnPrimeiro = findViewById(R.id.btnPrimeiro);
        btnPrimeiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos = 0;
                preencheCampos();
            }
        });

        btnUltimo = findViewById(R.id.btnUltimo);
        btnUltimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos = clientes.size() - 1;
                preencheCampos();
            }
        });

        btnAnterior = findViewById(R.id.btnAnterior);
        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pos > 0) {
                    pos = pos - 1;
                }
                preencheCampos();
            }
        });

        btnProximo = findViewById(R.id.btnProximo);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pos < clientes.size() - 1) {
                    pos = pos + 1;
                }
                preencheCampos();
            }
        });

        btnAlterar = findViewById(R.id.btnAlterar);
        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cliente c = clientes.get(pos);
                c.setCodigo(Integer.parseInt(edtCodigo.getText().toString()));
                c.setNome(edtNome.getText().toString());
                c.setEndereco(edtEndereco.getText().toString());
            }
        });

        btnExcluir = findViewById(R.id.btnExcluir);
        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clientes.removeElementAt(pos);
                if (pos >= clientes.size()){
                    pos = pos - 1;
                }
                preencheCampos();
            }
        });

        btnAddTelefone = findViewById(R.id.btnAdicionaTelefone);
        btnAddTelefone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                preencheCampos();
            }
        });
    }

    private void preencheCampos(){
        if (pos > -1) {
            Cliente c = clientes.get(pos);
            edtCodigo.setText(Integer.toString(c.getCodigo()));
            edtNome.setText(c.getNome());
            edtEndereco.setText(c.getEndereco());
            edtTelefone.setText(c.getTelefone());

        }else{
            edtCodigo.setText("");
            edtNome.setText("");
            edtEndereco.setText("");
            edtTelefone.setText("");
        }
    }
        @Override
        public void onClick(View view) {
            clientes.removeElementAt(pos);
            if (pos >= clientes.size()){
                pos = pos - 1;
            }
            preencheCampos();
        }
    });

        @Override
        public void onClick(View view) {
            Cliente c = new Cliente();
            c.setCodigo(Integer.parseInt(edtCodigo.getText().toString()));
            c.setNome(edtNome.getText().toString());
            c.setEndereco(edtEndereco.getText().toString());
            clientes.add(c);
            pos = clientes.size() - 1;
        }
    });
}
