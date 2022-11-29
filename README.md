# Instrucciones. 
El siguiente proyecto, se utilizará para conectar un dispositivo IoT, a una base de datos en la nube, en donde un dispositivo Móvil, sea capaz de actualizar el estado. 
![imagen](https://user-images.githubusercontent.com/109394677/204330793-b50e9603-a891-48df-b4ad-13763f6fbdc1.png)


Las pantallas de Android, serán las siguientes: 

# Pantalla Login
El activity Login, constará de dos botones: 
Username
Password

Además, contendrá 3 botones, como indica la siguiente figura: 
![imagen](https://user-images.githubusercontent.com/109394677/204332608-3c50dcf6-1002-4b5e-b99c-71e149764ca1.png)

La caja de usuario, permitirá solamente escribir textos en formato email. 
La caja de contraseña, permitirá ingresar formato clave, con mínimo 8 caracteres. 

Al presionar INGRESAR, deberá validar el usuario / clave, por medio de Firebase
![imagen](https://user-images.githubusercontent.com/109394677/204334014-0c9c59c9-9bf3-493b-90fc-e1cccc264029.png)


Al presionar Login con google, deberá validar por medio del servicio de Firebase, como indica la siguiente imagen: 

![imagen](https://user-images.githubusercontent.com/109394677/204334427-8d31b561-3697-4114-8357-c481645d89b0.png)


Si el usuario es validado, mostrará la siguiente pantalla. 

![imagen](https://user-images.githubusercontent.com/109394677/204335374-0c4ce28a-9412-4000-8b9d-0eda486e4922.png)


En donde los valores (rango) de semáforo (ROJO/AMARILLO/VERDE), deberá ser configurados, por medio de ...
Dichos valores, serán leídos desde Firebase. 

## Agregar un nuevo dispositivo. 
Al presionar el botón Flotante, podrá agregarse un nuevo dispositivo. 
