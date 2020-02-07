package com.dmspro.ecalendar.data.network;

import com.dmspro.ecalendar.core.DataLayerException;
import com.dmspro.ecalendar.schedule.domain.model.Event;

import java.util.List;

/**
 * Created by HP on 8/21/2017.
 */
public interface NetworkDataSource {

    List<Event> getSchedule() throws DataLayerException;
}
