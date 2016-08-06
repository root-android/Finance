package com.vao.finance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prime1 on 06.08.2016.
 */
public class CustomTransactionsAdapter extends ArrayAdapter<Transactions> {
    private List<Transactions> list = new ArrayList<Transactions>();

    public CustomTransactionsAdapter(Context context, List<Transactions> transactionses) {
        super(context, 0, transactionses);
        list = transactionses;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Transactions t = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.nameTransaction);
        TextView sum = (TextView) convertView.findViewById(R.id.sum);

        name.setText(t.name);
        sum.setText(t.sum+"");

        return convertView;
    }
}
