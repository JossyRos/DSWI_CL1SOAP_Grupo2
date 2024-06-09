package pe.edu.cibertec.DSWI_CL1SOAP_Grupo2.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServletServletRegistrationBean
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet,"/ws/*");
    }

    @Bean(name = "obrero")
    public DefaultWsdl11Definition obreroWsdl11Definition(XsdSchema obreroSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ObreroPort");
        wsdl11Definition.setLocationUri("/ws/obrero");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(obreroSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema obreroSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/obrero.xsd"));
    }

    @Bean(name = "practica")
    public DefaultWsdl11Definition practicaWsdl11Definition(XsdSchema practicaSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PracticaPort");
        wsdl11Definition.setLocationUri("/ws/practica");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(practicaSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema practicaSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/practica.xsd"));
    }

    @Bean(name = "tiempo")
    public DefaultWsdl11Definition tiempoWsdl11Definition(XsdSchema tiempoSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("TiempoPort");
        wsdl11Definition.setLocationUri("/ws/tiempo");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(tiempoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema tiempoSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/tiempo.xsd"));
    }

    @Bean(name = "numero")
    public DefaultWsdl11Definition numeroWsdl11Definition(XsdSchema numeroSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("NumeroPort");
        wsdl11Definition.setLocationUri("/ws/numero");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(numeroSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema numeroSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/numero.xsd"));
    }

    @Bean(name = "cuadrado")
    public DefaultWsdl11Definition cuadradoWsdl11Definition(XsdSchema cuadradoSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CuadradoPort");
        wsdl11Definition.setLocationUri("/ws/cuadrado");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(cuadradoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema cuadradoSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/cuadrado.xsd"));
    }



}

