package Visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

public class PainelCadastroPL extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static public JButton botaoCadastrar;
	static public JButton botaoLimpar;
	static public JButton botaoVoltar;
	static public JLabel tituloPrograma;
	public static JLabel imagemc;
	
	static public JLabel diasPL;
	static public JLabel inicioPL;
	static public JLabel fimPL;
	static public JLabel periodoLetivo;

	static public JFormattedTextField txtInicioPL;
	static public JFormattedTextField txtFimPL;
	static public JFormattedTextField txtDiasPL;
	static public JTextField txtPeriodoL;

	public PainelCadastroPL() throws ParseException {
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
		panel.add(getTxtPeriodoL());
		panel.add(getTxtInicioPL());
		panel.add(getTxtFimPL());
		panel.add(getTxtDiasPL());
		panel.add(getPeriodoLetivo());
		panel.add(getInicioPL());
		panel.add(getFimPL());
		panel.add(getDiasPL());
		add(getBotaoVoltar());
		add(getBotaoLimpar());
		add(getBotaoCadastrar());
		add(getImagemc());
			
		Data();
		
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
			tituloPrograma = new JLabel("Cadastro Período Letivo");
			tituloPrograma.setBounds(205, 28, 410, 40);
			tituloPrograma.setFont(new Font("Serif", Font.BOLD, 35));
			tituloPrograma.setForeground(Color.WHITE);
		}
		return tituloPrograma;
	}
	
	public JTextField getTxtPeriodoL() {
		if(txtPeriodoL == null) {
			txtPeriodoL = new JTextField();
			txtPeriodoL.setFont(new Font("Arian", Font.PLAIN, 13));
			txtPeriodoL.setBackground(Color.decode("#f4fcfc"));
			txtPeriodoL.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtPeriodoL.setBounds(60, 50, 190, 24);
		}
		return txtPeriodoL;
	}
	
	public JFormattedTextField getTxtInicioPL() {
		if(txtInicioPL == null) {
			txtInicioPL = new JFormattedTextField();
			txtInicioPL.setFont(new Font("Arian", Font.PLAIN, 13));
			txtInicioPL.setBackground(Color.decode("#f4fcfc"));
			txtInicioPL.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtInicioPL.setBounds(60, 150, 190, 24);
		}
		return txtInicioPL;
	}
	
	public JFormattedTextField getTxtFimPL() {
		if(txtFimPL == null) {
			txtFimPL = new JFormattedTextField();
			txtFimPL.setFont(new Font("Arian", Font.PLAIN, 13));
			txtFimPL.setBackground(Color.decode("#f4fcfc"));
			txtFimPL.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtFimPL.setBounds(60, 250, 190, 24);
		}
		return txtFimPL;
	}
	
	public JFormattedTextField getTxtDiasPL() {
		if(txtDiasPL == null) {
			txtDiasPL = new JFormattedTextField();
			txtDiasPL.setFont(new Font("Arian", Font.PLAIN, 13));
			txtDiasPL.setBackground(Color.decode("#f4fcfc"));
			txtDiasPL.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtDiasPL.setBounds(60, 350, 190, 24);
		}
		return txtDiasPL;
	}
	
	public JLabel getPeriodoLetivo() {
		if(periodoLetivo == null) {
			periodoLetivo = new JLabel("Periodo Letivo");
			periodoLetivo.setBounds(60, 25, 290, 25);
			periodoLetivo.setForeground(Color.decode("#a2c8cf"));
		}
		return periodoLetivo;
	}
	
	public JLabel getInicioPL() {
		if(inicioPL == null) {
			inicioPL = new JLabel("Data de Inicio do Período Letivo");
			inicioPL.setBounds(60, 125, 280, 25);
			inicioPL.setForeground(Color.decode("#a2c8cf"));
		}
		return inicioPL;
	}
	
	public JLabel getFimPL() {
		if(fimPL == null) {
			fimPL = new JLabel("Data de Termino do Período Letivo");
			fimPL.setBounds(60, 225, 280, 25);
			fimPL.setForeground(Color.decode("#a2c8cf"));
		}
		
		return fimPL;
	}
	
	public JLabel getDiasPL() {
		if(diasPL == null) {
			diasPL = new JLabel("Dias de Períodos Letivos");
			diasPL.setBounds(60, 325, 280, 25);
			diasPL.setForeground(Color.decode("#a2c8cf"));
		}
		return diasPL;
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
	
	public void Data() {

		try {

			MaskFormatter mascaraDATA = new MaskFormatter("##/##/####");
			mascaraDATA.install(txtFimPL);
			mascaraDATA.install(txtInicioPL);

		} catch (ParseException e) {

			JOptionPane.showMessageDialog(null, "Data Inválida!");
		}
	}
}
