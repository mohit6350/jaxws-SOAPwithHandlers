package com.lufthansa.service.types;

import java.io.Serializable;

public class BookFlightResponse implements Serializable {

	private String PNR;
	private String status;

	public String getPNR() {
		return PNR;
	}

	public BookFlightResponse setPNR(String pNR) {
		PNR = pNR;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public BookFlightResponse setStatus(String status) {
		this.status = status;
		return this;
	}

	@Override
	public String toString() {
		return "BookFlightResponse [PNR=" + PNR + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PNR == null) ? 0 : PNR.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		BookFlightResponse other = (BookFlightResponse) obj;
		if (PNR == null) {
			if (other.PNR != null)
				return false;
		} else if (!PNR.equals(other.PNR))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
