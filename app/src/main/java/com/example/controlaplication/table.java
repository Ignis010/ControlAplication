package com.example.controlaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class table extends AppCompatActivity {

    ImageView myImage1;
    ImageView myImage2;
    ImageView myImage3;
    ImageView myImage4;
    ImageView myImage5;
    ImageView myImage6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        myImage1 = (ImageView) findViewById(R.id.imageView);
        myImage2 = (ImageView) findViewById(R.id.imageView2);
        myImage3 = (ImageView) findViewById(R.id.imageView3);
        myImage4 = (ImageView) findViewById(R.id.imageView4);
        myImage5 = (ImageView) findViewById(R.id.imageView5);
        myImage6 = (ImageView) findViewById(R.id.imageView6);
    }

    public void Click(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }


    @SuppressLint("NonConstantResourceId")
    public void ClickImage(View view) {
        Intent image1 = new Intent(this, image.class);
        switch (view.getId()) {
            case R.id.imageView:
                image1.putExtra("thisImage",R.drawable.sword);
                break;
            case R.id.imageView2:
                image1.putExtra("thisImage",R.drawable.sword3);
                break;
            case R.id.imageView3:
                image1.putExtra("thisImage",R.drawable.sword2);
                break;
            case R.id.imageView4:
                image1.putExtra("thisImage",R.drawable.sword4);
                break;
            case R.id.imageView5:
                image1.putExtra("thisImage",R.drawable.sword5);
                break;
            case R.id.imageView6:
                image1.putExtra("thisImage",R.drawable.sword6);
                break;
        }
        startActivity(image1);
    }
}