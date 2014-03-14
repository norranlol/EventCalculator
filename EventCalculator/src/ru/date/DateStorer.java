package ru.date;

import org.joda.time.DateTime;

public class DateStorer {
	
	private DateTime dateTimeCurrent;
	private DateTime dateTimeFuture;
	
	public DateStorer(DateTime dateTimeFuture){
		dateTimeCurrent = new DateTime();
		this.dateTimeFuture = dateTimeFuture;
	}

	public DateTime getDateTimeCurrent() {
		return dateTimeCurrent;
	}

	public DateTime getDateTimeFuture() {
		return dateTimeFuture;
	}
}
