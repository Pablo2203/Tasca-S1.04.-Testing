# Tarea S1.04 - Testing

---

## 📄 Descripción - Enunciado del ejercicio

Este ejercicio tiene como objetivo practicar el desarrollo de pruebas unitarias en Java utilizando las bibliotecas **JUnit** y **AssertJ**, así como introducir el enfoque de **TDD** (Desarrollo Dirigido por Pruebas).  

El proyecto está compuesto por distintos ejercicios:  
1. Crear y gestionar una colección de libros en una biblioteca.  
2. Implementar un cálculo para determinar la letra de un DNI.  
3. Generar y probar una excepción específica.  
4. Utilizar AssertJ para realizar validaciones avanzadas.  
5. Aplicar TDD para una clase `Calculadora` que permita operaciones básicas.  

El ejercicio se enfoca en cumplir normas de buenas prácticas siguiendo las reglas establecidas en el Sprint 0 y asegurando que el programa esté escrito en inglés.

---

## 💻 Tecnologías Utilizadas

Este proyecto utiliza las siguientes tecnologías y herramientas:

- **Java 17**  
- **Maven** (como gestor de dependencias y compilación)  
- **JUnit 5** (para pruebas unitarias)  
- **AssertJ 3.20.2** (para pruebas avanzadas con aserciones)  
- **Git y GitHub** (para control de versiones)  

---

## 📋 Requisitos

Antes de ejecutar este proyecto, asegúrate de cumplir con los siguientes requisitos:

- **Java JDK** 17 instalado.  
- **Maven** (versión 3.8 o superior) instalado.  
- IDE como IntelliJ IDEA o Eclipse para edición y ejecución del código.  
- Conexión a internet para descargar las dependencias necesarias mediante Maven.  

---

## 🛠️ Instalación

Sigue estos pasos para instalar y preparar el proyecto en tu entorno local:

1. Clona este repositorio en tu máquina local:  
   ```bash
   git clone https://github.com/usuario/proyecto-taxco-04-testing.git
   ```

2. Accede al directorio del proyecto:  
   ```bash
   cd proyecto-taxco-04-testing
   ```

3. Descarga las dependencias necesarias:  
   ```bash
   mvn clean install
   ```

4. Abre el proyecto en tu IDE de preferencia, configurándolo como un proyecto Maven.

---

## ▶️ Ejecución

Una vez configurado el entorno, sigue los pasos para ejecutar las pruebas:

### Ejecutar todas las pruebas:
1. Abre tu terminal dentro del proyecto.
2. Ejecuta las pruebas con el siguiente comando:  
   ```bash
   mvn test
   ```
   Esto ejecutará las pruebas de todas las clases desarrolladas (`JUnit` y `AssertJ`).

### Ejecutar una prueba específica:
1. Desde el IDE, busca una clase o método de prueba en el package `src/test/java`.
2. Haz clic derecho y selecciona la opción **Run Test** (Ejecutar prueba).

### Ejecución Manual:
1. Si deseas ejecutar las clases principales manualmente para ver su funcionalidad, navega al package `src/main/java`.
2. Ejecuta las clases correspondientes desde el IDE haciendo clic en el botón **Run**.

---

## 🌐 Despliegue

Este proyecto no requiere despliegue en un entorno de producción, ya que se trata de un ejercicio de prácticas de pruebas unitarias. Sin embargo, sigue las siguientes recomendaciones generales si fuese necesario desplegarlo:

1. Exporta el proyecto como un archivo JAR.  
   ```bash
   mvn clean package
   ```
2. Coloca el archivo JAR generado en el entorno en el que quieras desplegar el proyecto.  
3. Ejecuta el JAR con el comando:  
   ```bash
   java -jar nombre-del-archivo.jar
   ```

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas contribuir, sigue estos pasos:  

1. Realiza un fork del repositorio.  
2. Crea una nueva rama para tu funcionalidad:  
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. Realiza los cambios necesarios y realiza un commit:  
   ```bash
   git commit -m "Añadida nueva funcionalidad"
   ```
4. Empuja tus cambios a tu rama:  
   ```bash
   git push origin feature/nueva-funcionalidad
   ```
5. Abre un Pull Request en el repositorio original y describe los cambios realizados.

---

## 📃 Notas Importantes

- Todos los nombres de clases, métodos y variables deben estar en inglés.  
- Asegúrate de que el código sigue las normas de buenas prácticas descritas en el Sprint 0.  
- Verifica que todas las pruebas pasan exitosamente antes de enviar tu proyecto.  

--- 

## 📂 Ejemplo de Estructura del Proyecto

```plaintext
src/
├── main/
│   └── java/
│       ├── library/          # Gestión de libros
│       ├── dni/              # Cálculo de la letra del DNI
│       ├── exceptions/       # Manejo de excepciones
│       └── calculator/       # Calculadora con TDD
│
└── test/
    └── java/
        ├── library/          # Pruebas para gestión de libros
        ├── dni/              # Pruebas para cálculo del DNI
        ├── exceptions/       # Pruebas para excepciones
        └── calculator/       # Pruebas TDD de la calculadora
```

--- 

**¡Suerte con tu desarrollo! 🚀**
