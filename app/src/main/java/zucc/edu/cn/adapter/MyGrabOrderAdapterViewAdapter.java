package zucc.edu.cn.adapter;

import android.content.Context;

import cn.bingoogolapple.androidcommon.adapter.BGAAdapterViewAdapter;
import cn.bingoogolapple.androidcommon.adapter.BGAViewHolderHelper;
import zucc.edu.cn.Bean.OrderBean;
import zucc.edu.cn.ioline.R;
import zucc.edu.cn.util.CurrentTime;


/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/5/21 上午12:39
 * 描述:
 */
public class MyGrabOrderAdapterViewAdapter extends BGAAdapterViewAdapter<OrderBean> {

    public static final String 新发布 = "新发布";
    public static final String 被抢了 = "被抢了";

    public MyGrabOrderAdapterViewAdapter(Context context) {
        super(context, R.layout.lv_item_mygrab);
    }
    @Override
    protected void setItemChildListener(BGAViewHolderHelper viewHolderHelper) {
        viewHolderHelper.setItemChildClickListener(R.id.tab01_item_liner);
//        viewHolderHelper.setItemChildClickListener(R.id.ll_phone);
    }

    @Override
    public void fillData(BGAViewHolderHelper viewHolderHelper, int position, OrderBean model) {
        viewHolderHelper
                .setText(R.id.dan_lv_name, model.getStudent_name())
                .setText(R.id.dan_lv_school, model.getSchool())
                .setText(R.id.dan_lv_type, model.getLable())
                .setText(R.id.dan_lv_content, model.getContent())
                .setText(R.id.dan_lv_money,"赚"+model.getTip()+"元");

        switch ( model.getState()){
            case "0":
                viewHolderHelper.setText(R.id.dan_lv_state, 新发布);
                viewHolderHelper.setTextColor(R.id.dan_lv_state, mContext.getResources().getColor(R.color.orangered));
                break;
            case "1":
                viewHolderHelper.setText(R.id.dan_lv_state, 被抢了);
                viewHolderHelper.setTextColor(R.id.dan_lv_state, mContext.getResources().getColor(R.color.gray));
                break;
            case "2":
                viewHolderHelper.setText(R.id.dan_lv_state, "已完成");
                viewHolderHelper.setTextColor(R.id.dan_lv_state, mContext.getResources().getColor(R.color.gray));
                break;
            case "-1":
                viewHolderHelper.setText(R.id.dan_lv_state, "已关闭");
                viewHolderHelper.setTextColor(R.id.dan_lv_state, mContext.getResources().getColor(R.color.gray));
                break;

        }

        if(model.getSex().equals("男")){
            viewHolderHelper.setImageResource(R.id.dan_lv_gender_pic,R.drawable.gender_symbol_boy);
        }
        else{
            viewHolderHelper.setImageResource(R.id.dan_lv_gender_pic,R.drawable.gender_symbol_girl);
        }

        viewHolderHelper.setText(R.id.dan_lv_time, CurrentTime.subDay(model.getTime()));

    }



}