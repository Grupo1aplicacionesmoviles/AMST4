package com.example.amst4;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class calendar_Lesther extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_lesther);
        CalendarView calendarLesther = findViewById(R.id.calendarLesther);


       calendarLesther.setOnDateChangeListener((view, year, month, dayOfMonth) -> {

           if(dayOfMonth==12){
               Toast.makeText(calendar_Lesther.this,"Recuerda lavarte los dientes",Toast.LENGTH_LONG).show();
           }
           else{
               Toast.makeText(calendar_Lesther.this,"No hay recordatorio, solo el 12 tiene",Toast.LENGTH_LONG).show();
           }
       });
    }
}