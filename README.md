# 2_Estructuras
Estructuras de control.
## If_ElseIf_Else
**If_ElseIf_Else**  

1. Escribir un programa que pida dos números para calcular la división. Gestionar el error si se introduce un divisor 0 con una estructura condicional.  
2. Para poder tributar es necesario ser mayor de 16 años y tener ingresos mensuales superiores a 1000€. El sistema pide al usuario edad e ingresos y si cumple los requisitos le aplica un 2.18% de impuestos.  
3. Se van a dividir los alumnos de la clase en tres grupos por orden alfabético. A-J K-S T-Z. El usuario introduce un nombre y el sistema dice a qué grupo pertenece.  
4. Para la calidad de los productos de una empresa se establecen 3 niveles de rendimiento y unas puntuaciones:  
Inaceptable [0.0 - 0.4], Aceptable (0.4-0.6], Meritorio (0.6-1].  
El precio del producto va en función de su calidad siendo éste factor multiplicado por 5.00€ (precio máximo).  
Crea un sistema que reciba una puntuación. Si la puntuación no está en los límites se acabará el programa. Si se introduce una puntuación correcta el sistema dirá a qué nivel pertenece y calculará su precio.  

Corrección:
~~~
En el 3 no contemplas la posibilidad de que el usuario introduzca algún número u otro carácter,
eso produce que, si el String comienza por Ç por ejemplo, 
la aplicación indicaría que el alumno está en el grupo 3, sin llegar a gestionar el error.
~~~
## SwitchCase
**SwitchCase**  

1. El usuario introduce un mes un visualiza el número de días de ese mes. Si es febrero pedirá el año, calculará si es bisiesto y mostrará el número de días.
2. Calculadora. El sistema pide dos números y un operador. Realiza y muestra el resultado de la operación con los dos valores. Implementa +, -, *, /, % .
3. Calculador número de día anual. El usuario introduce día y mes. El sistema muestra en qué día del año nos encontramos.  
4. Un programa que aumenta el salario de sus trabajadores según el rango en el que se encuentra. [0-9000) 20%, [9000-15000) 10%, [15000-20000] 5%, más de 20000 3%.
5. Crea un programa que muestre 4 nombres de usuario, el usuario introduzca uno de dichos nombres y el sistema le de un mensaje de bienvenida personalizado para dicho usuario.
6. Crea un programa que lea cualquier palabra introducida por el usuario. Captura la primera vocal de dicha palabra. Muestra un mensaje para el caso de cada vocal especificando: "la primera vocal de la palabra [palabra] es [vocal]".
7. Extra. El usuario introduce un nombre con letras minúsculas y mayúsculas mezcladas y el sistema lo muestra con la inicial en mayúscula y el resto en minúscula.
8. EXTRA: Crear un programa que solicite el nombre completo del ciclo formativo que realiza el usuario. El sistema capturará la inicial de cada palabra significativa y las concatenará en un String. Comparará esta cadena con "DAM", "DAW", "SMR" o "ASIR" y asignará un precio de matrícula y una mensualidad al usuario. Finalmente mostrará por pantalla el precio total que pagará el usuario por el curso completo.  

Corrección:
~~~
Se puede mejorar la eficiencia del 1 y 2 situando los sout fuera de las estructuras. 
Te propongo resolver el ejercicio extra de los módulos utilizando arrays 
y una única estructura for.
~~~
## For_y_Arrays
**ForFacil**  

0. Muestra el nombre del usuario 5 veces  
1. Muestra los números del 1 al 10  
2. Muestra los números del 10 al 0  
3. Muestra los números del 0 al 20 de 2 en dos  
4. Muestra los múltiplos de 3 del 0 al 50. (0, 3, 6, 9, 12, 15, ..., 48)  
5. Muestra el nombre del usuario 30 veces mostrando el número de cada vez:  
1 - Ángela  
2 - Ángela  
...  
30 - Ángela
  
