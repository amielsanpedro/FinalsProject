package com.SanpedroAlatraca.project.work_it_out;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_signup, button_login;

    public void openSignup(){
        Intent next = new Intent(this,SignUp.class);
        startActivity(next);
    }

    public void openLogin(){
        Intent next = new Intent(this,Homepage.class);
        startActivity(next);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_signup= (Button)findViewById(R.id.button_signup);
        button_signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSignup();
            }
        });

        button_login= (Button)findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLogin();
            }
        });
    }
}
