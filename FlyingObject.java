package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public abstract class FlyingObject { //��X�Ҧ����O�@���ݩ�(�W��), ���������~��
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	public FlyingObject(int width, int height, int x, int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	public FlyingObject(){ //�d���q�{���^����, �Ѫ�, �l�u
		
	}
	public FlyingObject(int width, int height){ //��X�@��: �p�ľ�, �j�ľ�, �p�e��
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(World.WIDTH - this.width);
		y = -this.height;
	}
	
	/** ���檫���� */
	public abstract void step();

	/** �[��/Ū���Ϥ� */
	public static BufferedImage loadImage(String fileName){ //�[�ѼƬO���F���D�nŪ����
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		}
		catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
