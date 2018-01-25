package com.photoadventure.cogini_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.photoadventure.cogini_project.Model.Post;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Views
    private RecyclerView mRecyclerView;
    private Adapter mAdapter;

    //Properties
    ArrayList<Object> mPosts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating new posts
        Post post1 = new Post("Post1","Post1 title", "abcd");
        Post post2 = new Post("Post2","Post2 title", "efgh");
        Post post3 = new Post("Post3","Post3 title", "xyz");

        mPosts.add(post1);
        mPosts.add(post2);
        mPosts.add(post3);

        mPosts.add("The End");


        //Set up Recycler View
        mRecyclerView = findViewById(R.id.RecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new Adapter(mPosts);
        mRecyclerView.setAdapter(mAdapter);


    }
}
