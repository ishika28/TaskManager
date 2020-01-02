package com.example.taskmanager.strictmode;

public class strictModeClass {

    public static void strictModeClass(){
        android.os.StrictMode.ThreadPolicy policy=
                new android.os.StrictMode.ThreadPolicy.Builder()
                .permitAll().build();

        android.os.StrictMode.setThreadPolicy(policy);

    }
}
