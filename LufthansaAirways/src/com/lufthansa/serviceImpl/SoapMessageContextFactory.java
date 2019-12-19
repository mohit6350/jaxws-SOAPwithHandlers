package com.lufthansa.serviceImpl;

import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SoapMessageContextFactory {

	private  SOAPMessageContext context;
	private FlightServiceHandler handler;
	
	

	public FlightServiceHandler getHandler() {
		return handler;
	}

	public void setHandler(FlightServiceHandler handler) {
		this.handler = handler;
	}

	public  SOAPMessageContext getContext() {
		return context;
	}

	public  void setContext(SOAPMessageContext c) {
		context = c;
	}
	
}
