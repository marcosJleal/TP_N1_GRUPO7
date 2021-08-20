package utn.frgp.edu.ar.tpn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Suma extends AppCompatActivity {

    TextView txtNum1;
    TextView txtNum2;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        this.setTitle(R.string.TituloSuma);

    }

    public void Sumar(View vw){

        int num1=Integer.parseInt(txtNum1.getText().toString());
        int num2=Integer.parseInt(txtNum2.getText().toString());
        int result=num1+num2;
        tvResultado.setText(String.valueOf(result));

    }

}