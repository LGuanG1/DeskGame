
import java.awt.*;
import javax.swing.*;
public class BallGame2 extends JFrame{

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x = 100;//С��ĺ�����
	double y = 100;//С���������


	double degree = 3.14/3;//���ȣ��˴�λ����
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x,(int)y, null);
		
		x = x + 10*Math.cos(degree);//
		y = y + 10*Math.sin(degree);
		
		if(y > 705-40-30||y < 40+40) {//705�Ǵ��ڸ߶ȣ�40���ӱ߿�30��ֱ����40���������
			degree = -degree;
		}
		//�������ұ߽�
		if(x < 40||x > 1212-40-30) {
			degree = 3.14-degree;
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
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
