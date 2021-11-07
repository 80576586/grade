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

import javax.security.auth.Subject;


public class MainActivity extends AppCompatActivity {
    Button button;
    Button backButton;


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
        TextView textViewTvg1=findViewById(R.id.tvg1);
        TextView textViewTvg2=findViewById(R.id.tvg2);
        TextView textViewTvg3=findViewById(R.id.tvg3);
        TextView textViewTvg4=findViewById(R.id.tvg4);
        TextView textViewTv2_0=findViewById(R.id.tv2_0);
        TextView textView3_0_2=findViewById(R.id.tv3_0_2);
        TextView textView2_1_1=findViewById(R.id.tv2_1_1);
        TextView textView3_0_1=findViewById(R.id.tv3_0_1);
        TextView textViewTVG1=findViewById(R.id.TVG1);
        TextView textViewTVG2=findViewById(R.id.TVG2);
        TextView textViewTVG3=findViewById(R.id.TVG3);
        TextView textViewTVG4=findViewById(R.id.TVG4);

        Bundle bundle1=intent.getExtras();
        Bundle bundle2=intent.getExtras();
        Bundle bundle3=intent.getExtras();
        Bundle bundle4=intent.getExtras();
        Bundle bundle5=intent.getExtras();
        Bundle bundle6=intent.getExtras();
        Bundle bundle7=intent.getExtras();
        Bundle bundle8=intent.getExtras();
        Bundle bundle9=intent.getExtras();
        //Bundle bundle10=intent.getExtras();

        double a1=bundle1.getDouble("grade1");
        double b1=bundle2.getDouble("credit1");
        double c1=bundle3.getDouble("grade2");
        double d1=bundle4.getDouble("credit2");
        double e1=bundle5.getDouble("grade3");
        double f1=bundle6.getDouble("credit3");
        double g1=bundle7.getDouble("grade4");
        double h1=bundle8.getDouble("credit4");
        String TVG1= bundle9.getString("subject1");
        String TVG2= bundle9.getString("subject2");
        String TVG3= bundle9.getString("subject3");
        String TVG4= bundle9.getString("subject4");
        textViewTVG1.setText(TVG1);
        textViewTVG2.setText(TVG2);
        textViewTVG3.setText(TVG3);
        textViewTVG4.setText(TVG4);



