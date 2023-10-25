package ru.stqa.pft.sanbox;

import ru.stqa.pft.sandbox.Square;

public class squareTests {

  public void testArea(){
    Square s=new Square(5);
    assert s.area()==25;
  }
}
