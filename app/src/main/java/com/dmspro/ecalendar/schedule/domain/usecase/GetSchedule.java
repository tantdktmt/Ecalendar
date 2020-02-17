package com.dmspro.ecalendar.schedule.domain.usecase;

import androidx.annotation.NonNull;

import com.dmspro.ecalendar.core.DataLayerException;
import com.dmspro.ecalendar.core.UseCase;
import com.dmspro.ecalendar.data.network.NetworkDataSource;
import com.dmspro.ecalendar.schedule.domain.model.Event;

import java.util.List;

/**
 * Created by tantd on 2/7/2020.
 */
public class GetSchedule extends UseCase<GetSchedule.RequestValues, GetSchedule.ResponseValue> {

    private final NetworkDataSource mScheduleDataSource;

    public GetSchedule(@NonNull NetworkDataSource scheduleDataSource) {
        mScheduleDataSource = scheduleDataSource;
    }

    @Override
    protected void executeUseCase(final RequestValues values) {
        try {
            getUseCaseCallback().onSuccess(new ResponseValue(mScheduleDataSource.getSchedule()));
        } catch (DataLayerException e) {
            getUseCaseCallback().onSuccess(new ResponseValue(null));
        }
    }

    public static final class RequestValues implements UseCase.RequestValues {
    }

    public static final class ResponseValue implements UseCase.ResponseValue {
        private final List<Event> mTasks;

        public ResponseValue(@NonNull List<Event> tasks) {
            mTasks = tasks;
        }

        public List<Event> getTasks() {
            return mTasks;
        }
    }
}
