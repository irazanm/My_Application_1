package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit ;
    EditText Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button)findViewById(R.id.Hbutton);
        Name = (EditText)findViewById(R.id.PersonName);
        //لما اليوزر يضغط على الزر هنا اقول له وش يسوي
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = Name.getText().toString();
                sendDate(str);

            }
        });
    }
    //هنا يعني ارسلت التكست للصفحة الثانية
    private void sendDate(String str) {
        Intent intent = new Intent(this,HActivity.class);
        intent.putExtra("PersonName",str);
        startActivity(intent);
    }
}