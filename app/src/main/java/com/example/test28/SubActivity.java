package com.example.test28;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.time.Instant;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


       Button btn2 = findViewById(R.id.btn2);
       btn2.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               Log.d("로그", "값");
           }
       });

       findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(SubActivity.this, MainActivity.class);
               intent.putExtra("키", "값이 저장됨");
               //SubActivity.this 부터 시작해서 MainActivity.class를 호출함
               startActivity(intent);
           }
       });

    }



    public void Btn1Click(View v){
        Toast toast = Toast.makeText(this, "재밌네 ㅋㅋㅋ", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10, 10);
        toast.show();
    }
}
