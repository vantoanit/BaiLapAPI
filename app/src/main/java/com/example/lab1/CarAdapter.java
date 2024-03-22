package com.example.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CarAdapter extends BaseAdapter {
    List<CarModel> carModelList;

    Context context;
    public CarAdapter(Context context,List<CarModel> carModelList ){
        this.context =context;
        this.carModelList = carModelList;
    }
    @Override
    public int getCount() {
        return carModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return carModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item, parent, false);

        TextView tvID = (TextView) rowView.findViewById(R.id.tvId);
        ImageView imgAvatar = (ImageView) rowView.findViewById(R.id.imgAvatatr);
        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);

        TextView tvNamSX = (TextView) rowView.findViewById(R.id.tvNamSX);

        TextView tvHang = (TextView) rowView.findViewById(R.id.tvHang);

        TextView tvGia = (TextView) rowView.findViewById(R.id.tvGia);


        tvName.setText(String.valueOf(carModelList.get(position).getTen()));

        tvNamSX.setText(String.valueOf(carModelList.get(position).getNamSx()));

        tvHang.setText(String.valueOf(carModelList.get(position).getHang()));

        tvGia.setText(String.valueOf(carModelList.get(position).getGia()));

        return rowView;
    }
}
