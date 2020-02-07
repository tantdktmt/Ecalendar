package com.dmspro.ecalendar.schedule;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dmspro.ecalendar.R;
import com.dmspro.ecalendar.core.BaseActivity;
import com.dmspro.ecalendar.utils.FragmentController;

/**
 * Created by tantd on 2/7/2020.
 */
public class ScheduleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        ScheduleFragment scheduleFragment = (ScheduleFragment) getSupportFragmentManager().findFragmentById(R.id.layout_content);
        if (scheduleFragment == null) {
            scheduleFragment = ScheduleFragment.newInstance();
            FragmentController.addFragmentToActivity(getSupportFragmentManager(), scheduleFragment, R.id.layout_content);
        }
    }
}
