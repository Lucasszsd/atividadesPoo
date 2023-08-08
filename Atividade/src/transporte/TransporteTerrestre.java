package transporte;

import transporte.Transportadora;

public class TransporteTerrestre extends Transportadora {

    @Override
    public double calcularFrete(int altura, int largura) {
        double i = (double) ((altura / largura) * 0.2);
        return i;
    }
}
