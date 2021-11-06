package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.app.Instrumentation;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
    private EditText editText8;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;

   Bundle bundle = new Bundle();



   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);
        editText4=findViewById(R.id.editText4);
       editText5=findViewById(R.id.editText5);
       editText6=findViewById(R.id.editText6);
       editText7=findViewById(R.id.editText7);
       editText8=findViewById(R.id.editText8);
       Button btn1 = (Button) findViewById(R.id.btn1);
       btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String a = String.valueOf(editText1.getText());
                String b = editText2.getText().toString();
                String c = editText3.getText().toString();
                String d = editText4.getText().toString();
                String e = editText5.getText().toString();
                String f = editText6.getText().toString();
                String g = editText7.getText().toString();
                String h = editText8.getText().toString();
                String subject1=et1.getText().toString();
                String subject2=et2.getText().toString().trim();
                String subject3=et3.getText().toString().trim();
                String subject4=et4.getText().toString().trim();

                double a1 = 0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0,h1=0;
                if (a.length()>0)
                    a1=Double.parseDouble(a);
                if (b.length()>0)
                    b1=Double.parseDouble(b);
                if (c.length()>0)
                    c1=Double.parseDouble(c);
                if (d.length()>0)
                    d1=Double.parseDouble(d);
                if (e.length()>0)
                    e1=Double.parseDouble(e);
                if (f.length()>0)
                    f1=Double.parseDouble(f);
                //String g = String.valueOf(editText7.getText());
                if (g.length()>0)
                    g1=Double.parseDouble(g);
                if (h.length()>0)
                    h1=Double.parseDouble(h);
                if (a.length()<1||c.length()<1||e.length()<1||g.length()<1.||b.length()<1||d.length()<1||f.length()<1||h.length()<1||subject1.length()<1||subject2.length()<1||subject3.length()<1||subject4.length()<1){
                    Toast.makeText(MainActivity3.this, "请输入完整", Toast.LENGTH_SHORT).show(); }
                else if (a1>100||c1>100||e1>100||g1>100){

                    Toast.makeText(MainActivity3.this, "请输入正确的成绩", Toast.LENGTH_SHORT).show();}

                else {



                    Bundle bundle1 = new Bundle();
                    Bundle bundle2 = new Bundle();
                    Bundle bundle3 = new Bundle();
                    Bundle bundle4 = new Bundle();
                    Bundle bundle5 = new Bundle();
                    Bundle bundle6 = new Bundle();
                    Bundle bundle7 = new Bundle();
                    Bundle bundle8 = new Bundle();
                    Bundle bundle9 = new Bundle();
                    Bundle bundle10 = new Bundle();
                    Bundle bundle11= new Bundle();
                    Bundle bundle12= new Bundle();


                    bundle1.putDouble("grade1",a1);
                    bundle2.putDouble("credit1",b1);
                    bundle3.putDouble("grade2",c1);
                    bundle4.putDouble("credit2",d1);
                    bundle5.putDouble("grade3",e1);
                    bundle6.putDouble("credit3",f1);
                    bundle7.putDouble("grade4",g1);
                    bundle8.putDouble("credit4",h1);
                    bundle9.putString("subject1",subject1);
                    bundle10.putString("subject2",subject2);
                    bundle11.putString("subject3",subject3);
                    bundle12.putString("subject4",subject4);

                intent.putExtras(bundle1);
                intent.putExtras(bundle2);
                intent.putExtras(bundle3);
                intent.putExtras(bundle4);
                intent.putExtras(bundle5);
                intent.putExtras(bundle6);
                intent.putExtras(bundle7);
                intent.putExtras(bundle8);
                intent.putExtras(bundle9);
                intent.putExtras(bundle10);
                intent.putExtras(bundle11);
                intent.putExtras(bundle12);


                intent.setClass(MainActivity3.this, MainActivity.class);

                startActivity(intent);
                finish();}}


        });

    }



}