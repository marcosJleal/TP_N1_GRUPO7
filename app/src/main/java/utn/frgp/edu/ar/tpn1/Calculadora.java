package utn.frgp.edu.ar.tpn1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    Float valor1 = 0.0f;
    Float valor2 = 0.0f;
    TextView Resultado;
    int operador;
    boolean segundoNumero = false;
    boolean igual = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        this.setTitle(R.string.TituloCalculadora);
        Resultado = (TextView) findViewById(R.id.txtResultado);
    }

    public void btnNum0(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("0");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("0");
                segundoNumero = false;
            } else {

                if (num == 0.0f) {
                    Resultado.setText("0");
                } else {
                    Resultado.setText(Resultado.getText() + "0");
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void btnNum1(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("1");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("1");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("1");
                } else {
                    Resultado.setText(Resultado.getText() + "1");
                }
            }
        }

    }

    public void btnNum2(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("2");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("2");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("2");
                } else {
                    Resultado.setText(Resultado.getText() + "2");
                }
            }
        }

    }

    public void btnNum3(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("3");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("3");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("3");
                } else {
                    Resultado.setText(Resultado.getText() + "3");
                }
            }
        }

    }

    public void btnNum4(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("4");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("4");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("4");
                } else {
                    Resultado.setText(Resultado.getText() + "4");
                }
            }
        }

    }

    public void btnNum5(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("5");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("5");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("5");
                } else {
                    Resultado.setText(Resultado.getText() + "5");
                }
            }
        }

    }

    public void btnNum6(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("6");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("6");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("6");
                } else {
                    Resultado.setText(Resultado.getText() + "6");
                }
            }
        }

    }

    public void btnNum7(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("7");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("7");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("7");
                } else {
                    Resultado.setText(Resultado.getText() + "7");
                }
            }
        }

    }

    public void btnNum8(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("8");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("8");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("8");
                } else {
                    Resultado.setText(Resultado.getText() + "8");
                }
            }
        }

    }

    public void btnNum9(View vw) {
        float num = Float.parseFloat(Resultado.getText().toString());
        if(igual){
            Resultado.setText("9");
            igual = false;
        } else {
            if (segundoNumero) {
                Resultado.setText("9");
                segundoNumero = false;
            } else {
                if (num == 0.0f) {
                    Resultado.setText("9");
                } else {
                    Resultado.setText(Resultado.getText() + "9");
                }
            }
        }

    }

    public void btnBorrar(View vw) {
        Resultado.setText("0");
        valor1 = 0.0f;
        valor2 = 0.0f;
        segundoNumero = false;
        operador = 0;
        igual = false;
    }

    public void btnSumar(View vw) {
        if (valor1 == 0.0f) {
            valor1 = Float.parseFloat(Resultado.getText().toString());
            operador = 1;
            segundoNumero = true;
            igual = false;
        } else {
            Toast.makeText(this, "Solo esta permitido cuentas con dos numeros", Toast.LENGTH_LONG).show();
        }
    }

    public void btnMultiplicar(View vw) {
        if (valor1 == 0.0f) {
            valor1 = Float.parseFloat(Resultado.getText().toString());
            operador = 2;
            segundoNumero = true;
            igual = false;
        } else {
            Toast.makeText(this, "Solo esta permitido cuentas con dos numeros", Toast.LENGTH_LONG).show();
        }
    }

    public void btnDividir(View vw) {
        if (valor1 == 0.0f) {
            valor1 = Float.parseFloat(Resultado.getText().toString());
            operador = 3;
            segundoNumero = true;
            igual = false;
        } else {
            Toast.makeText(this, "Solo esta permitido cuentas con dos numeros", Toast.LENGTH_LONG).show();
        }
    }

    public void btnRestar(View vw) {
        if (valor1 == 0.0f) {
            valor1 = Float.parseFloat(Resultado.getText().toString());
            operador = 4;
            segundoNumero = true;
            igual = false;
        } else {
            Toast.makeText(this, "Solo esta permitido cuentas con dos numeros", Toast.LENGTH_LONG).show();
        }
    }

    public void btnIgual(View vw){
        valor2 = Float.parseFloat(Resultado.getText().toString());
        float res = 0.0f;
        switch (operador) {
            case 1:
                res = valor1 + valor2;
                break;
            case 2:
                res = valor1 * valor2;
                break;
            case 3:
                res = valor1 / valor2;
                break;
            case 4:
                res = valor1 - valor2;
                break;
            default:
                break;
        }
        Resultado.setText(String.valueOf(res));
        valor1 = 0.0f;
        valor2 = 0.0f;
        operador = 0;
        segundoNumero = false;
        igual = true;
    }


}