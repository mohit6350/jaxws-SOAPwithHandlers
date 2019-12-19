package com.lufthansa.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.lufthansa.service.types.BookFlightRequest;
import com.lufthansa.service.types.BookFlightResponse;
import com.lufthansa.service.types.FlightDetails;

@WebService(name="FlightService",targetNamespace="http://www.lufthansaAirways.com/flight/service/wsdl")
public interface FlightService {

	@WebMethod(operationName="getFlightDetails", action="getFlightDetails")
	public FlightDetails getFlightDetails(String passengerName);
	
	@WebMethod(operationName="bookFlight", action="bookFlight")
	@WebResult(name="bookFlightResponse", targetNamespace="http://www.lufthansaAirways.com/flight/service/types")
	public BookFlightResponse doFlightBooking(@WebParam(name="bookFlight", targetNamespace="http://www.lufthansaAirways.com/flight/service/types") BookFlightRequest request);
	
	@WebMethod(operationName="getHeaders", action="getHeaders")
	public String getHeaders();

}
