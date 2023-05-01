package padroesestruturais.facade;

public class ART extends Documentos {

    private static ART art = new ART();

    private ART() {};

    public static ART getInstancia() {
        return art;
    }
}
