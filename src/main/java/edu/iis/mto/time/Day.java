package edu.iis.mto.time;

import org.joda.time.DateTime;

public class Day implements TimeSource {

	@Override
	public DateTime getDateTime() {
		return new DateTime();
	}

}
