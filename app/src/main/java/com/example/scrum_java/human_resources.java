package com.example.scrum_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class human_resources extends AppCompatActivity {
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
        setContentView(R.layout.activity_human_resources);
        bu1 = findViewById(R.id.e1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu2 = findViewById(R.id.e2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});

        bu3 = findViewById(R.id.e3);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu4 = findViewById(R.id.e4);
        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu5 = findViewById(R.id.e5);
        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});


        bu6 = findViewById(R.id.e6);
        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu7 = findViewById(R.id.e7);
        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});

        bu8 = findViewById(R.id.e8);
        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu9 = findViewById(R.id.e9);
        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtaskf();
            }});
        bu10 = findViewById(R.id.e10);
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
