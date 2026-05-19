package facturacion;

public class FacturacionLegacy {
/*
 * Calcula el importe final aplicando el descuento según el tipo de cliente.
 *
 * @param importeBase  Importe bruto. Si es cero o negativo devuelve 0.
 * @param tipoCliente  1 = VIP, 2 = Estándar, otro = sin descuento.
 * @param esSocioVip   Si true y cliente VIP, aplica descuento máximo.
 * @return             Importe final tras aplicar el descuento.
 */

  public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {

    if (importeBase <= 0) return 0;

    if (tipoCliente == 1 && esSocioVip)
        return importeBase - (importeBase * DESCUENTO_VIP_EXTRA);

    if (tipoCliente == 1)
        return importeBase - (importeBase * DESCUENTO_VIP_ESTANDAR);

    if (tipoCliente == 2)
        return importeBase - (importeBase * DESCUENTO_ESTANDAR);

    return importeBase;
}    private static final double DESCUENTO_ESTANDAR = 0.05;
    private static final double DESCUENTO_VIP_ESTANDAR = 0.15;
    private static final double DESCUENTO_VIP_EXTRA = 0.25;
}