package geometria;

/**
 * Clase para crear líneas rectas en el plano Cartesiano.
 * @see Punto
 */
public class Linea {

    private Punto p1;
    private Punto p2;
    private Punto p3;

    /**
     * Constructor por omisión.
     */
    public Linea() {
        p1 = new Punto(0,0);
        p2 = new Punto(1,1);
        p3 = new Punto(2,2);
    }

    /**
     * Construye una línea a partir de dos puntos.
     * @param p1 punto de origen
     * @param p2 segundo punto
     *@param p3 tercer punto
     */
    public Linea(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * Regresa el punto de origen de esta línea.
     * @return el punto de origen
     */
    public Punto getP1() {
        return p1;
    }

    /**
     * Regresa el segundo punto de esta línea.
     * @return el segundo punto
     */
    public Punto getP2() {
        return p2;
    }
    /**
    * Regresa el punto de  origen de este triangulo.
    * @return el tercer punto
       */
      public Punto getP3() {
          return p3;
      }

}
