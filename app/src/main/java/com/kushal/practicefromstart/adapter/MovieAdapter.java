package com.kushal.practicefromstart.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kushal.practicefromstart.R;
import com.kushal.practicefromstart.models.Movie;

import java.util.List;

/**
 * Created by kusha on 6/25/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MoviewViewHolder> {

    private List<Movie> moviesList;

    public MovieAdapter(List<Movie> movies){
        this.moviesList = movies ;
    }


    @Override
    public MoviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list , parent ,false);
        return new MoviewViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MoviewViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.gener.setText(movie.getGenre());
        holder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MoviewViewHolder extends RecyclerView.ViewHolder {

        public TextView title,gener,year;
        public MoviewViewHolder(View itemView) {
            super(itemView);

            title =(TextView) itemView.findViewById(R.id.title);
            gener =(TextView) itemView.findViewById(R.id.genre);
            year = (TextView) itemView.findViewById(R.id.year);
        }
    }
}
