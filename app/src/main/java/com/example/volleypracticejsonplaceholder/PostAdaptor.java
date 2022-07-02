package com.example.volleypracticejsonplaceholder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdaptor extends RecyclerView.Adapter<PostAdaptor.ViewHolder> {

    List<PostModel> postList;
    Context context;
    public PostAdaptor(Context context, List<PostModel> postList) {
        this.postList=postList;
        this.context= context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userId.setText(Integer.toString(postList.get(position).getUserId()));
        String id= Integer.toString(postList.get(position).getUserId());
        holder.title.setText(postList.get(position).getTitle());
        holder.postdesc.setText(postList.get(position).getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PostModel parseItem = postList.get(position);

                Intent intent = new Intent(context, ShowDetails.class);
                intent.putExtra("userId", id);
                intent.putExtra("title", parseItem.getTitle());
                intent.putExtra("body", parseItem.getDesc());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,postdesc,userId;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.postTitle);
            postdesc=itemView.findViewById(R.id.postDesc);
            userId=itemView.findViewById(R.id.userId);
        }

    }
}
