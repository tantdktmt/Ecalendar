package com.dmspro.ecalendar.schedule;

import com.dmspro.ecalendar.core.BasePresenter;
import com.dmspro.ecalendar.core.IView;
import com.dmspro.ecalendar.schedule.domain.model.Event;

import java.util.List;

/**
 * Created by HP on 8/21/2017.
 */
public interface ScheduleContract {
    interface View extends IView<Presenter> {
        void showSchedule(List<Event> lstEvent);
    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract void loadSchedule();
    }
}
