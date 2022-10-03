package com.example.mpdamt2;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String nom1 = intent.getStringExtra("Nom");


        TextView res = (TextView) findViewById(R.id.textView);

        res.setText("Nom: "+nom1 );
    }
}