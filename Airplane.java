package cn.tedu.shoot;
import java.awt.image.BufferedImage;

/** �p�ľ� */
public class Airplane extends FlyingObject {
	private int speed;
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i = 0 ; i < images.length ; i++){
			images[i] = loadImage("airplane" + i + ".png");
		}
	}
	
	/** �c�y��k */
	public Airplane(){
		super(49, 36);
		speed = 2;
	}
	
	/** �p�ľ����� */
	public void step(){
		System.out.println("�p�ľ���y���в��ʤF: " + speed);
	}
	
}
