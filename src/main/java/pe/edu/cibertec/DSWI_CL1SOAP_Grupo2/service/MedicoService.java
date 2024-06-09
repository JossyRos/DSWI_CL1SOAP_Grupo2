package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.convert.MedicoConvert;
import pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.model.Medico;
import pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.repository.MedicoRepository;
import pe.edu.cibertec.ws.objects.MedicosP;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MedicoService implements IMedicoService{
    private MedicoRepository medicoRepository;
    private MedicoConvert medicoConvert;

    @Override
    public List<MedicosP> listaMedico() {
        return medicoConvert.convertMedicoToMedicoWs(
                medicoRepository.findAll()
        );
    }

    @Override
    public MedicosP obtenerMedicoxId(int id) {
        Optional<Medico> medico = medicoRepository.findById(id);
        return medico.map(value ->
                        medicoConvert.convertMedicoToMedicoWs(value))
                .orElse(null);
    }

    @Override
    public MedicosP registrarActualizarMedico(MedicosP medicosP) {
        Medico nuevoMedico = medicoRepository.save(
                medicoConvert.convertMedicoPtoMedico(medicosP));
        if(nuevoMedico == null)
            return null;
        return medicoConvert.convertMedicoToMedicoWs(nuevoMedico);
    }
}
