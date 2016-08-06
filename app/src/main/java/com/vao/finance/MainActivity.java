package com.vao.finance;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView listView;
    private ArrayList<Transactions> transactions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.mainListVIew);
        transactions = getData();
        CustomTransactionsAdapter customTransactionsAdapter =
                new CustomTransactionsAdapter(this, transactions);
        listView.setAdapter(customTransactionsAdapter);
    }

    private ArrayList<Transactions> getData() {
        ArrayList<Transactions> a = new ArrayList<>();
        a.add(new Transactions("Куринная котлета", 21.70));
        a.add(new Transactions("Молоко", 13.90));
        a.add(new Transactions("Вода 6л", 23));
        a.add(new Transactions("Банан", 6.80));
        return a;
    }
}
