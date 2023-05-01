package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentos {

    private List<Engenheiro> documentosEmFalta = new ArrayList<Engenheiro>();

    public void addDocumentoEmFalta(Engenheiro engenheiro) {
        this.documentosEmFalta.add(engenheiro);
    }

    public boolean verificarDocumentoEmFalta(Engenheiro engenheiro) {
        return this.documentosEmFalta.contains(engenheiro);
    }

}

