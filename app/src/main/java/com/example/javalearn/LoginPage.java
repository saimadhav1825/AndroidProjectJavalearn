package com.example.javalearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;
    Button newuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        username=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        login=(Button) findViewById(R.id.login);
        newuser=(Button)findViewById(R.id.newuser);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("sai")&&password.getText().toString().equals("1234")){
                Intent intent=new Intent(LoginPage.this,MainPage.class);
                startActivity(intent);
                }
                else {
                    Toast.makeText(LoginPage.this,"enter valid username and password",Toast.LENGTH_SHORT).show();
                }
            }
        });
        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginPage.this,NewUserPage.class);
                startActivity(intent);
            }
        });

    }
}
