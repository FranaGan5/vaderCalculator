# <p align="center"> :rocket: VADER CALCULATOR :iphone:
## <p align="center">  ¿Qué es?
<p align="justify">Es una aplicación de calculadora diseñada para dispositivos Android con el objetivo de proporcionar a los usuarios una herramienta eficiente y fácil de usar para realizar operaciones aritméticas básicas. Desarrollada utilizando Android Studio, esta aplicación destaca por su interfaz de usuario intuitiva y funcional, permitiendo a los usuarios realizar cálculos de manera rápida y precisa.

</p>
<p align="center">
  <img width="300" height="600" src="https://github.com/FranaGan5/vaderCalculator/blob/main/Images/Inicio_app.png">
</p>

## <p align="center">  ¿Qué características posee?
<table style="width: 100%;">
  <tr>
    <td style="text-align: left; vertical-align: top;">
      <img width="100%" height="100%" src="https://github.com/FranaGan5/vaderCalculator/blob/main/Images/Contenido_app.png">
    </td>
    <td style="text-align: right; vertical-align: top;">
      <img width="100%" height="100%" src="https://github.com/FranaGan5/vaderCalculator/blob/main/Images/Funciones_app.png">
    </td>
  </tr>
</table>

## <p align="center">  Las operaciones:
<p align="justify">
1. OPERACIÓN CALCULAR: A la hora de calcular nuestras operaciones ha sido necesario que el tipo de dato a introducir sea de tipo “float” para poder manejar datos decimales. Se ha hecho un casting para visualizar los datos en el EditText. 
  Después de introducir los campos en los EditText y habilitarse el radioButton de “operación” solo quedará pulsar el botón CALCULAR y nos mostrará el resultado de la operación </p>
<p align="justify">
2. OPERACIÓN GUARDAR: Llegados a este punto lo siguiente que queremos hacer es guardar la operación realizada por el usuario. Para ello hemos utilizado la clase “SharedPreferences”, que nos permitirá almacenar la operación hasta que decidamos eliminarla de la memoria del dispositivo. Al pulsar el botón guardar se mostrará un mensaje (“Toast”) indicándonos que los datos han sido guardados </p>
<p align="justify">   
3. OPERACIÓN MOSTRAR: Al efectuar la pulsación en el botón mostrar hay dos posibles mensajes que nos aparecerán en nuestro EditText. Mensaje 1: Se muestra la última operación realizada que previamente ha sido guardada. Mensaje 2: Si no hemos guardado la operación previamente aparecerá el mensaje “NO HAY DATOS GUARDADOS” </p>
<p align="justify">   
4. OPERACIÓN BORRAR: Para finalizar pulsaremos el botón borrar y nos eliminará de la memoria la última operación que realizó el usuario. Mostrándose el mensaje (“Toast”) “Registros y operaciones eliminadas”. Volverán a deshabilitarse los RadioButton para que el usuario introduzca nuevamente los datos en ambos EditText.
</p>





