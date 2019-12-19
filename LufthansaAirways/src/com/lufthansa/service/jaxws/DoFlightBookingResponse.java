
package com.lufthansa.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "bookFlightResponse", namespace = "http://www.lufthansaAirways.com/flight/service/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoFlightBookingResponse", namespace = "http://www.lufthansaAirways.com/flight/service/wsdl")
public class DoFlightBookingResponse {

    @XmlElement(name = "bookFlightResponse", namespace = "http://www.lufthansaAirways.com/flight/service/types")
    private com.lufthansa.service.types.BookFlightResponse bookFlightResponse;

    /**
     * 
     * @return
     *     returns BookFlightResponse
     */
    public com.lufthansa.service.types.BookFlightResponse getBookFlightResponse() {
        return this.bookFlightResponse;
    }

    /**
     * 
     * @param bookFlightResponse
     *     the value for the bookFlightResponse property
     */
    public void setBookFlightResponse(com.lufthansa.service.types.BookFlightResponse bookFlightResponse) {
        this.bookFlightResponse = bookFlightResponse;
    }

}
