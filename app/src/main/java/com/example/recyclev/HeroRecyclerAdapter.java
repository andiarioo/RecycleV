package com.example.recyclev;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeroRecyclerAdapter extends RecyclerView.Adapter<HeroRecyclerAdapter.ViewHolder> {
    private List<HeroModel> models;
    private OnItemClickCallback onItemClickCallback;

    public HeroRecyclerAdapter(List<HeroModel> models) {
        this.models = models;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HeroModel model = models.get(position);
        holder.ivHeroPhoto.setBackgroundResource(model.getPhoto());
        holder.tvHeroName.setText(model.getName());
        holder.tvHeroSummary.setText(model.getSummary());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(models.get(position));
            }
        });
    }


    @Override
    public int getItemCount() {
        return models.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivHeroPhoto;
        TextView tvHeroName;
        TextView tvHeroSummary;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivHeroPhoto = itemView.findViewById(R.id.iv_hero_photo);
            tvHeroName = itemView.findViewById(R.id.tv_hero_name);
            tvHeroSummary = itemView.findViewById(R.id.tv_hero_summary);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(HeroModel data);
    }
}
