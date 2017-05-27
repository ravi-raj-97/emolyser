package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Button bt1 = (Button) findViewById(R.id.button33);

        QuesOne q1=new QuesOne();
        QuesTwo q2=new QuesTwo();
        QuesThree q3=new QuesThree();
        QuesFour q4=new QuesFour();
        QuesFive q5=new QuesFive();
        QuesSix q6=new QuesSix();
        QuesSeven q7=new QuesSeven();
        QuesEight q8=new QuesEight();
        QuesNIne q9=new QuesNIne();
        QuesTen q10=new QuesTen();
        QuesEleven q11=new QuesEleven();
        QuesTwelve q12=new QuesTwelve();
        QuesThirteen q13=new QuesThirteen();
        QuesFourteen q14=new QuesFourteen();
        QuesFifteen q15=new QuesFifteen();

        int a[]=new int[16];
        a[0]=-1;
        a[1]=q1.val;
        a[2]=q2.val;
        a[3]=q3.val;
        a[4]=q4.val;
        a[5]=q5.val;
        a[6]=q6.val;
        a[7]=q7.val;
        a[8]=q8.val;
        a[9]=q9.val;
        a[10]=q10.val;
        a[11]=q11.val;
        a[12]=q12.val;
        a[13]=q13.val;
        a[14]=q14.val;
        a[15]=q15.val;


        bt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent it1=new Intent(Finish.this,MainActivity.class);
                startActivity(it1);
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });
    }
}
