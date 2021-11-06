package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.security.cert.CRLException;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    Button button;
    Button backButton;
    TextView textView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();

        TextView textView1 =findViewById(R.id.tv1_1);
        TextView textView2 =findViewById(R.id.tv1_2);
        TextView textView3 =findViewById(R.id.tv2_1);
        TextView textView4 =findViewById(R.id.tv2_2);
        TextView textView5 =findViewById(R.id.tv3_1);
        TextView textView6 =findViewById(R.id.tv3_2);
        TextView textView7 =findViewById(R.id.tv4_1);
        TextView textView8 =findViewById(R.id.tv4_2);
        TextView textView9 =findViewById(R.id.tv2_1_2);
        TextView textViewtvg1=findViewById(R.id.tvg1);
        TextView textViewtvg2=findViewById(R.id.tvg2);
        TextView textViewtvg3=findViewById(R.id.tvg3);
        TextView textViewtvg4=findViewById(R.id.tvg4);
        TextView textViewtv2_0=findViewById(R.id.tv2_0);
        TextView textView3_0_2=findViewById(R.id.tv3_0_2);
        TextView textView2_1_1=findViewById(R.id.tv2_1_1);
        TextView textView3_0_1=findViewById(R.id.tv3_0_1);
        Bundle bundle1=intent.getExtras();
        Bundle bundle2=intent.getExtras();
        Bundle bundle3=intent.getExtras();
        Bundle bundle4=intent.getExtras();
        Bundle bundle5=intent.getExtras();
        Bundle bundle6=intent.getExtras();
        Bundle bundle7=intent.getExtras();
        Bundle bundle8=intent.getExtras();
        Bundle bundle9=intent.getExtras();

        double a1=bundle1.getDouble("grade1");
        double b1=bundle2.getDouble("credit1");
        double c1=bundle3.getDouble("grade2");
        double d1=bundle4.getDouble("credit2");
        double e1=bundle5.getDouble("grade3");
        double f1=bundle6.getDouble("credit3");
        double g1=bundle7.getDouble("grade4");
        double h1=bundle8.getDouble("credit4");


        double i=b1+d1+f1+h1;
        double j=a1+c1+e1+g1;
        double a2=0,c2=0,e2=0,g2=0;
        double pjf=(a1*b1+c1*d1+e1*f1+g1*h1)/i;
        DecimalFormat pjf2=new DecimalFormat("0.00");
        if(pjf>=90)
            textView3_0_2.setText("优秀");
        if (pjf>=85&&pjf<90)
            textView3_0_2.setText("良好");
        if(pjf>=75&&pjf<85)
            textView3_0_2.setText("一般");
        if (pjf>=60&&pjf<75)
            textView3_0_2.setText("较差");
        if(pjf<60)
            textView3_0_2.setText("不合格");


        if (a1>=90){
            textViewtvg1.setText("A");
            textView2.setText("4.0");
            a2=4.0;
        }
        if (a1>=86&&a1<90){
            textViewtvg1.setText("A-");
            textView2.setText("3.7");
            a2=3.7;
        }
        if (a1>=83&&a1<86){
            textViewtvg1.setText("B+");
            textView2.setText("3.3");
            a2=3.3;
        }
        if (a1>=80&&a1<83){
            textViewtvg1.setText("B");
            textView2.setText("3.0");
            a2=3.0;
        }
        if (a1>=76&&a1<80) {
            textView2.setText("2.7");
            textViewtvg1.setText("B-");
            a2=2.7;
        }
        if (a1>=73&&a1<76){
            textViewtvg1.setText("C+");
            textView2.setText("2.3");
            a2=2.3;
        }
        if (a1>=70&&a1<73){
            textViewtvg1.setText("C");
            textView2.setText("2.0");
            a2=2.0;
        }
        if (a1>=66&&a1<70){
            textViewtvg1.setText("C-");
            textView2.setText("1.7");
            a2=1.7;
        }
        if (a1>=63&&a1<66){
            textViewtvg1.setText("D+");
            textView2.setText("1.3");
            a2=1.3;
        }
        if (a1>=60&&a1<63){
            textViewtvg1.setText("D");
            textView2.setText("1.0");
            a2=1.0;
        }
        if (a1<60){
            textViewtvg1.setText("F");
            textView2.setText("0");
            a2=0;
        }
        if (c1>=90){
            textViewtvg2.setText("A");
            textView4.setText("4.0");
            c2=4.0;
        }
        if (c1>=86&&c1<90){
            textViewtvg2.setText("A-");
            textView4.setText("3.7");
            c2=3.7;
        }
        if (c1>=83&&c1<86){
            textViewtvg2.setText("B+");
            textView4.setText("3.3");
            c2=3.3;
        }
        if (c1>=80&&c1<83){
            textViewtvg2.setText("B");
            textView4.setText("3.0");
            c2=3.0;
        }
        if (c1>=76&&c1<80) {
            textView4.setText("2.7");
            textViewtvg2.setText("B-");
            c2=2.7;
        }
        if (c1>=73&&c1<76){
            textViewtvg2.setText("C+");
            textView4.setText("2.3");
            c2=2.3;
        }
        if (c1>=70&&c1<73){
            textViewtvg2.setText("C");
            textView4.setText("2.0");
            c2=2.0;
        }
        if (c1>=66&&c1<70){
            textViewtvg2.setText("C-");
            textView4.setText("1.7");
            c2=1.7;
        }
        if (c1>=63&&c1<66){
            textViewtvg2.setText("D+");
            textView4.setText("1.3");
            c2=1.3;
        }
        if (c1>=60&&c1<63){
            textViewtvg2.setText("D");
            textView4.setText("1.0");
            c2=1.0;
        }
        if (c1<60){
            textViewtvg2.setText("F");
            textView4.setText("0");
            c2=0;
        }

        if (e1>=90){
            textViewtvg3.setText("A");
            textView6.setText("4.0");
            e2=4.0;
        }
        if (e1>=86&&e1<90){
            textViewtvg3.setText("A-");
            textView6.setText("3.7");
            e2=3.7;
        }
        if (e1>=83&&e1<86){
            textViewtvg3.setText("B+");
            textView6.setText("3.3");
            e2=3.3;
        }
        if (e1>=80&&e1<83){
            textViewtvg3.setText("B");
            textView6.setText("3.0");
            e2=3.0;
        }
        if (e1>=76&&e1<80) {
            textView6.setText("2.7");
            textViewtvg3.setText("B-");
            e2=2.7;
        }
        if (e1>=73&&e1<76){
            textViewtvg3.setText("C+");
            textView6.setText("2.3");
            e2=2.3;
        }
        if (e1>=70&&e1<73){
            textViewtvg3.setText("C");
            textView6.setText("2.0");
            e2=2.0;
        }
        if (e1>=66&&e1<70){
            textViewtvg3.setText("C-");
            textView6.setText("1.7");
            e2=1.7;
        }
        if (e1>=63&&e1<66){
            textViewtvg3.setText("D+");
            textView6.setText("1.3");
            e2=1.3;
        }
        if (e1>=60&&e1<63){
            textViewtvg3.setText("D");
            textView6.setText("1.0");
            e2=1.0;
        }
        if (e1<60){
            textViewtvg3.setText("F");
            textView6.setText("0");
            e2=0;
        }

        if (g1>=90){
            textViewtvg4.setText("A");
            textView8.setText("4.0");
            g2=4.0;
        }
        if (g1>=86&&g1<90){
            textViewtvg4.setText("A-");
            textView8.setText("3.7");
            g2=3.7;
        }
        if (g1>=83&&g1<86){
            textViewtvg4.setText("B+");
            textView8.setText("3.3");
            g2=3.3;
        }
        if (g1>=80&&g1<83){
            textViewtvg4.setText("B");
            textView8.setText("3.0");
            g2=3.0;
        }
        if (g1>=76&&g1<80) {
            textView8.setText("2.7");
            textViewtvg4.setText("B-");
            g2=2.7;
        }
        if (g1>=73&&g1<76){
            textViewtvg4.setText("C+");
            textView8.setText("2.3");
            g2=2.3;
        }
        if (g1>=70&&g1<73){
            textViewtvg4.setText("C");
            textView8.setText("2.0");
            g2=2.0;
        }
        if (g1>=66&&g1<70){
            textViewtvg4.setText("C-");
            textView8.setText("1.7");
            g2=1.7;
        }
        if (g1>=63&&g1<66){
            textViewtvg4.setText("D+");
            textView8.setText("1.3");
            g2=1.3;
        }
        if (g1>=60&&g1<63){
            textViewtvg4.setText("D");
            textView8.setText("1.0");
            g2=1.0;
        }
        if (g1<60){
            textViewtvg4.setText("F");
            textView8.setText("0");
            g2=0;
        }
        double zjd=(a2*b1+c2*d1+e2*f1+g2*h1)/i;
        double pjf1=(a1+c1+e1+g1)/4;
        DecimalFormat zjd1=new DecimalFormat("0.00");
        double zfc=(a1-pjf1)*(a1-pjf1)+(c1-pjf1)*(c1-pjf1)+(e1-pjf1)*(e1-pjf1)+(g1-pjf1)*(g1-pjf1);
        double fc=zfc/4;
        if(fc<1&&fc>=0)
            textView3_0_1.setText("优秀");
        if (fc>=1&&fc<4)
            textView3_0_1.setText("良好");
        if (fc>=4&&fc<10)
            textView3_0_1.setText("较差");
        if (fc>=10)
            textView3_0_1.setText("差");

        textView1.setText(String.valueOf(a1));
        textView3.setText(String.valueOf(c1));
        textView5.setText(String.valueOf(e1));
        textView7.setText(String.valueOf(g1));
        textView9.setText(String.valueOf(i));
        textViewtv2_0.setText(String.valueOf(pjf2.format(pjf)));
        textView2_1_1.setText(String.valueOf( zjd1.format(zjd)));
        String A=String.valueOf(textView1.getText());
        String B=String.valueOf(textView3.getText());
        String C=String.valueOf(textView5.getText());
        String D=String.valueOf(textView7.getText());

        double A1=Double.valueOf(A);
        double B1=Double.valueOf(B);
        double C1=Double.valueOf(C);
        double D1=Double.valueOf(D);
        double E1=Double.valueOf(pjf);
        double F1=Double.valueOf(fc);


        Bundle bundleL=new Bundle();
        Bundle bundleM=new Bundle();
        Bundle bundleN=new Bundle();
        Bundle bundleO=new Bundle();
        Bundle bundleP=new Bundle();
        Bundle bundleQ=new Bundle();

        bundleL.putDouble("GRADE1",A1);
        bundleM.putDouble("GRADE2",B1);
        bundleN.putDouble("GRADE3",C1);
        bundleO.putDouble("GRADE4",D1);
        bundleP.putDouble("PJF",E1);
        bundleQ.putDouble("FC",F1);

        intent.putExtras(bundleL);
        intent.putExtras(bundleM);
        intent.putExtras(bundleN);
        intent.putExtras(bundleO);
        intent.putExtras(bundleP);
        intent.putExtras(bundleQ);




        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Intent intent = new Intent();
                    intent.setClass(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            });
        backButton = (Button)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(MainActivity.this,MainActivity3.class);


                startActivity(intent);
                //finish();
            }
        });







    }
}