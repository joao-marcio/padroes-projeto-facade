package padroesestruturais.facade;

public class EngenheiroFacade {

    public static boolean verificarDocumentosDesmembramento(Engenheiro engenheiro) {
        if (Planta.getInstancia().verificarDocumentoEmFalta(engenheiro)) {
            return false;
        }
        if (ART.getInstancia().verificarDocumentoEmFalta(engenheiro)) {
            return false;
        }
        if (MemorialDescritivo.getInstancia().verificarDocumentoEmFalta(engenheiro)) {
            return false;
        }
        return true;
    }
}