        double i=b1+d1+f1+h1;
        //double j=a1+c1+e1+g1;
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
            textViewTvg1.setText("A");
            textView2.setText("4.0");
            a2=4.0;
        }
        if (a1>=86&&a1<90){
            textViewTvg1.setText("A-");
            textView2.setText("3.7");
            a2=3.7;
        }
        if (a1>=83&&a1<86){
            textViewTvg1.setText("B+");
            textView2.setText("3.3");
            a2=3.3;
        }
        if (a1>=80&&a1<83){
            textViewTvg1.setText("B");
            textView2.setText("3.0");
            a2=3.0;
        }
        if (a1>=76&&a1<80) {
            textView2.setText("2.7");
            textViewTvg1.setText("B-");
            a2=2.7;
        }
        if (a1>=73&&a1<76){
            textViewTvg1.setText("C+");
            textView2.setText("2.3");
            a2=2.3;
        }
        if (a1>=70&&a1<73){
            textViewTvg1.setText("C");
            textView2.setText("2.0");
            a2=2.0;
        }
        if (a1>=66&&a1<70){
            textViewTvg1.setText("C-");
            textView2.setText("1.7");
            a2=1.7;
        }
        if (a1>=63&&a1<66){
            textViewTvg1.setText("D+");
            textView2.setText("1.3");
            a2=1.3;
        }
        if (a1>=60&&a1<63){
            textViewTvg1.setText("D");
            textView2.setText("1.0");
            a2=1.0;
        }
        if (a1<60){
            textViewTvg1.setText("F");
            textView2.setText("0");
            a2=0;
        }
        if (c1>=90){
            textViewTvg2.setText("A");
            textView4.setText("4.0");
            c2=4.0;
        }
        if (c1>=86&&c1<90){
            textViewTvg2.setText("A-");
            textView4.setText("3.7");
            c2=3.7;
        }
        if (c1>=83&&c1<86){
            textViewTvg2.setText("B+");
            textView4.setText("3.3");
            c2=3.3;
        }
        if (c1>=80&&c1<83){
            textViewTvg2.setText("B");
            textView4.setText("3.0");
            c2=3.0;
        }
        if (c1>=76&&c1<80) {
            textView4.setText("2.7");
            textViewTvg2.setText("B-");
            c2=2.7;
        }
        if (c1>=73&&c1<76){
            textViewTvg2.setText("C+");
            textView4.setText("2.3");
            c2=2.3;
        }
        if (c1>=70&&c1<73){
            textViewTvg2.setText("C");
            textView4.setText("2.0");
            c2=2.0;
        }
        if (c1>=66&&c1<70){
            textViewTvg2.setText("C-");
            textView4.setText("1.7");
            c2=1.7;
        }
        if (c1>=63&&c1<66){
            textViewTvg2.setText("D+");
            textView4.setText("1.3");
            c2=1.3;
        }
        if (c1>=60&&c1<63){
            textViewTvg2.setText("D");
            textView4.setText("1.0");
            c2=1.0;
        }
        if (c1<60){
            textViewTvg2.setText("F");
            textView4.setText("0");
            c2=0;
        }

        if (e1>=90){
            textViewTvg3.setText("A");
            textView6.setText("4.0");
            e2=4.0;
        }
        if (e1>=86&&e1<90){
            textViewTvg3.setText("A-");
            textView6.setText("3.7");
            e2=3.7;
        }
        if (e1>=83&&e1<86){
            textViewTvg3.setText("B+");
            textView6.setText("3.3");
            e2=3.3;
        }
        if (e1>=80&&e1<83){
            textViewTvg3.setText("B");
            textView6.setText("3.0");
            e2=3.0;
        }
        if (e1>=76&&e1<80) {
            textView6.setText("2.7");
            textViewTvg3.setText("B-");
            e2=2.7;
        }
        if (e1>=73&&e1<76){
            textViewTvg3.setText("C+");
            textView6.setText("2.3");
            e2=2.3;
        }
        if (e1>=70&&e1<73){
            textViewTvg3.setText("C");
            textView6.setText("2.0");
            e2=2.0;
        }
        if (e1>=66&&e1<70){
            textViewTvg3.setText("C-");
            textView6.setText("1.7");
            e2=1.7;
        }
        if (e1>=63&&e1<66){
            textViewTvg3.setText("D+");
            textView6.setText("1.3");
            e2=1.3;
        }
        if (e1>=60&&e1<63){
            textViewTvg3.setText("D");
            textView6.setText("1.0");
            e2=1.0;
        }
        if (e1<60){
            textViewTvg3.setText("F");
            textView6.setText("0");
            e2=0;
        }

        if (g1>=90){
            textViewTvg4.setText("A");
            textView8.setText("4.0");
            g2=4.0;
        }
        if (g1>=86&&g1<90){
            textViewTvg4.setText("A-");
            textView8.setText("3.7");
            g2=3.7;
        }
        if (g1>=83&&g1<86){
            textViewTvg4.setText("B+");
            textView8.setText("3.3");
            g2=3.3;
        }
        if (g1>=80&&g1<83){
            textViewTvg4.setText("B");
            textView8.setText("3.0");
            g2=3.0;
        }
        if (g1>=76&&g1<80) {
            textView8.setText("2.7");
            textViewTvg4.setText("B-");
            g2=2.7;
        }
        if (g1>=73&&g1<76){
            textViewTvg4.setText("C+");
            textView8.setText("2.3");
            g2=2.3;
        }
        if (g1>=70&&g1<73){
            textViewTvg4.setText("C");
            textView8.setText("2.0");
            g2=2.0;
        }
        if (g1>=66&&g1<70){
            textViewTvg4.setText("C-");
            textView8.setText("1.7");
            g2=1.7;
        }
        if (g1>=63&&g1<66){
            textViewTvg4.setText("D+");
            textView8.setText("1.3");
            g2=1.3;
        }
        if (g1>=60&&g1<63){
            textViewTvg4.setText("D");
            textView8.setText("1.0");
            g2=1.0;
        }
        if (g1<60){
            textViewTvg4.setText("F");
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
        textViewTv2_0.setText(pjf2.format(pjf));
        textView2_1_1.setText( zjd1.format(zjd));

        String A=String.valueOf(textView1.getText());
        String B=String.valueOf(textView3.getText());
        String C=String.valueOf(textView5.getText());
        String D=String.valueOf(textView7.getText());
        String E=String.valueOf(textViewTVG1.getText());
        String F=String.valueOf(textViewTVG2.getText());
        String G=String.valueOf(textViewTVG3.getText());
        String H=String.valueOf(textViewTVG4.getText());


        double A1=Double.parseDouble(A);
        double B1=Double.parseDouble(B);
        double C1=Double.parseDouble(C);
        double D1=Double.parseDouble(D);


        Bundle bundleL=new Bundle();
        Bundle bundleM=new Bundle();
        Bundle bundleN=new Bundle();
        Bundle bundleO=new Bundle();
        Bundle bundleP=new Bundle();
        Bundle bundleQ=new Bundle();
        Bundle bundleR=new Bundle();
        Bundle bundleS=new Bundle();
        Bundle bundleT=new Bundle();
        Bundle bundleU=new Bundle();

        bundleL.putDouble("GRADE1",A1);
        bundleM.putDouble("GRADE2",B1);
        bundleN.putDouble("GRADE3",C1);
        bundleO.putDouble("GRADE4",D1);
        bundleP.putDouble("PJF",pjf);
        bundleQ.putDouble("FC",fc);
        bundleR.putString("SUB1",E);
        bundleS.putString("SUB2",F);
        bundleT.putString("SUB3",G);
        bundleU.putString("SUB4",H);

        intent.putExtras(bundleL);
        intent.putExtras(bundleM);
        intent.putExtras(bundleN);
        intent.putExtras(bundleO);
        intent.putExtras(bundleP);
        intent.putExtras(bundleQ);
        intent.putExtras(bundleR);
        intent.putExtras(bundleS);
        intent.putExtras(bundleT);
        intent.putExtras(bundleU);




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
                finish();
            }
        });







    }
}