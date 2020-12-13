package com.colutti.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private Double dailyIncome;

	private Integer days;

	public Payment() {

	}

	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public double getTotal() {
		return days * dailyIncome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dailyIncome == null) ? 0 : dailyIncome.hashCode());
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (dailyIncome == null) {
			if (other.dailyIncome != null)
				return false;
		} else if (!dailyIncome.equals(other.dailyIncome))
			return false;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
