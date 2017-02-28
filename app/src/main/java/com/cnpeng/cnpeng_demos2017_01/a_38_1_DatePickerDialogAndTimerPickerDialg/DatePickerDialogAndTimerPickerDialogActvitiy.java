package com.cnpeng.cnpeng_demos2017_01.a_38_1_DatePickerDialogAndTimerPickerDialg;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import com.cnpeng.cnpeng_demos2017_01.R;

import java.util.Calendar;

import static android.R.string.no;

/**
 * 作者：CnPeng
 * <p>
 * 时间：2017/2/28:下午5:58
 * <p>
 * 说明：DatePickerDialogAndTimerPickerDialog的基本使用
 */

public class DatePickerDialogAndTimerPickerDialogActvitiy extends AppCompatActivity implements View.OnClickListener {

    private Button bt_showTPD;
    private Button bt_showDPD;
    Context context = this;
    private int      year;
    private int      month;
    private int      day;
    private TextView tv_date;
    private TextView tv_time;
    private int      hour;
    private int      minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpd_tpd);

        bt_showDPD = (Button) findViewById(R.id.bt_showDPD);
        bt_showTPD = (Button) findViewById(R.id.bt_showTPD);

        bt_showDPD.setOnClickListener(this);
        bt_showTPD.setOnClickListener(this);

        //获取当前日期
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        tv_date = (TextView) findViewById(R.id.tv_date);
        tv_time = (TextView) findViewById(R.id.tv_time);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_showDPD:   //展示日期选择器
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener
                        () {

                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tv_date.setText("日期是：" + year + "年" + (month + 1) + "月" + dayOfMonth + "日");
                    }
                }, year, month, day);

                datePickerDialog.show();
                break;
            case R.id.bt_showTPD:   //展示时间选择器
                TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener
                        () {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        tv_time.setText("时间是：" + hourOfDay + "时" + minute + "分");
                    }
                }, hour, minute, true);
                timePickerDialog.show();
                break;
        }
    }
}
