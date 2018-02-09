package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
		for(int i = 0; i<model.getWidth(); i++)
		{
			system.out.print(i);
		}
		System.out.println();
		for(int i = 0; i < model.getWidth(); i++)
		{
			for(int j=0; j<model.getWidth(); j++)
			{
				System.out.println(i+" "+model.getMark(i, j));
		    }
		}
		

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
		system.out.println("Player 1 (X)");
		system.out.println("Player 2 (O)");
		system.out.println("Enter the row and column numbers, separated by a space: ");
		system.input

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}