package com.example.databinding_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        UserRecyclerAdapter userRecyclerAdapter = new UserRecyclerAdapter(getUserList());
        recyclerView.setAdapter(userRecyclerAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    private List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Jhon Doe", 70, true, "https://picsum.photos/id/237/200"));
        userList.add(new User("Mary World", 70, true, "https://picsum.photos/id/238/200"));
        userList.add(new User("Hey baby", 70, false, "https://picsum.photos/id/239/200"));
        userList.add(new User("Jessica", 70, true, "https://picsum.photos/id/240/200"));
        userList.add(new User("Samantha", 70, false, "https://picsum.photos/id/241/200"));
        return userList;
    }
}
