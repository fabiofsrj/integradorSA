package br.com.sempreautos.integradorSA.parser.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ads")
public class LayoutRevendaMais {

	@XmlElement(name="ad", type=Ad.class)
	private List<Ad> anuncios;
	
}
