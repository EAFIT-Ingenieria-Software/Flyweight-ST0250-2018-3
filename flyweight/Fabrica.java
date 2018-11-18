package flyweight;

//Esta clase se encarga de crear los rectángulos de la clase RectangulosImplLigero, es la clase en la que comienza la creación de
//Rectángulos
public class Fabrica {
    
    //Con este método se crean los rectángulos, primero se obtiene una instancia de RectanguloLigero (con el método
    //getRectangulo) de su clase y con esa instancia se crean los rectángulos de la clase RectangulosImplLigero
    public static Rectangulos crearRectangulo(int id, int base, int altura){
        RectanguloLigero rec=ContenedorRectangulos.getRectangulo(base, altura);
        Rectangulos rectangulo=new RectangulosImplLigero(id, rec);
        return rectangulo;
    }
    
}
