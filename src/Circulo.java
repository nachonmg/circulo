/**
 * Clase Circulo con radio y centro
 * @author Nacho
 * @version 1.0
 */



public class Circulo {
 private double centroX;
 private double centroY;
 private double radio;
 public Circulo(
 double cx, double cy, double r) {
 centroX = cx;
 centroY = cy;
 radio = r;
 }
 
 /**
  * Calcula el centro del Circulo
  * @return Devuelve el centro del Circulo
  */
 public double getCentroX() {
 return centroX;
 }
 /**
  * Calcula el centro del Circulo
  * @return Devuelve el centro del Circulo
  */
 public double getCircunferencia() {
 return 2 * Math.PI * radio;
 }
 /**
  * Calcula el centro del Circulo
  * @param deltaX devuelve deltaX
  * @param deltaY devuelve deltaY
  */
 public void mueve(double deltaX, double deltaY) {
 centroX = centroX + deltaX;
 centroY = centroY + deltaY;
 }
 /**
  * Escala del Circulo
  * @param s  multiplica el circulo
  */
 public void escala(double s) {
 radio = radio * s;
 }
}