public class Circle {
  private double radius;
  public circle (){
      radius = 0.0;
  }

  public circle (double rad){
  this.radius = rad;
  }

  public getArea (){
  double area = 3.14 * this.radius * this.radius;
  }

  public getCircumference (){
  double circumference = 2 * 3.14 * radius;
  }

  public static void main (String [] args){
  Circle myCircle = new Circle (4.0);
  System.out.println (" Area of the circle is : " + myCircle.getArea());
  System.out.println (" Circumference of the circle is : " + myCircle.getCircumference());
  }
}
