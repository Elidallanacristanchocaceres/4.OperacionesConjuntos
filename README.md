# Operaciones con Conjuntos en Java

Este proyecto permite realizar operaciones básicas de teoría de conjuntos en Java. El programa solicita al usuario ingresar dos conjuntos de números y luego calcula la unión, intersección y diferencia entre ellos.

### 🚀 Funcionalidades

- Ingreso de dos conjuntos de números enteros desde la consola.

- Cálculo de la unión, intersección y diferencia de los conjuntos.

- Manejo de entradas inválidas para evitar errores en la ejecución.

### 🛠 Tecnologías utilizadas

- Java

- Colecciones (Set, HashSet)

- Entrada de datos con Scanner

### 📌 Uso

- Ejecuta el programa en un entorno compatible con Java.

- Ingresa los números del primer conjunto (escribiendo fin para finalizar la entrada).

- Ingresa los números del segundo conjunto (también finalizando con fin).

- El programa mostrará los resultados de la unión, intersección y diferencia de los conjuntos.

### 📂 Estructura del Código
````bash
Set<Integer> conjunto1 = new HashSet<>();
Set<Integer> conjunto2 = new HashSet<>();
````
Se utilizan HashSet para almacenar los elementos sin permitir duplicados.
````bash
Set<Integer> union = new HashSet<>(conjunto1);
union.addAll(conjunto2);
````
Unión: Combina los elementos de ambos conjuntos.
````bash
Set<Integer> interseccion = new HashSet<>(conjunto1);
interseccion.retainAll(conjunto2);
````

Intersección: Encuentra los elementos comunes entre ambos conjuntos.
````bash
Set<Integer> diferencia = new HashSet<>(conjunto1);
diferencia.removeAll(conjunto2);
````
Diferencia: Muestra los elementos del primer conjunto que no están en el segundo.

### 📝 Notas

- Se deben ingresar solo números enteros.

- Para finalizar la entrada de un conjunto, se debe escribir fin.
