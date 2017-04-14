package com.cnpeng.cnpeng_demos2017_01.b_08_CL_TB_VP_RV;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cnpeng.cnpeng_demos2017_01.R;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.fragment;


/**
 * 作者：CnPeng
 * <p>
 * 时间：2017/4/12:下午6:42
 * <p>
 * 说明：每个Tab 标题对应的内容。该界面需要使用RV列表。考虑，如果实现 RV的 上拉加载更多
 */

public class ClTbVpRbFragment extends Fragment {

    private int                         index;     //当前被选中的标题索引
    private View                        view;      //Fragment 中的视图view
    private List<String>                items;
    private ClTbVpRvRecyclerViewAdapter rvAdapter;


    public static Fragment getInstance(int position) {
        ClTbVpRbFragment fragment = new ClTbVpRbFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("index", position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        index = getArguments().getInt("index"); //获取传递过来的索引
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable
                                     ViewGroup container, Bundle savedInstanceState) {
        //  if (null != view) {     //防止重复创建
        //      ViewGroup parent = (ViewGroup) view.getParent();
        //      if (parent != null) {
        //          parent.removeView(view);
        //      }
        // }

        items = new ArrayList<>();
        for (int i = 'A'; i < 'z'; i++) {
            items.add(index + "——" + (char) i + "----------------------------------------");
        }

        view = inflater.inflate(R.layout.fm_cltbvprv, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_clTbVpRv);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 
                mLayoutManager.getOrientation());
        recyclerView.addItemDecoration(mDividerItemDecoration);
        recyclerView.setLayoutManager(mLayoutManager);

        rvAdapter = new ClTbVpRvRecyclerViewAdapter(items, getActivity());
        recyclerView.setAdapter(rvAdapter);

        initPull2Refresh(view);
        return view;
    }

    /**
     * 初始化下拉刷新监听
     */
    private void initPull2Refresh(View fragmentView) {
        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) fragmentView.findViewById(R.id.srl_ClTbVpRv);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //                //模拟更新数据，并关闭刷新
                //                for (int i = 0; i < 10; i++) {
                //                    items.add("下拉出来的数据" + i);
                //                }
                //                new Handler().postDelayed(new Runnable() {
                //                    @Override
                //                    public void run() {
                //                        swipeRefreshLayout.setRefreshing(false);    //关闭刷新
                //                    }
                //                }, 2500);
                //
                //                rvAdapter.setNewList(items);

            }
        });
    }
}
