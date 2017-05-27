package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuesOne extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_one);

        TextView tv1 = (TextView)findViewById(R.id.textView2);
        Button bt1 = (Button)findViewById(R.id.button1);
        Button bt2 = (Button)findViewById(R.id.button2);
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesOne.this, MainActivity.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent it2 = new Intent(QuesOne.this, QuesTwo.class);
                        startActivity(it2);
                    }
                });
    }
}
