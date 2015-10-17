package com.loc.demopasercomv2;

import android.content.Context;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseRelation;
import com.parse.ParseUser;

import java.text.ParseException;
import java.util.List;

/**
 * Created by loc on 17/10/2015.
 */
public class Login {
    public Login(Context context) {

    }

    /* user login*/
    public void UserLogin(final String UserName, String Pass) {
        // mot data mac dinh cua Parse
        ParseUser.logInInBackground(UserName, Pass, new LogInCallback() {
            @Override
            public void done(ParseUser user, com.parse.ParseException e) {
                // e là gia tri trả về

                if (user != null) {

                    Log.e("Trang thai", "Đăng nhập thành công" + user.getString("username"));
                } else {

                    Log.e("Trang thai", "Đăng nhập không thành công");
                }
            }
        });

//        ParseObject
//        ParseRelation<ParseObject>list ;

//        Parse

        /*-----------------------------------------------------*/
//        ParseQuery query = new ParseQuery("myapp");
//        query.findInBackground(new FindCallback() {
//            @Override
//            public void done(List objects, com.parse.ParseException e) {
//                if (e==null) {
//                    Log.d("Info", "No Errors");
//                }else{
//                    Log.d("Info", "Errors");
//                }
//            }


//            @Override
//            public void done(List<ParseObject> FightersDB/*This is my ArrayList*/, ParseException e) {
//                if (e==null){
//                    Log.d("Info", "No Errors");
//
//                    //This is where I don't know what to do to retrieve my objects.
//                    //Inside each object, I have strings named "Name" "WeightClass" "Record" "Age"
////                    TextView tv;
////                    tv = (TextView) findViewById(R.id.tv);
////                    tv.setText(name + " " + class + " " + record + " " + age);
//
//                }else {
//                    Log.d("Info", "Not Retrieved successfully");
//                }
//            }


//        });
        /*-------------------------------------------------------*/


//        query.getInBackground("xWMyZ4YEGZ", new GetCallback<ParseObject>() {
//            @Override
//            public void done(ParseObject object, com.parse.ParseException e) {
//
//
//            }
//        });
//        Parse
   /*
   * cách truyền dữ liệu vào
   * ParseObject gameScore = new ParseObject("GameScore");
gameScore.put("score", 1337);
gameScore.put("playerName", "Sean Plott");
gameScore.put("cheatMode", false);
gameScore.pinInBackground();
   * */

    }


}