**Arrays(sinFor)**  
Para cada ejercicio muestra el array de caracteres antes de modificarlo y después.  
Utiliza un bucle como este para mostrar:  
for ([tipo] elemento : [nombreArray])  
sout(elemento)  
  
0. Crea un array con 5 caracteres. Accede al último elemento y modifícalo por el carácter '*'  
1. Pide al usuario que introduzca un número. Crea un array de ese tamaño. No es necesario que introduzcas valores.  
2. Crea un array de 4 posiciones de tipo entero. Accede a cada elemento y asígnale el valor 0.  
3. Crea un array de 3 elementos de tipo float. Pide al usuario que introduzca 3 valores y almacénalos en cada elemento.  
4. Crea un array de 5 posiciones de int. Pide al usuario que introduzca un entero. Asigna ese entero a cada elemento del array. Es decir, todos los elementos tendrán el mismo valor.  
5. Crea un array de 6 elementos e inicialízalo con la siguiente instrucción:  
int valores[] = {2,4,5,6,2,4};  
Haz que tu programa acceda a todos los elementos y almacene la suma de todos los valores.  
6. Crea e inicializa un array de 4 elementos de tipo char, todos los elementos serán la letra 'c'. Ahora cambia el valor de todos los elementos para que almacenen el carácter 'y'.  


**Arrays_ForMedio**

0. Crea un array de 3 posiciones y rellénalo con números aleatorios dentro del rango que defina el usuario.  
1. Crea un array de tipo carácter que esté inicializado con las letras de tu nombre en minúscula. Accede al primer elemento y modifícalo para que sea una mayúscula.  
2. Crea un array de tamaño 10 enteros. Pide al usuario que introduzca los 10 valores por teclado. Crea otro bucle para mostrar el contenido.  
3. Haz lo mismo que el ejercicio anterior pero para una cadena de caracteres. A la vez que introduces los caracteres en el array introdúcelos en un String. Muestra el contenido del array y muestra también el contenido del String.  
4. Introduce un String por teclado. Crea un array de la longitud del String introducido. Utilizando un bucle for almacena en cada elemento del array una letra del String de forma ordenada.  
5. Crea un array de tamaño 100. Inicialízalo con un bucle for para que almacene los valores de 0-99. Haz otro bucle para calcular la suma de todos los valores y la media.  
6. Crea un array del tamaño del abecedario (sin la letra ñ). Haz que se inicialice automáticamente utilizando un bucle for para que tenga la letra A como primer valor y la Z como último.  
7. Crea e inicializa un array con 5 notas decimales. Crea un bucle que calcule la nota media. Muestra la nota media  
8. Crea un array de tipo entero con 10 posiciones. Inicialízalo con números aleatorios dentro de un rango 0-9. Pide al usuario que introduzca un número. El programa comprobará si el número introducido es alguno de los que están en el array.  
9. Calcula cuántos (cantidad) números divisibles entre 5 hay en un intervalo dado por el usuario. Muestra cada uno de los números y finalmente muestra la cantidad total.

**ForDificil**  
Ejercicios para quién se aburra en casa.  
https://www.mclibre.org/consultar/python/ejercicios/ej-ascii-2.html

**Matrices**  

0. Matriz de tipo string va a almacenar 5 libros. Un libro son dos strings (título y autor). Pide por pantalla título y autor y rellena la matriz. Imprime la matriz.
1. Matriz que contiene notas trimestrales de los alumnos, tantos alumnos como indique el usuario. Cada fila es un alumno y cada columna nota trimestral. Rellena la matriz con números aleatorios double. Haz la nota media de cada alumno e introdúcela en un array.

## Consolidación
Ejercicios de consolidación para las estructuras If_ElseIf_Else, SwitchCase y For.  

**Consolidacion1**

