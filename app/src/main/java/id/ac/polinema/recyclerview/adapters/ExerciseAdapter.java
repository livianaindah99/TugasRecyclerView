package id.ac.polinema.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.Berita;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {

    private Context context;
    private List<Berita> items;
    private static final int LOGO_LEFT = 1;
    private static final int LOGO_RIGHT = 2;

    public ExerciseAdapter(Context context, List<Berita> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if(viewType == LOGO_LEFT){
            view = LayoutInflater.from(context).inflate(R.layout.item_exercise,parent,false);
        } else if(viewType == LOGO_RIGHT){
            view = LayoutInflater.from(context).inflate(R.layout.item_exercise2,parent,false);
        }
        return new ExerciseAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Berita item = items.get(position);
        Glide.with(context).load(item.getImage()).into(holder.image);
        holder.judul.setText(item.getJudul());
        holder.kategori.setText(item.getKategori());
    }

    @Override
    public int getItemCount() {
        if (items != null) {
            return items.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView judul;
        ImageView image;
        TextView kategori;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
            image = itemView.findViewById(R.id.image);
            kategori = itemView.findViewById(R.id.kategori);
        }
    }

    @Override
    public int getItemViewType(int position){
        return (position % 4 == 0 || position % 4 == 3) ? LOGO_RIGHT : LOGO_LEFT;
    }
}
