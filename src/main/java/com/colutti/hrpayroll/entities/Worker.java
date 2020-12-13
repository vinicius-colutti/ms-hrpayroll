package com.colutti.hrpayroll.entities;

import java.io.Serializable;

	
public class Worker implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long idLong;

	private String name;

	private Double dailyIncome;

	public Worker() {

	}

	public Worker(Long idLong, String name, Double dailyIncome) {
		super();
		this.idLong = idLong;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dailyIncome == null) ? 0 : dailyIncome.hashCode());
		result = prime * result + ((idLong == null) ? 0 : idLong.hashCode());
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
		Worker other = (Worker) obj;
		if (dailyIncome == null) {
			if (other.dailyIncome != null)
				return false;
		} else if (!dailyIncome.equals(other.dailyIncome))
			return false;
		if (idLong == null) {
			if (other.idLong != null)
				return false;
		} else if (!idLong.equals(other.idLong))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
