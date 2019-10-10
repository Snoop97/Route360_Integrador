package com.example.route360_v3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Login extends AppCompatActivity {

    EditText userName, password;
    Button Ingresar;
    TextView lblMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName = (EditText) findViewById(R.id.txtUser);
        password = (EditText) findViewById(R.id.txtPass);
        Ingresar = (Button) findViewById(R.id.btnIngresar);

     /*   Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarUsuario(obtenerUsuario(),obtenerPassword());
            }
        });
*/

    }
    public void onLogin(View view)
    {
     String username = userName.getText().toString();
     String psw = password.getText().toString();
     String type = "login";
     BackgroundAdm backgroundAdm = new BackgroundAdm(this);
     backgroundAdm.execute(type, username, psw);
     Intent intent = new Intent(Login.this, com.example.route360_v3.Mapa.class);
     startActivity(intent);
    }

    public String obtenerUsuario()
    {
        return userName.getText().toString();
    }

    public String obtenerPassword()
    {
        return password.getText().toString();
    }
    public void validarUsuario(final String Usuario, String Password)
    {
        String URL="http://website301297.000webhostapp.com/Route360/Controlador/AdministradorControlador.php?op=1&usuarioAdm="+Usuario+"&passwordAdm="+Password;
        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try
                {
                    String rpta = String.valueOf(response);
                    if(rpta.contains("success"))
                    {
                        Toast.makeText(Login.this, "Bienvenido usuario: "+Usuario, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, com.example.route360_v3.Mapa.class);
                        intent.putExtra("usuarioAdm", Usuario);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Login.this, "Verifique sus credenciales",Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception ex)
                {
                    Toast.makeText(Login.this, "Error: "+ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Login.this,"Error en el codigo", Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(stringRequest);
    }
}
