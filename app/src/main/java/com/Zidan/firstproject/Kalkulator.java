package com.Zidan.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
EditText A1;
EditText A2;
Button  tambah;
Button kurang;
Button kali;
Button bagi;
TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        A1 = findViewById(R.id.NumberA1);
        A2 = findViewById(R.id.NumberA2);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        hasil = findViewById(R.id.hasil);







    }
}
