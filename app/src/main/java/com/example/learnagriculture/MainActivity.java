package com.example.learnagriculture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button elevage;
    private Button agriculture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.elevage = findViewById(R.id.elevage);
        elevage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent otherActivity = new Intent(getApplicationContext(), elevage.class);
                startActivity(otherActivity);
                finish();
            }
        });

        this.agriculture = findViewById(R.id.agriculture);
        agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity1 = new Intent(getApplicationContext(), agriculture.class);
                startActivity(otherActivity1);
                finish();
            }
        });

    }




}
