package com.example.customadapter;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] names = {"group 1"};
    int[] images = {R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);
        CustomAdapter customAdapter = new CustomAdapter(names, images, this);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = names[position];
                int image = images[position];
                startActivity(new Intent(MainActivity.this, BigImage.class).putExtra("name", name).putExtra("image", image));

            }
        });
    }

}