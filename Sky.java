package cn.tedu.shoot;
import java.awt.image.BufferedImage;

public class Sky extends FlyingObject {
	private static BufferedImage image; //圖片
	static{
		image = loadImage("background.png");
	}
	
	private int speed;
	private int y1;
	public Sky(){
		super(World.WIDTH, World.HEIGHT, 0, 0);
		speed = 1;
		y1 = -height; //y1: 負的窗口的高
	}
	
	/** 天空移動 */
	public void step(){
		System.out.println("天空的y做標移動了: " + speed);
	}
}
