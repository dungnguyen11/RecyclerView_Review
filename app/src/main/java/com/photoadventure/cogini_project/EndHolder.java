package com.photoadventure.cogini_project;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Sam on 1/26/2018.
 */

public class EndHolder extends RecyclerView.ViewHolder{

    private TextView mEnd;

    public EndHolder(View itemView) {
        super(itemView);
        mEnd = itemView.findViewById(R.id.theEnd_text);
    }
}
