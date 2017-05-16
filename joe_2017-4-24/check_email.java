package com.example.zhou.travelapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Zhou on 2017/4/21.
 */
public class check_email extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_email);
        Button backToLogin=(Button)findViewById(R.id.to_login);
        backToLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Paction on click
                Intent intent = new Intent(check_email.this,MainActivity .class);//class name of login needed
                startActivity(intent);
            }
        });
    }
}
