package flyweight;
import java.util.HashMap;
import java.util.Map;
 
//Éste es un contenedor para los diferentes "tipos de rectángulos" creados, es decir, instancias de la clase RectanguloLigero
public class ContenedorRectangulos {
 
//Se guardan en un HashMap
private static Map<String,RectanguloLigero> macLigeros= new HashMap<String, RectanguloLigero>();

//Este método se utiliza cuando se va a crear un rectángulo nuevo, lo que hace es revisar si ya existe un "tipo" de rectángulo
//con los datos recibidos, si no existe, crea uno. La instancia que devuelve es la que se le dará al nuevo rectángulo de la clase
//RectangulosImplLigero como referencia a sus datos de base y altura
public static RectanguloLigero getRectangulo(int base,int altura) {
String clave=base+":"+altura;
if (!macLigeros.containsKey(clave)) {
macLigeros.put(clave,new RectanguloLigero(base,altura));
}
return macLigeros.get(clave);
}
}