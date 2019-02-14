package br.edu.ifpr.josepher.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView userName;
    private TextView senha;
    private TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = findViewById(R.id.userName);
        senha = findViewById(R.id.senha);
        login = findViewById(R.id.botao);

        login.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == login){
            String name = userName.getText().toString();
            String password = senha.getText().toString();

            String msg = "Login " + (loginValido(name, password) ? "VÁLIDO" : "INVÁLIDO");

            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }

    }
    private boolean loginValido(String usuario, String senha) {
        return usuario.equals("josepher") && senha.equals("123");
    }
}
