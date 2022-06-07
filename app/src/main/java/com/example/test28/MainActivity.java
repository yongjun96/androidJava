package com.example.test28;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //android life cycle <- 구글의 검색 (안드로이드의 진행구조를 볼수 있음)


    //앱이 실행될 때 만들어 놓는 함수
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //super : 부모calss 그 차체를 호출한다는 의미

        //savedInstanceState <- 현재 UI를 일단 저장해 놓음음
       super.onCreate(savedInstanceState);
       //R == res(resource) -> layout -> activity_main.xml (View형식)
        setContentView(R.layout.activity_main);

        //sunActivity에서 받은 intent의 값을 저장할 수 있음
        Intent intent = getIntent();
        //가져운 key값 키의 value인 값을 str에 저장
        String str = intent.getExtras().getString("키");
        Log.d("로그", str);

        ((EditText)findViewById(R.id.edit_text)).setText(str);

        //EditText editText = findViewById(R.id.edit_text);
        //editText.setText(str);
    }


    //앱이 실행된 후, 진행할 작업함수
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}