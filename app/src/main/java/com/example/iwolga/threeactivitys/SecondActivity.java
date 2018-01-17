package com.example.iwolga.threeactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by iwolga on 17.01.2018.
 */

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button first = findViewById(R.id.first);
        Button third = findViewById(R.id.third);
        final TextView data = findViewById(R.id.data);

        String stringData = getIntent().getStringExtra("data");
        data.setText(stringData);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                intent.putExtra("data", data.getText().toString());
                startActivity(intent);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("data", data.getText().toString());
                startActivity(intent);
            }
        });

    }
}
