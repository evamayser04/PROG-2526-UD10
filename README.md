# 📚 README — Colecciones en Java (1º DAM)

# 🧩 Unidad 10 — Colecciones

---

# 📌 ¿Qué son las colecciones?

Las colecciones son estructuras de datos dinámicas que permiten almacenar varios elementos dentro de un mismo objeto.

En Java forman parte del framework:

```java
java.util
```

Se utilizan porque los arrays tradicionales tienen limitaciones:

| Arrays | Colecciones |
|---|---|
| Tamaño fijo | Tamaño dinámico |
| Menos métodos | Muchos métodos útiles |
| Más incómodos | Más flexibles |

---

# 📌 Framework Collection

Java organiza las colecciones mediante interfaces y clases.

## Esquema básico

```txt
Collection
│
├── List
│   ├── ArrayList
│   └── LinkedList
│
└── Set
    ├── HashSet
    ├── LinkedHashSet
    └── TreeSet
```

Los mapas (`Map`) van aparte.

---

# 📌 Tipos genéricos

Las colecciones usan genéricos para indicar el tipo de dato.

## Sintaxis

```java
Collection<String>
List<Integer>
Set<Cliente>
Map<String, Integer>
```

## Ejemplo

```java
List<String> nombres = new ArrayList<>();
```

Esto significa:

- Lista
- Solo admite String

---

# 📌 Interfaz Collection

Es la interfaz principal.

```java
Collection<E>
```

La `E` significa Element.

---

# 🔹 Métodos básicos de Collection

| Método | Explicación |
|---|---|
| `add()` | Inserta un elemento |
| `remove()` | Elimina |
| `contains()` | Comprueba si existe |
| `size()` | Devuelve tamaño |
| `clear()` | Vacía |
| `isEmpty()` | Comprueba si está vacía |

---

# ✅ Ejemplo básico

```java
Collection<Integer> numeros = new ArrayList<>();

numeros.add(5);
numeros.add(8);

System.out.println(numeros.contains(5));
System.out.println(numeros.size());
```

---

# 📌 Recorrido de colecciones

## For-each

```java
for(Integer n : numeros) {
    System.out.println(n);
}
```

---

# 📌 Iterator

Se usa para recorrer y eliminar elementos de forma segura.

## Ejemplo típico del examen

```java
Iterator<Integer> it = numeros.iterator();

while(it.hasNext()) {

    Integer n = it.next();

    if(n == 5) {
        it.remove();
    }
}
```

---

# 📌 Métodos globales de Collection

Permiten operar con colecciones completas.

| Método | Función |
|---|---|
| `addAll()` | Añade otra colección |
| `removeAll()` | Elimina coincidencias |
| `retainAll()` | Mantiene coincidencias |
| `containsAll()` | Comprueba si contiene todos |

---

# ✅ Ejemplo removeAll()

```java
Collection<Integer> lista1 =
new ArrayList<>();

lista1.add(1);
lista1.add(2);
lista1.add(3);

Collection<Integer> lista2 =
new ArrayList<>();

lista2.add(2);

lista1.removeAll(lista2);

System.out.println(lista1);
```

Resultado:

```txt
[1, 3]
```

---

# 📌 Conversión colección ↔ array

---

# 🔹 Colección → Array

```java
Integer[] tabla =
coleccion.toArray(new Integer[0]);
```

---

# 🔹 Array → Colección

```java
List<Integer> lista =
new ArrayList<>(
Arrays.asList(tabla)
);
```

⚠️ Importante:

```java
Arrays.asList()
```

devuelve una lista fija.

Por eso normalmente hacemos:

```java
new ArrayList<>(Arrays.asList(tabla))
```

---

# 📌 Interfaz List

`List` hereda de `Collection`.

Características:

✅ Mantiene orden  
✅ Permite repetidos  
✅ Tiene índices

---

# 📌 ArrayList

Es la implementación más usada.

## Declaración correcta

```java
List<String> nombres =
new ArrayList<>();
```

⚠️ Se recomienda usar:

- Interfaz a la izquierda
- Implementación a la derecha

---

# 📌 Métodos importantes de List

| Método | Función |
|---|---|
| `add(indice, dato)` | Inserta |
| `get(indice)` | Obtiene |
| `set(indice, dato)` | Sustituye |
| `remove(indice)` | Elimina |
| `indexOf()` | Primera aparición |
| `lastIndexOf()` | Última aparición |

---

# ✅ Ejemplo List

```java
List<String> lista =
new ArrayList<>();

lista.add("Ana");
lista.add("Luis");

lista.add(1, "Marta");

System.out.println(lista);

String nombre = lista.get(2);

System.out.println(nombre);
```

---

# 📌 Problema típico con remove()

Muy importante para examen.

## Esto:

```java
numeros.remove(2);
```

NO elimina el número 2.

Elimina el elemento del índice 2.

---

# ✅ Forma correcta

```java
numeros.remove(Integer.valueOf(2));
```

---

# 📌 Comparación de listas

## equals()

Dos listas son iguales SOLO si:

- Tienen mismos elementos
- En el mismo orden

---

# ✅ Ejemplo

