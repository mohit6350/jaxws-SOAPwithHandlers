
package com.lufthansa.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getFlightDetailsResponse", namespace = "http://www.lufthansaAirways.com/flight/service/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightDetailsResponse", namespace = "http://www.lufthansaAirways.com/flight/service/wsdl")
public class GetFlightDetailsResponse {

    @XmlElement(name = "return", namespace = "")
    private com.lufthansa.service.types.FlightDetails _return;

    /**
     * 
     * @return
     *     returns FlightDetails
     */
    public com.lufthansa.service.types.FlightDetails getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.lufthansa.service.types.FlightDetails _return) {
        this._return = _return;
    }

}
