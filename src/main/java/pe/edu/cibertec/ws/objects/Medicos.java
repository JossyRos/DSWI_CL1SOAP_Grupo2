//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 10:12:37 PM PET 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medicos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medicos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idmedico" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nommedico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apemedico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechnacmedico" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicos", propOrder = {
    "idmedico",
    "nommedico",
    "apemedico",
    "fechnacmedico"
})
public class Medicos {

    protected int idmedico;
    @XmlElement(required = true)
    protected String nommedico;
    @XmlElement(required = true)
    protected String apemedico;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechnacmedico;

    /**
     * Obtiene el valor de la propiedad idmedico.
     * 
     */
    public int getIdmedico() {
        return idmedico;
    }

    /**
     * Define el valor de la propiedad idmedico.
     * 
     */
    public void setIdmedico(int value) {
        this.idmedico = value;
    }

    /**
     * Obtiene el valor de la propiedad nommedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNommedico() {
        return nommedico;
    }

    /**
     * Define el valor de la propiedad nommedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNommedico(String value) {
        this.nommedico = value;
    }

    /**
     * Obtiene el valor de la propiedad apemedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApemedico() {
        return apemedico;
    }

    /**
     * Define el valor de la propiedad apemedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApemedico(String value) {
        this.apemedico = value;
    }

    /**
     * Obtiene el valor de la propiedad fechnacmedico.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechnacmedico() {
        return fechnacmedico;
    }

    /**
     * Define el valor de la propiedad fechnacmedico.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechnacmedico(XMLGregorianCalendar value) {
        this.fechnacmedico = value;
    }

}
