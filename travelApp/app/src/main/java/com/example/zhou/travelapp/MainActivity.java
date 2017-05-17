package com.example.zhou.travelapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_city=(Button)findViewById(R.id.button);
        final EditText editText=(EditText)findViewById(R.id.editText6);
        button_city.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               String input_search= editText.getText().toString();
                ArrayList <String>countries_cities=new ArrayList<String>();//hard code country and ciry information
                countries_cities.add("city1");
                countries_cities.add("city2");
                countries_cities.add("city3");
                countries_cities.add("city4");
                countries_cities.add("city1");
                countries_cities.add("city2");
                countries_cities.add("city5");
                countries_cities.add("city6");
                int j=0;
                ArrayList <String>matched_result=new ArrayList<String>();
                for(int i=0; i<countries_cities.size();i++)
                {
                    if (input_search.equals(countries_cities.get(i)))
                    {
                        matched_result.add(countries_cities.get(i));
                        j++;
                    }
                }
                if(j==0)
                {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("error");
                    alert.setMessage("no country or city name matched, please enter again");
                    alert.setPositiveButton("OK",null);
                    alert.show();
                }
                else if(j==1)
                {
                    Intent intent = new Intent(MainActivity.this, Search_reult.class);
                    String message = matched_result.get(0);
                    intent.putExtra(EXTRA_MESSAGE,message);
                    startActivity(intent);
                }
               else if(j>=2)
                {
                    final CharSequence[] cs = matched_result.toArray(new CharSequence[matched_result.size()]);
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Select");
                    builder.setItems(cs, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int item) {
                            // Do something with the selection
                                String message1=cs[item].toString();
                            Intent intent = new Intent(MainActivity.this, Search_reult.class);
                            intent.putExtra(EXTRA_MESSAGE,message1);
                            startActivity(intent);


                            dialog.dismiss();
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            }

        });



        }
    }





