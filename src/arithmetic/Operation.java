/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 *
 * @author Kevin Dado
 */
public enum Operation {

  ADDITION{
    public double apply(double x, double y) { return x + y; }
  }, 
  MINUS {
    public double apply(double x, double y) { return x - y; }
  }, 
  MULTIPLY{
    public double apply(double x, double y) { return x * y; }
  }, 
  DIVIDE{
    public double apply(double x, double y){return x * y;} 
  }
  ;

  public abstract double apply(double x, double y);
}
    

