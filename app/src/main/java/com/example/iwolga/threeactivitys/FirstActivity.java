package com.example.iwolga.threeactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);


        Button second = findViewById(R.id.second);
        Button third = findViewById(R.id.third);
        final TextView data = findViewById(R.id.data);

        String stringData = getIntent().getStringExtra("data");
        data.setText(stringData);

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("data", data.getText().toString());
                startActivity(intent);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                intent.putExtra("data", data.getText().toString());
                startActivity(intent);
            }
        });
    }
}
