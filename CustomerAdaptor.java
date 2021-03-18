package com.example.listview;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.content.Context;
import java.util.ArrayList;

import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
import android.view.ViewGroup;

public class CustomerAdaptor extends BaseAdapter {
    private ArrayList<Jobs> dataset;
    private Context con;

    public CustomerAdaptor(ArrayList<Jobs> data, Context c) {
        dataset = data;
        con = c;
    }


    // View lookup cache
    private static class ViewHolder {
        TextView Tittle;
        TextView Company_name;
        TextView address;
        TextView salary;
             TextView description;
        Button b;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            Log.i("CustomAdapter", "convertView is null");
            convertView = LayoutInflater.from(con).inflate(R.layout.list_row, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.Tittle =convertView.findViewById(R.id.textView);
            viewHolder.Company_name= convertView.findViewById(R.id.textView2);
            viewHolder.address=convertView.findViewById(R.id.textView3);
            viewHolder.salary=convertView.findViewById(R.id.textView4);


            viewHolder.b  =    convertView.findViewById(R.id.button);



            convertView.setTag(viewHolder);
        } else {
            Log.i("CustomAdapter", "Reused");
            viewHolder = (ViewHolder) convertView.getTag();
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(con,Screen2.class);
                con.startActivity(i);
                viewHolder.description.setText(dataset.get(position).getDescription());
                notifyDataSetChanged();
            }
        });

        viewHolder.Tittle.setText(dataset.get(position).getTittle());
        viewHolder.Company_name.setText(dataset.get(position).getCompany_name());
        viewHolder.address.setText(dataset.get(position).getAddress());
       viewHolder.salary.setText(dataset.get(position).getSalary());

        return convertView;
    }

    @Override
    public int getCount() {
        return dataset.size();
    }

    @Override
    public Object getItem(int position) {
        return dataset.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
