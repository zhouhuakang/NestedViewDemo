package com.hank.nestedviewdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class ListViewInScrollViewDemo extends AppCompatActivity {
    private ListView mListView;
    private MyAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_in_scroll_view);
        findView();
        initView();
        setListener();
    }

    private void findView() {
        mListView = (ListView) findViewById(R.id.lv);
    }

    private void initView() {
        mMyAdapter = new MyAdapter(ListViewInScrollViewDemo.this, FakeData.getData());
        mListView.setAdapter(mMyAdapter);
        mMyAdapter.notifyDataSetChanged();
        Utils.setListViewHeightBasedOnChildren(mListView);
    }

    private void setListener() {
    }


    public class MyAdapter extends BaseAdapter {

        private Context mContext;
        private JSONArray data;


        public MyAdapter(Context context, JSONArray data) {
            mContext = context;
            this.data = data;

        }

        @Override
        public int getCount() {
            if (null == data) {
                return 0;
            }
            return data.length();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (null == convertView) {
                convertView = View.inflate(mContext, R.layout.item, null);
                holder = new ViewHolder();
                holder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
                holder.tvAge = (TextView) convertView.findViewById(R.id.tv_age);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            JSONObject jsonObject = data.optJSONObject(position);
            holder.tvName.setText(jsonObject.optString("name"));
            holder.tvAge.setText(jsonObject.optString("age"));
            return convertView;
        }

        class ViewHolder {
            TextView tvName, tvAge;

        }

    }


}
