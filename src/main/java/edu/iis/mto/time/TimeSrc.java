package edu.iis.mto.time;

import org.joda.time.DateTime;

public class TimeSrc implements TimeSource {

	@Override
	public DateTime currentDateTime() {
		return new DateTime();
	}

}
