```
████████╗███████╗██╗░░██╗████████╗░██████╗░███████╗███╗░░██╗███████╗██████╗░░█████╗░████████╗░█████╗░██████╗░
╚══██╔══╝██╔════╝╚██╗██╔╝╚══██╔══╝██╔════╝░██╔════╝████╗░██║██╔════╝██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗
░░░██║░░░█████╗░░░╚███╔╝░░░░██║░░░██║░░██╗░█████╗░░██╔██╗██║█████╗░░██████╔╝███████║░░░██║░░░██║░░██║██████╔╝
░░░██║░░░██╔══╝░░░██╔██╗░░░░██║░░░██║░░╚██╗██╔══╝░░██║╚████║██╔══╝░░██╔══██╗██╔══██║░░░██║░░░██║░░██║██╔══██╗
░░░██║░░░███████╗██╔╝╚██╗░░░██║░░░╚██████╔╝███████╗██║░╚███║███████╗██║░░██║██║░░██║░░░██║░░░╚█████╔╝██║░░██║
░░░╚═╝░░░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚═════╝░╚══════╝╚═╝░░╚══╝╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝
```

@author: JC-Xander<br>
@version: 1.3.0<br>
@since:  2024/03/08<br>
@date: 2024/02/1

# ¿Qué es?
TextGenerator permite crear Texto Gigante ASCII mediante el envio de una cadena de caracteres la cual resive desde los argumentos,muy util para decorar titulos y darle un estilo unico a nuestros archivos de texto. Este generador cuenta con varios estilos de artASCII entre ellos:

## Fuentes:
- __ArtASCII(3D):__  Ofrese un estilo de Letras 3D,
    Este estilo solo incluye letras mayusculas (A~Z, incluyendo la ñ), numeros (0~9) y los caracteres especiales.
    - '-'
    - '_'

    Los caracteres en minusculas o con acentos son replazados por su char en Mayuscula por ejemplo:
    'a' Sera remplazado por 'A'
    'z' Sera remplazado por 'Z'
    'ó' Sera remplazado por 'O'

    Nota: En caso de enviar un caracter no valido por ejemplo ';', este sera sustitiudo por un espacio.

    ```
        ░█████╗░██████╗░████████╗░█████╗░░██████╗░█████╗░██╗██╗░██████╗░██████╗░░
        ██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔════╝██╔══██╗██║██║░╚════██╗██╔══██╗░
        ███████║██████╔╝░░░██║░░░███████║╚█████╗░██║░░╚═╝██║██║░░█████╔╝██║░░██║░
        ██╔══██║██╔══██╗░░░██║░░░██╔══██║░╚═══██╗██║░░██╗██║██║░░╚═══██╗██║░░██║░
        ██║░░██║██║░░██║░░░██║░░░██║░░██║██████╔╝╚█████╔╝██║██║░██████╔╝██████╔╝░
        ╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝╚═╝░╚═════╝░╚═════╝░░
    ```

- __ArtASCII(2D):__ Ofrese un estilos de letras 2D
    Este estilo solo incluye letras mayusculas (A~Z, incluyendo la ñ), numeros (0~9) y los caracteres especiales.
    - '-'
    - '_'

    Los caracteres en minusculas o con acentos son replazados por su char en Mayuscula por ejemplo:<br>
    'a' Sera remplazado por 'A'<br>
    'z' Sera remplazado por 'Z'<br>
    'ó' Sera remplazado por 'O'<br>

    Nota: En caso de enviar un caracter no valido por ejemplo ';', este sera sustitiudo por un espacio.

    ```
        ╭━━━╮╭━━━╮╭━━━━╮╭━━━╮╭━━━╮╭━━━╮╭━━╮╭━━╮╱╭━━━╮╭━━━╮╱
        ┃╭━╮┃┃╭━╮┃┃╭╮╭╮┃┃╭━╮┃┃╭━╮┃┃╭━╮┃╰┫┣╯╰┫┣╯╱┃╭━╮┃╰╮╭╮┃╱
        ┃┃╱┃┃┃╰━╯┃╰╯┃┃╰╯┃┃╱┃┃┃╰━━╮┃┃╱╰╯╱┃┃╱╱┃┃╱╱╰╯╭╯┃╱┃┃┃┃╱
        ┃╰━╯┃┃╭╮╭╯╱╱┃┃╱╱┃╰━╯┃╰━━╮┃┃┃╱╭╮╱┃┃╱╱┃┃╱╱╭━╯╭╯╱┃┃┃┃╱
        ┃╭━╮┃┃┃┃╰╮╱╱┃┃╱╱┃╭━╮┃┃╰━╯┃┃╰━╯┃╭┫┣╮╭┫┣╮╱┃┃╰━╮╭╯╰╯┃╱
        ╰╯╱╰╯╰╯╰━╯╱╱╰╯╱╱╰╯╱╰╯╰━━━╯╰━━━╯╰━━╯╰━━╯╱╰━━━╯╰━━━╯╱
    ```

- __Carty:__ Ofrese un estilo de Letras de Tipo Carty
    Este estilo se desarrollo anteriormente en el repositorio Carty, en el cual esncontraras toda la información hacerca de esta fuente.

    Pero se le realizarón modificaciones para que se adaptara a la estructura de las fuentes, aparte se estructuraron los metodos de una forma mas segmentada para que fuera mas facil su interpretación.

    ```
        ╔═══╗──╔╗╔═══╦═══╦═══╦══╦══╗─╔═╦═══╦═══╦═╗
        ║╔═╗║─╔╝╚╣╔═╗║╔═╗║╔═╗╠╣╠╩╣╠╝╔╝╔╣╔═╗╠╗╔╗╠╗╚╗
        ║║─║╠═╬╗╔╣║─║║╚══╣║─╚╝║║─║║╔╝╔╝╚╝╔╝║║║║║╚╗╚╗
        ║╚═╝║╔╝║║║╚═╝╠══╗║║─╔╗║║─║║║║║─╔═╝╔╝║║║║─║║║
        ║╔═╗║║─║╚╣╔═╗║╚═╝║╚═╝╠╣╠╦╣╠╣║║─║║╚═╦╝╚╝║─║║║
        ╚╝─╚╩╝─╚═╩╝─╚╩═══╩═══╩══╩══╩╗╚╗╚═══╩═══╝╔╝╔╝
        ────────────────────────────╚╗╚╗───────╔╝╔╝
        ─────────────────────────────╚═╝───────╚═╝
    ```
## Analisis
TextGenerator crea un objeto el cual se encarga de almacenar el Arte ASCII correspondiente al caracter de cada lenguaje luego se creo una clase abstracta la cual contiene los metodos de busqueda y unión de los caracateres y esto esto se le hereda a la fuente en la cual solo deberemos de editar crear el metodo constructor inicializando todos los caracteres ascii en el arreglo alphabeto.

En algunos casos los metodos de union de los caracteres necesitara mas detalles como en el caso de la fuente carty por lo que se sobreescribieron algunos de los metrodos heredados.

Para establecer el tipo de fuente se creo un enum el cual contiene variables que simbolizan canda una de las fuentes por lo que al envialas le estamos diciendo al contructor que fuente queremos en especifico.

Espero ir añadiendo mas fuentes a medida pasa el tiempo de momento estas 3 es un comienzo.

Nota: Este programa recibe tanto la cadenada de caracateres como el tipo de fuente desde el argumento ya que esta pensado que se ejecute como si fuera un comando de terminal.