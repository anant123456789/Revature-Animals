package revature.assingement;

import java.io.File;

public abstract class Animal {
public String picture;	
public String food;
public String hunger;
public String boundaries;
public String location;

public abstract void makeNoise(String a);
public abstract void eat(String b);
public abstract void sleep();
public abstract void roam();
}
