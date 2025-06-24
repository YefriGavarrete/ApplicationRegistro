package com.example.applicationregistro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtNombres, txtApellidos, txtCorreo, txtEdad;
    Button btnenviar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtNombres = (EditText) findViewById(R.id.txtNombres);
        txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        btnenviar = (Button) findViewById(R.id.btnVolver);


        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view  ){
                String nombres = txtNombres.getText().toString();
                String apellidos = txtApellidos.getText().toString();
                int edad = Integer.parseInt(txtEdad.getText().toString());
                String correo = txtCorreo.getText().toString();

                DatosUsuarios persona = new DatosUsuarios(nombres, apellidos, edad, correo);

                Intent intent  = new Intent(MainActivity.this, Activity_Informacion.class);
                intent.putExtra("usuario",persona);
                startActivity(intent);
            }

        });




        Activity_Informacion activity = new Activity_Informacion();

    }
}