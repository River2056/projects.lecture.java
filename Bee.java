package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;

/** �p�e�� */
public class Bee extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i = 0 ; i < images.length ; i++){
			images[i] = loadImage("bee" + i + ".png");
		}
	}
	
	private int xSpeed; // �p�e���|��ۨ�
	private int ySpeed;
	private int awardType; // ���y����(0��1)
	public Bee(){
		super(60, 50);
		Random rand = new Random();
		xSpeed = 1;
		ySpeed = 2;
		awardType = rand.nextInt(2); //0��1�������H����(2 = 0, 1)
	}
	
	/** �p�e������ */
	public void step(){
		System.out.println("�p�e����x�y�в��ʤF: " + xSpeed);
		System.out.println("�p�e����y�y�в��ʤF: " + ySpeed);
	}
}
