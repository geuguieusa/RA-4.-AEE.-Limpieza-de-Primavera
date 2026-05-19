/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {

    private static final double DESCUENTO_VIP_EXTRA    = 0.25;
    private static final double DESCUENTO_VIP_ESTANDAR = 0.15;
    private static final double DESCUENTO_ESTANDAR     = 0.05;

    /**
     * Calcula el importe final de una transacción aplicando el descuento
     * correspondiente según la categoría del cliente.
     *
     * @param importeBase  Importe bruto de la transacción. Si es cero o
     *                     negativo, devuelve 0.
     * @param tipoCliente  Categoría del cliente: 1 = VIP, 2 = Estándar,
     *                     cualquier otro valor = sin descuento.
     * @param esSocioVip   Si es true y el cliente es VIP, se aplica el
     *                     descuento máximo del 25%.
     * @return             Importe final tras aplicar el descuento, o 0 si
     *                     el importe base no es válido.
     */
    public double calcularTotal(double importeBase,
                                int tipoCliente,
                                boolean esSocioVip) {

        if (importeBase <= 0) return 0;

        if (tipoCliente == 1 && esSocioVip)
            return importeBase - (importeBase * DESCUENTO_VIP_EXTRA);

        if (tipoCliente == 1)
            return importeBase - (importeBase * DESCUENTO_VIP_ESTANDAR);

        if (tipoCliente == 2)
            return importeBase - (importeBase * DESCUENTO_ESTANDAR);

        return importeBase;
    }
}