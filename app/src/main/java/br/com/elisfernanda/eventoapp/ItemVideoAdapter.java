package br.com.elisfernanda.eventoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Elis Fernanda on 28/09/2016.
 */
public class ItemVideoAdapter extends ArrayAdapter<itemVideo> {

    public ItemVideoAdapter(Context context, List<itemVideo> lista) {
        super(context, 0,lista);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.item_video,parent,false);
        }

        itemVideo itemVideo = getItem(position);

        TextView titulo = (TextView) itemView.findViewById(R.id.titulo);
        titulo.setText(itemVideo.getTitulo());

        TextView data = (TextView) itemView.findViewById(R.id.data);
        data.setText(itemVideo.getData());

        return itemView;
    }
}
