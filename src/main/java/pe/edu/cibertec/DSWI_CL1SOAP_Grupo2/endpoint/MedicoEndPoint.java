package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.exception.NotFoundException;
import pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.service.MedicoService;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class MedicoEndPoint {
    private MedicoService medicoService;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMedicosRequest")
    @ResponsePayload
    public GetMedicosResponse getMedicos(@RequestPayload
                                         GetMedicosRequest request){
        GetMedicosResponse response = new GetMedicosResponse();
        response.getMedicos().addAll(medicoService.listaMedico());
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMedicoRequest")
    @ResponsePayload
    public GetMedicoResponse getMedico(@RequestPayload
                                       GetMedicoRequest request){
        GetMedicoResponse response = new GetMedicoResponse();
        MedicosP medicows = medicoService.obtenerMedicoxId(request.getId());
        if(medicows == null)
            throw  new NotFoundException("El medico con el ID " + request.getId()+" no existe");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postMedicoRequest")
    @ResponsePayload
    public PostMedicoResponse saveMedico(@RequestPayload
                                         PostMedicoRequest request){
        PostMedicoResponse response = new PostMedicoResponse();
        response.setMedico(medicoService.registrarActualizarMedico(
                request.getMedico()));
        return response;
    }
}
