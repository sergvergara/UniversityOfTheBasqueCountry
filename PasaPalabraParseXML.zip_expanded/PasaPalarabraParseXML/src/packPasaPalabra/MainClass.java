package packPasaPalabra;

public class MainClass {
    public static void main(String[] args) {
        CatalogoDefiniciones catalogo = CatalogoDefiniciones.getCatalogoDefiniciones();

        catalogo.loadData();
        System.out.println(catalogo.toString());
    }
}



