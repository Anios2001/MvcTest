package com.example.mvctestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mvctestapp.Model.Model;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer , View.OnClickListener {
    private Model myModel;
    private Button bt1,bt2,bt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating relationship between Observer activity and Observable Model
        myModel=new Model();
        myModel.addObserver(this);
        bt1=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        bt1.setText("Count :"+myModel.getInteger(0));
        bt2.setText("Count :"+ myModel.getInteger(1));
        bt3.setText("Count :"+myModel.getInteger(2));
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1:
                myModel.updateIntegerArrayList(0);
                break;
            case R.id.button2:
                myModel.updateIntegerArrayList(1);
                break;
            case R.id.button3:
                myModel.updateIntegerArrayList(2);
                break;
        }
    }
}