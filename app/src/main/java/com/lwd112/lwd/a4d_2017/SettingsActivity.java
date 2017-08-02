package com.lwd112.lwd.a4d_2017;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SettingsActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    Button settings_switch_01;
    Button settings_switch_02;
    Button settings_switch_03;
    Button settings_switch_04;

    TextView settings_alarm_text1;
    TextView settings_alarm_text2;
    TextView settings_alarm_text3;
    TextView settings_alarm_text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settings_alarm_text1 = (TextView)findViewById(R.id.settings_alarm_text1);
        settings_alarm_text2 = (TextView)findViewById(R.id.settings_alarm_text2);
        settings_alarm_text3 = (TextView)findViewById(R.id.settings_alarm_text3);
        settings_alarm_text4 = (TextView)findViewById(R.id.settings_alarm_text4);

        setupBackButton();
        setupOkButton();
        setupSettingsButton();

    }


    private void setupOkButton() {

        Button btn_Settings2OK = (Button)findViewById(R.id.btn_Settings2OK);
        btn_Settings2OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void setupBackButton() {

        Button btn_Settings2Back = (Button)findViewById(R.id.btn_Settings2Back);
        btn_Settings2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

    private void setupSettingsButton()
    {

        ImageView btn_alarmSet1 = (ImageView)findViewById(R.id.settings_button_1);
        ImageView btn_alarmSet2 = (ImageView)findViewById(R.id.settings_button_2);
        ImageView btn_alarmSet3 = (ImageView)findViewById(R.id.settings_button_3);
        ImageView btn_alarmSet4 = (ImageView)findViewById(R.id.settings_button_4);

        btn_alarmSet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsTimeIntent1 = new Intent(v.getContext(), SettingsTimeActivity.class);
                startActivity(settingsTimeIntent1);
            }
        });

        btn_alarmSet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsTimeIntent2 = new Intent(v.getContext(), SettingsTimeActivity.class);
                startActivity(settingsTimeIntent2);
            }
        });

        btn_alarmSet3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsTimeIntent3 = new Intent(v.getContext(), SettingsTimeActivity.class);
                startActivity(settingsTimeIntent3);
            }
        });

        btn_alarmSet4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsTimeIntent4 = new Intent(v.getContext(), SettingsTimeActivity.class);
                startActivity(settingsTimeIntent4);
            }
        });

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked)
        {
            //Toast.makeText(this,"Toggle Button ON",Toast.LENGTH_SHORT).show();
        }   else {
            //
        }

    }
}
