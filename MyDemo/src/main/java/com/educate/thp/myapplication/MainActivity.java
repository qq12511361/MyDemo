package com.educate.thp.myapplication;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    List<String> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList.add("recyclerviewDemo");
        myList.add("动画Demo");
        ListView listView = (ListView) findViewById(R.id.myListView);
        myBaseAdapter adapter = new myBaseAdapter(MainActivity.this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

   //dfdgdgdfgdf

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.i("tag", "========================================================="+i);
        Toast.makeText(getApplicationContext(), "position=" + i, Toast.LENGTH_LONG).show();
    }

    public class myBaseAdapter extends BaseAdapter {
        private Context context;
        private LayoutInflater inflater;

        public myBaseAdapter(Context context) {
            this.context = context;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return myList.size();
        }

        @Override
        public Object getItem(int position) {
            return myList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            ViewHolder viewHolder = new ViewHolder();
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.activity_main_listview_item, null);
                viewHolder.textView = (TextView) convertView.findViewById(R.id.listview_textview);
                viewHolder.button = (Button) convertView.findViewById(R.id.listview_button);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.textView.setText(myList.get(position));
            return convertView;
        }

        private class ViewHolder {
            private TextView textView;
            private Button button;
        }
    }

}
