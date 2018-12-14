package cn.tedu.shoot;
import java.awt.image.BufferedImage;

/** 英雄機: 是飛行物 */
public class Hero extends FlyingObject {
	private static BufferedImage[] images; //英雄機圖片多張  所以做成數組
	static{
		images = new BufferedImage[6];
		for(int i = 0 ; i < images.length ; i++){
			images[i] = loadImage("hero" + i + ".png");
		}
	}
	
	private int life;
	private int doubleFire;
	
	/** 構造方法 Constructor */
	public Hero(){
		super(97, 124, 140, 400);
		this.life = 3; //默認3條命
		this.doubleFire = 0; //單倍火力
	}
	
	/** 英雄機隨著鼠標移動  x, y = 鼠標的x和y */
	public void moveTo(int x, int y){
		System.out.println("英雄機移動啦!");
	}
	
	/** 英雄機移動 */
	public void step(){
		System.out.println("英雄機切換圖片啦!");
	}
	
}
