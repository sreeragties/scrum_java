package com.example.scrum_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub_task1 extends AppCompatActivity {
    Button bu1;
    Button bu2;
    Button bu3;
    Button bu4;
    Button bu5;
    Button bu6;
    Button bu7;
    Button bu8;
    Button bu9;
    Button bu10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_task1);
        bu1 = findViewById(R.id.d1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu2 = findViewById(R.id.d2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});

        bu3 = findViewById(R.id.d3);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu4 = findViewById(R.id.d4);
        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu5 = findViewById(R.id.d5);
        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});


        bu6 = findViewById(R.id.d6);
        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu7 = findViewById(R.id.d7);
        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});

        bu8 = findViewById(R.id.d8);
        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu9 = findViewById(R.id.d9);
        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu10 = findViewById(R.id.d10);
        bu10.setOnClickListener(new View.OnClickListener() {
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
