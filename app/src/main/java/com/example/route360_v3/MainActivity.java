package com.example.route360_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button botonUsuario, botonEmpresa, botonLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonUsuario = (Button) findViewById(R.id.btnUser);
        botonEmpresa = (Button) findViewById(R.id.btnComp);
        botonLogIn = (Button) findViewById(R.id.btnLogin);

        botonUsuario.setOnClickListener(this); //referencia al boton Usuario
        botonEmpresa.setOnClickListener(this); //referencia al boton Empresa
        botonLogIn.setOnClickListener(this); //referencia al login
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnUser:
                Intent intentUsuario = new Intent(this, RegistroUsuario.class);
                startActivity(intentUsuario);
                break;
            case R.id.btnComp:
                Intent intentEmpresa = new Intent(this,RegistroEmpresa.class);
                startActivity(intentEmpresa);
                break;
            case R.id.btnLogin:
                Intent intentLogin = new Intent(this,Login.class);
                startActivity(intentLogin);
                break;

        }
    }
}
