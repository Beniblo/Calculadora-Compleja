package org.utl.calculadoracompleja.controller;

import org.utl.calculadoracompleja.model.NumeroComplejo;

/**
 *
 * @author beniblo
 */
public class CalculadoraCompleja {
    public NumeroComplejo adicionar(NumeroComplejo nc1, NumeroComplejo nc2) {
        double r = nc1.getReal() + nc2.getReal();
        double i = nc1.getImg() + nc2.getImg();
        return new NumeroComplejo(r, i);
    }

    public NumeroComplejo restar(NumeroComplejo nc1, NumeroComplejo nc2) {
        double r = nc1.getReal() - nc2.getReal();
        double i = nc1.getImg() - nc2.getImg();
        return new NumeroComplejo(r, i);
    }

    public NumeroComplejo multiplicar(NumeroComplejo nc1, NumeroComplejo nc2) {
        double r = (nc1.getReal() * nc2.getReal()) - (nc1.getImg() * nc2.getImg());
        double i = (nc1.getReal() * nc2.getImg()) + (nc1.getImg() * nc2.getReal());
        return new NumeroComplejo(r, i);
    }

    public NumeroComplejo dividir(NumeroComplejo nc1, NumeroComplejo nc2) {

        double den = (Math.pow(nc2.getReal(), 2) + Math.pow(nc2.getImg(), 2));
        double r = 0;
        double i = 0;

        if (den != 0) 
        {
            r = ((nc1.getReal() * nc2.getReal()) + (nc1.getImg() * nc2.getImg())) / den;
            i = ((nc1.getImg() * nc2.getReal()) - (nc1.getReal() * nc2.getImg())) / den;
        }

        return new NumeroComplejo(r, i);
    }
}
