package com.example.zikirmatik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class EsmListAdapter extends ArrayAdapter<esmaulhsn> {

    private static final String TAG = "EsmListAdapter";

    private Context mContext;
    int mResource;

    public EsmListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<esmaulhsn> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String name = getItem(position).getName();
        String adet = getItem(position).getAdet();

        esmaulhsn esmaulhsn = new esmaulhsn(name,adet);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView esName = convertView.findViewById(R.id.esm1);
        TextView esAdet = convertView.findViewById(R.id.esm2);

        esName.setText(name);
        esAdet.setText(adet);

        return convertView;

    }
}
