package com.lufthansa.service.types;

import java.io.Serializable;

public class FlightDetails implements Serializable{
	private String flightName;
	private String pnr;
	private String passengerName;
	private String from;
	private String to;
	private String date;
	private String seatNo;

	public String getFlightName() {
		return flightName;
	}

	public FlightDetails setFlightName(String flightName) {
		this.flightName = flightName;
		return this;
	}

	public String getPnr() {
		return pnr;
	}

	public FlightDetails setPnr(String pnr) {
		this.pnr = pnr;
		return this;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public FlightDetails setPassengerName(String passengerName) {
		this.passengerName = passengerName;
		return this;
	}

	public String getFrom() {
		return from;
	}

	public FlightDetails setFrom(String from) {
		this.from = from;
		return this;
	}

	public String getTo() {
		return to;
	}

	public FlightDetails setTo(String to) {
		this.to = to;
		return this;
	}

	public String getDate() {
		return date;
	}

	public FlightDetails setDate(String date) {
		this.date = date;
		return this;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public FlightDetails setSeatNo(String seatNo) {
		this.seatNo = seatNo;
		return this;
	}

	@Override
	public String toString() {
		return "FlightDetails [flightName=" + flightName + ", pnr=" + pnr + ", passengerName=" + passengerName
				+ ", from=" + from + ", to=" + to + ", date=" + date + ", seatNo=" + seatNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((flightName == null) ? 0 : flightName.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((passengerName == null) ? 0 : passengerName.hashCode());
		result = prime * result + ((pnr == null) ? 0 : pnr.hashCode());
		result = prime * result + ((seatNo == null) ? 0 : seatNo.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
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
		FlightDetails other = (FlightDetails) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (flightName == null) {
			if (other.flightName != null)
				return false;
		} else if (!flightName.equals(other.flightName))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (passengerName == null) {
			if (other.passengerName != null)
				return false;
		} else if (!passengerName.equals(other.passengerName))
			return false;
		if (pnr == null) {
			if (other.pnr != null)
				return false;
		} else if (!pnr.equals(other.pnr))
			return false;
		if (seatNo == null) {
			if (other.seatNo != null)
				return false;
		} else if (!seatNo.equals(other.seatNo))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

}
