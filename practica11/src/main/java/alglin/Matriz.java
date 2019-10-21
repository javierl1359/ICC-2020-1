package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 *
 */
public class Matriz {

    private double[][] datos;
    private int m, n;

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el número de filas
     * @param n el número de columnas
     */
    public Matriz(int m, int n) {
      this.datos = new double[m][n];
      this.m = m;
      this.n = n;
      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
           datos[i][j] = 0;
        }
      }
    }

    /**
     * Regresa la entrada en la i-ésima fila y j-ésima columna de esta matriz.
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
      return datos[i][j];
    }
    /**
     * Inserta el dato dado en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param dato el número que se insertará en esta matriz
     * @param i    la fila donde se insertará <code>dato</code>
     * @param j    la columna donde se insertará <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j){
      datos[i][j] = dato;
    }


    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumará esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
     public Matriz sumar(Matriz otra) {
       if (this.m == otra.m && this.n == otra.n) {
          Matriz sum = new Matriz(m,n);
          for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                sum.datos[i][j] = this.datos[i][j] + otra.datos[i][j];
             }
          }
          return sum;
       } else {
          return null;
       }
    }

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c){
      Matriz escal = new Matriz(m,n);
        for(int i = 0; i < m; i++){
          for(int j = 0; j < n; j++){
            escal.datos[i][j] = this.datos[i][j] * c;
          }
        }
      return escal;
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima fila de esta matriz
     */
     public Matriz eliminarFila(int k) {
       Matriz elim = new Matriz(m-1,n);
          for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                if (i != k) {
                   if (i > k) {
                      elim.datos[i-1][j] = datos[i][j];
                   } else {
                      elim.datos[i][j] = datos[i][j];
                   }
                }
             }
          }
       return elim;
     }


    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima columna de esta matriz
     */
     public Matriz eliminarColumna(int k) {
       Matriz elim = new Matriz(m,n-1);
          for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                if (j != k) {
                   if (j > k) {
                      elim.datos[i][j-1] = datos[i][j];
                   } else {
                      elim.datos[i][j] = datos[i][j];
                   }
                }
             }
          }
       return elim;
    }
    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
    public double determinante() {
      int ig;
      double min;
      int use = 1;
      double sump = 0.0;
      Matriz factn;
      if(m == n){
        if(m == 1){
          sump += this.datos[0][0];
        }else{
          for(int u = 0; u < m; u++){
            for(int w = 0; w < n; w++){
              ig = ((w + u) % 2 == 0) ? 1 : -1;
              if (u < 1){
                if(this.m > 2){
                  min = this.datos[u][w];
                  factn = this.eliminarFila(u).eliminarColumna(w);
                  sump += ig * min * factn.determinante();
                }else{
                  if(w == 1){
                    use = -1;
                  }
                  sump += ig * this.datos[u][w] * this.datos[u + 1][w + use];
                }
              }
            }
          }
        }
      }
      return sump;
    }

    /**
     * Regresa los datos de esta matriz de tal forma que las columnas están separadas por un espacio
     * y las filas están separadas por un salto de línea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representación en <code>String</code> de esta matriz
     */
    @Override
    public String toString(){
      String Cadena = "";
      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
          Cadena += "" + datos[i][j];
          if(j < n-1){
            Cadena += " ";
          }
        }
        if(i < m-1){
          Cadena += "\n";
        }
      }
      return Cadena;
    }

    /**
     * Regresa <code>true</code> si y sólo si <code>obj</code> es una instancia de
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     *         entrada
     */
    @Override
    public boolean equals(Object obj) {
      boolean z = false;
      Matriz otra = (Matriz)obj;
      if(this == obj){
        z = true;
      }if (obj != null && getClass() == obj.getClass()) {
         if (m == otra.m && n == otra.n) {
            z = true;
         }
      }
      if (z) {
         for (int  i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               if (datos[i][j] != otra.datos[i][j]) {
                  z = false;
               }
            }
         }
      }
      return z;
   }

}
