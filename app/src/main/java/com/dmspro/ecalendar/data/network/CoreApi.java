package com.dmspro.ecalendar.data.network;

import com.dmspro.ecalendar.schedule.domain.model.Event;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tantd on 2/7/2020.
 */
public interface CoreApi {

    @GET("1kpjf")
    Call<List<Event>> getSchedule();
}