```java
List<String> a =
Arrays.asList("Ana", "Luis");

List<String> b =
Arrays.asList("Luis", "Ana");

System.out.println(a.equals(b));
```

Resultado:

```txt
false
```

---

# 📌 Ordenación de listas

## Orden natural

```java
lista.sort(null);
```

---

# 🔹 Orden inverso

```java
lista.sort(
Comparator.reverseOrder()
);
```

---

# 📌 Interfaz Set

`Set` representa conjuntos matemáticos.

Características:

❌ No admite duplicados  
❌ No tiene índices

---

# 📌 ¿Cómo detecta duplicados?

Usa:

```java
equals()
hashCode()
```

---

# ⚠️ MUY IMPORTANTE

Si sobrescribes:

```java
equals()
```

también debes sobrescribir:

```java
hashCode()
```

---

# 📌 HashSet

## Características

✅ Muy rápido  
❌ No mantiene orden

---

# ✅ Ejemplo

```java
Set<Integer> numeros =
new HashSet<>();

numeros.add(5);
numeros.add(5);

System.out.println(numeros);
```

Resultado:

```txt
[5]
```

---

# 📌 LinkedHashSet

## Características

✅ Mantiene orden de inserción

---

# 📌 TreeSet

## Características

✅ Orden automático  
✅ Orden natural

---

# ✅ Ejemplo

```java
Set<Integer> arbol =
new TreeSet<>();

arbol.add(8);
arbol.add(1);
arbol.add(5);

System.out.println(arbol);
```

Resultado:

```txt
[1, 5, 8]
```

---

# 📌 Comparable

Permite definir el orden natural de una clase.

## Ejemplo

```java
public class Cliente
implements Comparable<Cliente>
```

---

# 🔹 Método obligatorio

```java
@Override
public int compareTo(Cliente otro) {

    return dni.compareTo(otro.dni);
}
```

---

# 📌 Conversión List ↔ Set

Muy usada para eliminar repetidos.

---

# 🔹 Lista → Set

```java
List<Integer> lista =
Arrays.asList(1,1,2,3);

Set<Integer> sinRepes =
new HashSet<>(lista);
```

---

# 🔹 Set → Lista

```java
List<Integer> limpia =
new ArrayList<>(sinRepes);
```

---

# 📌 Map

Los mapas guardan parejas:

```txt
Clave → Valor
```

Ejemplo:

```txt
"DNI" → Cliente
```

---

# 📌 Características de Map

✅ Claves únicas  
✅ Valores repetidos permitidos  
❌ No hereda de Collection

---

# 📌 Implementaciones

| Clase | Característica |
|---|---|
| `HashMap` | Más rápido |
| `LinkedHashMap` | Mantiene orden |
| `TreeMap` | Ordena claves |

---

# 📌 Métodos importantes de Map

| Método | Función |
|---|---|
| `put()` | Inserta |
| `get()` | Obtiene valor |
| `remove()` | Elimina |
| `containsKey()` | Busca clave |
| `containsValue()` | Busca valor |

---

# ✅ Ejemplo Map

```java
Map<String, Integer> edades =
new HashMap<>();

edades.put("Ana", 20);
edades.put("Luis", 25);

System.out.println(
edades.get("Ana")
);
```

---

# 📌 Recorrer un Map

## Con keySet()

```java
for(String clave : mapa.keySet()) {

    System.out.println(
        clave + " -> "
        + mapa.get(clave)
    );
}
```

---

# 📌 Clase Collections

⚠️ No confundir:

| Nombre | Tipo |
|---|---|
| `Collection` | Interfaz |
| `Collections` | Clase utilitaria |

---

# 📌 Métodos importantes

| Método | Función |
|---|---|
| `sort()` | Ordena |
| `binarySearch()` | Búsqueda rápida |
| `reverse()` | Invierte |
| `shuffle()` | Mezcla |
| `swap()` | Intercambia |
| `max()` | Máximo |
| `min()` | Mínimo |
| `frequency()` | Cuenta repeticiones |

---

# ✅ Ejemplo Collections

```java
List<Integer> numeros =
new ArrayList<>();

numeros.add(50);
numeros.add(10);
numeros.add(30);

Collections.sort(numeros);

System.out.println(numeros);
```

Resultado:

```txt
[10, 30, 50]
```

---

# 📌 binarySearch()

⚠️ La lista debe estar ordenada.

```java
int pos =
Collections.binarySearch(
lista,
30
);
```

---

# 📌 frequency()

Cuenta cuántas veces aparece un elemento.

```java
int veces =
Collections.frequency(lista, 5);
```

---

# 📌 Resumen general

| Estructura | Duplicados | Orden | Índices |
|---|---|---|---|
| List | ✅ | ✅ | ✅ |
| Set | ❌ | Depende | ❌ |
| Map | Claves ❌ | Depende | ❌ |

---

# 📌 Cuándo usar cada una

| Situación | Estructura |
|---|---|
| Necesito índices | List |
| No quiero repetidos | Set |
| Quiero pares clave-valor | Map |
| Quiero rapidez | HashSet / HashMap |
| Quiero orden automático | TreeSet / TreeMap |

---

# 📚 Importaciones más usadas

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
```

---

# 👨‍💻 1º DAM — Programación

## Eva Katherine Mayser Vanea
