package com.rosefinches.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.rosefinches.smiledialog.DialogBuilder;
import com.rosefinches.smiledialog.SmileDialog;
import com.rosefinches.smiledialog.enums.DialogType;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SmileDialog dialog = new DialogBuilder(MainActivity.this).build();


                dialog.show();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SmileDialog dialog = new DialogBuilder(MainActivity.this, DialogType.ERROR)
                        .setTitleText(R.string.app_name)
                        .setTitleText("222")
                        .setContentText(null)
                        .setConformBgResColor(R.color.colorPrimary)
                        .setTitleTextResColor(R.color.colorAccent)
                        .setContentTextColor(Color.RED)
                        .setConformTextColor(Color.GREEN)
                        .setCancelTextColor(Color.GREEN)
//                        .setCanceledOnTouchOutside(false)
//                        .setCancelable(false)
//                .hideTitle(true)
                        .setConformButton("sss")
                        .setWindowAnimations(R.style.dialog_style)
                        .build();

                dialog.show();
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmileDialog dialog = new DialogBuilder(MainActivity.this, DialogType.SUCCESS).build();
                dialog.show();
            }
        });


    }
}
