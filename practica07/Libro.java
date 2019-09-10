/**
* Descripcion de la clase libro
* @author Becerril Lara Francisco Javier
* @version 1.0
*/
public class Libro{
private String titulo;
private String autor;
private int anio;
/**
*Constructor default que inicializa los atributos con valores arbitrarios (0,"",etc)
*/
public Libro (){
titulo="";
autor="etc";
anio=0;
}
/**
*Constructor que inicializa a los atributos con los valores de los parametros
*@param titl - Titulo del libro
*@param aut - Autor del libro
*@param an - Año del libro
*/
public Libro(String titl, String aut, int an){
  titulo= titl;
  autor =aut;
  anio=an;
}
/**
*Metdo para el titulo del libro
*@param tl - el valor de titulo
*/
public void settl(String tl){
  titulo=tl;
}
/**
*Metodo para el autor del libro
**@param a - el valor de autor
*/
public void setAutor(String a){
  autor=a;
}
/**
*Metodo para el año del libro
**@param b - el valor de año
*/
public void setAño(int b){
  anio=b;
}
/**
*Metodo para obtener el  titulo del libro
*@return String - el titulo del libro
*/
public String gettitulo(){
  return titulo;
}
/**
*Metodo para  obtener el autor del libro
**@return String - el autor del libro
*/
public String getautor(){
  return autor;
}
/**
*Metodo para el año del libro
*@return int- el año del libto
*/
public int gettl(){
  return anio;
}
}
