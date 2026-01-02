
package boneco;

public class ToyBuilder {

    public static void main(String[] args) {

	String rope      = "----------------------|";
        String head      = "                      O"; 
        String body      = "                      |";

	//PERNAS
        String leftlegs = "                     /";
        String rightlegs = " \\";

	//BRAÇOS
	String leftarms  = "———"; 
	String rightarms  = "———";

        // Construção do boneco
        Toy toy = new Toy(
            rope,
            head,
	    body,
            leftlegs,
            rightlegs,
            leftarms,
            rightarms
        );

        toy.drawToy(5);

    }
}

