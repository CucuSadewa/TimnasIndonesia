package com.example.timnasindonesia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class PemainAdapter extends RecyclerView.Adapter<PemainAdapter.ViewHolder> {

    private ArrayList<Pemain> listPemain;
    private OnItemClickCallback onItemClickCallback;

    PemainAdapter(ArrayList<Pemain> list){
        this.listPemain = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_pemain, parent, false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Pemain pemain = listPemain.get(position);

        Glide.with(holder.itemView.getContext())
                .load(pemain.getPhoto())
                .apply(new RequestOptions().override(130, 200))
                .into(holder.imgPhoto);

        holder.tvName.setText(pemain.getName());
        holder.tvPosisi.setText(pemain.getPosisi());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Favorite "+listPemain.get(holder.getAdapterPosition()).getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Share "+listPemain.get(holder.getAdapterPosition()).getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Anda Memilih "+listPemain.get(holder.getAdapterPosition()).getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listPemain.get(holder.getAdapterPosition()));
            }
        });


    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public interface OnItemClickCallback {
        void onItemClicked(Pemain data);
    }

    @Override
    public int getItemCount() {
        return listPemain.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvPosisi;
        Button btnFavorite, btnShare;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.image_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPosisi = itemView.findViewById(R.id.tv_item_posisi);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);

        }
    }
}
