

package aplicacionrectangulo2;


public class Aplicacionrectangulo2 {

  
    public static void main(String[] args) {
       Rectangulo rec1 =new Rectangulo (3,5);
       
       System.out.println("base: "+rec1.getBase());
       System.out.println("altura "+rec1.getAltura());
       System.out.println("area ="+rec1.calcularArea(7,8));
       System.out.println("perimetro ="+rec1.calcularPerimetro());
       
       
    }
    
}
