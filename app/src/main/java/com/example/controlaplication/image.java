package com.example.controlaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

public class image extends AppCompatActivity {

    ImageView imageThis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Bundle arguments = getIntent().getExtras();
        int name = arguments.getInt("thisImage");

        imageThis = (ImageView) findViewById(R.id.imageView8);

        imageThis.setImageResource(name);
    }

    public void Click(View view) {
        Intent table = new Intent(this, table.class);
        startActivity(table);
    }
}