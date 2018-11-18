package flyweight;
public class Main {

    //Método Main del paquete, aquí se crean los rectángulos
    public static void main(String[] args) {
        Rectangulos r1= Fabrica.crearRectangulo(1, 5, 7);
        Rectangulos r2= Fabrica.crearRectangulo(2, 5, 7);
        Rectangulos r3= Fabrica.crearRectangulo(3, 8, 12);
        Rectangulos r4= Fabrica.crearRectangulo(4, 8, 12);
        Rectangulos r5= Fabrica.crearRectangulo(5, 8, 12);
        Rectangulos r6= Fabrica.crearRectangulo(6, 8, 12);
        Rectangulos r7= Fabrica.crearRectangulo(7, 8, 12);
        Rectangulos r8= Fabrica.crearRectangulo(4, 10, 4);
        
    }
    
}
