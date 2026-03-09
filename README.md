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

  ## NAVEGACION 


  
  <img width="354" height="784" alt="image" src="https://github.com/user-attachments/assets/09e0bb31-5242-4103-ad90-92e4f10e5504" />



## Campos
 
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


## BOTONOES 


1.- 

<img width="347" height="775" alt="image" src="https://github.com/user-attachments/assets/1ed05650-01cf-4b46-8547-3b2d0734abb7" />

<img width="376" height="795" alt="image" src="https://github.com/user-attachments/assets/fccd55ed-0de2-42d3-9b2a-4d5d7db52bd8" />

<img width="366" height="763" alt="image" src="https://github.com/user-attachments/assets/fa1fb06c-c2f7-4f48-a524-28286f504178" />

<img width="399" height="767" alt="image" src="https://github.com/user-attachments/assets/9e0f3580-6e26-4e90-af24-c890067f44ac" />

<img width="357" height="774" alt="image" src="https://github.com/user-attachments/assets/ea845181-b503-4cf9-9a02-d01fd9696d43" />


## SELECCION 

<img width="396" height="779" alt="image" src="https://github.com/user-attachments/assets/beca779b-9742-4725-812b-2476e566b30a" />

<img width="379" height="757" alt="image" src="https://github.com/user-attachments/assets/0aa294a1-3810-4378-addd-32c0d3c530c4" />
<img width="375" height="765" alt="image" src="https://github.com/user-attachments/assets/1276e7ac-d0d3-4927-8a5f-58e20e010867" />
<img width="388" height="770" alt="image" src="https://github.com/user-attachments/assets/4fdcbd2d-55f5-48ac-96f6-42d9133ae6b4" />
<img width="379" height="778" alt="image" src="https://github.com/user-attachments/assets/9714c444-39b7-4fd9-b8e3-ede4638dcbdf" />



## LISTAS

<img width="369" height="585" alt="image" src="https://github.com/user-attachments/assets/8aaeaf2f-ac05-4086-8af9-c0525516b091" />
<img width="396" height="557" alt="image" src="https://github.com/user-attachments/assets/24aca808-479c-4079-847d-9ad24da5535e" />
<img width="358" height="660" alt="image" src="https://github.com/user-attachments/assets/cd7b1ea8-b796-4fe0-a623-07c9a07e1df4" />
<img width="403" height="663" alt="image" src="https://github.com/user-attachments/assets/7b457a99-5b07-4a3a-884f-11397939d6a0" />
<img width="414" height="555" alt="image" src="https://github.com/user-attachments/assets/bcf58b1a-1f38-4c33-af9a-9dde668d40dd" />


## INFO

<img width="379" height="496" alt="image" src="https://github.com/user-attachments/assets/90b3bea1-a13c-4fae-a124-761e0afbeb17" />
<img width="393" height="473" alt="image" src="https://github.com/user-attachments/assets/2dd8ffd6-9460-419d-b314-19c007dd58d1" />
<img width="398" height="557" alt="image" src="https://github.com/user-attachments/assets/e1646833-194d-4ca5-a875-4b815ffd6422" />
<img width="396" height="594" alt="image" src="https://github.com/user-attachments/assets/a85b7e60-3e4d-4538-b5b7-363f80c2fd11" />
<img width="426" height="551" alt="image" src="https://github.com/user-attachments/assets/f74d5f52-de26-41bd-ad68-0c514048b26d" />
