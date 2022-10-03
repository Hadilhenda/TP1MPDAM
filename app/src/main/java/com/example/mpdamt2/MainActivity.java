package com.example.mpdamt2;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nom;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = (EditText) findViewById(R.id.nom);
        b3 = (Button) findViewById (R.id.b3);
        b2 = (Button) findViewById (R.id.b2);
        b1 = (Button) findViewById (R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom1 = nom.getText().toString();


                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                intent.putExtra("Nom",nom1);

                startActivity(intent);


            }
        });
        this.b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( view.getContext() ,MainActivity3.class );
                startActivity(intent);
            }
        });
        this.b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra(CalendarContract.Events.TITLE, "Event Title");
                //intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, DateTime);
               //intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, DateTime);
                intent.putExtra(CalendarContract.Events.ALL_DAY, false);
                intent.putExtra(CalendarContract.Events.DESCRIPTION, "Event Descripttion");
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Event Location");
                startActivity(Intent.createChooser(intent, "Add to calendar"));
            }
        });

    }
}