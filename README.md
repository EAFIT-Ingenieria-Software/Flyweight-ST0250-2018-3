# Flyweight-ST0250-2018-2
El problema en este ejemplo es crear muchos rectángulos con las mismas medidas de base y altura sin malgastar memoria.
Para solucionar éste problema se implementa el patrón de diseño Flyweight de la siguiente manera:

1. Los objetos rectángulo se dividen en dos clases, una contiene los valores que se repiten (la clase RectanguloLigero)  y la otra contiene los datos que son diferentes para cada objeto (RectanguloImplLigero).

2. Ambas clases se unen en una interfaz (interfaz Rectangulos).

3. Los "tipos" de rectángulo se guardan en un contenedor, en este caso, en un HashMap (clase ContenedorRectangulos).

4. Se crea una fábrica que será la encargada de crear los rectángulos (clase Fabrica).

5. Todo se ejecuta en la clase principal (clase Main).

Luego, en el momento de ejecución, el proceso se hace de la siguiente manera: 
Se invoca a la clase fábrica para crear los rectángulos; Ésta se asegura de que ese "tipo" de rectángulo (es decir, un rectángulo con esas medidas) ya exista y, en caso contrario, lo crea; Luego crea un rectángulo con sus datos distintivos y le agrega una instancia al "tipo" de rectángulo que está guardado en el contenedor.

De esta manera, se crean muchos rectángulos con la misma medida y sólo se ocupa memoria en los datos que están guardados en el contenedor, que se repiten sólo una vez.
