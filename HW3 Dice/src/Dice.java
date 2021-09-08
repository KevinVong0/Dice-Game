import java.util.Random;

import javafx.scene.image.Image;

public class Dice {

	Image dice1 = new Image("file:./res/dice1.png");
	Image dice2 = new Image("file:./res/dice2.png");
	Image dice3 = new Image("file:./res/dice3.png");
	Image dice4 = new Image("file:./res/dice4.png");
	Image dice5 = new Image("file:./res/dice5.png");
	Image dice6 = new Image("file:./res/dice6.png");
	
	Image dice1held = new Image("file:./res/dice1held.png");
	Image dice2held = new Image("file:./res/dice2held.png");
	Image dice3held = new Image("file:./res/dice3held.png");
	Image dice4held = new Image("file:./res/dice4held.png");
	Image dice5held = new Image("file:./res/dice5held.png");
	Image dice6held = new Image("file:./res/dice6held.png");
	
	private Image image;
	private int value;
	private boolean clicked = false;
	public Dice() {
		
	}
	
	public Dice(int value) {
		switch (value) {
        case 1:  this.value = 1;
				 this.image = dice1;
				 break;
        case 2:  this.value = 2;
				 this.image = dice2;
				 break;
        case 3:  this.value = 3;
				 this.image = dice3;
				 break;
        case 4:  this.value = 4;
				 this.image = dice4;
				 break;
        case 5:  this.value = 5;
				 this.image = dice5;
				 break;
        case 6:  this.value = 6;
				 this.image = dice6;
				 break;
		}
		
		
	}
	
	public void onClick() {
		if (this.clicked != true) {
			this.clicked = true;
			switch (value) {
	        case 1:  this.value = 1;
					 this.image = dice1held;
					 break;
	        case 2:  this.value = 2;
					 this.image = dice2held;
					 break;
	        case 3:  this.value = 3;
					 this.image = dice3held;
					 break;
	        case 4:  this.value = 4;
					 this.image = dice4held;
					 break;
	        case 5:  this.value = 5;
					 this.image = dice5held;
					 break;
	        case 6:  this.value = 6;
					 this.image = dice6held;
					 break;
			}
		}
		
		else {
			this.clicked = false;
			switch (value) {
	        case 1:  this.value = 1;
					 this.image = dice1;
					 break;
	        case 2:  this.value = 2;
					 this.image = dice2;
					 break;
	        case 3:  this.value = 3;
					 this.image = dice3;
					 break;
	        case 4:  this.value = 4;
					 this.image = dice4;
					 break;
	        case 5:  this.value = 5;
					 this.image = dice5;
					 break;
	        case 6:  this.value = 6;
					 this.image = dice6;
					 break;
			}
		}
	}
	
	public void reRoll() {
		if (!this.clicked) {
		int rand = (int)((Math.random() * 6) + 1);
		switch (rand) {
        case 1:  this.value = 1;
				 this.image = dice1;
				 break;
        case 2:  this.value = 2;
				 this.image = dice2;
				 break;
        case 3:  this.value = 3;
				 this.image = dice3;
				 break;
        case 4:  this.value = 4;
				 this.image = dice4;
				 break;
        case 5:  this.value = 5;
				 this.image = dice5;
				 break;
        case 6:  this.value = 6;
				 this.image = dice6;
				 break;
		}
		}
		return;
		
	}
	
	public Image getImage() {
		return this.image;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean getClicked() {
		return this.clicked;
	}
	
	public void setValue(int value) {
		this.value = value;
		switch (value) {
        case 1:  this.value = 1;
				 this.image = dice1;
				 break;
        case 2:  this.value = 2;
				 this.image = dice2;
				 break;
        case 3:  this.value = 3;
				 this.image = dice3;
				 break;
        case 4:  this.value = 4;
				 this.image = dice4;
				 break;
        case 5:  this.value = 5;
				 this.image = dice5;
				 break;
        case 6:  this.value = 6;
				 this.image = dice6;
				 break;
		}
	}
	
}