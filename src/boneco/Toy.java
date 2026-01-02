package boneco;

public class Toy {

    // Rope default
    String rope;


    String head;

    String body;

    //Legs
    String leftlegs;
    String rightlegs;
	
    //Arms
    String leftarms;
    String rightarms;

    public Toy(String rope, String head, String body,
		String leftlegs, String rightlegs,
		String leftarms, String rightarms) {

        this.rope = rope;
        this.head = head;
        this.body = body;

        this.leftlegs = leftlegs;
        this.rightlegs = rightlegs;

	this.leftarms = leftarms;
	this.rightarms = rightarms;
    }
	
    public void drawToy(int erros) {
        System.out.println("\n" + rope);
	
		switch(erros){
			
			case 1:
        		System.out.println("                      " + head);
			break;

			case 2:
        		System.out.println("                      " + head);
        		System.out.println("                      " + body);

			break;
                        
			case 3:	
			System.out.println("                      " + head);
        		System.out.println("                      " + body);

        		System.out.println("                     " + leftlegs);

			break;

			case 4:

			System.out.println("                      " + head);
        		System.out.println("                      " + body);

			System.out.println("                     "+ leftlegs + " " + rightlegs);
				
			//System.out.println(leftarms);

			break;

			case 5:     			
			System.out.println("                      " + head);
    			System.out.println("                     " + leftarms + body); 
    			System.out.println("                     " + leftlegs + " " + rightlegs);
    			break;

			case 6:    			
			System.out.println("                      " + head);
    			System.out.println("                     " + leftarms + body + rightarms);
    			System.out.println("                     " + leftlegs + " " + rightlegs);
    			break;

			case 7:
			System.out.println("                      " + "X");
    			System.out.println("                     " + leftarms + body + rightarms);
    			System.out.println("                     " + leftlegs + " " + rightlegs);
			
			System.out.println("\nGAME OVER\n O boneco foi enformado! ");
			break;
		default:	
			System.out.println("\nValor inválido: número de erros fora do intervalo (0 a 7).");
			break;
		}


    }
}
