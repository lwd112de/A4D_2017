package com.lwd112.lwd.a4d_2017;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingsTimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_time);

        setupSettingsTimeOkButton();
        setupSettingsTimeBackButton();

    }


    private void setupSettingsTimeOkButton() {

        Button btn_About2OK = (Button)findViewById(R.id.btn_SettingsTime_2OK);
        btn_About2OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void setupSettingsTimeBackButton() {

        Button btn_About2Back = (Button)findViewById(R.id.btn_SettingsTime_2Back);
        btn_About2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
