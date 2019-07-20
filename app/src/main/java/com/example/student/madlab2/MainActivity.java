package com.example.student.madlab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv2 = findViewById(R.id.textV1);
        tv2.setText(R.string.Msg1);

        Log.i("Lifecycle", "Inside OnCreate Method");

        }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();

        Log.i("Lifecycle", "Inside OnResume Method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle", "Inside OnRestart qqqqq" +
                "qqMethod");
    }
}
