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
public class ForgetPassWord extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password_layout);
        Button reset_password_button=(Button)findViewById(R.id.resetpasswordButton);
        reset_password_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Paction on click
                Intent intent = new Intent(ForgetPassWord.this, check_email.class);
                startActivity(intent);
            }
        });
    }
}
