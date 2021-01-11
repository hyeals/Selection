package com.example.selection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        TextView gender = findViewById(R.id.get_gender);
        TextView old = findViewById(R.id.get_old);

        Intent get_intent = getIntent();
        gender.append(get_intent.getStringExtra("gender"));
        old.append(get_intent.getStringExtra("old"));
    }
}
