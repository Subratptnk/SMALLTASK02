package com.example.smalltask02;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view)
    {
        Log.i("INFO", "Image tapped ");

        ImageView imageView = findViewById(R.id.bart1);

        ImageView balaView = findViewById(R.id.bala2);

        imageView.animate().translationYBy(2000).scaleX(0.25f).scaleY(0.25f).rotationBy(270).alpha(0).setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = (ImageView)findViewById(R.id.bart1);
        imageView.setX(-1000);
        imageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }
}
