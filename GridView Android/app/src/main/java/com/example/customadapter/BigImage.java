package com.example.customadapter;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.squareup.picasso.Picasso;

public class BigImage extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_image);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.text);

        Intent intent = getIntent();

        if (intent.getExtras() != null) {
            String text = intent.getExtras().getString("text");
            int image = intent.getExtras().getInt("image");
            textView.setText(text);
            Picasso.get().load("http://gandom.co/devTest/1/images/120939950_cyCdKjEK8QSFkhXf40mhDtfzU5i9_1gSLYgwHqgJ-hs.jpg").placeholder(R.drawable.ic_launcher_background).resize(500,500).into(imageView);
            //imageView.setImageResource(image);
        }
    }
}