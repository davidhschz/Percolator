package com.example.percolator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText user, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        user = findViewById(R.id.etuser);
        password = findViewById(R.id.etpassword);
        login = findViewById(R.id.btnlogin);

        final String nickuser1 = "usuario1";
        final String passworduser1 = "contraseña1";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals(nickuser1) && password.getText().toString().equals(passworduser1)){
                    Intent sendInfo = new Intent(getApplicationContext(), MainActivity.class);
                    sendInfo.putExtra("checkedUser", user.getText().toString());
                    startActivity(sendInfo);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrecta", Toast.LENGTH_SHORT).show();
                    user.setText("");
                    password.setText("");
                }
            }
        });

    }
}