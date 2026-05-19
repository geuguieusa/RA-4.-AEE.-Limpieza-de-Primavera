# RefactorizacionLegacy

## Cambios realizados

### Renombrado de variables
| Original | Refactorizado |
|----------|--------------|
| `cT` | `calcularTotal` |
| `m` | `importeBase` |
| `tC` | `tipoCliente` |
| `dV` | `esSocioVip` |

### Constantes extraídas
Se eliminaron los números mágicos creando constantes `private static final`:
- `DESCUENTO_VIP_EXTRA = 0.25`
- `DESCUENTO_VIP_ESTANDAR = 0.15`
- `DESCUENTO_ESTANDAR = 0.05`

### Cláusulas de guarda
Se eliminaron todos los bloques `else` usando retornos tempranos,
reduciendo la complejidad ciclomática de 6 a 1 nivel de anidamiento.

### Documentación
Se añadió JavaDoc completo con `@param` y `@return`.

## Tests
Los 5 tests unitarios de `FacturacionLegacyTest.java` pasan en verde
sin ninguna modificación.