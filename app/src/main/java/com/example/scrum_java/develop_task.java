package com.example.scrum_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class develop_task extends AppCompatActivity {
    Button bu1;
    Button bu2;
    Button bu3;
    Button bu4;
    Button bu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_develop_task);
        bu1 = findViewById(R.id.c1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu2 = findViewById(R.id.c2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});

        bu3 = findViewById(R.id.c3);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu4 = findViewById(R.id.c4);
        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu3 = findViewById(R.id.c5);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
    }
    public void subtaskf(){
        Intent intent = new Intent(this,taskview.class);
        startActivity(intent);
    }
}
