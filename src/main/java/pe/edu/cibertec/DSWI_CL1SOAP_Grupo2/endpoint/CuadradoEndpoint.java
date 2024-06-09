package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.CalculateSquaresAndHalvesRequest;
import pe.edu.cibertec.ws.objects.CalculateSquaresAndHalvesResponse;
import pe.edu.cibertec.ws.objects.NumberResult;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class CuadradoEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalculateSquaresAndHalvesRequest")
    @ResponsePayload
    public CalculateSquaresAndHalvesResponse calculateSquaresAndHalves(@RequestPayload CalculateSquaresAndHalvesRequest request) {
        List<NumberResult> results = new ArrayList<>();

        for (int i = 15; i <= 70; i++) {
            NumberResult result = new NumberResult();
            result.setNumero(i);
            result.setCuadrado(i * i);
            result.setMedio((float) (i / 2.0));
            results.add(result);
        }

        CalculateSquaresAndHalvesResponse response = new CalculateSquaresAndHalvesResponse();
        response.getResultado().addAll(results);

        return response;
    }
}
