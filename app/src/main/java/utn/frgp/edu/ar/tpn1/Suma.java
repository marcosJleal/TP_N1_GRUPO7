package utn.frgp.edu.ar.tpn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suma extends AppCompatActivity {

    EditText etPrimerNumero;
    EditText etSegundoNumero;
    TextView tvResultadoSumaEj1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        this.setTitle(R.string.TituloSuma);

        etPrimerNumero = (EditText) findViewById(R.id.etPrimerNumero);
        etSegundoNumero = (EditText) findViewById(R.id.etSegundoNumero);
        tvResultadoSumaEj1 = (TextView) findViewById(R.id.tvResultadoSumaEj1);

    }

    public void Sumar(View vw){

        int num1=Integer.parseInt(etPrimerNumero.getText().toString());
        int num2=Integer.parseInt(etSegundoNumero.getText().toString());
        int result=num1+num2;
        tvResultadoSumaEj1.setText(String.valueOf(result));

    }

}