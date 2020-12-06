package interfaces;

import constants.Tipo;

public interface Tributavel {
    double getValorImposto();

    String getTitula();

    Tipo getTipo();
}
