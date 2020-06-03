package com.example.scrum_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard_page extends AppCompatActivity {
    Button team;
    Button employee;
    Button calen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_page);
        team = findViewById(R.id.teams);
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empf();
            }});
        employee = findViewById(R.id.employee);
        employee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamf();
            }});
        calen = findViewById(R.id.calender);
        calen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empf();
            }});
    }
    public void teamf(){
        Intent intent = new Intent(this,employee.class);
        startActivity(intent);
    }
    public void empf(){
        Intent intent = new Intent(this,empty.class);
        startActivity(intent);
    }
}
