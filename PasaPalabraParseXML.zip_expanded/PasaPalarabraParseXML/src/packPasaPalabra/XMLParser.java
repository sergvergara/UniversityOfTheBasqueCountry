package packPasaPalabra;

import java.io.FileInputStream;

import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLParser extends DefaultHandler {
    private static XMLParser   mXMLParser       = new XMLParser();
    private String             texto            = null;
    private Character          letra            = null;
    private Definicion         definicionActual = null;
    private TagOperatorFactory operatorFactory;

    private XMLParser() {
        operatorFactory = new TagOperatorFactory();
    }

    public void characters(char[] pCh, int pStart, int pLength) throws SAXException {
        texto = new String(pCh, pStart, pLength).trim();
    }

    public void endDocument() throws SAXException {
        System.out.println("Finished processing the file");
    }

    public void endElement(String pUri, String pLocalName, String pName) throws SAXException {
        TagOperator op = operatorFactory.getTagOperator(pName);

        if (op == null) {

            // TODO: Add Log information
            return;
        }

        op.invokeEnd();
    }

    public void parseXmlFile(String pFile) throws XmlParsingException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();

            saxParser.parse(new FileInputStream(pFile), this);
        } catch (Exception e) {
            throw new XmlParsingException(e);
        }
    }

    public void startDocument() throws SAXException {
        System.out.println("Init parsing");
    }

    public void startElement(String pUri, String pLocalName, String pName, Attributes pAttributes)
            throws SAXException {}

    public static XMLParser getXMLParser() {
        return mXMLParser;
    }

    // Tag operators
    private class DefinicionTagOperator implements TagOperator {
        @Override
        public void invokeEnd() {
            if ((definicionActual != null) && (letra != null)) {
                CatalogoDefiniciones.getCatalogoDefiniciones().addDefinicion(letra, definicionActual);
                definicionActual = null;
                letra            = null;
            }
        }
    }


    private class EnunciadoTagOperator implements TagOperator {
        @Override
        public void invokeEnd() {
            definicionActual = new Definicion(texto);
            texto            = null;
        }
    }


    private class LetraTagOperator implements TagOperator {
        @Override
        public void invokeEnd() {
            letra = new Character(texto.charAt(0));
            texto = null;
        }
    }


    private class RespuestaTagOperator implements TagOperator {
        @Override
        public void invokeEnd() {
            if ((definicionActual != null) && (texto != null)) {
                definicionActual.addRespuesta(texto);
                texto = null;
            }
        }
    }


    private class TagOperatorFactory {
        private Map<String, TagOperator> operators = null;

        public TagOperatorFactory() {
            operators = new HashMap<String, TagOperator>();
            operators.put("Definicion", new DefinicionTagOperator());
            operators.put("Letra", new LetraTagOperator());
            operators.put("Enunciado", new EnunciadoTagOperator());
            operators.put("Respuesta", new RespuestaTagOperator());
        }

        public TagOperator getTagOperator(String pName) {
            return operators.get(pName);
        }
    }
}



