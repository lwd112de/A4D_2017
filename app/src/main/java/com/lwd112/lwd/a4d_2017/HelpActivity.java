package com.lwd112.lwd.a4d_2017;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        setupHelpAboutButton();
        setupHelpBackButton();

    }

    private void setupHelpAboutButton() {

        Button btn_Help2About = (Button)findViewById(R.id.btn_Help2About);
        btn_Help2About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent = new Intent(v.getContext(),AboutActivity.class);
                startActivity(aboutIntent);
            }
        });

    }

    private void setupHelpBackButton() {

        Button btn_Help2Back = (Button)findViewById(R.id.btn_Help2Back);
        btn_Help2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }




}

