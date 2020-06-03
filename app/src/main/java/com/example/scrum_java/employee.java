package com.example.scrum_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class employee extends AppCompatActivity {
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        b1 = findViewById(R.id.but20);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prof();
            }});
    }
    public void prof(){
        Intent intent = new Intent(this,profileview.class);
        startActivity(intent);
    }

}
