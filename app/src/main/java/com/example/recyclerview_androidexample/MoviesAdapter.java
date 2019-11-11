package com.example.recyclerview_androidexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    public MoviesAdapter(List<Movie> moviesList)
    {
        this.moviesList = moviesList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,year,gender;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.title);
            gender = (TextView)itemView.findViewById(R.id.gender);
            year = (TextView) itemView.findViewById(R.id.year);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);
                return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        Movie movie= moviesList.get(position);
        holder.title.setText(movie.getTitle11());
        holder.gender.setText(movie.getGender11());
        holder.year.setText(movie.getYear11());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}
