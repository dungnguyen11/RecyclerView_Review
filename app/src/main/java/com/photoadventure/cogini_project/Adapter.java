package com.photoadventure.cogini_project;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView.ViewHolder;

import com.photoadventure.cogini_project.Model.Post;

import java.util.ArrayList;

/**
 * Created by Sam on 1/25/2018.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder>{

    public static final int POST_TYPE = 0;
    public static final int END_TYPE = 1;

    //Using Object for different viewType
    private ArrayList<Object> mPosts;

    public Adapter(ArrayList<Object> posts) {
        mPosts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == POST_TYPE) {
            View view = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.post_row, parent, false);
            return new PostHolder(view);

        } else if (viewType == END_TYPE) {
            View view = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.the_end_row, parent, false);
            return new EndHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int itemType = getItemViewType(position);

        if (itemType == POST_TYPE) {
            Post post = (Post) mPosts.get(position);
            ((PostHolder)holder).bind(post);
        } else if (itemType == END_TYPE) {

        }
    }


    @Override
    public int getItemViewType(int position) {
        if (mPosts.get(position) instanceof Post) {
            return POST_TYPE;
        } else {
            return END_TYPE;
        }

    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }
}
