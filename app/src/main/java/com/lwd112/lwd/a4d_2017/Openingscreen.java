package com.lwd112.lwd.a4d_2017;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Openingscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_openingscreen);

        SetupInfoButton();
        SetupSettingsButton();

    }

    private void SetupSettingsButton() {

        Button btn_Opening2Settings = (Button)findViewById(R.id.btn_Opening2Settings);
        btn_Opening2Settings.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(v.getContext(), SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

    }

    private void SetupInfoButton() {

        Button btn_Opening2Help = (Button)findViewById(R.id.btn_Opening2Help);
        btn_Opening2Help.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(v.getContext(), HelpActivity.class);
                startActivity(settingsIntent);
            }
        });

    }
}
