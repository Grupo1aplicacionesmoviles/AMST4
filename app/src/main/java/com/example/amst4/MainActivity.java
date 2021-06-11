package com.example.amst4;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.linear_graph:
                startActivity(new Intent(MainActivity.this,LinearGraphActivity.class));
                break;
            case R.id.video_view:
                startActivity(new Intent(MainActivity.this,LinearGraphActivity.class));
                break;
            case R.id.calendar_view:
                startActivity(new Intent(MainActivity.this,LinearGraphActivity.class));
                break;
            case R.id.map:
                startActivity(new Intent(MainActivity.this,LinearGraphActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //Comentario
}