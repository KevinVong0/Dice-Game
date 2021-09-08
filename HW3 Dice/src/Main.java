/* Kevin Vong
 * CS2450
 * HW3 Dice
 * 10/30/18
 */


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	private Label overall, score, rollsRemain, best;
	private Button button1, button2;
	private HBox dice;
	private VBox root;
	private int overallScore = 0, roundScore = 0, rollsRemaining = 3;
	
	Dice dice1 = new Dice(1);
	Dice dice2 = new Dice(1);
	Dice dice3 = new Dice(1);
	Dice dice4 = new Dice(1);
	Dice dice5 = new Dice(1);
	
	ImageView gameDice1 = new ImageView(dice1.getImage());
	ImageView gameDice2 = new ImageView(dice2.getImage());
	ImageView gameDice3 = new ImageView(dice3.getImage());
	ImageView gameDice4 = new ImageView(dice4.getImage());
	ImageView gameDice5 = new ImageView(dice5.getImage());
	
	
	public static void main(String args[]) {
		launch(args);
	}
	
	
	public void start(Stage primaryStage) {
		
		overall = new Label("Overall Score: " + overallScore);
		score = new Label("Your Score: " + roundScore);
		rollsRemain = new Label("Rolls Remaining: " + rollsRemaining);
		button1 = new Button("Roll Dice");
		button2 = new Button("Play Again?");
		
		button1.setStyle("-fx-pref-width: 120px ; -fx-border-color: #010101; -fx-font-weight: bold ");
		button2.setStyle("-fx-pref-width: 120px; -fx-border-color: #010101 ; -fx-font-weight: bold ");
		best = new Label();
		
		overall.setStyle("-fx-font-weight: bolder ; -fx-font-size: 16pt");
		score.setStyle("-fx-font-weight: bolder; -fx-font-size: 16pt; -fx-font-style: italic");
		rollsRemain.setStyle("-fx-font-weight: bolder; -fx-font-size: 16pt");
		best.setStyle("-fx-font-weight: bolder; -fx-font-size: 16pt; -fx-font-style: italic");
		
		
		dice = new HBox(10,gameDice1, gameDice2, gameDice3, gameDice4, gameDice5);
		dice.setPadding(new Insets(10));
		dice.setAlignment(Pos.CENTER);
		
		root = new VBox(10, overall, dice, button1, score, rollsRemain, best);
		root.setPadding(new Insets(10));
		root.setAlignment(Pos.CENTER);
		
		Dice[] dArray = new Dice[5]; 
		dArray[0] = dice1;
		dArray[1] = dice2;
		dArray[2] = dice3;
		dArray[3] = dice4;
		dArray[4] = dice5;
		

		gameDice1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
			if (rollsRemaining != 3) {
			dice1.onClick();
			gameDice1.setImage(dice1.getImage());
			}
		});
		
		gameDice2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
			if (rollsRemaining != 3) {
			dice2.onClick();
			gameDice2.setImage(dice2.getImage());
			}
		});
		
		gameDice3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
			if (rollsRemaining != 3) {
			dice3.onClick();
			gameDice3.setImage(dice3.getImage());
			}
		});
		
		gameDice4.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
			if (rollsRemaining != 3) {
			dice4.onClick();
			gameDice4.setImage(dice4.getImage());
			}
		});
		
		gameDice5.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
			if (rollsRemaining != 3) {
			dice5.onClick();
			gameDice5.setImage(dice5.getImage());
			}
		});
		
		
		button1.setOnAction(event -> {
				if (rollsRemaining != 0 && button1.getText() == "Roll Dice" ) {
					rollsRemaining--;
					rollsRemain.setText("Rolls Remaining: " + rollsRemaining);
					
					dice1.reRoll();
					dice2.reRoll();
					dice3.reRoll();
					dice4.reRoll();
					dice5.reRoll();
					
					/*dice1.setValue(2);
					dice2.setValue(1);
					dice3.setValue(3);
					dice4.setValue(4);
					dice5.setValue(5); */
					
					gameDice1.setImage(dice1.getImage());
					gameDice2.setImage(dice2.getImage());
					gameDice3.setImage(dice3.getImage());
					gameDice4.setImage(dice4.getImage());
					gameDice5.setImage(dice5.getImage());
				}
				
				if (rollsRemaining == 0) {

					int counter1 = 0;
					int counter2 = 0;
					int counter3 = 0;
					int counter4 = 0;
					int counter5 = 0;
					int counter6 = 0;
					for(int i = 0; i < dArray.length; i++) {
						if (dArray[i].getValue() == 1)
							counter1++;
					}
					
					for(int i = 0; i < dArray.length; i++) {
						if (dArray[i].getValue() == 2)
							counter2++;
					}
	
					for(int i = 0; i < dArray.length; i++) {
						if (dArray[i].getValue() == 3)
							counter3++;
					}
					
					for(int i = 0; i < dArray.length; i++) {
						if (dArray[i].getValue() == 4)
							counter4++;
					}
					
					for(int i = 0; i < dArray.length; i++) {
						if (dArray[i].getValue() == 5)
							counter5++;
					}
					
					for(int i = 0; i < dArray.length; i++) {
						if (dArray[i].getValue() == 6)
							counter6++;
					}
					
					if (counter1 == 2) {
						best.setText("Two of a kind!");
						overallScore+=1;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=1;
						score.setText("Your Score: " + roundScore);
					}
					if (counter2 == 2) {
						best.setText("Two of a kind!");
						overallScore+=1;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=1;
						score.setText("Your Score: " + roundScore);
					}
					if (counter3 == 2) {
						best.setText("Two of a kind!");
						overallScore+=1;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=1;
						score.setText("Your Score: " + roundScore);
					}
					if (counter4 == 2) {
						best.setText("Two of a kind!");
						overallScore+=1;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=1;
						score.setText("Your Score: " + roundScore);
					}
					if (counter5 == 2) {
						best.setText("Two of a kind!");
						overallScore+=1;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=1;
						score.setText("Your Score: " + roundScore);
					}
					if (counter6 == 2) {
						best.setText("Two of a kind!");
						overallScore+=1;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=1;
						score.setText("Your Score: " + roundScore);
					}
					
					if (counter1 == 3) {
						best.setText("Three of a kind!");
						overallScore+=5;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=5;
						score.setText("Your Score: " + roundScore);
					}
					if (counter2 == 3) {
						best.setText("Three of a kind!");
						overallScore+=5;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=5;
						score.setText("Your Score: " + roundScore);
					}
					if (counter3 == 3) {
						best.setText("Three of a kind!");
						overallScore+=5;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=5;
						score.setText("Your Score: " + roundScore);
					}
					if (counter4 == 3) {
						best.setText("Three of a kind!");
						overallScore+=5;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=5;
						score.setText("Your Score: " + roundScore);
					}
					if (counter5 == 3) {
						best.setText("Three of a kind!");
						overallScore+=5;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=5;
						score.setText("Your Score: " + roundScore);
					}
					if (counter6 == 3) {
						best.setText("Three of a kind!");
						overallScore+=5;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=5;
						score.setText("Your Score: " + roundScore);
					}
					if (counter1 == 4) {
						best.setText("Four of a kind!");
						overallScore+=7;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=7;
						score.setText("Your Score: " + roundScore);
					}
					if (counter2 == 4) {
						best.setText("Four of a kind!");
						overallScore+=7;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=7;
						score.setText("Your Score: " + roundScore);
					}
					if (counter3 == 4) {
						best.setText("Four of a kind!");
						overallScore+=7;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=7;
						score.setText("Your Score: " + roundScore);
					}
					if (counter4 == 4) {
						best.setText("Four of a kind!");
						overallScore+=7;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=7;
						score.setText("Your Score: " + roundScore);
					}
					if (counter5 == 4) {
						best.setText("Four of a kind!");
						overallScore+=7;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=7;
						score.setText("Your Score: " + roundScore);
					}
					if (counter6 == 4) {
						best.setText("Four of a kind!");
						overallScore+=7;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=7;
						score.setText("Your Score: " + roundScore);
					}
					
					if (counter1 == 5) {
						best.setText("Five of a kind!");
						overallScore+=10;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=10;
						score.setText("Your Score: " + roundScore);
					}
					if (counter2 == 5) {
						best.setText("Five of a kind!");
						overallScore+=10;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=10;
						score.setText("Your Score: " + roundScore);
					}
					if (counter3 == 5) {
						best.setText("Five of a kind!");
						overallScore+=10;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=10;
						score.setText("Your Score: " + roundScore);
					}
					if (counter4 == 5) {
						best.setText("Five of a kind!");
						overallScore+=10;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=10;
						score.setText("Your Score: " + roundScore);
					}
					if (counter5 == 5) {
						best.setText("Five of a kind!");
						overallScore+=10;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=10;
						score.setText("Your Score: " + roundScore);
					}
					if (counter6 == 5) {
						best.setText("Five of a kind!");
						overallScore+=10;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=10;
						score.setText("Your Score: " + roundScore);
					}
					
					int[] counterArray = new int[6];
					counterArray[0] = counter1;
					counterArray[1] = counter2;
					counterArray[2] = counter3;
					counterArray[3] = counter4;
					counterArray[4] = counter5;
					counterArray[5] = counter6;
					
					for(int i = 0;i < counterArray.length;i++) {
						for (int k = i + 1; k < counterArray.length; k++) {
					        if (counterArray[i] == 2 && counterArray[k] == 2) {
					        	best.setText("Two sets of two of a kind!");
					        	overallScore+=2; // only +2 because two pairs are already 2 pts
								overall.setText("Overall Score: " + overallScore);
								roundScore+=2;
								score.setText("Your Score: " + roundScore);
					        }
						}
					}
					
					for(int i = 0;i < counterArray.length;i++) {
						for (int k = i + 1; k < counterArray.length; k++) {
					        if (counterArray[i] == 3 && counterArray[k] == 2 || counterArray[i] == 2 && counterArray[k] == 3) {
					        	best.setText("Full House!");
					        }
						}
					}
					
					int[] straight = new int[5];
					for (int i = 0; i < straight.length;i++) {
						straight[i] = dArray[i].getValue();
					}
					
					for(int i = 0;i < straight.length;i++) {
						for (int k = i + 1; k < straight.length; k++) {
							int smallerNum;
							if (straight[k] < straight[i]) {
								smallerNum = straight[k];
								straight[k] = straight[i];
								straight[i] = smallerNum;
							}
						} 
					}
					String straight1 = "";
					if (straight[0] == 1)
						straight1+= "1";
					if (straight[1] == 2)
						straight1+= "2";
					if (straight[2] == 3)
						straight1+= "3";
					if (straight[3] == 4)
						straight1+= "4";
					if (straight[4] == 5)
						straight1+= "5";
					
					String straight2 = "";
					if (straight[0] == 2)
						straight2+= "2";
					if (straight[1] == 3)
						straight2+= "3";
					if (straight[2] == 4)
						straight2+= "4";
					if (straight[3] == 5)
						straight2+= "5";
					if (straight[4] == 6)
						straight2+= "6";
						
					if (straight1.contains("12345")) {
						best.setText("Straight!");
						overallScore+=8;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=8;
						score.setText("Your Score: " + roundScore);
					}
					
					if (straight2.contains("23456")) {
						best.setText("Straight!");
						overallScore+=8;
						overall.setText("Overall Score: " + overallScore);
						roundScore+=8;
						score.setText("Your Score: " + roundScore);
					}
					
				root = new VBox(10, overall, dice, button2, score, rollsRemain, best);
				root.setPadding(new Insets(10));
				root.setAlignment(Pos.CENTER);
				root.setStyle("-fx-background-color: #E8726C");
				primaryStage.setScene(new Scene(root));
				
				}
				
				
					
		});
		
		button2.setOnAction(event -> {
			
			if(dice1.getClicked() == true)
			{
				dice1.onClick();
			}
			
			if(dice2.getClicked() == true)
			{
				dice2.onClick();
			}
			
			if(dice3.getClicked() == true)
			{
				dice3.onClick();
			}
			
			if(dice4.getClicked() == true)
			{
				dice4.onClick();
			}
			
			if(dice5.getClicked() == true)
			{
				dice5.onClick();
			}
			
			dice1.reRoll();
			dice2.reRoll();
			dice3.reRoll();
			dice4.reRoll();
			dice5.reRoll();
			
			gameDice1.setImage(dice1.getImage());
			gameDice2.setImage(dice2.getImage());
			gameDice3.setImage(dice3.getImage());
			gameDice4.setImage(dice4.getImage());
			gameDice5.setImage(dice5.getImage());
			
			rollsRemaining = 3;
			rollsRemain.setText("Rolls Remaining: " + rollsRemaining);
			roundScore = 0;
			score.setText("Your Score: " + roundScore);
			best.setText("");
			root = new VBox(10, overall, dice, button1, score, rollsRemain, best);
			root.setPadding(new Insets(10));
			root.setAlignment(Pos.CENTER);
			root.setStyle("-fx-background-color: #E8726C");
			primaryStage.setScene(new Scene(root));
			
			
		});
		
		primaryStage.setTitle("Dice Game");
		root.setStyle("-fx-background-color: #E8726C");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
	}
}

