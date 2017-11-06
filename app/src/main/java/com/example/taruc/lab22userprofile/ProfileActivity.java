package com.example.taruc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {
    private EditText editTextID, editTextEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        editTextID = (EditText)findViewById(R.id.editTextID);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        }

        public void saveProfile(View view){
            Intent intent = new Intent();
            intent.putExtra(MainActivity.USER_ID, editTextID.getText().toString());
            intent.putExtra(MainActivity.USER_EMAIL, editTextEmail.getText().toString());
            setResult(MainActivity.REQUEST_PROFILE_UPDATE,intent);
            finish();
        }
}
