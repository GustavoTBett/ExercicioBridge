package org.gustavotbett;

abstract class Forma {
    protected Renderizador renderizador;

    public Forma(Renderizador renderizador) {
        this.renderizador = renderizador;
    }
}
