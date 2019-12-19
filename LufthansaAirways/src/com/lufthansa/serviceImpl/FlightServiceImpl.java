package com.lufthansa.serviceImpl;

import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.NodeList;

import com.lufthansa.service.types.BookFlightRequest;
import com.lufthansa.service.types.BookFlightResponse;
import com.lufthansa.service.types.FlightDetails;

@WebService(endpointInterface = "com.lufthansa.service.FlightService")
public class FlightServiceImpl {

	public FlightDetails getFlightDetails(String passengerName) {
		return new FlightDetails().setFlightName("boeing747").setDate("12-12-2019").setFrom("New York").setTo("Chicago")
				.setPassengerName(passengerName).setPnr("LFA-PNR-123").setSeatNo("A34");
	}

	public BookFlightResponse doFlightBooking(BookFlightRequest request) {
		return new BookFlightResponse().setPNR("LFA-PNR-1234").setStatus("CONFIRMED");
	}

	public String getHeaders() {
		return new StringBuffer().append(FlightServiceHandler.lufthansaheaders.getUserName()).append(" : ")
				.append(FlightServiceHandler.lufthansaheaders.getPassword()).toString();
	}
}
