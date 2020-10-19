package com.example.profile_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView icon0;
    private ImageView icon1;
    private ImageView icon2;
    private ImageView icon3;
    private ImageView icon4;
    private ImageView icon5;
    private Button    load;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        icon0 = (ImageView)findViewById(R.id.imageView);
        icon1 = (ImageView)findViewById(R.id.imageView2);
        icon2 = (ImageView)findViewById(R.id.imageView3);
        icon3 = (ImageView)findViewById(R.id.imageView4);
        icon4 = (ImageView)findViewById(R.id.imageView5);
        icon5 = (ImageView)findViewById(R.id.imageView6);

        icon0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v,icon0);
            }
        });

        icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v,icon1);
            }
        });

        icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v,icon2);
            }
        });

        icon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v,icon3);
            }
        });

        icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v,icon4);
            }
        });

        icon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v,icon5);
            }
        });
    }

    public void SetTeamIcon(View view, ImageView selectedImage) {

        Intent returnIntent = new Intent();
        returnIntent.putExtra("imageID", selectedImage.getId());
        setResult(RESULT_OK, returnIntent);
        finish();
    }
}