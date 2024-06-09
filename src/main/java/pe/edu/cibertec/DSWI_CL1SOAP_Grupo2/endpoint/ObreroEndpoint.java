package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.endpoint;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.CalcularSalarioRequest;
import pe.edu.cibertec.ws.objects.CalcularSalarioResponse;
import pe.edu.cibertec.ws.objects.Obrero;

public class ObreroEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalcularSalarioRequest")
    @ResponsePayload
    public CalcularSalarioResponse getSalario(@RequestPayload CalcularSalarioRequest request) {
        CalcularSalarioResponse response = new CalcularSalarioResponse();
        double salarioRegular = request.getHorasTrabajadas() * request.getHorasTrabajadas();
        double salarioExtra = (request.getHorasTrabajadas() > 40) ?
                (request.getHorasTrabajadas() - 40) * request.getTarifaHoraExtra() : 0;
        response.setSalario(salarioRegular + salarioExtra);
        return response;
    }
}
