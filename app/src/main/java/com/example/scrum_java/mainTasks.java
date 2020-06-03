package com.example.scrum_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class mainTasks extends AppCompatActivity {
    Button hr_button;
    Button pending;
    Button devel;
    Button testi;
    Button compli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tasks);
        hr_button = findViewById(R.id.hr);
        hr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subta();
            }});
        pending = findViewById(R.id.pend);
        pending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penda();
            }});
        devel = findViewById(R.id.devel);
        devel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deva();
            }});
        testi = findViewById(R.id.testing);
        testi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subta();
            }});
        compli = findViewById(R.id.compl);
        compli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                penda();
            }});






    }
    public void subta(){
        Intent intent = new Intent(this,rejected_task.class);
        startActivity(intent);
    }
    public void penda(){
        Intent intent = new Intent(this,pending_task.class);
        startActivity(intent);
    }

    public void deva(){
        Intent intent = new Intent(this,develop_task.class);
        startActivity(intent);
    }
}
