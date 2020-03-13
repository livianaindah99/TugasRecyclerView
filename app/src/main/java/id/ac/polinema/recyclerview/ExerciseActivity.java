package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.ExerciseAdapter;
import id.ac.polinema.recyclerview.models.Berita;

public class ExerciseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Berita> part = new ArrayList<>();

        part.add(new Berita("A City Living Under the Shadow","RBC News","https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png"));
        part.add(new Berita("One Problem For Democratic Leaders","NY Times","https://i.pinimg.com/originals/c4/81/1d/c4811d59c17568b2ea75b1327d0dfc9e.jpg"));
        part.add(new Berita("The Golden Secret to Better Breakfast","BBC World","https://www.ippf.org/sites/default/files/styles/featured_image_crop_sm/public/2017-04/bbc.jpg?h=70d62718&itok=2ZQyNmy9"));
        part.add(new Berita("How to Plan your First Ski Vacation","NBC Nightly","https://upload.wikimedia.org/wikipedia/commons/9/9f/NBC_News_2013_logo.png"));
        part.add(new Berita("How Social Isolation is Killing Us","RBC News","https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/RBC_Royal_Bank.svg/1200px-RBC_Royal_Bank.svg.png"));
        part.add(new Berita("Use Labels to Sort Messsages in Facebook","BBC World","https://www.ippf.org/sites/default/files/styles/featured_image_crop_sm/public/2017-04/bbc.jpg?h=70d62718&itok=2ZQyNmy9"));

        ExerciseAdapter adapter = new ExerciseAdapter(this, part);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
