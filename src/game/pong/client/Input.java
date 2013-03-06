package game.pong.client;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

public class Input{
	
	//Just putting all the input stuff in an actual input class and then calling it from
	//the main class. Tidy stuffs up
	public static void onUpdate(){
		while(Keyboard.next())
		{
			if(Keyboard.getEventKeyState() && Keyboard.isKeyDown(Keyboard.KEY_P))
			{
				if(StateGame.playerNum == 0)
				{
					if(StateGame.isPlayer1Paused == false){
						StateGame.isPlayer1Paused = true;
					}
					else if(StateGame.isPlayer1Paused == true){
						StateGame.isPlayer1Paused = false;
					}
				}
				if(StateGame.playerNum == 1)
				{
					if(StateGame.isPlayer2Paused == false){
						StateGame.isPlayer2Paused = true;
					}
					else if(StateGame.isPlayer2Paused == true){
						StateGame.isPlayer2Paused = false;
					}  //Changed from == false because I think it seems nicer like this. Don't know why
				}
			}
		}
		
		if(!StateGame.isPlayer1Paused && !StateGame.isPlayer2Paused)
		{
			if(Keyboard.isKeyDown(Keyboard.KEY_UP)) //Player paddles
			{
				if(StateGame.P1Y > 0)
				{
					if(StateGame.playerNum == 0 && !StateGame.isPlayer1Paused){
						StateGame.P1Y -= StateGame.p2Speed;
					}else if(StateGame.playerNum == 1 && !StateGame.isPlayer2Paused){
						StateGame.p2Y -= StateGame.p2Speed;
					}
				}
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_DOWN))
			{
				if(StateGame.P1Y + 60 < Display.getHeight())
				{
					if(StateGame.playerNum == 0 && !StateGame.isPlayer1Paused){
						StateGame.P1Y += StateGame.p2Speed;
					}else if(StateGame.playerNum == 1 && !StateGame.isPlayer2Paused){
						StateGame.p2Y += StateGame.p2Speed;
					}
				}
			}
			if(StateGame.isTwoPlayerOfflineMode)
			{
				if(Keyboard.isKeyDown(Keyboard.KEY_W))
				{
					if(StateGame.p2Y > 0)
					{
						StateGame.p2Y -= StateGame.p2Speed;
					}
				}
				if(Keyboard.isKeyDown(Keyboard.KEY_S))
				{
					if(StateGame.p2Y + 60 < Display.getHeight())
					{
						StateGame.p2Y += StateGame.p2Speed;
					}
				}
			}
		}
	}
}
