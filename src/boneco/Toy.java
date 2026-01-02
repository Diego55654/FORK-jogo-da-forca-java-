package boneco;

public class Toy {

    // Corda
    String rope;


    String head;

    String body;

    //Pernas
    String leftlegs;
    String rightlegs;
	
    //Braços
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
        System.out.println(rope);
	
		switch(erros){
			
			case 1:
        		System.out.println(head);
			break;

			case 2:
        		System.out.println(head);
        		System.out.println(body);

			break;
                        
			case 3:	
			System.out.println(head);
        		System.out.println(body);

        		System.out.println(leftlegs);
        		
			break;

			case 4:

			System.out.println(head);
        		System.out.println(body);

        		System.out.println(leftlegs + rightlegs);
        		
			//System.out.println(leftarms);

			break;

			case 5:
        		System.out.println(head);
        		System.out.println("\\|"leftarms + body);

        		System.out.println(leftlegs + rightlegs);
        		
			//System.out.println(leftarms);
			
			break;

			case 6:

			System.out.println(head);
        		System.out.println(body);

        		System.out.println(rightlegs + leftlegs);
        
			System.out.println(leftarms + rightarms);
	
			break;
		default:
			
			System.out.println("\nParabéns por acertar todas as letras sem um único erro");
			break;
		}

	

        //System.out.println(leftlegs + leftarms);

    }
}
