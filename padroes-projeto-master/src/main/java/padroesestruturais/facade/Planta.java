package padroesestruturais.facade;

public class Planta extends Documentos {

    private static Planta planta = new Planta();

    private Planta() {};

    public static Planta getInstancia() {
        return planta;
    }

}
