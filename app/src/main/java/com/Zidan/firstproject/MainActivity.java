package com.Zidan.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //list object
    EditText textname;
    Button btnKLIK;
    TextView tvname;
EditText textpswrd;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textname = findViewById(R.id.textnama);
        textpswrd = findViewById(R.id.textpswrd);
        btnKLIK = findViewById(R.id.btnKLIK);
        btnKLIK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (textname.getText().toString().isEmpty() && textpswrd.getText().toString().isEmpty()) {
//                    Toast.makeText(MainActivity.this, "sihlakan isi username dan password", Toast.LENGTH_SHORT).show();
//                } else if (textname.getText().toString().isEmpty() && textpswrd.getText().toString().equals("ZidanBawang")) {
//                    Toast.makeText(MainActivity.this, "sihlakan isi username", Toast.LENGTH_SHORT).show();
//                } else if (textname.getText().toString().equals("zidan") && textpswrd.getText().toString().isEmpty()) {
//                    Toast.makeText(MainActivity.this, "sihlakan isi password", Toast.LENGTH_SHORT).show();
//                } else if (textname.getText().toString().equals("zidan") && textpswrd.getText().toString().equals("zidanbawang")) {
//                    Toast.makeText(MainActivity.this, "successfully logged in", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "somethin's wrong,please try again", Toast.LENGTH_SHORT).show();
//                }
                if (textpswrd.getText().toString().isEmpty() || textname.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "sihlakan isi username dan password", Toast.LENGTH_SHORT).show();
                }else if (textname.getText().toString().equals("zidan") && textpswrd.getText().toString().equals("uwaw")){
                    Toast.makeText(MainActivity.this, "successfully logged in", Toast.LENGTH_SHORT).show();
                    Intent intentku = new Intent(MainActivity.this,Kalkulator .class);
                    startActivity(intentku);
                }else {
                    Toast.makeText(MainActivity.this, "somethin's wrong,please try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


