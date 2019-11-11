package com.example.recyclerview_androidexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycleview;
    ArrayList<Movie> movie_arrayList;
    private MoviesAdapter mAdapter;
    LinearLayoutManager lm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movie_arrayList = new ArrayList<>();
        recycleview=(RecyclerView)findViewById(R.id.recycleview);

       //  RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

         lm=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

         recycleview.setLayoutManager(lm);
         recycleview.setHasFixedSize(true);
         mAdapter= new MoviesAdapter(movie_arrayList);
         recycleview.setAdapter(mAdapter);
         preparedata();
        }

     public void preparedata()
     {
      Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
      movie_arrayList.add(movie);
      movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
      movie_arrayList.add(movie);
      movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
      movie_arrayList.add(movie);
       movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
      movie_arrayList.add(movie);

       mAdapter.notifyDataSetChanged();
    }
}
