import transporte.TransporteNautico;
import transporte.TransporteTerrestre;

public class Main {
    public static void main(String[] args) {
        int altura = 10;
        int largura = 10;
        double resultadoTerrestre, resultadoNautico;

        TransporteTerrestre terrestre = new TransporteTerrestre();
        TransporteNautico nautico = new TransporteNautico();

        resultadoTerrestre = terrestre.calcularFrete(altura,largura);
        resultadoNautico = nautico.calcularFrete(altura,largura);

        System.out.println(resultadoTerrestre);
        System.out.println(resultadoNautico);
    }
}
