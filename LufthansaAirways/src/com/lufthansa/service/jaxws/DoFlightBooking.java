
package com.lufthansa.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "bookFlight", namespace = "http://www.lufthansaAirways.com/flight/service/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookFlight", namespace = "http://www.lufthansaAirways.com/flight/service/wsdl")
public class DoFlightBooking {

    @XmlElement(name = "bookFlight", namespace = "http://www.lufthansaAirways.com/flight/service/types")
    private com.lufthansa.service.types.BookFlightRequest bookFlight;

    /**
     * 
     * @return
     *     returns BookFlightRequest
     */
    public com.lufthansa.service.types.BookFlightRequest getBookFlight() {
        return this.bookFlight;
    }

    /**
     * 
     * @param bookFlight
     *     the value for the bookFlight property
     */
    public void setBookFlight(com.lufthansa.service.types.BookFlightRequest bookFlight) {
        this.bookFlight = bookFlight;
    }

}
