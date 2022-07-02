package com.example.volleypracticejsonplaceholder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowDetails extends AppCompatActivity {

    TextView id,title,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
        id= findViewById(R.id.userId_desc);
        title= findViewById(R.id.title_desc);
        desc = findViewById(R.id.description);

        String id_value = getIntent().getStringExtra("userId");
        String title_value = getIntent().getStringExtra("title");
        String desc_value = getIntent().getStringExtra("body");

        id.setText(id_value);
        title.setText(title_value);
        desc.setText(desc_value);
    }
}