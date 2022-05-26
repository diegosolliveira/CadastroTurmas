package Visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;

public class PainelCadastroDisciplina extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static  JButton botaoCadastrar;
	public static  JButton botaoLimpar;
	public static JButton botaoVoltar;
	public static JLabel tituloPrograma;
	public static JLabel imagemc;

	public static JTextField txtDisciplina;
	public static JTextField txtCodigo;
	public static JTextField txtCargaHoraria;

	public static  JLabel disciplina;
	public static  JLabel codigo;
	public static  JLabel ementa;
	public static JLabel cargaHoraria;

	public static  JTextPane ementaPane;

	public PainelCadastroDisciplina() throws ParseException {
		super();
		this.setBackground(Color.decode("#a2c8cf"));
		this.setVisible(true);
		setLayout(null);
		repaint();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#f4fcfc"));
		panel.setBounds(65, 70, 645, 520);
		panel.setLayout(null);
		add(panel);
		add(getTituloPrograma());
		panel.add(getDisciplina());
		panel.add(getCodigo());
		panel.add(getEmenta());
		panel.add(getTxtDisciplina());
		panel.add(getEmentaPane());
		panel.add(getTxtCodigo());
		panel.add(getTxtCargaHoraria());
		panel.add(getCargaHoraria());
		add(getBotaoVoltar());
		add(getBotaoLimpar());
		add(getBotaoCadastrar());
		add(getImagemc());
		
		botaoVoltar.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(Color.WHITE);

			}

			public void mouseEntered(MouseEvent e) {
				e.getComponent().setBackground(Color.decode("#e1e1e1"));

			}

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		botaoLimpar.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(Color.WHITE);

			}

			public void mouseEntered(MouseEvent e) {
				e.getComponent().setBackground(Color.decode("#e1e1e1"));

			}

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		botaoCadastrar.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			public void mouseExited(MouseEvent e) {
				e.getComponent().setBackground(Color.WHITE);

			}

			public void mouseEntered(MouseEvent e) {
				e.getComponent().setBackground(Color.decode("#e1e1e1"));

			}

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}
	
	public JLabel getImagemc() {
		if (imagemc == null) {

			ImageIcon imagem = new ImageIcon(getClass().getResource("PLANOdeFUNDO.png"));
			imagemc = new JLabel(imagem);
			imagemc.setBounds(0, 0, 800, 720);
		}

		return imagemc;
	}	
	
	public JLabel getTituloPrograma() {
		if(tituloPrograma == null) {
			tituloPrograma = new JLabel("Cadastro Disciplina");
			tituloPrograma.setBounds(245, 28, 310, 40);
			tituloPrograma.setFont(new Font("Serif", Font.BOLD, 35));
			tituloPrograma.setForeground(Color.WHITE);
		}
		return tituloPrograma;
	}
	
	public JLabel getDisciplina() {
		if(disciplina == null) {
			disciplina = new JLabel("Disciplina");
			disciplina.setBounds(60, 25, 290, 25);
			disciplina.setForeground(Color.decode("#a2c8cf"));
		}
		return disciplina;
	}
	
	public JLabel getCodigo() {
		if(codigo == null) {
			codigo = new JLabel("Código");
			codigo.setBounds(420, 25, 280, 25);
			codigo.setForeground(Color.decode("#a2c8cf"));
		}
		return codigo;
	}
	
	public JLabel getCargaHoraria() {
		if(cargaHoraria == null) {
			cargaHoraria = new JLabel("Carga Horária");
			cargaHoraria.setBounds(420, 125, 280, 25);
			cargaHoraria.setForeground(Color.decode("#a2c8cf"));
		}
		return cargaHoraria;
	}
	
	public JLabel getEmenta() {
		if(ementa == null) {
			ementa = new JLabel("Ementa");
			ementa.setBounds(60, 125, 280, 25);
			ementa.setForeground(Color.decode("#a2c8cf"));
		}
		return ementa;
	}

	public JTextField getTxtDisciplina() {
		if(txtDisciplina == null) {
			txtDisciplina = new JTextField();
			txtDisciplina.setFont(new Font("Arian", Font.PLAIN, 13));
			txtDisciplina.setBackground(Color.decode("#f4fcfc"));
			txtDisciplina.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtDisciplina.setBounds(60, 50, 300, 24);
		}
		return txtDisciplina;
	}

	public JTextField getTxtCodigo(){
		if(txtCodigo == null) {
			txtCodigo = new JTextField();
			txtCodigo.setFont(new Font("Arian", Font.PLAIN, 13));
			txtCodigo.setBackground(Color.decode("#f4fcfc"));
			txtCodigo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtCodigo.setBounds(420, 50, 130, 24);
		}
		return txtCodigo;
	}
	
	public JTextField getTxtCargaHoraria(){
		if(txtCargaHoraria == null) {
			txtCargaHoraria = new JTextField();
			txtCargaHoraria.setFont(new Font("Arian", Font.PLAIN, 13));
			txtCargaHoraria.setBackground(Color.decode("#f4fcfc"));
			txtCargaHoraria.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtCargaHoraria.setBounds(420, 150, 130, 24);
		}
		return txtCargaHoraria;
	}
	
	public JTextPane getEmentaPane() {
		if(ementaPane == null) {
			ementaPane = new JTextPane();
			ementaPane.setFont(new Font("Arian", Font.PLAIN, 13));
			ementaPane.setBackground(Color.WHITE);
			ementaPane.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			ementaPane.setBounds(60, 150, 300, 250);
		}
		return ementaPane;
	}
	
	public JButton getBotaoVoltar() {
		if(botaoVoltar == null) {
			botaoVoltar = new JButton("Inicio");
			botaoVoltar.setBounds(220, 615, 100, 25);
			botaoVoltar.setBackground(Color.WHITE);
			botaoVoltar.setForeground(Color.GRAY);
			botaoVoltar.setBorder(getBorder());
		}
		return botaoVoltar;
	}
	
	public JButton getBotaoLimpar() {
		if(botaoLimpar == null) {
			botaoLimpar = new JButton("Limpar Dados");
			botaoLimpar.setBounds(325, 615, 120, 25);
			botaoLimpar.setBackground(Color.WHITE);
			botaoLimpar.setForeground(Color.GRAY);
			botaoLimpar.setBorder(getBorder());
		}
		return botaoLimpar;
	}
	
	public JButton getBotaoCadastrar() {
		if(botaoCadastrar == null) {
			botaoCadastrar = new JButton("Cadastrar");
			botaoCadastrar.setBounds(450, 615, 100, 25);
			botaoCadastrar.setBackground(Color.WHITE);
			botaoCadastrar.setForeground(Color.GRAY);
			botaoCadastrar.setBorder(getBorder());
		}
		return botaoCadastrar;
	}
}
