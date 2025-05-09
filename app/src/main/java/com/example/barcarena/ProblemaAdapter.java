package com.example.barcarena;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProblemaAdapter extends RecyclerView.Adapter<ProblemaAdapter.ViewHolder> {

    private List<problema> problemas;

    public ProblemaAdapter(List<problema> problemas) {
        this.problemas = problemas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_problema, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        problema problema = problemas.get(position);
        holder.txtProblema.setText(problema.getTitulo());
        holder.imgProblema.setImageResource(problema.getImagem());
    }

    @Override
    public int getItemCount() {
        return problemas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtProblema;
        ImageView imgProblema;

        public ViewHolder(View itemView) {
            super(itemView);
            txtProblema = itemView.findViewById(R.id.txtProblema);
            imgProblema = itemView.findViewById(R.id.imgProblema);
        }
    }
}



