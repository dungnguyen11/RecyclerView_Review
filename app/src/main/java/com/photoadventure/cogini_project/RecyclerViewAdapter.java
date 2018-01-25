package com.photoadventure.cogini_project;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.photoadventure.cogini_project.Model.Post;

import java.util.ArrayList;

/**
 * Created by Sam on 1/25/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{

    private ArrayList<Post> mPosts;

    public RecyclerViewAdapter(ArrayList<Post> posts) {
        mPosts = posts;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.post_row, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Post post = mPosts.get(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }
}
