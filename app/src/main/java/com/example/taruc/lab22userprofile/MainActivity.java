package com.example.taruc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_PROFILE_UPDATE = 0;
    public static final String USER_ID = "com.example.taruc.lab22userprofile.ID";
    public static final String USER_EMAIL = "com.example.taruc.lab22userprofile.EMAIL";
    private TextView textViewID, textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewID = (TextView)findViewById(R.id.textViewID);
        textViewEmail = (TextView)findViewById(R.id.textViewEmail);
    }

    public void editProfile(View view){
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivityForResult(intent, REQUEST_PROFILE_UPDATE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //request code is the unique code that your activity sent
        //result code is show whether it is successful or not
        //data is data return from intent
        super.onActivityResult(requestCode, resultCode, data);
        //if(requestCode == REQUEST_PROFILE_UPDATE && resultCode == RESULT_OK)
        if(requestCode == REQUEST_PROFILE_UPDATE){
            String id, email;
            id = data.getStringExtra(USER_ID);
            email = data.getStringExtra(USER_EMAIL);
            //display data
            textViewID.append(" "+id);
            textViewEmail.append(" "+email);
        }
    }
}
