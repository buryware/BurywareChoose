package com.buryware.burywarechoose;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Steve on 11/13/2015.
 */
public class ChooseAdapter extends BaseAdapter {
    private Context context;
//    private final String[] countries;
    int nCells = 2;
    int nLevel = 1;


    public ChooseAdapter(int nCells) {
        if (nLevel == 1){
            this.nCells = 2;
        } else {
            this.nCells = nCells * nCells;
        }
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);
            gridView = inflater.inflate(R.layout.gamegridview, null);

            TextView textView = (TextView) gridView.findViewById(R.id.statusline);

        /*    textView.setText(countries[position]); */

            ImageView cell = (ImageView) gridView .findViewById(R.id.gamegrid);

            cell.setImageResource(R.mipmap.circle_blue);

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return nCells;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
