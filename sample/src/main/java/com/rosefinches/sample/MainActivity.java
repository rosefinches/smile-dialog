package com.rosefinches.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.rosefinches.smiledialog.SmileDialogBuilder;
import com.rosefinches.smiledialog.SmileDialog;
import com.rosefinches.smiledialog.enums.SmileDialogType;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SmileDialog dialog = new SmileDialogBuilder(MainActivity.this).hideIcon(true).build();


                dialog.show();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SmileDialog dialog = new SmileDialogBuilder(MainActivity.this, SmileDialogType.ERROR)
                        .setTitleText(R.string.app_name)
                        .setContentText(null)
                        .setConformBgResColor(R.color.colorPrimary)
                        .setTitleTextResColor(R.color.colorAccent)
                        .setContentTextColor(Color.RED)
                        .setConformTextColor(Color.GREEN)
                        .setCancelTextColor(Color.GREEN)
//                        .setCanceledOnTouchOutside(false)
//                        .setCancelable(false)
//                .hideTitle(true)
                        .setWindowAnimations(R.style.dialog_style)
                        .build();

                dialog.show();
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmileDialog dialog = new SmileDialogBuilder(MainActivity.this, SmileDialogType.SUCCESS).build();
                dialog.show();
            }
        });


    }
}
