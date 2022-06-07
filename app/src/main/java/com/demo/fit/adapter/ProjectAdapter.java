package com.demo.fit.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.demo.fit.ProjectDetailActivity;
import com.demo.fit.bean.ProjectBeen;
import com.demo.fit.databinding.ItemProjectBinding;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.MyViewHolder> {
    ItemProjectBinding itemBinding;

    private Context context;
    private List<ProjectBeen> examBeens;

    public ProjectAdapter(Context context, List<ProjectBeen> examBeens) {
        this.context = context;
        this.examBeens = examBeens;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemBinding = ItemProjectBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        MyViewHolder holder = new MyViewHolder(itemBinding);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Glide.with(context).load(examBeens.get(position).getImage()).into(holder.itemErrorQuestionBinding.ivImage);

        holder.itemErrorQuestionBinding.tvTitle.setText(examBeens.get(position).getTitle());
        holder.itemErrorQuestionBinding.tvContent.setText(examBeens.get(position).getContent());

        holder.itemErrorQuestionBinding.llAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProjectDetailActivity.class);
                intent.putExtra("detail", examBeens.get(position));
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return examBeens.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ItemProjectBinding itemErrorQuestionBinding;

        public MyViewHolder(ItemProjectBinding itemErrorQuestionBinding) {
            super(itemErrorQuestionBinding.getRoot());
            this.itemErrorQuestionBinding = itemErrorQuestionBinding;
        }
    }

}
