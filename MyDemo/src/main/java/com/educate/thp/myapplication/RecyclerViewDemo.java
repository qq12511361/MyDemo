package com.educate.thp.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by 41223 on 2018/8/28.
 */

public class RecyclerViewDemo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.antivity_recyclerview_demo);

    }

    public class MyRecyclerView extends RecyclerView.Adapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class MyHoldView extends RecyclerView.ViewHolder {
                TextView textView;
            public MyHoldView(View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.center);
            }
        }
    }
}
