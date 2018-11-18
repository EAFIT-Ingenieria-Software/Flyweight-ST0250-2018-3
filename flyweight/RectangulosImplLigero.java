package flyweight;
//Esta es la clase que crea los rectángulos que se supone estarían repitiendo información
//Éstos rectángulos tienen el atributo id y una instancia de RectanguloLigero, que actúa como referencia a los datos de base y altura
public class RectangulosImplLigero implements Rectangulos{

private int id;                                                 //id de cara rectángulo
private RectanguloLigero tipo;                                  //Instancia que actúa como "tipo" de rectángulo o referencia a la información de base y altura
static int cont=0;                                              //Contador de rectángulos

//Método constructor
public RectangulosImplLigero(int id, RectanguloLigero tipo){
 super();
 this.id=id;
 ++cont;
    System.out.println("Rectangulos creados: "+cont);
}    

//Consulta la base
public int getBase(){
    return tipo.getBase();
}
//Consulta la altura
public int getAltura(){
    return tipo.getAltura();
}
}
