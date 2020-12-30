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
        int id = post.getUserId();
        String title = post.getTitle();
        String text = post.getText();

        holder.txt_userId.setText(String.valueOf(id));
        holder.txt_title.setText(title);
        holder.txt_text.setText(text);
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{

        private TextView txt_userId, txt_title, txt_text;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_userId = itemView.findViewById(R.id.txt_userId);
            txt_title = itemView.findViewById(R.id.txt_title);
            txt_text = itemView.findViewById(R.id.txt_text);
        }
    }
}
