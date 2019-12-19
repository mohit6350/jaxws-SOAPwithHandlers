package com.lufthansa.serviceImpl;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class FlightServiceHandler implements SOAPHandler<SOAPMessageContext> {

	private boolean flag = true;
	public static LufthansaServiceHeaders lufthansaheaders;

	static {
		System.out.println("static block executed");
		lufthansaheaders = new LufthansaServiceHeaders();
	}

	public FlightServiceHandler() {
		System.out.println("creating factory object");
	}

	@Override
	public void close(MessageContext mc) {

	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext soapMessageContext) {
		if(flag){
			System.out.println("handler called");
			SOAPHeader header;
			try {
				header = soapMessageContext.getMessage().getSOAPPart().getEnvelope().getHeader();
				System.out.println(header.getElementsByTagName("soapenv:userName").item(0).getTextContent());
				System.out.println(header.getElementsByTagName("soapenv:password").item(0).getTextContent());
				lufthansaheaders.setUserName(header.getElementsByTagName("soapenv:userName").item(0).getTextContent());
				lufthansaheaders.setPassword(header.getElementsByTagName("soapenv:password").item(0).getTextContent());
				flag = false;
			} catch (SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				flag = false;
			}
		}
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
