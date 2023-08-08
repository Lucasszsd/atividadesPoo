package transporte;

import transporte.Transportadora;

public class TransporteNautico extends Transportadora {


    @Override
    public double calcularFrete(int altura, int largura) {
        double i = (double) ((altura / largura) * 0.1);
        return i;
    }
}
