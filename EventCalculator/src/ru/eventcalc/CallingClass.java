package ru.eventcalc;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Weeks;
import org.joda.time.Years;

import ru.date.DateCalculator;
import ru.date.DateCalculatorImpl;
import ru.date.DateDifference;
import ru.date.DateStorer;
import ru.date.DateValidator;

public class CallingClass {

	public static void main(String[] args) {
		int year, month, day, hour, minute;
		year = 2015;
		month = 2;
		day = 28;
		hour = 23;
		minute = 59;
		DateValidator dateValidator = new DateValidator();
		if (dateValidator.validateDatesOnValidMeans(year, month, day, hour, minute)){
			DateTime dateTime = new DateTime(year, month, day, hour, minute);
			DateStorer dateStorer = new DateStorer(dateTime);
			DateCalculator dateCalculator = new DateCalculatorImpl();
			System.out.println(dateValidator.validateDatesOnAfter(dateStorer));
			if (dateValidator.validateDatesOnAfter(dateStorer)){
			DateDifference dateDifference = dateCalculator.calculateDifferenceBetweenDates(dateStorer);
			System.out.println("Years = " + dateDifference.getYears() + " ,Months = " + dateDifference.getMonths() + 
					" ,Weeks = " + dateDifference.getWeeks() + " ,Days = " + dateDifference.getDays() + " ,Hours = " + 
					dateDifference.getHours() + " ,Minutes = " + dateDifference.getMinutes());
			}
		}
		else 
			System.out.println("Invalid Date");
	}
}


