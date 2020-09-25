package com.rechit.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mShowCount;
    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=findViewById(R.id.textCount);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount)); // atau mCount+""
        }
        if(mCount == 100){
            Toast.makeText(this, "Good Job you've reach 100 points!", Toast.LENGTH_LONG).show();
        }
    }
}