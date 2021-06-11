package com.example.amst4;


import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;


public class calendar_Lesther extends AppCompatActivity {

    private CalendarView calendarLesther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_lesther);

       calendarLesther = (CalendarView) findViewById(R.id.calendarLesther);


       calendarLesther.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
           @Override
           public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

               if(dayOfMonth==12){
                   Toast.makeText(calendar_Lesther.this,"Recuerda lavarte los dientes",Toast.LENGTH_LONG).show();
               }
               else{
                   Toast.makeText(calendar_Lesther.this,"No hay recordatorio, solo el 12 tiene",Toast.LENGTH_LONG).show();
               }
           }
       });
    }
}