package com.ingwilson.miprimerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Manipulacion  extends AppCompatActivity {
    EditText edtnombre;
    EditText edtmonto;
    TextView txtresultado;
    Button btnejecutar;
    Button btncambio;
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulacion);
        edtnombre=findViewById(R.id.edtnombre);
        edtmonto=findViewById(R.id.edtmonto);
        txtresultado=findViewById(R.id.txtResultado);
        btnejecutar=findViewById(R.id.btncambiar);
        btncambio=findViewById(R.id.btntest);
        btnejecutar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double cambio;
                cambio=Double.parseDouble(edtmonto.getText().toString())*3.3;
                txtresultado.setText(edtnombre.getText() + " el monto de "+ edtmonto.getText()+
                        " dolares equivale a " + cambio.toString() + "Soles");
            }
        });
    }


    public void ocultar(View view) {
        if(a==0)
        {
            btnejecutar.setVisibility(View.GONE);
            a=1;
            btncambio.setText("Mostrar");
        }
        else
        {
            btnejecutar.setVisibility(View.VISIBLE);
            a=0;
            btncambio.setText("OCULTAR");
        }
    }
}