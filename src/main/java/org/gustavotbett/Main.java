package org.gustavotbett;

import org.gustavotbett.objetos.Circulo;
import org.gustavotbett.objetos.Quadrado;

public class Main {
    public static void main(String[] args) {
        Renderizador2D renderizador2D = new Renderizador2D();
        Renderizador3D renderizador3D = new Renderizador3D();
        Quadrado quadrado2D = new Quadrado(renderizador2D);
        quadrado2D.getRenderizador().renderizaForma();
        Quadrado quadrado3D = new Quadrado(renderizador3D);
        quadrado3D.getRenderizador().renderizaForma();

        Circulo circulo2D = new Circulo(renderizador2D);
        circulo2D.getRenderizador().renderizaForma();
        Circulo circulo3D = new Circulo(renderizador3D);
        circulo3D.getRenderizador().renderizaForma();
    }
}