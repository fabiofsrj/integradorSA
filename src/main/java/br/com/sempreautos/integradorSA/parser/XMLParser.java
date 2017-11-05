package br.com.sempreautos.integradorSA.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.com.sempreautos.integradorSA.parser.dto.LayoutRevendaMais;

public class XMLParser {
    // Export
    public static void marshal(LayoutRevendaMais arquivo, File selectedFile)
            throws IOException, JAXBException {
        
    	JAXBContext context;
        BufferedWriter writer = null;

        writer = new BufferedWriter(new FileWriter(selectedFile));
        context = JAXBContext.newInstance(LayoutRevendaMais.class);

        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(arquivo, writer);
        
        writer.close();
    }
 
    // Import
    public static LayoutRevendaMais unmarshal(File importFile) throws JAXBException {
        LayoutRevendaMais arquivo = new LayoutRevendaMais();
 
        JAXBContext context = JAXBContext.newInstance(LayoutRevendaMais.class);
        Unmarshaller um = context.createUnmarshaller();
        arquivo = (LayoutRevendaMais) um.unmarshal(importFile);
 
        return arquivo;
    }
}
