package com.example.profile_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView teamicon;
    private EditText  teamname;
    private EditText  teamAdd;
    private Button mapSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamicon = (ImageView)findViewById(R.id.ivcoin);
        teamname = (EditText)findViewById(R.id.etteamN);
        teamAdd  = (EditText)findViewById(R.id.etteamA);
        mapSearch= (Button)findViewById(R.id.btmap);

        mapSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnOpenInGoogleMap(v);
            }
        });
        teamicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v);
            }
        });



    }

    public void OnOpenInGoogleMap(View view){
        Uri gmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamAdd.getText());
        Intent mapIntent= new Intent(Intent.ACTION_VIEW,gmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }


    public void OnSetAvatarButton(View view) {
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivityForResult (intent,0);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if (resultCode == RESULT_CANCELED) return;


        String drawableName = "ic_logo_00";
        switch (data.getIntExtra("imageID",R.id.imageView)) {
            case R.id.imageView:
                drawableName = "ic_logo_00";
                break;
            case R.id.imageView2:
                drawableName = "ic_logo_01";
                break;
            case R.id.imageView3:
                drawableName = "ic_logo_02";
                break;
            case R.id.imageView4:
                drawableName = "ic_logo_03";
                break;
            case R.id.imageView5:
                drawableName = "ic_logo_04";
                break;
            case R.id.imageView6:
                drawableName = "ic_logo_05";
                break;
            default:
                drawableName = "ic_logo_00";
                break;
        }
        int resID = getResources().getIdentifier(drawableName, "drawable", getPackageName());
        teamicon.setImageResource(resID);
    }



}