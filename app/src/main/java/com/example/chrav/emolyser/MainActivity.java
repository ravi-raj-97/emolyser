package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.textView);
        TextView tv2 = (TextView) findViewById(R.id.textView1);
        Button bt1 = (Button) findViewById(R.id.button);
        bt1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(MainActivity.this, QuesOne.class);
                startActivity(it1);

            }
        });
    }
}
