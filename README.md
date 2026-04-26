# Android Testing

Dentro de una vista ya diseñada por Raimón y un ViewModel al cual le falta componentes, conectamos
las funciones del view model a la vista encargadas de camnbiar los estados de dichos componentes.

No obstante el ViewModel carecía de algunas funcionalidades y LiveData's por lo que ha sido necesario
añadirlo para que entonces si que funcione todo correctamente.a

---

# Arquitectura del proyecto

El proyecto se estructura con la arquitectura MVVM, típica en este tipo de proyectos. 

Disponemos del ViewModel, encargado de contenter y ejecutar las funciones de la aplicación.
La vista, encargada de contener los componentes y mostrarlos por pantalla.
Los tests, encargados de probar tanto la lógica de la aplicación desde una parte visual (Instrumental Testing) y 
desde una parte lógica (Unit Testing).
La Main Activity, al solo tener una vista, no destaca su importancia en el proyecto.

---

# Vista principal

<img width="584" height="1292" alt="PHOTO-2026-04-26-12-46-55" src="https://github.com/user-attachments/assets/2c2bf3b4-db82-4f1e-93d8-4f5d0e0de56e" />

En esta vista se pueden observar los distintos elementos de la vista: El tristate, los checkboxes, los radiobuttons...

Su estado puede cambiar apartir de lo implementado tanto en la vista como en el ViewModel.

---

# Resultados Unit Testing

<img width="1506" height="1104" alt="PHOTO-2026-04-26-12-34-30" src="https://github.com/user-attachments/assets/02dc333b-f753-44d2-8dbb-8ff5885e255d" />

<img width="482" height="54" alt="PHOTO-2026-04-26-12-34-40" src="https://github.com/user-attachments/assets/823bc15e-baca-46e0-94fb-f49ab58fcb36" />

Ejecutamos todos los tests desde el background de la aplicación usando los tipo Unit Testing, donde mediante la puesta de escenarios
concretos nos aseguramos que los valores de los estados sean unos determinados.

---

# Resultados Instrumental Testing

<img width="1600" height="740" alt="PHOTO-2026-04-26-13-19-13" src="https://github.com/user-attachments/assets/452c86e4-522f-4ff0-b228-c54f94312de0" />

https://github.com/user-attachments/assets/12328ae0-ae4c-4a06-a1b8-201d0fd3a67b

Por último, ejecutamos tests relacionados con la parte gráfica donde la máquina de manera automática pincha los distintos elementos de la página mientras
se asegura de que muestra un cambio de valor correcto. En este caso seleccionamos una opcion distinta en el tristate, seleccionamos todos los checkboxes etc.

Recordar que cada vez que ejecutamos un nuevo test limpiamos la ejecución del anterior para que no haya ningún tipo de interferencia en la prueba.




