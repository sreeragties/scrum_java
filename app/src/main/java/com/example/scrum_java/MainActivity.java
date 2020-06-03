package com.example.scrum_java;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton;
        Button dashButton;
        Button taskButton;

        loginButton = findViewById(R.id.buttontask);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }});
        dashButton = findViewById(R.id.buttondash);
        dashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendash();
            }});
        taskButton = findViewById(R.id.buttontask2);
        taskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTask();
            }});

    }
    public void openLogin(){
        Intent intent = new Intent(this,mainTasks.class);
        startActivity(intent);
    }

    public void opendash(){
        Intent intent = new Intent(this,dashboard_page.class);
        startActivity(intent);
    }
    public void openTask(){
        Intent intent = new Intent(this,tasktask.class);
        startActivity(intent);
    }
}
