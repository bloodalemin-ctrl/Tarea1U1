# PROYECTO: CATÁLOGO DE INTERFACES DE USUARIO 

**Estudiante:** Alejandra Benitez Leonardo
**Institución:** Escuela Superior de Cómputo (ESCOM) - IPN
**Materia:** Desarrollo de aplicaciones moviles nativas
**Grupo:** 7CV3

---

## DESCRIPCIÓN DE LA APP
Esta aplicación es un catálogo interactivo desarrollado en **Android Studio** utilizando el lenguaje **Kotlin**. El proyecto tiene como objetivo demostrar el dominio de los **Fragments** para la creación de interfaces modulares y dinámicas. Se implementó una arquitectura basada en **clases base** para optimizar la reutilización de código y facilitar el manejo de un volumen considerable de pantallas.

La aplicación organiza un total de **25 fragmentos** divididos en **5 categorías** fundamentales:

1. **Entradas (EditText):** Configuración de distintos tipos de entrada como texto simple, contraseña, email, teléfono y multilínea.
2. **Botones:** Diversos estilos de botones para acciones como aceptar, eliminar, enviar, registrar y salir.
3. **Selección:** Implementación de componentes **CheckBox** para la gestión de preferencias del usuario.
4. **Listas:** Uso de **ListView** para la visualización de conjuntos de datos organizados (frutas, países, lenguajes, etc.).
5. **Información:** Manejo de recursos gráficos e iconos para la presentación de datos estáticos.

---

## INSTRUCCIONES DE USO
1. **Menú Principal:** Al iniciar, la app presenta cinco botones que dan acceso a cada categoría del catálogo.
2. **Navegación por Pestañas:** Dentro de cada categoría, se utiliza un sistema de pestañas (**TabLayout**) en la parte superior.
3. **Exploración:** El usuario puede navegar entre los 5 ejemplos de cada categoría tocando la pestaña correspondiente.
4. **Interacción:** * En **Botones** y **Selección**, al interactuar con los elementos, el sistema muestra una notificación tipo **Toast**.
    * En **Entradas**, se pueden probar los diferentes tipos de teclado optimizados.
5. **Retorno:** Utilice el botón de retroceso del dispositivo para volver al menú principal y cambiar de categoría.

---

## DETALLES DE IMPLEMENTACIÓN
* **Herencia de Clases:** Se definieron clases `open` (moldes) para el comportamiento común de los fragmentos, reduciendo drásticamente la redundancia de código.
* **Gestión de Fragments:** La navegación se controla mediante transacciones de `FragmentManager` disparadas por eventos del `TabLayout`.
* **Diseño Adaptable:** Se utilizó `ConstraintLayout` para asegurar que los componentes se ajusten correctamente a distintos tamaños de pantalla.

## INSTALACIÓN Y CONFIGURACIÓN

Para ejecutar este proyecto de manera local, siga estos pasos:

1. **Descarga del Proyecto:** Clone el repositorio o descargue el archivo .zip del proyecto y extráigalo en su computadora.
2. **Importación:** Abra **Android Studio** y seleccione la opción **"Open"**. Busque la carpeta del proyecto y espere a que **Gradle** sincronice todas las dependencias y librerías necesarias.
3. **Configuración del Emulador:** Se recomienda utilizar un dispositivo virtual (AVD) con **API 33** o superior (Medium Phone) para asegurar la compatibilidad de los componentes visuales.
4. **Ejecución:** Una vez finalizada la carga, presione el botón **"Run"** (flecha verde) en la barra superior. Si el emulador presenta pantalla negra, realice un **"Wipe Data"** desde el Device Manager y reinicie el proceso.



## CAPTURAS DE PANTALLA

<details>
  <summary>Clic aquí para desplegar las capturas del proyecto</summary>


  <img width="354" height="784" alt="image" src="https://github.com/user-attachments/assets/09e0bb31-5242-4103-ad90-92e4f10e5504" />



Texto
 Campos
 
 Nombre
  <img width="373" height="776" alt="image" src="https://github.com/user-attachments/assets/932609ba-8c50-4569-bc53-2ff9513dddd2" />
Contrasenia

<img width="385" height="791" alt="image" src="https://github.com/user-attachments/assets/a7ed6a67-7965-460c-9bc7-a086bc2665c1" />

Correo

<img width="369" height="776" alt="image" src="https://github.com/user-attachments/assets/107c755a-523a-433f-b9a1-d13af4cb8550" />

Celular

<img width="355" height="773" alt="image" src="https://github.com/user-attachments/assets/a5285cbf-82ad-40b6-bade-656c5460db19" />

Comentarios

<img width="367" height="797" alt="image" src="https://github.com/user-attachments/assets/709a1627-8f0b-4421-982d-3f15f8055d09" />

