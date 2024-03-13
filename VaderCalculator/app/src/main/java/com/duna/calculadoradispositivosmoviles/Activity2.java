package com.duna.calculadoradispositivosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    float resultado;
    String auxiliar;
    String ultimaOperacion = "";
    String resultadoRecuperado;
    EditText caja1, caja2;
    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0, bonton_punto, boton_menos;
    RadioButton suma, resta, multiplicacion, division;

    Button calcular, mostrar, borrar, guardar;
    SharedPreferences guardadoDatos;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        guardadoDatos = getSharedPreferences("guardadoDatos", Context.MODE_PRIVATE);

        //EditText/////////////////////////////////////////////
        caja1 = findViewById(R.id.textPrimerNumero);
        //Deshabilita el teclado virtual del dispositivo
        caja1.setInputType(InputType.TYPE_NULL);
        //Permite introducir en el EditText decimales.
        //caja1.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);

        caja2 = findViewById(R.id.textSegundoNumero);
        //Deshabilita el teclado virtual del dispositivo
        caja2.setInputType(InputType.TYPE_NULL);
        //Deshabilita el teclado virtual del dispositivo
        //Permite introducir en el EditText decimales. Habilitado en el XML previamente
        //caja2.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);

        //RadioGroup/RadioButton////////////////////////////////
        suma = findViewById(R.id.ButtonSuma);
        resta = findViewById(R.id.ButtonResta);
        multiplicacion = findViewById(R.id.ButtonMultiplicacion);
        division = findViewById(R.id.ButtonDivision);
        deshabilitarRadioBoton();

        //Botones Accion (Calcular, Mostrar, Borrar y Guardar)////
        calcular = findViewById(R.id.buttonCalcular2);
        mostrar = findViewById(R.id.buttonMostrar2);
        borrar = findViewById(R.id.buttonBorrar2);
        guardar = findViewById(R.id.buttonGuardar2);

        //En los EditText no se muestran caracteres al inicio.
        caja1.setText("");
        caja2.setText("");

        //BOTONES//////////////////////////////////////////////////////////
        //Acción de los botones en la calculadora, escuchador y pulsación.

        //Botón1
        boton1 = findViewById(R.id.button_1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "1");
                } else {
                    caja2.setText(caja2.getText() + "1");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón2
        boton2 = findViewById(R.id.button_2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "2");
                } else {
                    caja2.setText(caja2.getText() + "2");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón3
        boton3 = findViewById(R.id.button_3);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "3");
                } else {
                    caja2.setText(caja2.getText() + "3");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón4
        boton4 = findViewById(R.id.button_4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "4");
                } else {
                    caja2.setText(caja2.getText() + "4");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón5
        boton5 = findViewById(R.id.button_5);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "5");
                } else {
                    caja2.setText(caja2.getText() + "5");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón6
        boton6 = findViewById(R.id.button_6);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "6");
                } else {
                    caja2.setText(caja2.getText() + "6");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón7
        boton7 = findViewById(R.id.button_7);
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "7");
                } else {
                    caja2.setText(caja2.getText() + "7");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón8
        boton8 = findViewById(R.id.button_8);
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "8");
                } else {
                    caja2.setText(caja2.getText() + "8");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón9
        boton9 = findViewById(R.id.button_9);
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "9");
                } else {
                    caja2.setText(caja2.getText() + "9");
                    habilitarRadioBoton();
                }
            }
        });
        //Botón0
        boton0 = findViewById(R.id.button_0);
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "0");
                } else {
                    caja2.setText(caja2.getText() + "0");
                    habilitarRadioBoton();
                }
            }
        });
        bonton_punto = findViewById(R.id.button_punto);
        bonton_punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + ".");
                } else {
                    caja2.setText(caja2.getText() + ".");
                    habilitarRadioBoton();
                }
            }
        });
        boton_menos= findViewById(R.id.button_simbolomenos);
        boton_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.isFocused()) {
                    caja1.setText(caja1.getText() + "-");
                } else {
                    caja2.setText(caja2.getText() + "-");
                    habilitarRadioBoton();
                }
            }
        });
        //RADIOGROUP////////////////////////////////////////////////////////////////
        //Selección de operaciones
        //RadioButton "SUMA"
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Casting para convertir el contenido del EditText en números
                    float numero1 = Float.parseFloat(caja1.getText().toString().trim());
                    float numero2 = Float.parseFloat(caja2.getText().toString().trim());
                    resultado = numero1 + numero2;
                    ultimaOperacion = numero1 + " + " + numero2;
                } catch (Exception e) {
                    Toast.makeText(Activity2.this, "Debes introducir los números antes en el contenedor", Toast.LENGTH_SHORT).show();
                    //Deshabilita los RadioButton
                    deshabilitarRadioBoton();

                }
            }
        });
        //RadioButton "RESTA"
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Casting para convertir el contenido del EditText en números
                    float numero1 = Float.parseFloat(caja1.getText().toString().trim());
                    float numero2 = Float.parseFloat(caja2.getText().toString().trim());
                    resultado = numero1 - numero2;
                    ultimaOperacion = numero1 + " - " + numero2;
                } catch (Exception e) {
                    Toast.makeText(Activity2.this, "Debes introducir los números antes en el contenedor.", Toast.LENGTH_LONG).show();
                    //Deshabilita los RadioButton
                    deshabilitarRadioBoton();
                }
            }
        });
        //RadioButton "MULTIPLICACIÓN"
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Casting para convertir el contenido del EditText en números
                    float numero1 = Float.parseFloat(caja1.getText().toString().trim());
                    float numero2 = Float.parseFloat(caja2.getText().toString().trim());
                    resultado = numero1 * numero2;
                    ultimaOperacion = numero1 + " * " + numero2;
                } catch (Exception e) {
                    Toast.makeText(Activity2.this, "Debes introducir los números antes en el contenedor.", Toast.LENGTH_LONG).show();
                    //Deshabilita los RadioButton
                    deshabilitarRadioBoton();
                }
            }
        });
        //RadioButton "DIVISIÓN"
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //Casting para convertir el contenido del EditText en números
                    float numero1 = Float.parseFloat(caja1.getText().toString().trim());
                    float numero2 = Float.parseFloat(caja2.getText().toString().trim());
                    //Se establece condición para que no se pueda dividir entre 0
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        ultimaOperacion = numero1 + " / " + numero2;
                    } else {
                        Toast.makeText(Activity2.this, "La división por cero no está permitida.", Toast.LENGTH_LONG).show();
                        //Deshabilita los RadioButtonr
                        deshabilitarRadioBoton();
                        caja1.setText("No se puede dividir entre 0");
                        caja2.setText("");
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(Activity2.this, "Debes introducir los números antes en el contenedor.", Toast.LENGTH_LONG).show();
                    deshabilitarRadioBoton();
                }
            }
        });
        //BOTONES DE OPERACIONES/////////////////////////////////////////////////////////////
        //Boton Calcular
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiar();

                //Convertir la cadena String a los datos pasados por parametro
                auxiliar = String.valueOf(resultado);
                caja1.setText(auxiliar);

                //Deselecciona los radiobutton de operaciones al calcular la operacion
                suma.setChecked(false);
                resta.setChecked(false);
                multiplicacion.setChecked(false);
                division.setChecked(false);
                //Deshabilita los RadioButton
                deshabilitarRadioBoton();
            }
        });
        //Boton guardar operación
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Guardar la última operación en SharedPreferences
                SharedPreferences.Editor editor = guardadoDatos.edit();
                editor.putString("guardado", ultimaOperacion);
                editor.apply();
                limpiar();
                deshabilitarRadioBoton();
                //Mensaje a mostrar en la aplicación: "Datos guardados"
                Toast.makeText(Activity2.this, "Datos guardados", Toast.LENGTH_SHORT).show();
            }
        });
        //Boton mostrar última operacion realizada.
        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultadoRecuperado = guardadoDatos.getString("guardado", "");
                if (!resultadoRecuperado.isEmpty()) {
                    try {
                        //Muestra el resultado completo. Números introducidos y resultado
                        mostrar();
                        //Deshabilita los RadioButton
                        deshabilitarRadioBoton();
                    }catch (NumberFormatException e) {
                        Toast.makeText(Activity2.this, "Error al convertir resultado recuperado a número", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    caja1.setText("No hay datos guardados");
                }
            }
        });
        //Boton borrar
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Borra los EditText y última operación guardada con SharedPreferences
                borrarTodo();
                //Deshabilita los RadioButton
                deshabilitarRadioBoton();
                //Lanza mensaje de que todo ha sido eliminado
                Toast.makeText(Activity2.this, "Registros y operaciones eliminadas", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //Funciones/////////////////////////////////////////////////////////////////////////////
    //Deshabilita los RadioButton para volver a operar
    private void deshabilitarRadioBoton() {
        suma.setEnabled(false);
        resta.setEnabled(false);
        multiplicacion.setEnabled(false);
        division.setEnabled(false);
    }
    //Habilita los RadioButton para volver a operar
    private void habilitarRadioBoton() {
        suma.setEnabled(true);
        resta.setEnabled(true);
        multiplicacion.setEnabled(true);
        division.setEnabled(true);
    }
    private void mostrar() {
        try {
            caja1.setText(resultadoRecuperado + " = " + resultado);
        }catch (NumberFormatException e){
            caja1.setText("Error al convertir resultadoRecuperado a numero");
        }
    }
    private void limpiar() {
        caja1.setText("");
        caja2.setText("");
    }
    private void borrarTodo() {
        caja1.setText("");
        caja2.setText("");
        SharedPreferences.Editor editor = guardadoDatos.edit();
        editor.remove("guardado");
        editor.apply();
    }
}








