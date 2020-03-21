package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Health Profile
        button1 = (Button) findViewById(R.id.buttonHealthProfile);
       button1.setOnClickListener(this);

        //Check List
        button4 = (Button) findViewById(R.id.buttonCheckList);
        button4.setOnClickListener(this);


    }

    //Add listener with button using onClick method
    public void onClick(View V) {

       if (V.getId() == R.id.buttonHealthProfile) {

            Intent intent = new Intent(MainActivity.this, HealthProfile.class);
           startActivity(intent);
       }

       else if (V.getId() == R.id.buttonCheckList) {
           Intent intent = new Intent(MainActivity.this, CheckList.class);
           startActivity(intent);
       }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
