
import java.awt.*;
import javax.swing.*;
public class BallGame2 extends JFrame{

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x = 100;//小球的横坐标
	double y = 100;//小球的纵坐标


	double degree = 3.14/3;//弧度，此处位弧度
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x,(int)y, null);
		
		x = x + 10*Math.cos(degree);//
		y = y + 10*Math.sin(degree);
		
		if(y > 705-40-30||y < 40+40) {//705是窗口高度，40桌子边框，30球直径，40标题栏宽度
			degree = -degree;
		}
		//碰到左右边界
		if(x < 40||x > 1212-40-30) {
			degree = 3.14-degree;
		}
	}
	//窗口加载
	void launchFrame() {
		setSize(1212,705);
		setLocation(50,50);
		setVisible(true);
		
		//重画窗口，每秒25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms,1s=1000ms，大约一秒画20次窗口 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	//main方法是程序执行入口
	public static void main(String[] args) {
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
