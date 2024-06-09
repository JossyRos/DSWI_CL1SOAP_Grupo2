package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetPracticasRequest;
import pe.edu.cibertec.ws.objects.GetPracticasResponse;

import java.util.Arrays;

@Endpoint
public class PracticaEndpoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPracticasRequest")
    @ResponsePayload
    public GetPracticasResponse getPracticas(@RequestPayload GetPracticasRequest request) {
        double[] notas = {request.getNota1(), request.getNota2(), request.getNota3(), request.getNota4()};
        Arrays.sort(notas);

        double notaEliminada = notas[0];
        double promedio = (notas[1] + notas[2] + notas[3]) / 3;

        GetPracticasResponse response = new GetPracticasResponse();
        response.setNotaEliminada(notaEliminada);
        response.setPromedio(promedio);

        return response;
    }
}
