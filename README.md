# Laboratorios de Programación Orientada a Objetos — Java

**Aprendiz:** Heidy Moncada  
**Programa:** Introducción a la Programación Orientada a Objetos  
**Fecha de última actualización:** 15 de octubre de 2026  
**Repositorio:** https://github.com/moncadaheidy389-pixel/Laboratorio-04-

---

## 📂 Estructura del Repositorio

├── MiBilletera.Java/ ← Billetera 2.0 — Colecciones y Excepciones
│ ├── Movimiento.java
│ ├── Billetera.java
│ └── Main.java
├── practica-4-1/ → Arreglos e índices
├── practica-4-2/ → List, ArrayList y listas de objetos
├── practica-4-3/ → Set, HashSet, Map y HashMap
├── practica-4-4/ → Manejo de excepciones (try/catch)



---

## 📋 Resumen de los Cuatro Laboratorios

### Laboratorio 01 — Fundamentos de Programación
**Temas:** Variables, tipos de datos, entrada/salida, estructuras de control y ciclos.

- ✅ Declaración y uso de variables (`int`, `double`, `String`)
- ✅ Lectura de datos por teclado con `Scanner`
- ✅ Estructuras condicionales: `if`, `else if`, `switch`
- ✅ Estructuras repetitivas: `for`, `while`, `do-while`
- ✅ Programación modular con métodos

**Estado:** ✅ Completado y funcional

---

### Laboratorio 02 — Enfoque Procedural
**Temas:** Lógica de negocio centralizada, menú interactivo, arreglos simples.

- ✅ Registro de ingresos y gastos
- ✅ Cálculo de saldo y saldo promedio
- ✅ Conteo de operaciones y filtrado
- ✅ Historial mediante arreglos de tamaño fijo
- ✅ Menú en bucle con validación de opciones

**Estado:** ✅ Completado y funcional

---

### Laboratorio 03 — Transición a Orientación a Objetos
**Temas:** Clases, encapsulamiento, independencia de objetos, validaciones.

- ✅ Clases: `Movimiento`, `Billetera`, `Main`, `PruebaBilleteras`
- ✅ Atributos `private` con acceso mediante métodos `get...()`
- ✅ Constructor para inicializar estados consistentes
- ✅ Validaciones de monto y saldo disponible
- ✅ Contadores y acumulados de operaciones
- ✅ Demostración: dos billeteras con estados independientes

**Estado:** ✅ Completado y funcional

---

### Laboratorio 04 — Colecciones y Manejo de Errores ✅
**Temas:** Estructuras dinámicas, agrupación de datos, control de excepciones.

#### 📊 Colecciones Implementadas
| Estructura | Uso | Propósito |
|---|---|---|
| `ArrayList<Movimiento>` | Historial de operaciones | Crece dinámicamente, conserva orden de registro |
| `HashSet<String>` | Categorías utilizadas | Evita duplicados automáticamente |
| `HashMap<String, Double>` | Gastos por categoría | Agrupa y suma valores por clave |

#### 🛡️ Manejo de Excepciones
- ✅ `try/catch` para entradas no numéricas → el programa no se detiene
- ✅ Validación de montos: finitos y mayores a cero
- ✅ Validación de categorías: no vacías ni nulas
- ✅ Control de saldo antes de registrar un gasto
- ✅ Mensajes claros y retorno al menú principal

#### 🧩 Clases Actualizadas
| Clase | Mejoras |
|---|---|
| `Movimiento` | Atributos `final`, validaciones en constructor |
| `Billetera` | Historial dinámico, reportes con `Set` y `Map` |
| `Main` | Entradas protegidas, menú con 7 opciones |

**Estado:** ✅ Completado y funcional

---

## 🚀 Instrucciones de Ejecución

### Billetera 2.0 (Laboratorio 04)
```bash
# Entrar a la carpeta
cd MiBilletera.Java

# Compilar todos los archivos
javac *.java

# Ejecutar la aplicación
java Main

feat: inicializar repositorio con estructura de prácticas
feat: agregar clase Movimiento con atributos y constructor
feat: implementar Billetera con ArrayList para historial
feat: incorporar HashSet para categorías únicas
feat: agregar HashMap para gastos por categoría
feat: implementar try/catch en entradas del menú
feat: menú completo con reportes financieros
docs: agregar README con resumen de los 4 laboratorios