package com.example.applicationregistro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_Informacion extends AppCompatActivity {
    TextView txtNombres, txtApellidos, txtEdad, txtCorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_informacion);

        txtNombres = findViewById(R.id.nombre);
        txtApellidos = findViewById(R.id.apellidos);
        txtEdad = findViewById(R.id.edad);
        txtCorreo = findViewById(R.id.correo);

        DatosUsuarios personas = (DatosUsuarios) getIntent().getSerializableExtra("persona");

        if (personas != null) {
            txtNombres.setText("Nombre: " + personas.getNombres());
            txtApellidos.setText("Apellido: " + personas.getApellidos());
            txtEdad.setText("Edad: " + personas.getEdad());
            txtCorreo.setText("Correo: " + personas.getCorreo());
        } else {
            txtNombres.setText("Error: No se recibió la información.");
        }

    }
}


//        btnVolver.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Activity_Informacion.this, MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
//            }
//        });