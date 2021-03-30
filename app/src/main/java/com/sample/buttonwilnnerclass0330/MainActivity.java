package com.sample.buttonwilnnerclass0330;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1, mButton2;
    TextView mTextView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mTextView1 = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClickListener());
        mButton2.setOnClickListener(new MyOnClickListener());
    }

    public class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1:
                    mTextView1.setText("강혜진의 버튼을 눌렀습니다!");
                    break;
                case R.id.button2:
                    mTextView1.setText("강혜진의 2nd 버튼을 눌렀습니다!");
                    break;
                default:
                    break;
            }
        }
    }
}