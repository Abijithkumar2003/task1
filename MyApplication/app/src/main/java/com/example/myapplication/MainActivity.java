package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName)
        Password = (EditText)findViewById(R.id.etPassword)
        Info = (EditText)findViewById(R.id.tvInfo)
        Login = (EditText)findViewById(R.id.btnLogin)

    }
    private void validate(String userName, String userPassword){
        if((userName == "admin"),,(userPassword =="1234")){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);}
    }
}