package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.service;

import pe.edu.cibertec.ws.objects.MedicosP;

import java.util.List;


public interface IMedicoService {
    List<MedicosP> listaMedico();
    MedicosP obtenerMedicoxId(int id);
    MedicosP registrarActualizarMedico (MedicosP medicosP);
}