0. Calcula la diferencia entre dos números enteros. Haz el cálculo sólo si el primer dígito es menor que el segundo. 
1. Pide al usuario si quiere encender la luz. El usuario introducirá S o N (también debes aceptar s o n). Si la letra introducida no se corresponde se mostrará un mensaje de error y la luz quedará apagada. Si introduce la letra n la luz quedará apagada. Si introduce la letra s la luz quedará encendida. luzEncendida es un booleano. 
2. El usuario introduce un número. Si el número es negativo no funciona. El programa sólo se ejecuta si el número es menor que 100. El programa genera un número aleatorio mayor que el número dado por el usuario y menor que 100. El sistema pide otro número al usuario. El sistema dice si ese número está más cerca de 100 o más cerca del número inicial que introdujo el usuario. 
3. El usuario introduce un número. Si el número es negativo no funciona. El sistema genera un número aleatorio entre 0 y el número introducido. El sistema pide de nuevo un número al usuario. Si el número coincide con el número aleatorio generado, el sistema felicita el usuario. 
4. Crea un array de 5 posiciones con 5 números aleatorios. Este número será el premiado en la lotería de navidad. El sistema comprobará si el número del usuario es premiado. El usuario introduce su número, si el número coincide asigna un premio de un millón. Si sólo los 3 últimos números coinciden asigna un premio de 100.000€. Si sólo coincide el 4º número, el premio es de 20€.

**Consolidacion2**

0. El usuario introduce una nota. Si la nota es menor que 5 el usuario está suspenso. Si la nota es mayor o igual que 5 el usuario está aprobado. Si la nota está fuera de los límites (0-10), se notifica el error.  
1. Se pide al usuario que introduzca un día de la semana de forma numérica. Se muestra el día de la semana en texto que le corresponde.  
Gestionar posibles errores.
2. Crea un array de 4 enteros, pide un numero al usuario y guarda ese numero y sus consecutivos en el array. Muestra el array.
4. Crea un array con las letras de tu nombre. Guarda cada elemento del array en un mismo string

## While
**While_enClase**  
Ejercicios prácticos realizados en clase.  

**While**  

0. Crea un programa en el que la luz esté encendida por defecto. El programa muestra que la luz está encendida y preguntará al usuario si quiere apagar la luz. Mientras que el usuario no responsa con una 'S' o 's' el sistema seguirá diciendo que la luz está encendida y preguntará si quiere apagarla.  
1. Crea una calculadora que sume números hasta que el número introducido sea el -1. Crea y utiliza la constante ERROR = -1.
2. Diseña un problema propio que necesite estructura while y resuelvelo.  
3. Crea un programa que muestre un contador de pulsaciones de la tecla intro. El programa debe salir cuando se escriba cualquier palabra + la tecla intro.  
4. Crea un programa que muestre la tabla de multiplicar del número 8. Crea y utiliza la constante TABLA_NUM = 8; El usuario pulsará la tecla intro para obtener la siguiente iteración de la tabla. Cuando el usuario escriba la palabra exit se parará.  
5. Crea un programa sobre la capacidad de un camión de 100 cajas. Crea y utiliza una constante para la capacidad. El programa pedirá el número de cajas que traen los clientes y las meterá en el camión. El programa aceptará cajas mientras que la suma sea menor que 100. El último usuario podrá sobrepasar la capacidad, pero se comunicará cuántas de sus cajas sobran. Es decir, si la suma es 90 y un usuario añade 15 cajas, se aceptarán todas, pero no se sumarán más cajas de otros clientes. Al salir del bucle se muestra el exceso de cajas que llevará el camión.  
6. Crea un programa que lleva la cuenta del inventario de una fábrica de latas.  
El inventario está en 1000 unidades actualmente. Mientras el número de unidades sea superior a 200, los clientes pueden llevarse el número de unidades que deseen (si hay suficientes). Cuando el inventario sea inferior a 200 se deja de repartir y se notifica que se deben fabricar más latas.
  
**While_Extra**  
Ejercicios para quién se aburra en casa.  
https://www.mclibre.org/consultar/python/ejercicios/ej-while-2.html