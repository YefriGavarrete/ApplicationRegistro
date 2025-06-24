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
    EditText txtNombres, txtApellidos, txtEdad, txtCorreo;
    Button btnVolver;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_informacion);
        txtNombres = (EditText) findViewById(R.id.txtNombres);
        txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        DatosUsuarios personas = (DatosUsuarios) getIntent().getSerializableExtra("usuario");
        if(personas!=null){
            txtNombres.setText(personas.getNombres());
            txtApellidos.setText(personas.getApellidos());
            txtEdad.setText(personas.getEdad());
            txtCorreo.setText(personas.getCorreo());
        }
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Informacion.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


    }
}