package com.example.evaluacion1_pdm_00084417;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10;
    int c1,c2,c3,c4,c5,c6,c7,c8,c9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1= 0;
        c2= 0;
        c3= 0;
        c4= 0;
        c5= 0;
        c6= 0;
        c7= 0;
        c8= 0;
        c9= 0;

        lbl1 = findViewById(R.id.lblPro1);
        lbl2 = findViewById(R.id.lblPro2);
        lbl3 = findViewById(R.id.lblPro3);
        lbl4 = findViewById(R.id.lblPro4);
        lbl5 = findViewById(R.id.lblPro5);
        lbl6 = findViewById(R.id.lblPro6);
        lbl7 = findViewById(R.id.lblPro7);
        lbl8 = findViewById(R.id.lblPro8);
        lbl9 = findViewById(R.id.lblPro9);

        lbl1.setText(lbl1.getText()+"\n"+c1);
        lbl2.setText(lbl2.getText()+"\n"+c2);
        lbl3.setText(lbl3.getText()+"\n"+c3);
        lbl4.setText(lbl4.getText()+"\n"+c4);
        lbl5.setText(lbl5.getText()+"\n"+c5);
        lbl6.setText(lbl6.getText()+"\n"+c6);
        lbl7.setText(lbl7.getText()+"\n"+c7);
        lbl8.setText(lbl8.getText()+"\n"+c8);
        lbl9.setText(lbl9.getText()+"\n"+c9);

        lbl1.setOnClickListener(this);
        lbl2.setOnClickListener(this);
        lbl3.setOnClickListener(this);
        lbl4.setOnClickListener(this);
        lbl5.setOnClickListener(this);
        lbl6.setOnClickListener(this);
        lbl7.setOnClickListener(this);
        lbl8.setOnClickListener(this);
        lbl9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId){
            case R.id.lblPro1:
                c1++;
                lbl1.setText("Producto 1\n"+c1);
            break;
            case R.id.lblPro2:
                c2++;
                lbl2.setText("Producto 2\n"+c2);
            break;
            case R.id.lblPro3:
                c3++;
                lbl3.setText("Producto 3\n"+c3);
            break;
            case R.id.lblPro4:
                c4++;
                lbl4.setText("Producto 4\n"+c4);
            break;
            case R.id.lblPro5:
                c5++;
                lbl5.setText("Producto 5\n"+c5);
            break;
            case R.id.lblPro6:
                c6++;
                lbl6.setText("Producto 6\n"+c6);
            break;
            case R.id.lblPro7:
                c7++;
                lbl7.setText("Producto 7\n"+c7);
            break;
            case R.id.lblPro8:
                c8++;
                lbl8.setText("Producto 8\n"+c8);
            break;
            case R.id.lblPro9:
                c9++;
                lbl9.setText("Producto 9\n"+c9);
            break;
        }
    }
}
