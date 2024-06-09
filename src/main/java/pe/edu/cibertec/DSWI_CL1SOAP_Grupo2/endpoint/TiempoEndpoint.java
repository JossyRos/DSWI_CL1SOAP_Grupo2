package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetMinutosRequest;
import pe.edu.cibertec.ws.objects.GetMinutosResponse;

@Endpoint
public class TiempoEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetMinutosRequest")
    @ResponsePayload
    public GetMinutosResponse getMinutes(@RequestPayload GetMinutosRequest request) {
        int segundos = request.getSegundos();
        int minutos = segundos / 60;

        GetMinutosResponse response = new GetMinutosResponse();
        response.setMinutos(minutos);

        return response;
    }
}
