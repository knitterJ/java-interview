//Can you override private method in Java?
public class Child extends Base {

  public void nothingSpecialMethod() {
    System.out.println("Yes! We made that ass pass! - you've just been overriden");
  }
  private void impossiblePart() {
    System.out.println("Of course this method can be invoked - but calling the method via Child object can't be called overriding anymore (even though it has the same name)");
  }


  public static void main(String[] args) {
    Base stdObj = new Child();
    stdObj.nothingSpecialMethod();

    // error: impossiblePart() has private access in Base
    // stdObj.impossiblePart();

    //Calling method this way also won't work! You'd have to use Java reflection in order to get to this method from Child class
    // Base noOtherChoiceObj = new Base();
    // noOtherChoiceObj.impossiblePart();

    Child childObj = new Child();
    childObj.impossiblePart();
  }
}
