# ☕ Fundamentos de POO en Java (Programación Orientada a Objetos)

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![OOP](https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge)](https://es.wikipedia.org/wiki/Programaci%C3%B3n_orientada_a_objetos)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

> Proyecto práctico enfocado en los principios cardinales de la **Programación Orientada a Objetos (POO)** en Java: modelado de clases, instanciación en memoria Heap, constructores sobrecargados (\	his\), encapsulamiento y modularidad por paquetes.

---

## 🏗️ Estructura del Proyecto

\\\	ext
JavaPoo/
├── src/
│   ├── Persona.java                     # Modelado básico: atributos de instancia, métodos y main
│   ├── aritmetica/
│   │   └── Aritmetica.java             # Clase modular: sobrecarga de constructores (vacío y con parámetros)
│   └── prueba/
│       └── PruebaAritmetica.java        # Punto de entrada y prueba de integración entre paquetes
└── Objetos.iml
\\\

---

## 🧩 Conceptos Clave Implementados

### 1. Clases, Atributos e Instanciación (\Persona.java\)
- **Estado y Comportamiento:** Definición de campos de instancia (\
ombre\, \pellido\) y métodos de acceso (\mostrarPersona()\).
- **Inferencia de Tipos:** Uso de \ar\ (introducido en Java 10) para la creación ágil de instancias en memoria.

### 2. Constructores y Sobrecarga (\Aritmetica.java\)
- **Constructor por defecto:** Permite instanciación vacía para inicialización tardía.
- **Constructor con parámetros:** Inicialización inmediata mediante la palabra clave \	his\ para diferenciar atributos de clase vs parámetros locales.
- **Operaciones:** Encapsulación de lógica matemática (\sumar()\, \estar()\).

### 3. Modularidad y Paquetes (\PruebaAritmetica.java\)
- **Separación de responsabilidades:** División lógica entre la capa de utilidades/dominio (\ritmetica\) y la capa de ejecución/test (\prueba\).
- Importación explícita de componentes entre namespaces de Java.

---

## 🚀 Compilación y Ejecución (CLI)

Desde la raíz del proyecto:

1. **Compilar todos los archivos fuente:**
   \\\ash
   javac -d bin src/Persona.java src/aritmetica/Aritmetica.java src/prueba/PruebaAritmetica.java
   \\\

2. **Ejecutar el ejemplo de Persona:**
   \\\ash
   java -cp bin Persona
   \\\

3. **Ejecutar el ejemplo de Aritmética:**
   \\\ash
   java -cp bin prueba.PruebaAritmetica
   \\\

---

## 👨‍💻 Autor
Desarrollado por **[Saúl Alexander Martínez (Luaz)](https://github.com/Luaz2021)** — Estudiante de DAM en la Universidad Europea.