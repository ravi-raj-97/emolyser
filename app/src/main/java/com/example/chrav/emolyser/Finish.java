package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Button bt1 = (Button) findViewById(R.id.button33);
        TextView tv1=(TextView)findViewById(R.id.textView18);
        TextView tv2=(TextView)findViewById(R.id.textView19);
        TextView tv3=(TextView)findViewById(R.id.textView20);
        TextView tv4=(TextView)findViewById(R.id.textView21);
        TextView tv5=(TextView)findViewById(R.id.textView22);

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

        int t1=0,t2=0,t3=0,t4=0,t5=0;
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        t3=t3+a[1];c3++;
        t1=t1+a[2]+a[3];c1=c1+2;
        t4=t4+a[4]+a[5];c4=c4+2;

        for(int i=6;i<=15;i++)
        {
            switch(a[i])
            {
                case 1:t1=t1+10;
                    c1++;
                    break;
                case 2:t1=t1+1;
                    c1++;
                    break;
                case 3:t2=t2+10;
                    c2++;
                    break;
                case 4:t2=t2+1;
                    c2++;
                    break;
                case 5:t3=t3+10;
                    c3++;
                    break;
                case 6:t3=t3+1;
                    c3++;
                    break;
                case 7:t4=t4+10;
                    c4++;
                    break;
                case 8:t4=t4+1;
                    c4++;
                    break;
                case 9:t5=t5+10;
                    c5++;
                    break;
                case 10:t5=t5+1;
                    c5++;
                    break;
            }
        }

        float r[]=new float[6];
        r[0]=-1;
        r[1]=t1/(c1*10);
        r[2]=t2/(c2*10);
        r[3]=t3/(c3*10);
        r[4]=t4/(c4*10);
        r[5]=t5/(c5*10);

        if(r[1]<=0.3)
            tv1.setText("Highly Emotional");
        else if(r[1]>0.3&&r[1]<=0.5)
            tv1.setText("Fairly Emotional");
        else if(r[1]>0.5&&r[1]<=0.7)
            tv1.setText("Fairly Practical");
        else
            tv1.setText("Highly Practical");

        if(r[2]<=0.3)
            tv2.setText("Highly Extrovert");
        else if(r[2]>0.3&&r[2]<=0.5)
            tv2.setText("Fairly Extrovert");
        else if(r[2]>0.5&&r[2]<=0.7)
            tv2.setText("Fairly Introvert");
        else
            tv2.setText("Highly Introvert");

        if(r[3]<=0.3)
            tv3.setText("Highly Submissive");
        else if(r[3]>0.3&&r[3]<=0.5)
            tv3.setText("Fairly Submissive");
        else if(r[3]>0.5&&r[3]<=0.7)
            tv3.setText("Fairly Dominant");
        else
            tv3.setText("Highly Dominant");

        if(r[4]<=0.3)
            tv4.setText("Highly Intuitive");
        else if(r[4]>0.3&&r[4]<=0.5)
            tv4.setText("Fairly Intuitive");
        else if(r[4]>0.5&&r[4]<=0.7)
            tv4.setText("Fairly Reasoning");
        else
            tv4.setText("Highly Reasoning");

        if(r[5]<=0.3)
            tv5.setText("Highly Fickle");
        else if(r[5]>0.3&&r[5]<=0.5)
            tv5.setText("Fairly Fickle");
        else if(r[5]>0.5&&r[5]<=0.7)
            tv5.setText("Fairly Stable");
        else
            tv5.setText("Highly Stable");

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
