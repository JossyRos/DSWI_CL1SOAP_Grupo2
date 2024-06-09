package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.model.Medico;
import pe.edu.cibertec.ws.objects.MedicosP;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Component
public class MedicoConvert {

    public Medico convertMedicoPtoMedico(MedicosP medicosP) {
        Medico medico = new Medico();
        medico.setIdmedico(medicosP.getIdmedico());
        medico.setNommedico(medicosP.getNommedico());
        medico.setApemedico(medicosP.getApemedico());
        medico.setFechnacmedico(medicosP.getFechnacmedico());
        return medico;
    }

    public List<Medico> convertMedicoPtoMedico(List<MedicosP> medicosP) {
        List<Medico> medicoList = new ArrayList<>();
        medicosP.forEach(dom -> {
            medicoList.add(convertMedicoPtoMedico(dom));
        });
        return medicoList;
    }
    public MedicosP convertMedicoToMedicoWs(Medico medico){
        MedicosP medicosP = new MedicosP();
        medicosP.setIdmedico(medico.getIdmedico());
        medicosP.setNommedico(medico.getNommedico());
        medicosP.setApemedico(medico.getApemedico());
        medicosP.setFechnacmedico((Date) medico.getFechnacmedico());
        return medicosP;
    }
    public List<MedicosP> convertMedicoToMedicoWs(List<Medico> medico){
        List<MedicosP> medicoList = new ArrayList<>();
        medico.forEach(dom ->{
            medicoList.add(convertMedicoToMedicoWs(dom));
        });
        return medicoList;
    }


}


