package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public abstract class FlyingObject { //抽出所有類別共有屬性(超類), 讓派生類繼承
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
	public FlyingObject(){ //留著默認給英雄機, 天空, 子彈
		
	}
	public FlyingObject(int width, int height){ //抽出共有: 小敵機, 大敵機, 小蜜蜂
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(World.WIDTH - this.width);
		y = -this.height;
	}
	
	/** 飛行物移動 */
	public abstract void step();

	/** 加載/讀取圖片 */
	public static BufferedImage loadImage(String fileName){ //加參數是為了知道要讀取誰
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
