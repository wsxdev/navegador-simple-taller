# SIMULADOR DE NAVEGADOR WEB EN CONSOLA

Proyecto Java sencillo realizado en clase de TI

## Resumen

Este proyecto contiene una aplicación Java mínima con la siguiente estructura de paquetes:

- `com.dev.app.App` — Clase principal (entry point).
- `com.dev.pagina.PaginaWeb` — Clase auxiliar relacionada con páginas web.

El repositorio incluye un `pom.xml` (proyecto Maven)

## Requisitos previos

- Java JDK 8, 11, 17 o superior (según el `pom.xml` del proyecto).
- Maven (3.x) instalado y en el PATH.

Comprueba las versiones con:

```bash
java -version
mvn -v
```

## Cómo compilar

Desde la raíz del proyecto (donde está `pom.xml`) ejecuta:

```bash
mvn clean package
```

Esto compilará el código y generará clases en `target/classes`.

## Cómo ejecutar

Opciones comunes para ejecutar la aplicación:

1) Ejecutar con Maven:

```bash
mvn exec:java -Dexec.mainClass="com.dev.app.App"
```

2) Ejecutar la clase principal directamente desde clases compiladas:

```bash
java -cp target/classes com.dev.app.App
```

## Archivos importantes

- `pom.xml` — configuración del proyecto Maven y dependencias.
- `src/main/java/com/dev/app/App.java` — punto de entrada.
- `src/main/java/com/dev/pagina/PaginaWeb.java` — clase relacionada con páginas.
- `.gitignore` — reglas para ignorar archivos generados.

## Desarrollo

Para contribuir al proyecto:

1. Clona el repositorio
2. Crea una rama para tus cambios
3. Realiza los cambios y pruebas necesarias
4. Envía un pull request

## Notas

- La clase principal es `com.dev.app.App`
- El proyecto utiliza Maven para gestión de dependencias y construcción
- Se incluye un `.gitignore` configurado para Java/Maven