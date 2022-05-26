package Visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

public class PainelCadastroAluno extends JPanel {

	private static final long serialVersionUID = 1L;

	static public JButton botaoCadastrar;
	static public JButton botaoLimpar;
	static public JButton botaoVoltar;
	static public JLabel tituloPrograma;
	public static JLabel imagemc;

	static public JTextField txtNomeA;
	static public JFormattedTextField txtRGA;
	static public JFormattedTextField txtCPFA;
	static public JFormattedTextField txtDtnascA;
	static public JComboBox<String> comboSexoA;
	static public JTextField txtMatriculaA;
	static public JTextField txtCurso;

	static public JLabel alunoNome;
	static public JLabel alunoRG;
	static public JLabel alunoCPF;
	static public JLabel alunoSexo;
	static public JLabel alunoDataNascimento;
	static public JLabel alunoCurso;
	static public JLabel alunoMatricula;

	public PainelCadastroAluno() throws ParseException {

		super();
		this.setBackground(Color.decode("#a2c8cf"));
		this.setVisible(true);
		setLayout(null);
		repaint();

		// criando outro painel para deixar uma parte em branco diferenciando da cor do
		// painel de fundo

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#f4fcfc"));
		panel.setBounds(65, 70, 645, 520);
		panel.setLayout(null);
		add(panel);

		add(getTituloPrograma());
		add(getBotaoVoltar());
		add(getBotaoLimpar());
		add(getBotaoCadastrar());
		panel.add(getAlunoNome());
		panel.add(getAlunoRG());
		panel.add(getAlunoCPF());
		panel.add(getAlunoSexo());
		panel.add(getAlunoDataNascimento());
		panel.add(getAlunoCurso());
		panel.add(getAlunoMatricula());
		panel.add(getTxtNomeA());
		panel.add(getTxtRGA());
		panel.add(getTxtCPFA());
		panel.add(getTxtDtnascA());
		panel.add(getComboSexoA());
		panel.add(getTxtCurso());
		panel.add(getTxtMatriculaA());
		add(getImagemc());

		CPF();
		RG();
		Data();

		// mudar as cores dos botoes ao passa mouse em cima

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
		if (tituloPrograma == null) {
			tituloPrograma = new JLabel("Cadastro Aluno");
			tituloPrograma.setBounds(245, 28, 310, 25);
			tituloPrograma.setFont(new Font("Serif", Font.BOLD, 35));
			tituloPrograma.setForeground(Color.WHITE);
		}

		return tituloPrograma;
	}

	public JLabel getAlunoNome() {
		if (alunoNome == null) {
			alunoNome = new JLabel("Nome");
			alunoNome.setBounds(60, 25, 290, 25);
			alunoNome.setForeground(Color.decode("#a2c8cf"));

		}

		return alunoNome;
	}

	public JLabel getAlunoRG() {
		if (alunoRG == null) {

			alunoRG = new JLabel("RG");
			alunoRG.setBounds(60, 125, 280, 25);
			alunoRG.setForeground(Color.decode("#a2c8cf"));

		}

		return alunoRG;
	}

	public JLabel getAlunoCPF() {
		if (alunoCPF == null) {
			alunoCPF = new JLabel("CPF");
			alunoCPF.setBounds(60, 225, 280, 25);
			alunoCPF.setForeground(Color.decode("#a2c8cf"));

		}

		return alunoCPF;
	}

	public JLabel getAlunoSexo() {
		if (alunoSexo == null) {
			alunoSexo = new JLabel("Sexo");
			alunoSexo.setBounds(420, 125, 280, 25);
			alunoSexo.setForeground(Color.decode("#a2c8cf"));

		}

		return alunoSexo;
	}

	public JLabel getAlunoDataNascimento() {
		if (alunoDataNascimento == null) {
			alunoDataNascimento = new JLabel("Data de Nascimento");
			alunoDataNascimento.setBounds(420, 25, 280, 25);
			alunoDataNascimento.setForeground(Color.decode("#a2c8cf"));

		}

		return alunoDataNascimento;
	}

	public JLabel getAlunoCurso() {
		if (alunoCurso == null) {
			alunoCurso = new JLabel("Curso");
			alunoCurso.setBounds(60, 325, 280, 25);
			alunoCurso.setForeground(Color.decode("#a2c8cf"));

		}

		return alunoCurso;
	}

	public JLabel getAlunoMatricula() {
		if (alunoMatricula == null) {
			alunoMatricula = new JLabel("Matrícula");
			alunoMatricula.setForeground(Color.decode("#a2c8cf"));
			alunoMatricula.setBounds(60, 425, 280, 25);
		}

		return alunoMatricula;
	}

