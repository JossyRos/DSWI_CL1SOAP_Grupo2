package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.SERVER)
public class NotFoundException extends RuntimeException {
    public  NotFoundException(String message){
        super(message);
    }
}
