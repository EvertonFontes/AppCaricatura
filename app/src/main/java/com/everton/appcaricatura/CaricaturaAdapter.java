package com.everton.appcaricatura;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CaricaturaAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Caricatura> _listaCaricatura;

    public CaricaturaAdapter( ArrayList<Caricatura> listaCaricatura){
        this._listaCaricatura = listaCaricatura;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_caricaturas,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Caricatura caricatura = _listaCaricatura.get(position);
        holder.image_caricatura.setImageResource(caricatura.getImagem());
        holder.txt_nome.setText(caricatura.getNome());
        holder.txt_idade.setText(caricatura.getIdade() + " anos");
        holder.txt_profissao.setText(caricatura.getProfissao());
    }

    @Override
    public int getItemCount() {
        return _listaCaricatura.size();
    }
}

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image_caricatura = itemView.findViewById(R.id.image_caricatura);
        TextView txt_nome = itemView.findViewById(R.id.txt_nome);
        TextView txt_idade = itemView.findViewById(R.id.txt_idade);
        TextView txt_profissao = itemView.findViewById(R.id.txt_profissao);

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
