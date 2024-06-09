package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.endpoint;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetSumaSeriesRequest;
import pe.edu.cibertec.ws.objects.GetSumaSeriesResponse;

public class NumeroEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSumaSeriesRequest")
    @ResponsePayload
    public GetSumaSeriesResponse getSumSeries(@RequestPayload GetSumaSeriesRequest request) {
        int limit = request.getLimite();
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        GetSumaSeriesResponse response = new GetSumaSeriesResponse();
        response.setSuma(sum);

        return response;
    }
}
