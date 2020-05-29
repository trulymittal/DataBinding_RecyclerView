package com.example.databinding_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.databinding_recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        UserRecyclerAdapter userRecyclerAdapter = new UserRecyclerAdapter(getUserList());
        activityMainBinding.recyclerView.setAdapter(userRecyclerAdapter);
        activityMainBinding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    private List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Jhon Doe", 70, true, "https://picsum.photos/id/237/200"));
        userList.add(new User("Charles Dickens", 70, true, "https://picsum.photos/id/238/200"));
        userList.add(new User("Harry Potter", 70, false, "https://picsum.photos/id/239/200"));
        userList.add(new User("Jessica Simpson", 70, true, "https://picsum.photos/id/240/200"));
        userList.add(new User("Paul Addams", 70, false, "https://picsum.photos/id/241/200"));
        return userList;
    }
}
