package com.cnpeng.cnpeng_demos2017_01.b_08_CL_TB_VP_RV;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cnpeng.cnpeng_demos2017_01.R;

import java.util.List;

/**
 * 作者：CnPeng
 * <p>
 * 时间：2017/4/12:下午7:54
 * <p>
 * 说明：RecyclerView 的适配器
 */

class ClTbVpRvRecyclerViewAdapter extends RecyclerView.Adapter<CusHolder> {
    private List<String> items;
    private Context      context;

    public ClTbVpRvRecyclerViewAdapter(List<String> items, Context context) {
        this.items = items;
        this.context = context;
    }

    /**
     * 更新数据的方法
     */
    public void setNewList(List<String> newItems) {
        this.items = newItems;
        notifyDataSetChanged();
    }

    @Override
    public CusHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //在填充条目布局的时候，如果不填入 parent 条目宽度无法填满布局，即便给条目设置了 matchParent
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_rv_cltbvprv, parent, false);
        CusHolder holder = new CusHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(CusHolder holder, int position) {
        holder.tv_rvItem.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

class CusHolder extends RecyclerView.ViewHolder {
    TextView tv_rvItem;

    public CusHolder(View itemView) {
        super(itemView);
        tv_rvItem = (TextView) itemView.findViewById(R.id.tv_rvItem);
    }
}
