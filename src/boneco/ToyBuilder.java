
package boneco;

public class ToyBuilder {

    public static void main(String[] args) {

}
	
    //Method to return an object
    public static Toy buildToy(){
	String rope      = "\n----------------------|";
        String head      = "O"; 
        String body      = "|";

	//Legs
        String leftlegs = "/";
        String rightlegs = "\\";

	//arms
	String leftarms  = "/"; 
	String rightarms  = "\\";


	// Building toy
        Toy toy = new Toy(
            rope,
            head,
	    body,
            leftlegs,
            rightlegs,
            leftarms,
            rightarms
        );

        //toy.drawToy(6);
	
	return toy;
    }
}

