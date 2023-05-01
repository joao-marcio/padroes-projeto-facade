package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngenheiroTest {

    @Test
    void deveRetornarFaltaARTDesmembramento() {
        Engenheiro engenheiro = new Engenheiro();
        MemorialDescritivo.getInstancia().addDocumentoEmFalta(engenheiro);

        assertEquals(false, engenheiro.apresentar());
    }

    @Test
    void deveRetornarFaltaPlantaDesmembramento() {
        Engenheiro engenheiro = new Engenheiro();
        Planta.getInstancia().addDocumentoEmFalta(engenheiro);

        assertEquals(false, engenheiro.apresentar());
    }

    @Test
    void deveRetornarFaltaMemorialDescritivoDesmembramento() {
        Engenheiro engenheiro = new Engenheiro();
        ART.getInstancia().addDocumentoEmFalta(engenheiro);

        assertEquals(false, engenheiro.apresentar());
    }

    @Test
    void deveRetornarEngenheiroApresentaTodosDocumentos() {
        Engenheiro engenheiro = new Engenheiro();

        assertEquals(true, engenheiro.apresentar());
    }

}