
import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x = 100;//С��ĺ�����
	double y = 100;//С���������
	boolean right = true;//����
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x,(int)y, null);
		if(right) {
			x = x + 10;
		}else {
			x = x - 10;
		}
		if(x > 1212-40-30) {//30��С���ֱ����40�����ӵı�Ե
			right = false;
		}
		if(x < 40) {
			right = true;
		}
	}
	//���ڼ���
	void launchFrame() {
		setSize(1212,705);
		setLocation(50,50);
		setVisible(true);
		
		//�ػ����ڣ�ÿ��25��
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms,1s=1000ms����Լһ�뻭20�δ��� 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	//main�����ǳ���ִ�����
	public static void main(String[] args) {
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
