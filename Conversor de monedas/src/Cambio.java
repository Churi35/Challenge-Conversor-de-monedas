public class Cambio
{
    public static void calcularCambio(String divisaBase, String divisaAConvertir, double tasaDeCambio, double valor)
    {
        System.out.println("El valor " + valor + " [" + divisaBase + "] corresponde al valor final de => " + (tasaDeCambio * valor) + "[" + divisaAConvertir
                + "] (1 " + divisaBase + " equivale a " + tasaDeCambio + " " + divisaAConvertir + " )");
    }
}
