package cn.tedu.shoot;
import java.awt.image.BufferedImage;

public class Sky extends FlyingObject {
	private static BufferedImage image; //�Ϥ�
	static{
		image = loadImage("background.png");
	}
	
	private int speed;
	private int y1;
	public Sky(){
		super(World.WIDTH, World.HEIGHT, 0, 0);
		speed = 1;
		y1 = -height; //y1: �t�����f����
	}
	
	/** �ѪŲ��� */
	public void step(){
		System.out.println("�ѪŪ�y���в��ʤF: " + speed);
	}
}
