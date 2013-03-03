package game.pong.client;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Textures {
	static Texture none;
	
	static Texture player1;
	static Texture player2;
	
	static Texture shadow;
	
	static Texture textBackground;
	
	
	
	public static void loadTextures(){
		
		try {
			none = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/none.png"), true);
		
			player1 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/player/player1.png"), true);
			player2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/player/player2.png"), true);
		
			shadow = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/shadow.png"), true);
			
			textBackground = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textBackground.png"), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
