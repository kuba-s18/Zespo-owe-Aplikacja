package com.example.kuba.generatortest;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Plan extends AppCompatActivity {
    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        grid= (GridView)findViewById(R.id.gridView);
        grid.setAdapter(new GridAdapter(this));
    }

    class GridAdapter extends BaseAdapter {
        String[] dane;
        Context context;
        GridAdapter(Context context){
            this.context=context;
            // pobranie danych dane=
            Resources res = context.getResources();
            dane=res.getStringArray(R.array.przedmioty);
        }
        @Override
        public int getCount() {
            return dane.length;
        }

        @Override
        public Object getItem(int position) {
            return dane[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        class ViewHolder
        {
            TextView textView;
            ViewHolder(View v)
            {
                textView=(TextView)v.findViewById(R.id.textView);
            }
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row=convertView;
            ViewHolder holder=null;
            if(row==null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row=inflater.inflate(R.layout.single_item, parent, false);
                holder=new ViewHolder(row);
                row.setTag(holder);
            }else
            {
                holder=(ViewHolder)row.getTag();
            }
            holder.textView.setText(dane[position]);
            return row;
        }
    }





}
