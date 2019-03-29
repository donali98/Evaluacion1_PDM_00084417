package com.example.evaluacion1_pdm_00084417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class SecondActivity extends AppCompatActivity {

    JSONObject infoReceived;
    TextView lblResultUsr, lblResultCorreo, lblResultTot,lblRes1,lblRes2,lblRes3,lblRes4,lblRes5,lblRes6,lblRes7,lblRes8,lblRes9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lblResultUsr = findViewById(R.id.lblResultUsr);
        lblResultCorreo = findViewById(R.id.lblResultCorreo);
        lblResultTot = findViewById(R.id.lblResultTot);
        lblRes1 = findViewById(R.id.lblRes1);
        lblRes2 = findViewById(R.id.lblRes2);
        lblRes3 = findViewById(R.id.lblRes3);
        lblRes4 = findViewById(R.id.lblRes4);
        lblRes5 = findViewById(R.id.lblRes5);
        lblRes6 = findViewById(R.id.lblRes6);
        lblRes7 = findViewById(R.id.lblRes7);
        lblRes8 = findViewById(R.id.lblRes8);
        lblRes9 = findViewById(R.id.lblRes9);



        Intent i = getIntent();
        if (i!=null){
            String rawJson = i.getExtras().getString("info");
            try {
                infoReceived = new JSONObject(rawJson);
                lblResultUsr.setText("Usuario: " +infoReceived.getString("usuario"));
                lblResultCorreo.setText("Correo: " +infoReceived.getString("correo"));
                lblResultTot.setText("Total de productos: " +infoReceived.getString("sumato"));
                lblRes1.setText("Producto 1\n"+infoReceived.getInt("p1"));
                lblRes2.setText("Producto 2\n"+infoReceived.getInt("p2"));
                lblRes3.setText("Producto 3\n"+infoReceived.getInt("p3"));
                lblRes4.setText("Producto 4\n"+infoReceived.getInt("p4"));
                lblRes5.setText("Producto 5\n"+infoReceived.getInt("p5"));
                lblRes6.setText("Producto 6\n"+infoReceived.getInt("p6"));
                lblRes7.setText("Producto 7\n"+infoReceived.getInt("p7"));
                lblRes8.setText("Producto 8\n"+infoReceived.getInt("p8"));
                lblRes9.setText("Producto 9\n"+infoReceived.getInt("p9"));


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
