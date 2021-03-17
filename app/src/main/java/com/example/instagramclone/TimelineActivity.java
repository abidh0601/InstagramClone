package com.example.instagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class TimelineActivity extends AppCompatActivity {
    
    public static final String TAG = "Timeline_Activity";
    
    RecyclerView rvPosts;
    List<Post> posts;
    PostsAdapter postsAdapter;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        
        //Find recycler view
        rvPosts = findViewById(R.id.rvPosts);
        
        
        //Init the list of tweets and adapter
        posts = new ArrayList<>();
        postsAdapter = new PostsAdapter(this, posts);
        
        
        //Recycler view setup: layout manager and the adapter
        rvPosts.setLayoutManager(new LinearLayoutManager(this));
        rvPosts.setAdapter(postsAdapter);
        populateTimeline();
    }

    private void populateTimeline() {
        //TODO: need to work here
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Post");

        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e != null){
                    Log.e(TAG, "Error getting posts", e);
                    return;
                }

                ParseObject test;

            }
        });

    }
}