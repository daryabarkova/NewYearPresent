package by.dbarkova.logic;

import by.dbarkova.bean.Candy;
import by.dbarkova.bean.Cookie;
import by.dbarkova.bean.Marshmallow;
import by.dbarkova.bean.Present;
import by.dbarkova.bean.Sweet;
import by.dbarkova.bean.Toy;

public class PresentPacking {
	
	public static void gathering()
	{
		Sweet souffle = new Candy("souffle", 9, 31.05, "square", "cream");
		Sweet lollipop = new Candy("lollipop", 6, 22.56, "oval", "red");
		Sweet truffle = new Candy("truffle", 12, 66.28, "pyramid", "brown"); 
		Sweet jelly = new Candy("jelly", 10, 13.66, "sphere", "yellow");
		
		Sweet miniMarsh = new Marshmallow ("minimarsh", 5, 5.0, 0.39);
		Sweet middleMarsh = new Marshmallow ("middlemarsh", 7, 6.11, 0.45);
		Sweet maxiMarsh = new Marshmallow ("maximarsh", 10, 7.55, 0.8);
		
		Sweet mrPinky = new Cookie ("Mr Pinky", 20, 100.15, 3);
		
		Toy cat = new Toy("cat", "cloth", 10);
		Toy dog = new Toy("dog", "wood", 10);
		Toy bear = new Toy("bear", "cloth", 15);
		
		Present present = new Present();
		
		present.addSweet(souffle, 5);
		present.addSweet(lollipop, 10);
		present.addSweet(truffle, 3);
		present.addSweet(jelly, 8);
		
		present.addSweet(miniMarsh, 10);
		present.addSweet(middleMarsh, 5);
		present.addSweet(maxiMarsh, 3);
		
		present.addSweet(mrPinky, 2);
		
		present.addToy(cat, 2);
		present.addToy(dog, 2);
		present.addToy(bear, 1);
		
		
		
 	}

}
