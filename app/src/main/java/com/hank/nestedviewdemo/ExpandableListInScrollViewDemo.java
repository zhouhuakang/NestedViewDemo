package com.hank.nestedviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class ExpandableListInScrollViewDemo extends AppCompatActivity implements ExpandableListView.OnGroupExpandListener {

    private ExpandableListView mElv;
    private ExpandPayListAdapter mPayListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_in_scroll_view_demo);
        findView();
        initView();
        setListener();
    }
    private void findView(){
        mElv = (ExpandableListView) findViewById(R.id.elv);
    }
    private void initView(){
        JSONArray mPayCategory = FakeData.getExpandableListViewData().optJSONArray("pay_category");
        mPayListAdapter = new ExpandPayListAdapter(mPayCategory);
        mElv.setOnGroupExpandListener(this);
        mElv.setAdapter(mPayListAdapter);
        for (int i = 0; i < mPayCategory.length(); i++) {
            mElv.expandGroup(i);
        }
        mPayListAdapter.notifyDataSetChanged();
    }
    private void setListener(){



    }
    @Override
    public void onGroupExpand(int groupPosition) {
        Utils.setExpandableListViewChildHeight(mElv, groupPosition);
        Utils.setExpandableListViewHeightBasedOnChildren(mElv);
    }


    private class ExpandPayListAdapter extends BaseExpandableListAdapter {
        JSONArray mPayCategory;

        public ExpandPayListAdapter(JSONArray mPayCategory) {
            this.mPayCategory = mPayCategory;
        }

        @Override
        public int getGroupCount() {
            return mPayCategory.length();
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return mPayCategory.optJSONObject(groupPosition).optJSONArray("pay_items").length();
        }

        @Override
        public Object getGroup(int groupPosition) {
            return mPayCategory.optJSONObject(groupPosition).optString("pay_name");
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return mPayCategory.optJSONObject(groupPosition).optJSONArray("pay_items").optJSONObject(childPosition);
        }

        @Override
        public long getGroupId(int groupPosition) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

            if (null == convertView) {
                convertView = LayoutInflater.from(ExpandableListInScrollViewDemo.this).inflate(R.layout.group_item_pay_detail, null);
                convertView.setTag(new GroupViewHolder(convertView));

            }
            GroupViewHolder holder = (GroupViewHolder) convertView.getTag();
            if (null == holder) {
                holder = new GroupViewHolder(convertView);
            }

            holder.tvSheetName.setText(mPayCategory.optJSONObject(groupPosition).optString("pay_name"));
            holder.tvTotalPrice.setVisibility(View.INVISIBLE);
            holder.ivGroupIcon.setVisibility(View.INVISIBLE);
            holder.tvTotalPriceUnit.setVisibility(View.INVISIBLE);
            holder.vGroupHeadLine.setVisibility(View.INVISIBLE);
            return convertView;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
            if (null == convertView) {
                convertView = LayoutInflater.from(ExpandableListInScrollViewDemo.this).inflate(R.layout.group_child_item_pay_detail, null);
                convertView.setTag(new ChildViewHolder(convertView));

            }
            ChildViewHolder holder = (ChildViewHolder) convertView.getTag();
            if (null == holder) {
                holder = new ChildViewHolder(convertView);
            }
            JSONArray jsonArray = mPayCategory.optJSONObject(groupPosition).optJSONArray("pay_items");
            JSONObject jsonObject = jsonArray.optJSONObject(childPosition);
            String drugName = jsonObject.optString("item_name");
            String drugPrice = jsonObject.optString("item_total_price");
//            drugPrice = AppUtil.reserveTwoDecimalPlaces(drugPrice);
            holder.tvDrugName.setText(drugName);
            holder.tvDrugPrice.setText(drugPrice);

            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return false;
        }

        class ChildViewHolder {
            TextView tvDrugName;
            TextView tvDrugPrice;

            public ChildViewHolder(View view) {
                tvDrugName = (TextView) view.findViewById(R.id.tv_drug_name);
                tvDrugPrice = (TextView) view.findViewById(R.id.tv_drug_price);
                view.setTag(this);
            }
        }

        class GroupViewHolder {
            TextView tvSheetName;
            TextView tvTotalPrice;
            ImageView ivGroupIcon;
            TextView tvTotalPriceUnit;
            View vGroupHeadLine;

            public GroupViewHolder(View view) {
                tvSheetName = (TextView) view.findViewById(R.id.tv_group_sheet_name);
                tvTotalPrice = (TextView) view.findViewById(R.id.tv_group_total_price);
                ivGroupIcon = (ImageView) view.findViewById(R.id.iv_group_icon);
                tvTotalPriceUnit = (TextView) view.findViewById(R.id.tv_group_total_price_unit);
                vGroupHeadLine = (View) view.findViewById(R.id.v_group_head_line);
                view.setTag(this);
            }
        }
    }



}
