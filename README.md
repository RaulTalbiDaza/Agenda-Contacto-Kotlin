# UD01_Actividad07_AgendaContactos

Aplicación de consola en Kotlin para gestionar una agenda básica de contactos usando una `MutableList`.

Actividad 07 de la UD01 (Introducción) del módulo **PMDM** (ILERNA).

## Descripción

El programa muestra un menú interactivo que se repite hasta que el usuario elige salir. Los contactos se guardan en memoria (una `MutableList<Contacto>`), por lo que **se pierden al cerrar el programa**.

## Funcionalidades

1. **Añadir contacto**: pide nombre, teléfono y correo electrónico, y lo guarda en la agenda.
2. **Listar contactos**: muestra los contactos numerados (`1. Nombre - Teléfono - Email`).
3. **Buscar contacto**: busca por nombre, de forma total o parcial y sin distinguir mayúsculas.
4. **Eliminar contacto**: muestra la lista y elimina por número de posición.
5. **Salir**: termina el programa.

## Validaciones

- Opciones de menú no válidas.
- Agenda vacía al listar, buscar o eliminar.
- Campos obligatorios vacíos.
- Teléfono con formato válido (9 dígitos que empiezan por 6, 7, 8 o 9).
- Correo electrónico con formato válido.
- Eliminación de posiciones inexistentes o entradas no numéricas.
- Búsquedas sin resultados.

## Estructura del proyecto

```
UD01_Actividad07_AgendaContactos/
├── src/main/kotlin/
│   ├── Main.kt       # Menú principal
│   ├── Contacto.kt   # data class Contacto(nombre, telefono, email)
|   └── Logica.kt     # Funciones de cada opción
└── README.md
```

> Ajusta las rutas si tu IntelliJ ha generado otra estructura.

## Requisitos

- IntelliJ IDEA
- JDK instalado (versión compatible con tu proyecto)
- Kotlin

## Cómo ejecutarlo

1. Clona el repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```
2. Abre la carpeta del proyecto en IntelliJ IDEA.
3. Abre `Main.kt` y pulsa el botón verde de **Run** junto a `fun main()`.
4. Usa el menú escribiendo el número de la opción en la consola.

## Ejemplo de uso

```
===== AGENDA DE CONTACTOS =====
1. Añadir contacto
2. Listar contactos
3. Buscar contacto
4. Eliminar contacto
5. Salir

Selecciona una opción
```

## Autor

Raul Talbi Daza
