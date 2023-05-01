package padroesestruturais.facade;

public class Engenheiro {

    public boolean apresentar() {
        return EngenheiroFacade.verificarDocumentosDesmembramento(this);
    }
}
