//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 10:50:54 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NumberResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NumberResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cuadrado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="medio" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberResult", propOrder = {
    "numero",
    "cuadrado",
    "medio"
})
public class NumberResult {

    protected int numero;
    protected int cuadrado;
    protected float medio;

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad cuadrado.
     * 
     */
    public int getCuadrado() {
        return cuadrado;
    }

    /**
     * Define el valor de la propiedad cuadrado.
     * 
     */
    public void setCuadrado(int value) {
        this.cuadrado = value;
    }

    /**
     * Obtiene el valor de la propiedad medio.
     * 
     */
    public float getMedio() {
        return medio;
    }

    /**
     * Define el valor de la propiedad medio.
     * 
     */
    public void setMedio(float value) {
        this.medio = value;
    }

}
