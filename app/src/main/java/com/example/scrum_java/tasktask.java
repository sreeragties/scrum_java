package com.example.scrum_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tasktask extends AppCompatActivity {
    Button hr_button;
    Button hmre;
    Button conte;
    Button crea;
    Button tes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasktask);
        hr_button = findViewById(R.id.hrwe);
        hr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subta();
            }});
        hmre = findViewById(R.id.humre);
        hmre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huma();
            }});
        conte = findViewById(R.id.contcre);
        conte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conta();
            }});
        tes = findViewById(R.id.tes);
        tes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huma();
            }});
        crea = findViewById(R.id.crea);
        crea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conta();
            }});
    }
    public void subta(){
        Intent intent = new Intent(this,sub_task1.class);
        startActivity(intent);
    }
    public void huma(){
        Intent intent = new Intent(this,human_resources.class);
        startActivity(intent);
    }
    public void conta(){
        Intent intent = new Intent(this,content_task.class);
        startActivity(intent);
    }
}
