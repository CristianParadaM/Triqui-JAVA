package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import controller.Controller;

/** Clase que maneja el objeto JPanelPlay.java
 *
 * @author Cristian David Parada Martinez
 * @date 12/05/2021
 *
 */
public class JLabelPlay extends JLabel {

	private static final long serialVersionUID = 1L;
	private boolean isEditable;
	private int x;
	private int y;
	
	/** Constructor de JPanelPlay
	 * 
	 */
	public JLabelPlay(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.isEditable = true;
		init();
	}

	/** Metodo que
	 * 
	 */
	private void init() {
		this.setBorder(new LineBorder(Color.BLACK));
		this.setFont(new Font("Arial", Font.BOLD, 50));
		this.setForeground(Color.BLACK);
		this.setText("");
		this.setHorizontalAlignment(JLabel.CENTER);
		this.addMouseListener(Controller.getInstance());
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	/**
	 * @param isEditable the isEditable to set
	 */
	public void setEditableCell(boolean isEditable) {
		this.isEditable = isEditable;
	}

	public boolean isEditable() {
		return isEditable;
	}
	
	public String getTextCell() {
		return this.getText();
	}

	/**
	 * @return the x
	 */
	public int getXCoordenate() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getYCoordenate() {
		return y;
	}
	
	
	
}
