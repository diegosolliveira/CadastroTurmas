package Visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PainelCadastroProfessor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static JButton botaoCadastrar;
	public static JButton botaoLimpar;
	public static JButton botaoVoltar;
	public static JLabel tituloPrograma;
	public static JLabel imagemc;

	static public JTextField txtNome;
	static public JFormattedTextField txtRG;
	static public JFormattedTextField txtCPF;
	static public JFormattedTextField txtDtnasc;
	static public JTextField txtArea;
	static public JComboBox<String> comboSexo;
	static public JTextField txtRegime;
	static public JTextField txtMatricula;
	static public JTextField txtTitulacao;

	static public JLabel professorNome;
	static public JLabel professorRG;
	static public JLabel professorCPF;
	static public JLabel professorSexo;
	static public JLabel professorDtnasc;
	static public JLabel professorArea;
	static public JLabel professorTitulacao;
	static public JLabel professorMatricula;
	static public JLabel professorRegime;

	public PainelCadastroProfessor() throws ParseException {

		super();
		this.setBackground(Color.decode("#a2c8cf"));
		this.setVisible(true);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#f4fcfc"));
		panel.setBounds(65, 70, 645, 520);
		panel.setLayout(null);
		add(panel);
		
		add(getTituloPrograma());
		add(getBotaoVoltar());
		add(getBotaoLimpar());
		add(getBotaoCadastrar());
		panel.add(getProfessorNome());
		panel.add(getProfessorRG());
		panel.add(getProfessorCPF());
		panel.add(getProfessorSexo());
		panel.add(getProfessorDtnasc());
		panel.add(getProfessorArea());
		panel.add(getProfessorMatricula());
		panel.add(getProfessorRegime());
		panel.add(getProfessorTitulacao());
		panel.add(getTxtArea());
		panel.add(getTxtCPF());
		panel.add(getTxtDtnasc());
		panel.add(getTxtMatricula());
		panel.add(getTxtNome());
		panel.add(getTxtRG());
		panel.add(getTxtRegime());
		panel.add(getTxtTitulacao());
		panel.add(getComboSexo());
		add(getImagemc());

		CPF();
		RG();
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
			tituloPrograma = new JLabel("Cadastro Professor");
			tituloPrograma.setBounds(245, 28, 310, 25);
			tituloPrograma.setFont(new Font("Serif", Font.BOLD, 35));
			tituloPrograma.setForeground(Color.WHITE);
		}
		
		return tituloPrograma;
	}
	
	public JLabel getProfessorNome() {
		if(professorNome == null) {
			professorNome = new JLabel("Nome");
			professorNome.setBounds(60, 25, 290, 25);
			professorNome.setForeground(Color.decode("#a2c8cf"));
		}
		
		return professorNome;
	}
	
	public JLabel getProfessorRG() {
		if(professorRG == null) {
			professorRG = new JLabel("RG");
			professorRG.setBounds(60, 125, 280, 25);
			professorRG.setForeground(Color.decode("#a2c8cf"));
		}
		
		return professorRG;
	}
	
	public JLabel getProfessorCPF() {
		if(professorCPF == null) {
			professorCPF = new JLabel("CPF");
			professorCPF.setBounds(60, 225, 280, 25);
			professorCPF.setForeground(Color.decode("#a2c8cf"));
		}
		
		return professorCPF;
	}
	
	public JLabel getProfessorSexo() {
		if(professorSexo == null) {
			professorSexo = new JLabel("Sexo");
			professorSexo.setBounds(420, 125, 280, 25);
			professorSexo.setForeground(Color.decode("#a2c8cf"));
		}
		
		return professorSexo;
	}
	
	public JLabel getProfessorDtnasc() {
		if(professorDtnasc == null) {
			professorDtnasc = new JLabel("Data de Nascimento");
			professorDtnasc.setBounds(420, 25, 280, 25);
			professorDtnasc.setForeground(Color.decode("#a2c8cf"));
		}
		
		return professorDtnasc;
	}
	
	public JLabel getProfessorRegime() {
		if(professorRegime == null) {
			professorRegime = new JLabel("Regime de Trabalho");
			professorRegime.setBounds(420, 325, 280, 25);
			professorRegime.setForeground(Color.decode("#a2c8cf"));
		}
		
		return professorRegime;
	}
	
	public JLabel getProfessorTitulacao() {
		if(professorTitulacao == null) {
			professorTitulacao = new JLabel("Titulaçao");
			professorTitulacao.setBounds(60, 325, 280, 25);
			professorTitulacao.setForeground(Color.decode("#a2c8cf"));
		}
		
		return professorTitulacao;
	}
	
	public JLabel getProfessorMatricula() {
		if(professorMatricula == null) {
			professorMatricula = new JLabel("Matrícula");
			professorMatricula.setBounds(420, 225, 280, 25);
			professorMatricula.setForeground(Color.decode("#a2c8cf"));
		}
		
		return professorMatricula;
	}
	public JLabel getProfessorArea() {
		if(professorArea == null) {
			professorArea = new JLabel("Área");
			professorArea.setForeground(Color.decode("#a2c8cf"));
			professorArea.setBounds(60, 425, 280, 25);
		}
		
		return professorArea;
	}
	
	public JTextField getTxtNome() {
		if(txtNome == null) {
			txtNome = new JTextField();
			txtNome.setFont(new Font("Arian", Font.PLAIN, 13));
			txtNome.setBackground(Color.decode("#f4fcfc"));
			txtNome.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtNome.setBounds(60, 50, 300, 24);
		}
		
		return txtNome;
	}
	
	public JFormattedTextField getTxtRG() {
		if(txtRG == null) {
			txtRG = new JFormattedTextField();
			txtRG.setFont(new Font("Arian", Font.PLAIN, 13));
			txtRG.setBackground(Color.decode("#f4fcfc"));
			txtRG.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtRG.setBounds(60, 150, 300, 24);
		}
		
		return txtRG;
	}
	
	public JFormattedTextField getTxtCPF() {
		if(txtCPF == null) {
			txtCPF = new JFormattedTextField();
			txtCPF.setFont(new Font("Arian", Font.PLAIN, 13));
			txtCPF.setBackground(Color.decode("#f4fcfc"));
			txtCPF.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtCPF.setBounds(60, 250, 300, 24);
		}
		
		return txtCPF;
	}
	
	public JFormattedTextField getTxtDtnasc() {
		if(txtDtnasc == null) {
			txtDtnasc = new JFormattedTextField();
			txtDtnasc.setFont(new Font("Arian", Font.PLAIN, 13));
			txtDtnasc.setBackground(Color.decode("#f4fcfc"));
			txtDtnasc.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtDtnasc.setBounds(420, 50, 130, 24);
		}
		
		return txtDtnasc;
	}

	public JComboBox<String> getComboSexo(){
		if(comboSexo == null) {
			comboSexo = new JComboBox<String>();
			comboSexo.setFont(new Font("Arian", Font.PLAIN, 13));
			comboSexo.setBackground(Color.decode("#f4fcfc"));
			comboSexo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			comboSexo.setBounds(420, 150, 130, 24);
			comboSexo.addItem("");
			comboSexo.addItem("Feminino");
			comboSexo.addItem("Masculino");
		}
		
		return comboSexo;
	}


	public JTextField getTxtMatricula() {
		if(txtMatricula == null) {
			txtMatricula = new JTextField();
			txtMatricula.setFont(new Font("Arian", Font.PLAIN, 13));
			txtMatricula.setBackground(Color.decode("#f4fcfc"));
			txtMatricula.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtMatricula.setBounds(420, 250, 130, 24);
		}
		
		return txtMatricula;
	}

	
	public JTextField getTxtTitulacao() {
		if(txtTitulacao == null) {
			txtTitulacao = new JTextField();
			txtTitulacao.setFont(new Font("Arian", Font.PLAIN, 13));
			txtTitulacao.setBackground(Color.decode("#f4fcfc"));
			txtTitulacao.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtTitulacao.setBounds(60, 350, 300, 24);
		}
		
		return txtTitulacao;
	}
	

	public JTextField getTxtRegime() {
		if(txtRegime == null) {
			txtRegime = new JTextField();
			txtRegime.setFont(new Font("Arian", Font.PLAIN, 13));
			txtRegime.setBackground(Color.decode("#f4fcfc"));
			txtRegime.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtRegime.setBounds(420, 350, 130, 24);
		}
		
		return txtRegime;
	}
	

	public JTextField getTxtArea() {
		if(txtArea == null) {
			txtArea = new JTextField();
			txtArea.setFont(new Font("Arian", Font.PLAIN, 13));
			txtArea.setBackground(Color.decode("#f4fcfc"));
			txtArea.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtArea.setBounds(60, 450, 300, 24);
		}
		return txtArea;
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
	
	// criando as mascaras para RG, CPF e data

		public void CPF() {

			try {

				MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
				mascaraCPF.install(txtCPF);

			} catch (ParseException e) {

				JOptionPane.showMessageDialog(null, "CPF Inválido!");
			}
		}

		public void RG() {

			try {

				MaskFormatter mascaraRG = new MaskFormatter("##.###.###-##");
				mascaraRG.install(txtRG);

			} catch (ParseException e) {

				JOptionPane.showMessageDialog(null, "RG Inválido!");
			}
		}

		public void Data() {

			try {

				MaskFormatter mascaraDATA = new MaskFormatter("##/##/####");
				mascaraDATA.install(txtDtnasc);

			} catch (ParseException e) {

				JOptionPane.showMessageDialog(null, "Data Inválida!");
			}
		}

}
