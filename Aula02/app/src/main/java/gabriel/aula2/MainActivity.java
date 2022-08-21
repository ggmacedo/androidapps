package gabriel.aula2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bSomar;
    private EditText eNum1;
    private EditText eNum2;
    private EditText eResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNum1 = findViewById(R.id.edtN1);
        eNum2 = findViewById(R.id.edtN2);
        eResultado = findViewById(R.id.edtTotal);
        bSomar = findViewById(R.id.btnSomar);

       bSomar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int n1 = Integer.parseInt(eNum1.getText().toString());
               int n2 = Integer.parseInt(eNum2.getText().toString());
               int total = n1 + n2;
               eResultado.setText(Integer.toString(total));

               Toast.makeText(getApplicationContext(), "Total: " + Integer.toString(total), Toast.LENGTH_LONG).show();

           }
       });

    }
}
