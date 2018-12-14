package cn.tedu.shoot;
import java.awt.image.BufferedImage;

/** 小敵機 */
public class Airplane extends FlyingObject {
	private int speed;
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i = 0 ; i < images.length ; i++){
			images[i] = loadImage("airplane" + i + ".png");
		}
	}
	
	/** 構造方法 */
	public Airplane(){
		super(49, 36);
		speed = 2;
	}
	
	/** 小敵機移動 */
	public void step(){
		System.out.println("小敵機的y做標移動了: " + speed);
	}
	
}
