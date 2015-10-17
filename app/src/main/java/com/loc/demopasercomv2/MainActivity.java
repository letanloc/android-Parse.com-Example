package com.loc.demopasercomv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.FindCallback;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername;
    EditText edtPassword;
    Button button;
    Login login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = new Login(this);
        Login();
        /*--- demo login in parse.com*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.UserLogin((edtUsername.getText() + ""), (edtPassword.getText() + ""));

            }
        });
        ParseQuery<ParseObject> query = ParseQuery.getQuery("myapp");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, com.parse.ParseException e) {
                if (e == null) {
//                    objects.get(1).getString("title");
                    Log.e("Infors", "Not eror");

//                    Log.e("DemoData", objects.get(1).getString("name"));

                    for (ParseObject Data : objects) {
                        Log.e("Datalist demo", Data.getString("name"));


                    }

                } else {
                    Log.e("Errorq1", e.toString());
                    Log.e("Infors", "eror");
                }
                Log.e("Infors", "Not  think");
            }
        });

    }


    public void Login() {
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPass);
        button = (Button) findViewById(R.id.button);
    }
}
