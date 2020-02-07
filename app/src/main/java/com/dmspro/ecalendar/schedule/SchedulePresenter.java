package com.dmspro.ecalendar.schedule;

import com.dmspro.ecalendar.core.UseCase;
import com.dmspro.ecalendar.data.network.NetworkRepository;
import com.dmspro.ecalendar.schedule.domain.usecase.GetSchedule;

/**
 * Created by HP on 8/21/2017.
 */
public class SchedulePresenter extends ScheduleContract.Presenter {

    private GetSchedule mGetSchedule;

    public SchedulePresenter() {
        this.mGetSchedule = new GetSchedule(NetworkRepository.getInstance());
    }

    @Override
    public void loadSchedule() {
        useCaseHandler.execute(mGetSchedule, new GetSchedule.RequestValues(), new UseCase.UseCaseCallback<GetSchedule.ResponseValue>() {
            @Override
            public void onSuccess(GetSchedule.ResponseValue response) {
                view.showSchedule(response.getTasks());
            }

            @Override
            public void onError(Throwable t) {

            }
        });
    }
}
