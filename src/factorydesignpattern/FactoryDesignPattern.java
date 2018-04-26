
package factorydesignpattern;

public class FactoryDesignPattern {

    public static void main(String[] args) {
        
         ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its draw method.
     
      shape shape1 = shapeFactory.getShape("CIRCLE");
      shape1.draw();
    }
    
}
