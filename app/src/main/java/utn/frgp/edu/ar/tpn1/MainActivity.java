package utn.frgp.edu.ar.tpn1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ejercicio1(View vw){

        Intent Ej1=new Intent(this,Suma.class);
        startActivity(Ej1);
    }
    public void Ejercicio2(View vw){

        Intent Ej2=new Intent(this,Calculadora.class);
        startActivity(Ej2);
    }
}