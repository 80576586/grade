package com.example.myapplication;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button backButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        TextView TV1=findViewById(R.id.TV1);
        TextView tva3_1=findViewById(R.id.tva3_1);
        TextView tva3_2=findViewById(R.id.tva3_2);
        TextView tva3_3=findViewById(R.id.tva3_3);
        TextView tva3_4=findViewById(R.id.tva3_4);
        TextView TV3_1=findViewById(R.id.TV3_1);
        TextView TV3_2=findViewById(R.id.TV3_2);
        TextView TV3_3=findViewById(R.id.TV3_3);
        TextView TV3_4=findViewById(R.id.TV3_4);
        //ImageView iv1=findViewById(R.id.iv1);
        Bundle bundleL=intent.getExtras();
        Bundle bundleM=intent.getExtras();
        Bundle bundleN=intent.getExtras();
        Bundle bundleO=intent.getExtras();
        Bundle bundleP=intent.getExtras();
        Bundle bundleQ=intent.getExtras();
        Bundle bundleR=intent.getExtras();
        Bundle bundleS=intent.getExtras();
        Bundle bundleT=intent.getExtras();
        Bundle bundleU=intent.getExtras();


        double A1=bundleL.getDouble("GRADE1");
        double B1=bundleM.getDouble("GRADE2");
        double C1=bundleN.getDouble("GRADE3");
        double D1=bundleO.getDouble("GRADE4");
        double E1=bundleP.getDouble("PJF");
        double F1=bundleQ.getDouble("FC");
        String G1=bundleR.getString("SUB1");
        String H1=bundleR.getString("SUB2");
        String I1=bundleR.getString("SUB3");
        String J1=bundleR.getString("SUB4");
        TV3_1.setText(G1);
        TV3_2.setText(H1);
        TV3_3.setText(I1);
        TV3_4.setText(J1);
        ImageView iv1=findViewById(R.id.iv1);





        if (E1>=80&&F1<10){
            TV1.setText("你的总体表现优秀，无偏科现象，继续保持！");
            iv1.setImageResource(R.mipmap.smile);}

        if (E1>=80&&F1>=10){
            TV1.setText("你的总体表现优秀，但存在偏科现象，请注意！");
            iv1.setImageResource(R.mipmap.smile);}
        if (E1>=70&&E1<80&&F1<10){
            TV1.setText("你的总体表现一般，无偏科现象，还需努力！");
            iv1.setImageResource(R.mipmap.no);}
        if (E1>=70&&E1<80&&F1>=10){
            TV1.setText("你的总体成绩表现一般，存在偏科现象，请注意！");
            iv1.setImageResource(R.mipmap.no);}

        if (E1>=60&&E1<70){
            TV1.setText("你的总体成绩有些糟糕，要加倍努力地学习了！");
            iv1.setImageResource(R.mipmap.no);}

        if (E1<60){
            TV1.setText("已经有挂科的科目了，要努力学习，争取下次不挂科！");
            iv1.setImageResource(R.mipmap.cry);}

        if(A1>=80)
            tva3_1.setText("建议：成绩表现优异，请继续努力！");
        if(A1<80&&A1>=70)
            tva3_1.setText("建议：表现一般，需要努力!");
        if(A1<70&&A1>=60)
            tva3_1.setText("建议：你已经处在挂科边缘了！");
        if (A1<60)
            tva3_1.setText("建议：已挂科，要投入更多的时间用于学习！");
        if(B1>=80)
            tva3_2.setText("建议：成绩表现优异，请继续努力！");
        if(B1<80&&B1>=70)
            tva3_2.setText("建议：表现一般，需要努力!");
        if(B1<70&&B1>=60)
            tva3_2.setText("建议：你已经处在挂科边缘了！");
        if (B1<60)
            tva3_2.setText("建议：已挂科，要投入更多的时间用于学习！");
        if(C1>=80)
            tva3_3.setText("建议：成绩表现优异，请继续努力！");
        if(C1<80&&C1>=70)
            tva3_3.setText("建议：表现一般，需要努力!");
        if(C1<70&&C1>=60)
            tva3_3.setText("建议：你已经处在挂科边缘了！");
        if (C1<60)
            tva3_3.setText("建议：已挂科，要投入更多的时间用于学习！");
        if(D1>=80)
            tva3_4.setText("建议：成绩表现优异，请继续努力！");
        if(D1<80&&D1>=70)
            tva3_4.setText("建议：表现一般，需要努力!");
        if(D1<70&&D1>=60)
            tva3_4.setText("建议：你已经处在挂科边缘了！");
        if (D1<60)
            tva3_4.setText("建议：已挂科，要投入更多的时间用于学习！");
        backButton1 = (Button) findViewById(R.id.backButton1);
        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}