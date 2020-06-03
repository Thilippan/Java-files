
public class Landline {

	String	Colour,place,Model;
	float number;
	Landline(){
		System.out.println("This is a Landline");
		Colour = "Black";
		number = 122333.0f;
		place = "Office";
	}
	void Type() {
		System.out.println(place +"landline no"+ number);
	}
	void Cost(){
		System.out.println("It is" +Colour +"in colour");
	}
}
