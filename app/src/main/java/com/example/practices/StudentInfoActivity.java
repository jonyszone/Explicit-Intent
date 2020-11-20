package com.example.practices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class StudentInfoActivity extends AppCompatActivity {
    public static final String TAG_NAME = "name";
    public static final String TAG_AGE= "age";
    public static final String TAG_PHONE = "phone";
    public static final String TAG_EMAIL = "email";

    private TextView studentNameTV, StudentAgeTV, StudentPhoneTV, StudentEmailTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        studentNameTV = findViewById(R.id.row_student_name);
        StudentAgeTV = findViewById(R.id.row_student_age);
        StudentPhoneTV = findViewById(R.id.row_student_phone);
        StudentEmailTV = findViewById(R.id.row_student_email);

        Toast.makeText(StudentInfoActivity.this,"Students Information",Toast.LENGTH_SHORT).show();
        Intent receiveIntent = getIntent();
        String name = receiveIntent.getStringExtra(TAG_NAME);
        String age = receiveIntent.getStringExtra(TAG_AGE);
        String phone = receiveIntent.getStringExtra(TAG_PHONE);
        String email = receiveIntent.getStringExtra(TAG_EMAIL);

        Log.e("StudentAge: ", age);

        studentNameTV.setText(name);
        StudentAgeTV.setText(age);
        StudentPhoneTV.setText(phone);
        StudentEmailTV.setText(email);
    }
}