	public JTextField getTxtNomeA() {
		if (txtNomeA == null) {
			txtNomeA = new JTextField();
			txtNomeA.setFont(new Font("Arian", Font.PLAIN, 13));
			txtNomeA.setBackground(Color.decode("#f4fcfc"));
			txtNomeA.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtNomeA.setBounds(60, 50, 300, 24);

		}

		return txtNomeA;
	}

	public JFormattedTextField getTxtCPFA() {
		if (txtCPFA == null) {
			txtCPFA = new JFormattedTextField();
			txtCPFA.setFont(new Font("Arian", Font.PLAIN, 13));
			txtCPFA.setBackground(Color.decode("#f4fcfc"));
			txtCPFA.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtCPFA.setBounds(60, 250, 300, 24);

		}

		return txtCPFA;
	}

	public JFormattedTextField getTxtDtnascA() {
		if (txtDtnascA == null) {

			txtDtnascA = new JFormattedTextField();
			txtDtnascA.setFont(new Font("Arian", Font.PLAIN, 13));
			txtDtnascA.setBackground(Color.decode("#f4fcfc"));
			txtDtnascA.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtDtnascA.setBounds(420, 50, 130, 24);

		}

		return txtDtnascA;
	}

	public JFormattedTextField getTxtRGA() {
		if (txtRGA == null) {
			txtRGA = new JFormattedTextField();
			txtRGA.setFont(new Font("Arian", Font.PLAIN, 13));
			txtRGA.setBackground(Color.decode("#f4fcfc"));
			txtRGA.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtRGA.setBounds(60, 150, 300, 24);

		}

		return txtRGA;
	}

	public JComboBox<String> getComboSexoA() {
		if (comboSexoA == null) {
			comboSexoA = new JComboBox<String>();
			comboSexoA.setFont(new Font("Arian", Font.PLAIN, 13));
			comboSexoA.setBackground(Color.decode("#f4fcfc"));
			comboSexoA.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			comboSexoA.setBounds(420, 150, 130, 24);
			comboSexoA.addItem("");
			comboSexoA.addItem("Feminino");
			comboSexoA.addItem("Masculino");

		}

		return comboSexoA;
	}

	public JTextField getTxtCurso() {
		if (txtCurso == null) {
			txtCurso = new JTextField();
			txtCurso.setFont(new Font("Arian", Font.PLAIN, 13));
			txtCurso.setBackground(Color.decode("#f4fcfc"));
			txtCurso.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtCurso.setBounds(60, 350, 300, 24);

		}

		return txtCurso;
	}

	public JTextField getTxtMatriculaA() {
		if (txtMatriculaA == null) {
			txtMatriculaA = new JTextField();
			txtMatriculaA.setFont(new Font("Arian", Font.PLAIN, 13));
			txtMatriculaA.setBackground(Color.decode("#f4fcfc"));
			txtMatriculaA.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtMatriculaA.setBounds(60, 450, 300, 24);

		}

		return txtMatriculaA;
	}

	public JButton getBotaoCadastrar() {
		if (botaoCadastrar == null) {
			botaoCadastrar = new JButton("Cadastrar");
			botaoCadastrar.setBounds(450, 615, 100, 25);
			botaoCadastrar.setBackground(Color.WHITE);
			botaoCadastrar.setForeground(Color.GRAY);
			botaoCadastrar.setBorder(getBorder());

		}

		return botaoCadastrar;
	}

	public JButton getBotaoLimpar() {
		if (botaoLimpar == null) {
			botaoLimpar = new JButton("Limpar Dados");
			botaoLimpar.setBounds(325, 615, 120, 25);
			botaoLimpar.setBackground(Color.WHITE);
			botaoLimpar.setForeground(Color.GRAY);
			botaoLimpar.setBorder(getBorder());

		}

		return botaoLimpar;
	}

	public JButton getBotaoVoltar() {
		if (botaoVoltar == null) {
			botaoVoltar = new JButton("Inicio");
			botaoVoltar.setBounds(220, 615, 100, 25);
			botaoVoltar.setBackground(Color.WHITE);
			botaoVoltar.setForeground(Color.GRAY);
			botaoVoltar.setBorder(getBorder());

		}

		return botaoVoltar;
	}

	// criando as mascaras para RG, CPF e data

	public void CPF() {

		try {

			MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.install(txtCPFA);

		} catch (ParseException e) {

			JOptionPane.showMessageDialog(null, "CPF Inválido!");
		}
	}

	public void RG() {

		try {

			MaskFormatter mascaraRG = new MaskFormatter("##.###.###-##");
			mascaraRG.install(txtRGA);

		} catch (ParseException e) {

			JOptionPane.showMessageDialog(null, "RG Inválido!");
		}
	}

	public void Data() {

		try {

			MaskFormatter mascaraDATA = new MaskFormatter("##/##/####");
			mascaraDATA.install(txtDtnascA);

		} catch (ParseException e) {

			JOptionPane.showMessageDialog(null, "Data Inválida!");
		}
	}

}
