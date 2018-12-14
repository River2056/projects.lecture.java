package cn.tedu.shoot;
import java.awt.image.BufferedImage;

/** �^����: �O���檫 */
public class Hero extends FlyingObject {
	private static BufferedImage[] images; //�^�����Ϥ��h�i  �ҥH�����Ʋ�
	static{
		images = new BufferedImage[6];
		for(int i = 0 ; i < images.length ; i++){
			images[i] = loadImage("hero" + i + ".png");
		}
	}
	
	private int life;
	private int doubleFire;
	
	/** �c�y��k Constructor */
	public Hero(){
		super(97, 124, 140, 400);
		this.life = 3; //�q�{3���R
		this.doubleFire = 0; //�歿���O
	}
	
	/** �^�����H�۹��в���  x, y = ���Ъ�x�My */
	public void moveTo(int x, int y){
		System.out.println("�^�������ʰ�!");
	}
	
	/** �^�������� */
	public void step(){
		System.out.println("�^���������Ϥ���!");
	}
	
}
