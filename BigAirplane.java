package cn.tedu.shoot;
import java.awt.image.BufferedImage;

/** �j�ľ� */
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
	
	/** �j�ľ����� */
	public void step(){
		System.out.println("�j�ľ���y���в��ʤF: " + speed);
	}
}
