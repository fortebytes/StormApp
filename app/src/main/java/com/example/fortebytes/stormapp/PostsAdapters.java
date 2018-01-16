package com.example.fortebytes.stormapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by es47653 on 1/16/2018.
 */

public class PostsAdapters extends ArrayAdapter<Post> {
    public PostsAdapters(Context context, ArrayList<Post> posts) {
        super(context, 0, posts);

    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        //Get data item for this position
        Post post = getItem(position);
        //Check if existing view is being reused, otherwise inflate the view
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_posts,parent,false);
        }
        //Lookup view for data population
        TextView postTitle = (TextView) convertView.findViewById(R.id.postTitle);
        TextView postContent = (TextView) convertView.findViewById(R.id.postContent);

        postTitle.setText(post.title);
        postContent.setText(post.content);

        //BUTTON HANDLER


        //Return the completed view to render on screen


        return convertView;

    }
}
