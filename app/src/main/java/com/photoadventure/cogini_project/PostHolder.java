package com.photoadventure.cogini_project;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.photoadventure.cogini_project.Model.Post;

/**
 * Created by Sam on 1/25/2018.
 */

public class PostHolder extends RecyclerView.ViewHolder{
    private Post mPost;


    //Header
    TextView mName;
    TextView mAuthor;
    TextView mDate;
    TextView mTime;
    TextView mView;
    Button mHeaderButton;

    //Body
    ImageView mPhoto;
    TextView mTitle;

    //Bottom
    TextView mLike;
    ImageButton mLikeButton;
    ImageButton mShareButton;
    ImageButton mReadButton;
    ImageButton mBookmarkButton;

    public PostHolder(View itemView) {
        super(itemView);

        //Header
        mName = itemView.findViewById(R.id.name_post_text);
        mAuthor = itemView.findViewById(R.id.user_name_text);
        mDate = itemView.findViewById(R.id.date_text);
        mTime = itemView.findViewById(R.id.time_text);
        mView = itemView.findViewById(R.id.view_text);
        mHeaderButton = itemView.findViewById(R.id.header_button);

        //Body
        mPhoto = itemView.findViewById(R.id.photo_imageView);
        mTitle = itemView.findViewById(R.id.title_text);

        //Bottom
        mLike = itemView.findViewById(R.id.like_text);
        mLikeButton = itemView.findViewById(R.id.like_imageButton);
        mShareButton = itemView.findViewById(R.id.share_imageButton);
        mReadButton = itemView.findViewById(R.id.read_imageButton);
        mBookmarkButton = itemView.findViewById(R.id.bookmark_imageButton);
    }

    public void bind(Post post) {
        mPost = post;
        mName.setText(mPost.getName());
        mAuthor.setText(mPost.getAuthor());
        mDate.setText(mPost.getDate());
        mTime.setText(mPost.getTime());
        mView.setText(" \u2022 " + String.valueOf(mPost.getNumberOfViews()) + " Views \u2022");
        mHeaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mTitle.setText(mPost.getTitle());

        mLike.setText(String.valueOf(mPost.getNumberOfLikes()) + " Likes");
    }


}
