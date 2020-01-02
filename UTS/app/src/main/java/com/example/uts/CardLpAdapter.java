package com.example.uts;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
public class CardLpAdapter  extends RecyclerView.Adapter<CardLpAdapter.ListViewHolder> {
    private ArrayList<Lp> listlp;
    private Context context;

    public CardLpAdapter(Context context,ArrayList<Lp> listlp){
        this.listlp = listlp;
        this.context = context;
    }
    @NonNull
    @Override
    public CardLpAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_lp,
                parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardLpAdapter.ListViewHolder holder, int position) {
        final Lp lp = listlp.get(position);
        Glide.with(holder.itemView.getContext())
                .load(lp.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(lp.getName());
        holder.tvDesc.setText(lp.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent detail = new Intent(context,DetailListLP.class);
                detail.putExtra("lp_id", lp.getId());
                context.startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listlp.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_lp_list);
            tvName = itemView.findViewById(R.id.name_list_lp);
            tvDesc = itemView.findViewById(R.id.desc_lp_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}

