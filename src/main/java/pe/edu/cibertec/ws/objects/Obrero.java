//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 09:55:21 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obrero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obrero"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="horasTrabajada" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salarioXhora" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="salarioHoraExtra" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TiempoTrabajado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TiempoExtra" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salarioTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obrero", propOrder = {
    "horasTrabajada",
    "salarioXhora",
    "salarioHoraExtra",
    "tiempoTrabajado",
    "tiempoExtra",
    "salarioTotal"
})
public class Obrero {

    protected int horasTrabajada;
    protected double salarioXhora;
    protected double salarioHoraExtra;
    @XmlElement(name = "TiempoTrabajado")
    protected int tiempoTrabajado;
    @XmlElement(name = "TiempoExtra")
    protected int tiempoExtra;
    protected double salarioTotal;

    /**
     * Obtiene el valor de la propiedad horasTrabajada.
     * 
     */
    public int getHorasTrabajada() {
        return horasTrabajada;
    }

    /**
     * Define el valor de la propiedad horasTrabajada.
     * 
     */
    public void setHorasTrabajada(int value) {
        this.horasTrabajada = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioXhora.
     * 
     */
    public double getSalarioXhora() {
        return salarioXhora;
    }

    /**
     * Define el valor de la propiedad salarioXhora.
     * 
     */
    public void setSalarioXhora(double value) {
        this.salarioXhora = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioHoraExtra.
     * 
     */
    public double getSalarioHoraExtra() {
        return salarioHoraExtra;
    }

    /**
     * Define el valor de la propiedad salarioHoraExtra.
     * 
     */
    public void setSalarioHoraExtra(double value) {
        this.salarioHoraExtra = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoTrabajado.
     * 
     */
    public int getTiempoTrabajado() {
        return tiempoTrabajado;
    }

    /**
     * Define el valor de la propiedad tiempoTrabajado.
     * 
     */
    public void setTiempoTrabajado(int value) {
        this.tiempoTrabajado = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoExtra.
     * 
     */
    public int getTiempoExtra() {
        return tiempoExtra;
    }

    /**
     * Define el valor de la propiedad tiempoExtra.
     * 
     */
    public void setTiempoExtra(int value) {
        this.tiempoExtra = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioTotal.
     * 
     */
    public double getSalarioTotal() {
        return salarioTotal;
    }

    /**
     * Define el valor de la propiedad salarioTotal.
     * 
     */
    public void setSalarioTotal(double value) {
        this.salarioTotal = value;
    }

}
