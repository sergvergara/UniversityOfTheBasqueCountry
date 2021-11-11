package packPasaPalabra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogoDefiniciones {
    private static CatalogoDefiniciones      mCatalogoDefiniciones = new CatalogoDefiniciones();
    private Map<Character, List<Definicion>> listaDefiniciones;

    private CatalogoDefiniciones() {
        listaDefiniciones = new HashMap<Character, List<Definicion>>();
    }

    public void addDefinicion(Character pLetra, Definicion pDefinicion) {
        if (!listaDefiniciones.containsKey(pLetra)) {
            listaDefiniciones.put(pLetra, new ArrayList<Definicion>());
        }

        listaDefiniciones.get(pLetra).add(pDefinicion);
    }

    public void loadData() {
        try {
            XMLParser.getXMLParser().parseXmlFile("Galderak.xml");
        } catch (XmlParsingException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return listaDefiniciones.toString();
    }

    public static CatalogoDefiniciones getCatalogoDefiniciones() {
        return mCatalogoDefiniciones;
    }
}



