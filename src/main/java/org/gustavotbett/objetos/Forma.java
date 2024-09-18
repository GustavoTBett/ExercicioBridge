package org.gustavotbett.objetos;

import org.gustavotbett.Renderizador;

abstract class Forma {
    private Renderizador renderizador;

    public Forma(Renderizador renderizador) {
        this.renderizador = renderizador;
    }

    public Renderizador getRenderizador() {
        return renderizador;
    }
}
