//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 10:12:37 PM PET 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.ws.objects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculateSquaresAndHalvesRequest_QNAME = new QName("http://www.cibertec.edu.pe/ws/objects", "CalculateSquaresAndHalvesRequest");
    private final static QName _CalculateSquaresAndHalvesResponse_QNAME = new QName("http://www.cibertec.edu.pe/ws/objects", "CalculateSquaresAndHalvesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.ws.objects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateSquaresAndHalvesRequest }
     * 
     */
    public CalculateSquaresAndHalvesRequest createCalculateSquaresAndHalvesRequest() {
        return new CalculateSquaresAndHalvesRequest();
    }

    /**
     * Create an instance of {@link CalculateSquaresAndHalvesResponse }
     * 
     */
    public CalculateSquaresAndHalvesResponse createCalculateSquaresAndHalvesResponse() {
        return new CalculateSquaresAndHalvesResponse();
    }

    /**
     * Create an instance of {@link GetMedicosRequest }
     * 
     */
    public GetMedicosRequest createGetMedicosRequest() {
        return new GetMedicosRequest();
    }

    /**
     * Create an instance of {@link GetMedicosResponse }
     * 
     */
    public GetMedicosResponse createGetMedicosResponse() {
        return new GetMedicosResponse();
    }

    /**
     * Create an instance of {@link Medicos }
     * 
     */
    public Medicos createMedicos() {
        return new Medicos();
    }

    /**
     * Create an instance of {@link GetMedicoRequest }
     * 
     */
    public GetMedicoRequest createGetMedicoRequest() {
        return new GetMedicoRequest();
    }

    /**
     * Create an instance of {@link GetMedicoResponse }
     * 
     */
    public GetMedicoResponse createGetMedicoResponse() {
        return new GetMedicoResponse();
    }

    /**
     * Create an instance of {@link PostMedicoRequest }
     * 
     */
    public PostMedicoRequest createPostMedicoRequest() {
        return new PostMedicoRequest();
    }

    /**
     * Create an instance of {@link PostMedicoResponse }
     * 
     */
    public PostMedicoResponse createPostMedicoResponse() {
        return new PostMedicoResponse();
    }

    /**
     * Create an instance of {@link GetSumaSeriesRequest }
     * 
     */
    public GetSumaSeriesRequest createGetSumaSeriesRequest() {
        return new GetSumaSeriesRequest();
    }

    /**
     * Create an instance of {@link GetSumaSeriesResponse }
     * 
     */
    public GetSumaSeriesResponse createGetSumaSeriesResponse() {
        return new GetSumaSeriesResponse();
    }

    /**
     * Create an instance of {@link CalcularSalarioRequest }
     * 
     */
    public CalcularSalarioRequest createCalcularSalarioRequest() {
        return new CalcularSalarioRequest();
    }

    /**
     * Create an instance of {@link CalcularSalarioResponse }
     * 
     */
    public CalcularSalarioResponse createCalcularSalarioResponse() {
        return new CalcularSalarioResponse();
    }

    /**
     * Create an instance of {@link GetPracticasRequest }
     * 
     */
    public GetPracticasRequest createGetPracticasRequest() {
        return new GetPracticasRequest();
    }

    /**
     * Create an instance of {@link GetPracticasResponse }
     * 
     */
    public GetPracticasResponse createGetPracticasResponse() {
        return new GetPracticasResponse();
    }

    /**
     * Create an instance of {@link GetMinutosRequest }
     * 
     */
    public GetMinutosRequest createGetMinutosRequest() {
        return new GetMinutosRequest();
    }

    /**
     * Create an instance of {@link GetMinutosResponse }
     * 
     */
    public GetMinutosResponse createGetMinutosResponse() {
        return new GetMinutosResponse();
    }

    /**
     * Create an instance of {@link NumberResult }
     * 
     */
    public NumberResult createNumberResult() {
        return new NumberResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSquaresAndHalvesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateSquaresAndHalvesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.cibertec.edu.pe/ws/objects", name = "CalculateSquaresAndHalvesRequest")
    public JAXBElement<CalculateSquaresAndHalvesRequest> createCalculateSquaresAndHalvesRequest(CalculateSquaresAndHalvesRequest value) {
        return new JAXBElement<CalculateSquaresAndHalvesRequest>(_CalculateSquaresAndHalvesRequest_QNAME, CalculateSquaresAndHalvesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSquaresAndHalvesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateSquaresAndHalvesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.cibertec.edu.pe/ws/objects", name = "CalculateSquaresAndHalvesResponse")
    public JAXBElement<CalculateSquaresAndHalvesResponse> createCalculateSquaresAndHalvesResponse(CalculateSquaresAndHalvesResponse value) {
        return new JAXBElement<CalculateSquaresAndHalvesResponse>(_CalculateSquaresAndHalvesResponse_QNAME, CalculateSquaresAndHalvesResponse.class, null, value);
    }

}
