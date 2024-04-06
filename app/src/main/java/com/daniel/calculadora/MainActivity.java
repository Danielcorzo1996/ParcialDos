package com.daniel.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nombres, cedula, fecha, carrera;
    private TextView res;
    private Button Enviar;

    private Message data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = findViewById(R.id.nombres);
        cedula = findViewById(R.id.cedula);
        fecha = findViewById(R.id.fecha);
        carrera = findViewById(R.id.carrera);

        Enviar = findViewById(R.id.enviar);

        data = new Message();

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    showResult(view,  nombres, cedula, fecha, carrera );
            }
        });

    }

    public void showResult(View view, EditText nombres, EditText cedula, EditText fecha, EditText carrera ){
        Intent intent = new Intent(this, MainActivity2.class);

        data.setResult(String.valueOf(nombres));
        data.setResult(String.valueOf(cedula));
        data.setResult(String.valueOf(fecha));
        data.setResult(String.valueOf(carrera));
        intent.putExtra("data", data );
        startActivity(intent);
    }




}
