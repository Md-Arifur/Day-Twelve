package com.bitm.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getUsers();
    }


    private void init() {
        users = new ArrayList<>();
    }

    private void getUsers() {
        users.add(new User("Arifur Rahman", R.drawable.arif, "01770178342"));
        users.add(new User("Abdullah al mamun", R.drawable.mamun, "01770178656"));

    }
}
