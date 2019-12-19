package com.lufthansa.service.publish;

import java.util.List;

import javax.xml.ws.Endpoint;
import javax.xml.ws.handler.Handler;

import com.lufthansa.serviceImpl.FlightServiceHandler;
import com.lufthansa.serviceImpl.FlightServiceImpl;

public class LufthansaFlightServicePublisher {

	public static void main(String[] args) {
		/*Endpoint.publish("http://localhost:2222/LufthansaAirways/flight/service/wsdl", new FlightServiceImpl());
		System.err.println("Server started successfully...");*/
		Endpoint ep = Endpoint.create(new FlightServiceImpl());
		List<Handler> handlerChain = ep.getBinding().getHandlerChain();
		handlerChain.add(new FlightServiceHandler());
		ep.getBinding().setHandlerChain(handlerChain);
		ep.publish("http://localhost:2222/LufthansaAirways/flight/service/wsdl");
		System.err.println("Server started successfully...");
	}
}
