package com.example.retrofitexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {

    private Context context;
    private List<Post> postList;

    public Adapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        AdapterViewHolder holder = new AdapterViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        final Post post = postList.get(position);
        String name = post.getName();
        String arti = post.getQuran_nameTranslation().getArab();
        int noSurah = post.getNumber_of_surah();
        int noAyah = post.getNumber_of_ayah();
        String type = post.getType();


        holder.txt_name.setText(name);
        holder.txt_arti.setText(arti);
        holder.txt_noSurat.setText(String.valueOf(noSurah));
        holder.txt_noAyat.setText(String.valueOf(noAyah));
        holder.txt_type.setText(type);
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{

        private TextView txt_name, txt_noSurat, txt_noAyat, txt_type, txt_arti;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_arti = itemView.findViewById(R.id.txt_arti);
            txt_noSurat = itemView.findViewById(R.id.txt_noSurat);
            txt_noAyat = itemView.findViewById(R.id.txt_noAyat);
            txt_type = itemView.findViewById(R.id.txt_type);
        }
    }
}
