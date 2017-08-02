package com.lwd112.lwd.a4d_2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        setupAboutOkButton();
        setupAboutBackButton();

    }


    private void setupAboutOkButton() {

        Button btn_About2OK = (Button)findViewById(R.id.btn_About2OK);
        btn_About2OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void setupAboutBackButton() {

        Button btn_About2Back = (Button)findViewById(R.id.btn_About2Back);
        btn_About2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }


}
