package com.example.myapplication;

import android.content.Intent;
import android.net.*;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    Button btnweb;
    Button btntel;
    Button btn3;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Instatiate the button
        btnweb = findViewById(R.id.btnweb);
        btntel = findViewById(R.id.btntel);
        btn3 = findViewById(R.id.main3);



        //Add a click listener to the button

        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String url = "https://secops-ctf.com/";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        btntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:0606060606");
                intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
        btntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:0606060606");
                intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);//pour entrer
                startActivity(intent);
            }
        });


    }
    public boolean onCreateOptionsMenu(Menu menu ){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}