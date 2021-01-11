package com.example.selection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup gender_group = findViewById(R.id.gender);
        final RadioGroup old_group = findViewById(R.id.old);
        // 라디오 그룹 등록

        Button button = findViewById(R.id.button);

        final Intent nextPage = new Intent(this, NextPage.class);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int gender_id = gender_group.getCheckedRadioButtonId();
                // getCheckedRadioButtonId의 리턴값은 선택된 RadioButton의 id값
                RadioButton gender = findViewById(gender_id);

                int old_id = old_group.getCheckedRadioButtonId();
                RadioButton old = findViewById(old_id);

                nextPage.putExtra("gender", gender.getText().toString());
                nextPage.putExtra("old", old.getText().toString());
                startActivity(nextPage);
            }
        });
    }

}