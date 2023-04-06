package com.dalvik.elementosui.exampleCardView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dalvik.elementosui.R;

public class CustomPeliculasAdapter extends RecyclerView.Adapter<CustomPeliculasAdapter.ViewHolder> {

    private Pelicula[] mDataSet;
    private OnClicMovieListener listener;

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public CustomPeliculasAdapter(Pelicula[] dataSet, OnClicMovieListener listener) {
        mDataSet = dataSet;
        this.listener = listener;
    }


    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_pelicula_item, parent, false);

       ViewHolder vh = new ViewHolder(v);
       vh.setListener(this.listener);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pelicula miPelicula = mDataSet[position];
        holder.setPelicula(miPelicula);
        holder.getTextTitulo().setText(miPelicula.getTitulo());
        holder.getTextGender().setText(miPelicula.getGenero());
        ImageView ivBasicImage =holder.getImgUrl();
        //Picasso.with(ivBasicImage.getContext()).load(miPelicula.getImgUrl()).into(ivBasicImage);
        Glide.with(ivBasicImage.getContext()).load(miPelicula.getImgUrl()).into(ivBasicImage);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textTitulo;
        private final TextView textGender;
        private final ImageView imgUrl;
        private Pelicula pelicula;
        private OnClicMovieListener listener;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Se hace clic al elemento desde el adapter
                    Log.e("onClick", "Element " + getPelicula().getTitulo() + " clicked desde adapter");
                    getListener().onMovieClicListener(getPelicula());
                }
            });
            textTitulo = v.findViewById(R.id.text_titulo);
            textGender = v.findViewById(R.id.text_genero);
            imgUrl = v.findViewById(R.id.img_pelicula);
        }


        public TextView getTextTitulo() {
            return textTitulo;
        }

        public TextView getTextGender() {
            return textGender;
        }

        public ImageView getImgUrl() {
            return imgUrl;
        }

        public Pelicula getPelicula() {
            return pelicula;
        }

        public void setPelicula(Pelicula pelicula) {
            this.pelicula = pelicula;
        }

        public OnClicMovieListener getListener() {
            return listener;
        }

        public void setListener(OnClicMovieListener listener) {
            this.listener = listener;
        }
    }
    // END_INCLUDE(recyclerViewSampleViewHolder)
}
