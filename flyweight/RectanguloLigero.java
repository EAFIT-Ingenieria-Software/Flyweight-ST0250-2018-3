package flyweight;
//Esta clase actúa como "tipo" de rectángulo, es decir, creará un objeto para cada combinación de información
//A la que van a hacer referencia los rectángulos de la clase RectangulosImplLigero
public class RectanguloLigero implements Rectangulos {
   
   private int base;                            //Combinación de base y altura a la que harán referencia todos los rectángulos
   private int altura;                          //que sean creados con estos mismos datos
   private static int contador=0;               
    
   //Método constructor
   public RectanguloLigero(int base, int altura){
       this.base=base;
       this.altura=altura;
       ++contador;
       System.out.println("Tipos de rectangulos creados: "+contador);
   }
   
   //Consulta la base
   public int getBase() {
        return base;
    }
   
   //Consulta la altura
    public int getAltura() {
        return altura;
    }
   
   
}
