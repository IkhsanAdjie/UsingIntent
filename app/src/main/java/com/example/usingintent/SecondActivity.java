package com.example.usingintent;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends MainActivity{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view){
        Intent data = new Intent();
        EditText txt_username = (EditText)findViewById(R.id.txtUsername);
        data.setData(Uri.parse(txt_username.getText().toString()));
        setResult(RESULT_OK,data);
        finish();
    }
}
