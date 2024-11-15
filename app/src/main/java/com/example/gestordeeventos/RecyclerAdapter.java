package com.example.gestordeeventos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private List<Evento> eventoList;
    Context context;
    ArrayList<Evento> evento;

    public RecyclerAdapter(Context context, List<Evento> eventoList) {
        this.context = context;
        this.eventoList = eventoList;
    }


    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.itens_evento, parent, false);
        return new RecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Evento eventoAtual = eventoList.get(position);
        holder.descricao.setText(evento.get(position).getDescricao());
        holder.local.setText(evento.get(position).getLocalizacao());
        holder.data_hora.setText(evento.get(position).getHoraEvento());

        /*holder.tipo.setTextDirection(Integer.parseInt(evento.get(position).getTipo()));*/
        holder.gratuidade.setImageResource(eventoAtual.isGratuito() ? R.drawable.baseline_money_off_24 : R.drawable.baseline_attach_money_24);

    }

    @Override
    public int getItemCount() {
        return eventoList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView tipo, gratuidade;
        TextView descricao, local, data_hora;


        @SuppressLint("WrongViewCast")
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tipo = itemView.findViewById(R.id.imageView3);
            gratuidade = itemView.findViewById(R.id.imageView2);
            descricao = itemView.findViewById(R.id.textView3);
            local = itemView.findViewById(R.id.textView);
            data_hora = itemView.findViewById(R.id.textView2);


        }
    }
}
