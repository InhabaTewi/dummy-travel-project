package com.example.zhou.travelapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Zhou on 2017/4/21.
 */
public class sign_up extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        Button submit_button=(Button)findViewById(R.id.button4);
        final EditText emailValidate = (EditText)findViewById(R.id.editTextEmail);//the eamil entered
        final EditText password1=(EditText)findViewById(R.id.editTextPassword1);
        final EditText password2=(EditText)findViewById(R.id.editTextPassword2);
        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        submit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String email=emailValidate.getText().toString();
                if (email.matches(emailPattern) && email.length() > 0)
                {
                    //email form checked
                    if(password1.getText().toString().equals(password2.getText().toString())){
                        //password checked
                       // Intent intent = new Intent(sign_up.this,LOGINPAGENAME.class);   //class name needed (jump after submit
                       // startActivity(intent);

                    }
                    else{
                        Toast.makeText(getApplicationContext(),"please enter the same password",Toast.LENGTH_SHORT).show();
                        password1.setText(null);
                        password2.setText(null);

                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid email address",Toast.LENGTH_SHORT).show();
                    emailValidate.setText(null);
                }


            }

        });



    }
}
