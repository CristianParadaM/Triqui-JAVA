package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import model.Board;
import view.JFrameMainWindow;
import view.JLabelPlay;

/**
 * Clase que maneja el objeto Controller.java
 *
 * @author Cristian David Parada Martinez
 * @date 12/05/2021
 *
 */
public class Controller implements MouseListener {

	private static Controller controller = null;
	private Board board;
	private JFrameMainWindow view;

	public static Controller getInstance() {
		if (controller == null) {
			controller = new Controller();
		}
		return controller;
	}

	/**
	 * Constructor de Controller
	 * 
	 * @param board
	 * @param view
	 */
	private Controller() {
		super();
		this.board = new Board(new String[][] { { "", "", "" }, { "", "", "" }, { "", "", "" } });
	}

	public void init() {
		this.view = new JFrameMainWindow();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabelPlay jLabelPlay = ((JLabelPlay) e.getComponent());
		if (e.getButton() == 1) {
			if (jLabelPlay.isEditable()) {
				((JLabelPlay) e.getComponent()).setText("X");
				((JLabelPlay) e.getComponent()).setEditableCell(false);
			}
		} else {
			if (jLabelPlay.isEditable()) {
				((JLabelPlay) e.getComponent()).setText("O");
				((JLabelPlay) e.getComponent()).setEditableCell(false);
			}
		}
		board.play(jLabelPlay.getXCoordenate(), jLabelPlay.getYCoordenate(), ((JLabelPlay) e.getComponent()).getText());
		switch (board.analice()) {
		case 0:
			JOptionPane.showMessageDialog(null, "gano X");
			this.view.rematch();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "gano O");
			this.view.rematch();
			break;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
