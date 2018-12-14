package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;

/** 小蜜蜂 */
public class Bee extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i = 0 ; i < images.length ; i++){
			images[i] = loadImage("bee" + i + ".png");
		}
	}
	
	private int xSpeed; // 小蜜蜂會橫著走
	private int ySpeed;
	private int awardType; // 獎勵類型(0或1)
	public Bee(){
		super(60, 50);
		Random rand = new Random();
		xSpeed = 1;
		ySpeed = 2;
		awardType = rand.nextInt(2); //0到1之內的隨機數(2 = 0, 1)
	}
	
	/** 小蜜蜂移動 */
	public void step(){
		System.out.println("小蜜蜂的x座標移動了: " + xSpeed);
		System.out.println("小蜜蜂的y座標移動了: " + ySpeed);
	}
}
