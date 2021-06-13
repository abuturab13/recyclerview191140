package com.example.recyclerview_191140;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class Adaplass extends RecyclerView.Adapter<Adaplass.viewholder> {
    private String[] data;
    public Adaplass(String[] data) {
        this.data=data;

    }

    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.app,parent ,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaplass.viewholder holder, int position) {

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        String title= data[position];
        holder.textView.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        btnclick Btnclick;
        TextView textView;
        Button button;



        public viewholder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.txt1);
            button=itemView.findViewById(R.id.btn1);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
    if(Btnclick!= null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        Btnclick.deletebtn(position);
                    }

                }

            });
        }

        public viewholder(View view) {
            super(view);
        }


        @Override
        public void onClick(View v) {

        }

    }
    public interface btnclick{
        void deletebtn(int position);
    }

}

