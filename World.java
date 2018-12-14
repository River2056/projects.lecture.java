package cn.tedu.shoot;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class World extends JPanel {
	public static final int WIDTH = 400; //���f�e
	public static final int HEIGHT = 700; //���f��
	
	
	Sky sky = new Sky();
	Hero hero = new Hero();
	FlyingObject[] enemies = {};
	Bullet[] bullets = {};
	
	public void action(){ //�Ұʰ�����եN�X
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
		JFrame frame = new JFrame(); //�Ыؤ@�ӵ��f��H
		World world = new World(); //�ЫؤF�@�ӭ��O��H
		frame.add(world); //�N���O�K�[�쵡�f��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�]�m�������f�ɰh�X�{��
		frame.setSize(WIDTH, HEIGHT); //�]�m���f���j�p
		frame.setLocationRelativeTo(null); //�]�m���f�~�����
		frame.setVisible(true); //�]�m���f�i��
		
		world.action(); //�Ұʰ���{��
	}

}
