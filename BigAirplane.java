package cn.tedu.shoot;
import java.awt.image.BufferedImage;

/** 大敵機 */
public class BigAirplane extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i = 0 ; i < images.length ; i++){
			images[i] = loadImage("bigplane" + i + ".png");
		}
	}
	
	private int speed;
	public BigAirplane(){
		super(69, 99);
		speed = 2;
	}
	
	/** 大敵機移動 */
	public void step(){
		System.out.println("大敵機的y做標移動了: " + speed);
	}
}
