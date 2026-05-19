# RefactorizacionLegacy

## Cambios realizados

### 1. Renombrado de variables (Refactor → Rename)
| Original | Refactorizado |
|----------|--------------|
| `cT` | `calcularTotal` |
| `m` | `importeBase` |
| `tC` | `tipoCliente` |
| `dV` | `esSocioVip` |

### 2. Constantes extraídas (Refactor → Introduce Constant)
Se eliminaron los números mágicos creando constantes `private static final`:
- `DESCUENTO_VIP_EXTRA = 0.25`
- `DESCUENTO_VIP_ESTANDAR = 0.15`
- `DESCUENTO_ESTANDAR = 0.05`

### 3. Cláusulas de guarda
Se eliminaron todos los bloques `else` usando retornos tempranos,
reduciendo la complejidad ciclomática de 6 niveles a 1.

### 4. Documentación JavaDoc
Se añadió JavaDoc completo con `@param` y `@return` en el método.

## Tests
Los 5 tests de `FacturacionLegacyTest.java` pasan en verde
sin ninguna modificación en el archivo de pruebas.

## Consultas IA
### Consulta 1
**Agente:** Sonet 4.6

**Prompt:** Explícame paso a paso cómo refactorizar FacturacionLegacy.java
en NetBeans aplicando renombrado de variables, extracción de constantes
y cláusulas de guarda sin romper los tests.

**Respuesta:** Guía paso a paso con el orden correcto: primero ejecutar
los tests en verde, luego renombrar con Ctrl+R, extraer constantes con
Introduce Constant, aplicar guard clauses eliminando todos los else,
añadir JavaDoc y hacer commit semántico.