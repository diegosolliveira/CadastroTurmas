package Visao;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JPanel {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public static JLabel telaCadastro;
	public static JLabel telaIcon;
	public static JLabel imagemc;
	public static JLabel data;
	public static JLabel horas;

	public TelaInicial() throws ParseException {

		super();
		this.setBackground(Color.decode("#a2c8cf"));
		this.setVisible(true);
		setLayout(null);
		repaint();

		add(getTelaIcon());
		add(getTelaCadastro());
		add(getData());
		add(getImagemc());
		
	}

	public JLabel getImagemc() {
		if (imagemc == null) {

			ImageIcon imagem = new ImageIcon(getClass().getResource("PLANOdeFUNDO.png"));
			imagemc = new JLabel(imagem);
			imagemc.setBounds(0, 0, 800, 720);
		}

		return imagemc;
	}
	
	public JLabel getData() {
		if(data == null) {
			Date dtf3 = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					
			data = new JLabel(formato.format(dtf3));
			data.setBounds(710, 590, 420, 100);
			data.setFont(new Font("Serif", Font.BOLD, 14));
			data.setForeground(Color.WHITE);
		}
		
		return data;
	}

	public JLabel getTelaIcon() {
		if (telaIcon == null) {
			ImageIcon imagem = new ImageIcon(getClass().getResource("image.png"));
			telaIcon = new JLabel(imagem);
			telaIcon.setBounds(250, 45, 310, 325);
		}

		return telaIcon;
	}

	public JLabel getTelaCadastro() {
		if (telaCadastro == null) {
			telaCadastro = new JLabel("Cadastro de Turmas");
			telaCadastro.setBounds(190, 330, 400, 65);
			telaCadastro.setFont(new Font("Serif", Font.BOLD, 45));
			telaCadastro.setForeground(Color.WHITE);
		}

		return telaCadastro;
	}
}
