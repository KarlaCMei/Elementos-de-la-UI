package com.dalvik.elementosui.exampleCardView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.dalvik.elementosui.R;
import com.dalvik.elementosui.databinding.ActivityCardViewBinding;

public class CardViewActivity extends AppCompatActivity implements OnClicMovieListener  {

    private ActivityCardViewBinding binding;
    private CustomPeliculasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_card_view);

        //Un listener lo puedes obtener dentro del constructor donde lo estas llamando y no es necesario
        //Implementar la interfaz en toda la clase
       /* adapter = new CustomPeliculasAdapter(getPeliculas(), new OnClicMovieListener() {
            @Override
            public void onMovieClicListener(Pelicula pelicula) {

            }
        });*/


        //Oh puedes implementarlo en toda la clase y llamarlo de la siguiente forma con "this"
        adapter = new CustomPeliculasAdapter(getPeliculas(), this);

        binding.recyclerPeliculas.setLayoutManager(new GridLayoutManager(this,2));
        binding.recyclerPeliculas.setAdapter(adapter);

    }

    private Pelicula[] getPeliculas(){
        Pelicula[] arrayPeliculas = new Pelicula[5];
        arrayPeliculas[0] = new Pelicula(0,"It", "Terror","https://es.web.img3.acsta.net/medias/nmedia/18/87/80/19/19961693.jpg");
        arrayPeliculas[1] = new Pelicula(1,"El hobbit", "Fantasia","https://www.elsotano.com/imagenes_grandes/9786070/978607072414.JPG");
        arrayPeliculas[2] = new Pelicula(2,"Harry Potter", "Fantasia","https://static.wikia.nocookie.net/esharrypotter/images/3/35/Harry_Potter_y_el_Prisionero_de_Azkaban_%28DVD%29.png/revision/latest?cb=20110208175552");
        arrayPeliculas[3] = new Pelicula(3,"Buenas noches mami", "Suspenso","https://comoacaba.com/wp-content/uploads/2020/09/zM7NEOrDJiCtn79yxfSXXbytutb.jpg");
        arrayPeliculas[4] = new Pelicula(4,"El castillo vagabundo", "Anime","https://www.cinematecadebogota.gov.co/sites/default/files/styles/318_x_460/public/afiches/poster_el_castillo_vagabundo.jpeg?itok=-ZTsGWSb");
        return arrayPeliculas;

    }

    @Override
    public void onMovieClicListener(Pelicula pelicula) {
        //Nuestra activity reacciona cuando el usuario hace clic en un elemento del adapter
        Log.e("onClick", "Element " + pelicula.getTitulo() + " clicked desde adapter");
    }
}