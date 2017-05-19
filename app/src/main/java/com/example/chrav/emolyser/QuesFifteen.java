package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuesFifteen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_fifteen);

        TextView tv1 = (TextView)findViewById(R.id.textView17);
        Button bt1 = (Button)findViewById(R.id.button35);
        Button bt2 = (Button)findViewById(R.id.button36);
        Button bt3 = (Button)findViewById(R.id.button37);
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesFifteen.this, QuesFourteen.class);
                                       startActivity(it1);
                                   }
                               }
                bt2.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent it2 = new Intent(QuesFifteen.this, Finish.class);
                                               startActivity(it2);
                                           }
                                       }

                        bt3.setOnContextClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            };
    }
}
