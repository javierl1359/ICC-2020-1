package geometria;
/**
*representa un poligono de tres lados. Esta definido por
*tres puntos en el plano cartesiano
*/
public class Triangulo {
  private Punto a;
  private Punto b;
  private Punto c;
  /**
  *Triángulo con todos sus lados de la misma longitud.
  */
  public static final int EQUILATERO = 0;
  /**
  *Triángulo con todos sus lados de longitud distinta.
  */
  public static final int ISOSCELES = 1;
  /**
  *Triángulo con exactamente dos lados de la misma longitud.
  */
  public static final int ESCALENO = 2;
/**
*Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
*/
  public Triangulo() {
    Punto a = new Punto (0,0);
    Punto b = new Punto (1,0);
    Punto c = new Punto(0.5, Math.sin(Math.PI/3));
  }
/**
*Crea un triángulo con los tres puntos dados.
*Parameters:
*@param a - primer punto
*@param b - segundo punto
*@param c - tercer punto
*/
public Triangulo(Punto a, Punto b,Punto c){
this.a = new Punto (a.getX(), a.getY());
this.b = new Punto (b.getX(), b.getY());
this.c = new Punto (c.getX(), c.getY());
}

/**
* Regresa el punto de  origen de este triangulo.
* @return el punto de origen
   */
  public Punto geta() {
      return a;
  }
/**
* Regresa el segundo punto de  de este triangulo.
* @return el segundo punto
*/
    public Punto getb() {
        return b;
    }
/**
* Regresa el  tercer punto de este triangulo.
* @return el tercer punto 
*/
  public Punto getc() {
    return c;
      }

/**
* Determina si los vértices de este triángulo están alineados.
*@return true si los vértices están alineados
*/
public boolean tieneVerticesAlineados(){
return(a.estanAlineados(b,c));
}
/**
*Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
*@return el tipo de triangulo
*/
public int tipo(){
  if( a.distancia(b) == b.distancia(c) ){
  if(b.distancia(c)== c.distancia(a)){
    return EQUILATERO;
  }else{
  return ISOSCELES;}
}else {
  return ESCALENO;
}}
}
