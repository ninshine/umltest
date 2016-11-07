import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class CalculatorForm {

	private JFrame frame;
	private Calculator C = new Calculator();
	private JTextField textField_Cr;
	private JTextField textField_Cs;
	private JTextField textField_Ta;
	private JTextField textField_Ts;
	private JTextField textField_Tb;
	private JTextField textField_Tc;
	private JTextField textField_r;
	private JTextField textField_h;
	private JTextField textField_Cv;
	private JTextField textField_a;
	private JTextField textField_b;
	private JTextField textField_c;
	private JTextField textField_Th;
	private JTextField textField_Tv;
	private JTextField textField_Ra;
	private JTextField textField_Rs;
	private JTextField textField_Rb;
	private JTextField textField_La;
	private JTextField textField_Lb;
	private JTextField textField_Lh;
	private JTextField textField_Lv;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorForm window = new CalculatorForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 438, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("面积", null, panel, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane_1, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(tabbedPane_1, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("圆面积", null, panel_1, null);
		
		textField_Cr = new JTextField();
		textField_Cr.setColumns(10);
		textField_Cr.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		JLabel label_3 = new JLabel("半径");
		
		JLabel label_4 = new JLabel("圆面积");
		
		textField_Cs = new JTextField();
		textField_Cs.setEditable(false);
		textField_Cs.setColumns(10);
		
		JButton button = new JButton("计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double r,s;//r圆的半径，s是圆的面积
				String tem_r,res_S;
				DecimalFormat df = new DecimalFormat("####.##");
				Calculator Cal= new Calculator();
				try{
					tem_r = textField_Cr.getText();
					if(tem_r.isEmpty()) throw new ReadError("圆的半径不能为空！");
					r = Double.parseDouble(tem_r);
					if(r>100) throw new ReadError("圆的半径请输入小于100的值");
					s = Cal.Shape2DGetS("Circle", r);
					res_S = df.format(s);
					textField_Cs.setText(res_S);
				}catch(Exception re){
					JOptionPane.showMessageDialog(null, re.getMessage(),"错误", JOptionPane.ERROR_MESSAGE); //弹出警告窗口
				}
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(38)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(textField_Cr, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(38)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(textField_Cs, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(16)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(5)
							.addComponent(label_3))
						.addComponent(textField_Cr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(5)
							.addComponent(label_4))
						.addComponent(textField_Cs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(button)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("三角形面积", null, panel_2, null);
		
		JLabel label_5 = new JLabel("三角形的边长");
		
		textField_Ta = new JTextField();
		textField_Ta.setColumns(10);
		textField_Ta.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();  
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		JLabel label_6 = new JLabel("三角形的面积");
		
		textField_Ts = new JTextField();
		textField_Ts.setEditable(false);
		textField_Ts.setColumns(10);
		
		
		textField_Tb = new JTextField();
		textField_Tb.setColumns(10);
		textField_Tb.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		
		textField_Tc = new JTextField();
		textField_Tc.setColumns(10);
		textField_Tc.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		
		JButton button_1 = new JButton("计算");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c,s;
				Calculator Cal= new Calculator();
				String tem_a, tem_b, tem_c, res_S;
				DecimalFormat df = new DecimalFormat("####.##");
				try{
					tem_a = textField_Ta.getText();
					if(tem_a.isEmpty()) throw new ReadError("三角形的边长不能为空！");
					tem_b = textField_Tb.getText();
					if(tem_b.isEmpty()) throw new ReadError("三角形的边长不能为空！");
					tem_c = textField_Tc.getText();
					if(tem_c.isEmpty()) throw new ReadError("三角形的边长不能为空！");
					a = Double.parseDouble(tem_a);
					b = Double.parseDouble(tem_b);
					c = Double.parseDouble(tem_c);
					if(a>100||b>100||c>100) throw new ReadError("三角形的边长请输入小于100的值");
					if((a+b)<=c||(a+c)<=b||(b+c)<=a) throw new TriangleError();
					s = Cal.Shape2DGetS("Triangle", a,b,c);
					res_S = df.format(s);
					textField_Ts.setText(res_S);
				}catch(Exception re){
					JOptionPane.showMessageDialog(null, re.getMessage(),"错误", JOptionPane.ERROR_MESSAGE); //弹出警告窗口
				}
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(34, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(textField_Ta, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_Tb, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_Tc, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_Ts, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
					.addGap(32))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(31)
					.addComponent(label_5)
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_Ta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Tb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Tc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(5)
							.addComponent(label_6))
						.addComponent(textField_Ts, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(button_1)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("长方形面积", null, panel_3, null);
		
		JLabel label_10 = new JLabel("长方形的长和宽");
		
		textField_Ra = new JTextField();
		textField_Ra.setColumns(10);
		textField_Ra.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9) || keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		JLabel label_11 = new JLabel("长方形的面积");
		
		textField_Rs = new JTextField();
		textField_Rs.setEditable(false);
		textField_Rs.setColumns(10);
		
		textField_Rb = new JTextField();
		textField_Rb.setColumns(10);
		textField_Rb.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		JButton button_4 = new JButton("计算");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,s;
				Calculator Cal= new Calculator();
				String tem_a, tem_b, res_S;
				DecimalFormat df = new DecimalFormat("####.##");
				try{
					tem_a = textField_Ra.getText();
					if(tem_a.isEmpty()) throw new ReadError("长方形的长不能为空！");
					tem_b = textField_Rb.getText();
					if(tem_b.isEmpty()) throw new ReadError("长方形的宽不能为空！");
					a = Double.parseDouble(tem_a);
					b = Double.parseDouble(tem_b);
					if(a>100||b>100) throw new ReadError("长方形的长宽请输入小于100的值");
					s = Cal.Shape2DGetS("Rectangle", a,b);
					res_S = df.format(s);
					textField_Rs.setText(res_S);
				}catch(Exception re){
					JOptionPane.showMessageDialog(null, re.getMessage(),"错误", JOptionPane.ERROR_MESSAGE); //弹出警告窗口
				}
			}
		});
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(62)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
									.addGap(35)
									.addComponent(textField_Rs, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(113)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(76)
							.addComponent(textField_Ra, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addGap(45)
							.addComponent(textField_Rb, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
					.addGap(76))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addGap(22)
					.addComponent(label_10)
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Ra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Rb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(5)
							.addComponent(label_11))
						.addComponent(textField_Rs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(button_4)
					.addGap(15))
		);
		panel_3.setLayout(gl_panel_3);
		panel.setLayout(gl_panel);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("体积", null, panel_4, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane_2, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane_2, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_2.addTab("圆柱体体积", null, panel_5, null);
		
		JLabel label_7 = new JLabel("半径");
		
		textField_r = new JTextField();
		textField_r.setColumns(10);
		textField_r.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		
		JLabel label_8 = new JLabel("高");
		
		textField_h = new JTextField();
		textField_h.setColumns(10);
		textField_h.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		
		textField_Cv = new JTextField();
		textField_Cv.setEditable(false);
		textField_Cv.setColumns(10);
		
		JLabel label_9 = new JLabel("圆柱体体积");
		
		JButton button_2 = new JButton("计算");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double r,h,v;//r圆的半径，s是圆的面积
				Calculator Cal= new Calculator();
				String tem_r, tem_h, res_V;
				DecimalFormat df = new DecimalFormat("####.##");
				try{
					tem_r = textField_r.getText();
					if(tem_r.isEmpty()) throw new ReadError("圆柱底面的半径不能为空！");
					tem_h = textField_h.getText();
					if(tem_h.isEmpty()) throw new ReadError("圆柱的高不能为空！");
					r = Double.parseDouble(tem_r);
					h = Double.parseDouble(tem_h);
					if(r>100) throw new ReadError("圆柱的底面半径请输入小于100的值");
					v = Cal.Shape3DGetV("Podetium","Circle",h, r);
					res_V = df.format(v);
					textField_Cv.setText(res_V);
				}catch(Exception re){
					JOptionPane.showMessageDialog(null, re.getMessage(),"错误", JOptionPane.ERROR_MESSAGE); //弹出警告窗口
				}
			}
		});
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(4)
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(134)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(4)
							.addComponent(textField_r, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(textField_h, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(36)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addComponent(textField_Cv, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7)
						.addComponent(label_8))
					.addGap(12)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_h, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(5)
							.addComponent(label_9))
						.addComponent(textField_Cv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(button_2)
					.addGap(17))
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("三棱柱体积", null, panel_6, null);
		
		JLabel label = new JLabel("三棱柱底面三角形的边长");
		
		textField_a = new JTextField();
		textField_a.setColumns(10);
		textField_a.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		
		textField_b = new JTextField();
		textField_b.setColumns(10);
		textField_b.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		
		textField_c = new JTextField();
		textField_c.setColumns(10);
		textField_c.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		
		textField_Th = new JTextField();
		textField_Th.setColumns(10);
		textField_Th.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		
		JLabel label_1 = new JLabel("三棱柱的高");
		
		JLabel label_2 = new JLabel("三棱柱的体积");
		
		textField_Tv = new JTextField();
		textField_Tv.setEditable(false);
		textField_Tv.setColumns(10);
		
		JButton button_3 = new JButton("计算");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c,h,v;
				Calculator Cal= new Calculator();
				String tem_a, tem_b, tem_c, tem_h, res_V;
				DecimalFormat df = new DecimalFormat("####.##");
				try{
					tem_a = textField_a.getText();
					if(tem_a.isEmpty()) throw new ReadError("三棱柱底面的边长不能为空！");
					tem_b = textField_b.getText();
					if(tem_b.isEmpty()) throw new ReadError("三棱柱底面的边长不能为空！");
					tem_c = textField_c.getText();
					if(tem_c.isEmpty()) throw new ReadError("三棱柱底面的边长不能为空！");
					tem_h = textField_Th.getText();
					if(tem_h.isEmpty()) throw new ReadError("三棱柱的高不能为空！");
					a = Double.parseDouble(tem_a);
					b = Double.parseDouble(tem_b);
					c = Double.parseDouble(tem_c);
					h = Double.parseDouble(tem_h);
					if(a>100||b>100||c>100) throw new ReadError("三棱柱底面的边长请输入小于100的值");
					if((a+b)<=c||(a+c)<=b||(b+c)<=a) throw new TriangleError();
					v = Cal.Shape3DGetV("Podetium","Triangle",h, a,b,c);
					res_V = df.format(v);
					textField_Tv.setText(res_V);
				}catch(Exception re){
					JOptionPane.showMessageDialog(null, re.getMessage(),"错误", JOptionPane.ERROR_MESSAGE); //弹出警告窗口
				}
			}
		});
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addComponent(textField_a, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_b, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_c, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(40)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(109)
							.addComponent(textField_Th, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(40)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(textField_Tv, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(154)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(240, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_a, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_b, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(11)
							.addComponent(label_1))
						.addComponent(textField_Th, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(textField_Tv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(button_3)
					.addContainerGap(7, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("长方体体积", null, panel_7, null);
		
		JLabel label_12 = new JLabel("长方体的底边长和宽");
		
		textField_La = new JTextField();
		textField_La.setColumns(10);
		textField_La.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		textField_Lb = new JTextField();
		textField_Lb.setColumns(10);
		textField_Lb.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		JLabel label_13 = new JLabel("长方体的高");
		
		textField_Lh = new JTextField();
		textField_Lh.setColumns(10);
		textField_Lh.addKeyListener(new KeyAdapter(){  
            public void keyTyped(KeyEvent e) {  
                int keyChar = e.getKeyChar();                 
                if((keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9)|| keyChar=='.'){  
                      
                }else{  
                    e.consume(); 
                }  
            }  
        });  
		
		JLabel label_14 = new JLabel("长方体的体积");
		
		textField_Lv = new JTextField();
		textField_Lv.setEditable(false);
		textField_Lv.setColumns(10);
		
		JButton button_5 = new JButton("计算");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,h,v;
				Calculator Cal= new Calculator();
				String tem_a, tem_b,tem_h, res_V;
				DecimalFormat df = new DecimalFormat("####.##");
				try{
					tem_a = textField_La.getText();
					if(tem_a.isEmpty()) throw new ReadError("长方体底面的长不能为空！");
					tem_b = textField_Lb.getText();
					if(tem_b.isEmpty()) throw new ReadError("长方体底面的宽不能为空！");
					tem_h = textField_Lh.getText();
					if(tem_h.isEmpty()) throw new ReadError("长方体的高不能为空！");
					a = Double.parseDouble(tem_a);
					b = Double.parseDouble(tem_b);
					h = Double.parseDouble(tem_h);
					if(a>100||b>100) throw new ReadError("长方体底面的长宽请输入小于100的值");
					v = Cal.Shape3DGetV("Podetium","Rectangle",h, a,b);
					res_V = df.format(v);
					textField_Lv.setText(res_V);
				}catch(Exception re){
					JOptionPane.showMessageDialog(null, re.getMessage(),"错误", JOptionPane.ERROR_MESSAGE); //弹出警告窗口
				}
			}
		});
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_7.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(40)
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(109)
							.addComponent(textField_Lh, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(40)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(textField_Lv, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(154)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
					.addGap(22))
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(63)
					.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(183, Short.MAX_VALUE))
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(60)
					.addComponent(textField_La, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
					.addGap(38)
					.addComponent(textField_Lb, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
					.addGap(61))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_7.createSequentialGroup()
					.addContainerGap(7, Short.MAX_VALUE)
					.addComponent(label_12)
					.addGap(12)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_La, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Lb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(11)
							.addComponent(label_13))
						.addComponent(textField_Lh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addComponent(label_14)
						.addComponent(textField_Lv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(button_5)
					.addContainerGap())
		);
		panel_7.setLayout(gl_panel_7);
		panel_4.setLayout(gl_panel_4);
		frame.getContentPane().setLayout(groupLayout);
		

		
	}
}
