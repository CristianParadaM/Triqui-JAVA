package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;

/** Clase que maneja el objeto JFrameMainWindow.java
 *
 * @author Cristian David Parada Martinez
 * @date 12/05/2021
 *
 */
public class JFrameMainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabelPlay jLabelPlay00;
	private JLabelPlay jLabelPlay01;
	private JLabelPlay jLabelPlay02;
	private JLabelPlay jLabelPlay10;
	private JLabelPlay jLabelPlay11;
	private JLabelPlay jLabelPlay12;
	private JLabelPlay jLabelPlay20;
	private JLabelPlay jLabelPlay21;
	private JLabelPlay jLabelPlay22;
	
	/** Constructor de JFrameMainWindow
	 * @param jLabelPlay00
	 * @param jLabelPlay01
	 * @param jLabelPlay02
	 * @param jLabelPlay10
	 * @param jLabelPlay11
	 * @param jLabelPlay12
	 * @param jLabelPlay20
	 * @param jLabelPlay21
	 * @param jLabelPlay22
	 * @throws HeadlessException
	 */
	public JFrameMainWindow(){
		super();
		this.jLabelPlay00 = new JLabelPlay(0,0);
		this.jLabelPlay01 = new JLabelPlay(0,1);
		this.jLabelPlay02 = new JLabelPlay(0,2);
		this.jLabelPlay10 = new JLabelPlay(1,0);
		this.jLabelPlay11 = new JLabelPlay(1,1);
		this.jLabelPlay12 = new JLabelPlay(1,2);
		this.jLabelPlay20 = new JLabelPlay(2,0);
		this.jLabelPlay21 = new JLabelPlay(2,1);
		this.jLabelPlay22 = new JLabelPlay(2,2);
		init();
	}


	/** Metodo que
	 * 
	 */
	public void init() {
		this.setLayout(new GridLayout(3,3));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(300,300));
		this.setLocationRelativeTo(null);
		this.add(jLabelPlay00);
		this.add(jLabelPlay01);
		this.add(jLabelPlay02);
		this.add(jLabelPlay10);
		this.add(jLabelPlay11);
		this.add(jLabelPlay12);
		this.add(jLabelPlay20);
		this.add(jLabelPlay21);
		this.add(jLabelPlay22);
		this.setVisible(true);
	}
	
	/** Metodo que
	 * 
	 */
	public void rematch() {
		for (int i = 0; i < this.getContentPane().getComponentCount(); i++) {
			((JLabelPlay)this.getContentPane().getComponent(i)).setText("");
			((JLabelPlay)this.getContentPane().getComponent(i)).setEditableCell(true);
		}
	}
	
}
