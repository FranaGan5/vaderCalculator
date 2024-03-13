package com.duna.calculadoradispositivosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {
    private TextView app_Bienvenida;
    private Button button_Acceso, button_Salir;
    private static final int BOTON_1 = R.id.buttonAcceso;
    private static final int BOTON_2 = R.id.buttonSalir;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        button_Acceso = findViewById(R.id.buttonAcceso);
        button_Salir = findViewById(R.id.buttonSalir);

        button_Acceso.setOnClickListener(this);
        button_Salir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == BOTON_1){
            Intent intentDatos = new Intent(this, Activity2.class);
            intentDatos.putExtra("nombre", "bienvenido");
            startActivity(intentDatos);
        }else if (v.getId() == BOTON_2){
            finish();
        }
    }
}