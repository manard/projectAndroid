package com.manar.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardView = findViewById(R.id.cardView);
        CardView caedView2=findViewById(R.id.cardView2);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click here
                Toast.makeText(MainActivity.this, "Book Clicked!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this, chooceCollege.class);
                startActivity(intent);
            }
        });
        caedView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "FeedBack Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
