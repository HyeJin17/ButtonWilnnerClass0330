package com.sample.buttonwilnnerclass0330;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener{
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) { this.mainActivity = mainActivity; }

    @Override
    public void onClick(View v) {mainActivity.mTextView1.setText("강혜진의 버튼을 눌렀습니다!");
    }
}
