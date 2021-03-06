import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Roulette extends JPanel {
	// 5개 짜리 룰렛 경로
	private final static String ROULETTE_FIVE = "D:\\img\\5번.png";
	// 6개짜리 룰렛 경로
	private final static String ROULETTE_SIX = "D:\\img\\6번.png";
	// 8개 짜리 룰렛 경로
	private final static String ROULETTE_EIGHTH = "D:\\img\\8번.png";

	String showRoulette = ROULETTE_FIVE; // 룰렛화면, 기본은 5개짜리
	File f;
	BufferedImage bi;
	MyFrame2 win = null;

	public Roulette(MyFrame2 m) {
		setLayout(null);

		setBackground(Color.white);
		
		win = m;
		// 전체 패널
		JPanel pMain = new JPanel(); // 메인 패널 변수
		pMain.setBounds(0, 0, 520, 900);

//      pMain.setPreferredSize(new Dimension(550, 978));
		pMain.setLayout(new BoxLayout(pMain, BoxLayout.Y_AXIS));

		// 룰렛 패널
		JPanel pRoul = new JPanel(); // 룰렛 패널 변수
		pRoul.setSize(500, 400);
//      pRoul.setPreferredSize(new Dimension(550, 400));

		JLabel lRoul = new JLabel(); // 룰렛(이미지)을(를) 붙일 변수
		File imageRoulette = new File(ROULETTE_FIVE);

		try { // 처음 시작 메인 화면
			bi = ImageIO.read(imageRoulette);
			lRoul.setIcon(new ImageIcon(bi));
			pRoul.setPreferredSize(new Dimension(500, 400));
		} catch (IOException e) {
			e.printStackTrace();
		}

		pRoul.add(lRoul);
		pMain.add(pRoul);

		pRoul.setBorder(BorderFactory.createTitledBorder("Roulette"));

		// 버튼
		JPanel pBtn = new JPanel(); // 버튼 패널
		pBtn.setLayout(new BoxLayout(pBtn, BoxLayout.Y_AXIS));
		pBtn.setPreferredSize(new Dimension(550, 100));

		JPanel pbtn1 = new JPanel(); // 메인 버튼, 누르면 회전
		JButton sBtn = new JButton("회전");
		sBtn.setPreferredSize(new Dimension(150, 60));
		pbtn1.add(sBtn);
		pBtn.add(pbtn1);

		// 버튼(개수 버튼 1)

		JPanel otherP = new JPanel(); // 5분할 된 룰렛
		JButton btn1 = new JButton("5개");
		btn1.setPreferredSize(new Dimension(100, 60));
		otherP.add(btn1);

		// 버튼(개수 버튼 2)
		JButton btn2 = new JButton("6개"); // 6분할 된 룰렛
		btn2.setPreferredSize(new Dimension(100, 60));
		otherP.add(btn2);

		// 버튼(개수 버튼 3)
		JButton btn3 = new JButton("8개"); // 8분할 된 룰렛
		btn3.setPreferredSize(new Dimension(100, 60));
		otherP.add(btn3);
		pBtn.add(otherP);

		pBtn.setBorder(BorderFactory.createTitledBorder("메뉴"));

		class myThread extends Thread {
			public void run() {
				Random r = new Random();
				int time = Math.abs(r.nextInt()) % 1000;

				JPanel panel = new JPanel();
				JLabel label = new JLabel();
				for (int i = 0; i <= time; i += 3) { // i는 돌아가는 속도
					try {
						BufferedImage oldImage = ImageIO.read(new FileInputStream(showRoulette));
						BufferedImage newImage = new BufferedImage(oldImage.getHeight(), oldImage.getWidth(),
								oldImage.getType());
						Graphics2D graphics = (Graphics2D) newImage.getGraphics();
						graphics.rotate(Math.toRadians(i), newImage.getWidth() / 2, newImage.getHeight() / 2);
						graphics.translate((newImage.getWidth() - oldImage.getWidth()) / 2,
								(newImage.getHeight() - oldImage.getHeight()) / 2);
						graphics.drawImage(oldImage, 0, 0, oldImage.getWidth(), oldImage.getHeight(), null);
						ImageIcon icon = new ImageIcon(newImage);
						lRoul.setIcon(icon);
						repaint();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		}

		// 회전 버튼 이벤트 처리
		class ActionRotate implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == sBtn) {
					// 사진이 회전하게 만들어 주세요..
					Thread t = new myThread();
					t.start();
				}

			}

		}
		// 개수 버튼에 따른 이벤트 처리
		class Action1 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (arg0.getSource() == btn1) {
					// 5 버튼
					showRoulette = ROULETTE_FIVE;
					try {
						f = new File(ROULETTE_FIVE);
						bi = ImageIO.read(f);
						lRoul.setIcon(new ImageIcon(bi));
						pRoul.setPreferredSize(new Dimension(500, 400));
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else if (arg0.getSource() == btn2) {
					showRoulette = ROULETTE_SIX;
					try {

						f = new File(ROULETTE_SIX); // 6 사진 경로
						bi = ImageIO.read(f);
						lRoul.setIcon(new ImageIcon(bi));
						pRoul.setPreferredSize(new Dimension(500, 400));
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else if (arg0.getSource() == btn3) {
					showRoulette = ROULETTE_EIGHTH;
					try {
						f = new File(ROULETTE_EIGHTH); // 8사진 경로
						bi = ImageIO.read(f);
						lRoul.setIcon(new ImageIcon(bi));
						pRoul.setPreferredSize(new Dimension(500, 400));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		sBtn.addActionListener(new ActionRotate());
		btn1.addActionListener(new Action1());
		btn2.addActionListener(new Action1());
		btn3.addActionListener(new Action1());

		pMain.add(pBtn);

		// 텍스트 패널
		JPanel pText = new JPanel(); // 텍스트 패널
		pText.setSize(500, 250);
		pText.setPreferredSize(new Dimension(550, 250));

		JTextField tField = new JTextField(40); // 텍스트 필드. 입력 부분
		JButton tBtn = new JButton("입력"); // 입력 후 버튼 누를시 에리어에 추가
		JTextArea tArea = new JTextArea(11, 45); // 내용을 출력 받을 부분
		JScrollPane sPane = new JScrollPane(tArea); // 스크롤을 추가

		// 글 입력에 따른 이벤트 처리
		class Action2 implements ActionListener {
			int actionCnt = 0;

			@Override

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == tBtn || e.getSource() == tField) {
					String name = tField.getText();
					actionCnt++;
					tArea.append(actionCnt + "번째 메뉴 : " + name + "\n");
					tArea.setCaretPosition(tArea.getDocument().getLength());
					tField.setText("");
				}
			}
		}

		tBtn.addActionListener(new Action2()); // 버튼 누를시 이벤트 처리
		tField.addActionListener(new Action2()); // 텍스트 바에서 엔터 누를 시 이벤트 처리

		pText.setBorder(BorderFactory.createTitledBorder("메뉴"));

		pText.add(tField);
		pText.add(tBtn);
		pText.add(sPane);
		pMain.add(pText);

		add(pMain);

		//
		RoundedButton2 btn11 = new RoundedButton2("Roulette");
		btn11.setSize(130, 30);
		btn11.setLocation(0, 900);
		btn11.setForeground(Color.white);
		add(btn11);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("Roulette");
			}
		});
		RoundedButton2 btn21 = new RoundedButton2("Calculator");
		btn21.setSize(130, 30);
		btn21.setLocation(130, 900);
		add(btn21);
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("Calculator");
			}
		});
		RoundedButton2 btn31 = new RoundedButton2("Information");
		btn31.setSize(130, 30);
		btn31.setLocation(260, 900);
		add(btn31);
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("Information");
			}
		});
		RoundedButton2 btn4 = new RoundedButton2("Record");
		btn4.setSize(130, 30);
		btn4.setLocation(390, 900);
		add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("Record");
			}
		});

		//
		setVisible(true);
	}
}
