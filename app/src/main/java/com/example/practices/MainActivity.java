package com.example.practices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameET, ageET, phoneET, emailET;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET = findViewById(R.id.studentNameInput);
        ageET = findViewById(R.id.studentAgeInput);
        phoneET = findViewById(R.id.studentPhoneInput);
        emailET = findViewById(R.id.studentEmailInput);

    }

    public void registerStudent(View view) {
        String name = nameET.getText().toString();
        String age = ageET.getText().toString();
        String phone = phoneET.getText().toString();
        String email = emailET.getText().toString();
        validateTheFields(name, age, phone, email);
        Intent intent= new Intent(MainActivity.this, StudentInfoActivity.class);
        intent.putExtra(StudentInfoActivity.TAG_NAME, name);
        intent.putExtra(StudentInfoActivity.TAG_AGE, age);
        intent.putExtra(StudentInfoActivity.TAG_PHONE, phone);
        intent.putExtra(StudentInfoActivity.TAG_EMAIL, email);
        startActivity(intent);


    }

    private void validateTheFields(String name, String age, String phone, String email) {
        if (name.isEmpty()){
            nameET.setError(getString(R.string.empty_fields_error_message));
            return;
        }
        if (age.isEmpty()){
            ageET.setError(getString(R.string.empty_fields_error_message));
            return;
        }
        if (phone.isEmpty()){
            phoneET.setError(getString(R.string.empty_fields_error_message));
            return;
        }
        if (email.isEmpty()){
            emailET.setError(getString(R.string.empty_fields_error_message));
        }
    }
}