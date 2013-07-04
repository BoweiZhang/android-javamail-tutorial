package com.tiemenschut.tutorials.javamail;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText emailEdit;
    private EditText subjectEdit;
    private EditText messageEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEdit = (EditText) findViewById(R.id.email);
        subjectEdit = (EditText) findViewById(R.id.subject);
        messageEdit = (EditText) findViewById(R.id.message);
        Button sendButton = (Button) findViewById(R.id.send);
        
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEdit.getText().toString();
                String subject = subjectEdit.getText().toString();
                String message = messageEdit.getText().toString();
                sendMail(email, subject, message);
            }
        });
    }

    private void sendMail(String email, String subject, String message) {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
