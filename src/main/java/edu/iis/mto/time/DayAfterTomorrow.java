package edu.iis.mto.time;

import org.joda.time.DateTime;

public class DayAfterTomorrow implements TimeSource {

	@Override
	public DateTime getDateTime() {
		return new DateTime().plusDays(2);
	}

}
