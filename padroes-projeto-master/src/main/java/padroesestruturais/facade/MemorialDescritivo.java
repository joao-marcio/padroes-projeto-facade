package padroesestruturais.facade;

public class MemorialDescritivo extends Documentos {

    private static MemorialDescritivo memorialDescritivo = new MemorialDescritivo();

    private MemorialDescritivo() {};

    public static MemorialDescritivo getInstancia() {
        return memorialDescritivo;
    }
}
