package com.dmspro.ecalendar.data.network;

import com.dmspro.ecalendar.core.DataLayerException;
import com.dmspro.ecalendar.schedule.domain.model.Event;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by HP on 8/21/2017.
 */

public class NetworkRepository implements NetworkDataSource {

    private static NetworkRepository instance;

    private CoreApi mCoreApi;

    public static synchronized NetworkRepository getInstance() {
        if (instance == null) {
            instance = new NetworkRepository();
        }
        return instance;
    }

    private NetworkRepository() {
        this.mCoreApi = ApiHelper.getRetrofit().create(CoreApi.class);
    }

    @Override
    public List<Event> getSchedule() throws DataLayerException {
        Call<List<Event>> call = mCoreApi.getSchedule();
        try {
            Response<List<Event>> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                throw new DataLayerException(response.code(), response.message());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
