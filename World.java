package cn.tedu.shoot;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class World extends JPanel {
	public static final int WIDTH = 400; //窗口寬
	public static final int HEIGHT = 700; //窗口高
	
	
	Sky sky = new Sky();
	Hero hero = new Hero();
	FlyingObject[] enemies = {};
	Bullet[] bullets = {};
	
	public void action(){ //啟動執行測試代碼
		sky.step();
		hero.step();
		
		enemies = new FlyingObject[9];
		enemies[0] = new Airplane();
		enemies[1] = new Airplane();
		enemies[2] = new Airplane();
		enemies[3] = new BigAirplane();
		enemies[4] = new BigAirplane();
		enemies[5] = new BigAirplane();
		enemies[6] = new Bee();
		enemies[7] = new Bee();
		enemies[8] = new Bee();
		
		for(int i = 0 ; i < enemies.length ; i++){
			FlyingObject f = enemies[i];
			System.out.println(f.width + ", " + f.height + ", " + f.x + ", " + f.y);
			f.step();
		}
		
		bullets = new Bullet[]{
				new Bullet(100, 200),
				new Bullet(300, 400)
		};
		for(int i = 0 ; i < bullets.length ; i++){
			Bullet b = bullets[i];
			System.out.println(b.x + ", " + b.y);
			b.step();
		}
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame(); //創建一個窗口對象
		World world = new World(); //創建了一個面板對象
		frame.add(world); //將面板添加到窗口中
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //設置關閉窗口時退出程序
		frame.setSize(WIDTH, HEIGHT); //設置窗口的大小
		frame.setLocationRelativeTo(null); //設置窗口居中顯示
		frame.setVisible(true); //設置窗口可見
		
		world.action(); //啟動執行程序
	}

}
