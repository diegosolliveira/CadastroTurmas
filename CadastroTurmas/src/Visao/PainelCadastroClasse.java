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
import javax.swing.border.MatteBorder;

public class PainelCadastroClasse extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static public JButton botaoCadastrar;
	static public JButton botaoLimpar;
	static public JButton botaoVoltar;
	static public JLabel tituloPrograma;
	static public JLabel subtAluno;
	static public JLabel subtProf;
	public static JLabel imagemc;

	static public JTextField txtNomeA;
	static public JTextField txtNomeP;
	static public JTextField txtDisciplina;
	static public JTextField txtPeriodoL;
	static public JTextField txtMatriculaA;
	static public JTextField txtMatriculaP;

	static public JLabel alunoNome;
	static public JLabel professorNome;
	static public JLabel disciplina;
	static public JLabel periodoLetivo;
	static public JLabel professorMatricula;
	static public JLabel alunoMatricula;

	public PainelCadastroClasse() throws ParseException {
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
		panel.add(getSubtAluno());
		panel.add(getSubtProf());
		panel.add(getDisciplina());
		panel.add(getPeriodoLetivo());
		panel.add(getAlunoNome());
		panel.add(getAlunoMatricula());
		panel.add(getProfessorNome());
		panel.add(getProfessorMatricula());
		panel.add(getTxtDisciplina());
		panel.add(getTxtPeriodoL());
		panel.add(getTxtNomeA());
		panel.add(getTxtMatriculaP());
		panel.add(getTxtNomeP());
		panel.add(getTxtMatriculaA());
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

	public JTextField getTxtDisciplina() {
		if (txtDisciplina == null) {
			txtDisciplina = new JTextField();
			txtDisciplina.setFont(new Font("Arian", Font.PLAIN, 13));
			txtDisciplina.setBackground(Color.decode("#f4fcfc"));
			txtDisciplina.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtDisciplina.setBounds(60, 50, 300, 24);
		}
		return txtDisciplina;
	}

	public JTextField getTxtPeriodoL() {
		if (txtPeriodoL == null) {
			txtPeriodoL = new JTextField();
			txtPeriodoL.setFont(new Font("Arian", Font.PLAIN, 13));
			txtPeriodoL.setBackground(Color.decode("#f4fcfc"));
			txtPeriodoL.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtPeriodoL.setBounds(420, 50, 155, 24);
		}
		return txtPeriodoL;
	}
	
	public JLabel getSubtAluno() {
		if(subtAluno == null) {
			subtAluno = new JLabel("Cadastrar Professor");
			subtAluno.setBounds(60, 150, 300, 24);
			subtAluno.setFont(new Font("Serif", Font.BOLD, 20));
			subtAluno.setForeground(Color.decode("#a2c8cf"));
		}
		return subtAluno;
	}
	
	public JLabel getSubtProf() {
		if(subtProf == null){
			subtProf = new JLabel("Cadastrar Alunos");
			subtProf.setBounds(60, 290, 300, 24);
			subtProf.setFont(new Font("Serif", Font.BOLD, 20));
			subtProf.setForeground(Color.decode("#a2c8cf"));
		}
		return subtProf;
	}
	
	public JLabel getDisciplina() {
		if(disciplina == null) {
			disciplina = new JLabel("Disciplina");
			disciplina.setBounds(60, 25, 290, 25);
			disciplina.setForeground(Color.decode("#a2c8cf"));
		}
		return disciplina;
	}

	public JLabel getPeriodoLetivo() {
		if(periodoLetivo == null) {
			periodoLetivo = new JLabel("Periodo Letivo");
			periodoLetivo.setBounds(420, 25, 280, 25);
			periodoLetivo.setForeground(Color.decode("#a2c8cf"));
		}
		return periodoLetivo;
	}
	
	public JLabel getAlunoNome() {
		if(alunoNome == null) {
			alunoNome = new JLabel("Nome Aluno");
			alunoNome.setBounds(60, 340, 310, 25);
			alunoNome.setForeground(Color.decode("#a2c8cf"));
		}
		return alunoNome;
	}
	
	public JLabel getAlunoMatricula() {
		if(alunoMatricula == null) {
			alunoMatricula = new JLabel("Nº Matricula do Aluno");
			alunoMatricula.setBounds(420, 340, 310, 25);
			alunoMatricula.setForeground(Color.decode("#a2c8cf"));
		}
		return alunoMatricula;
	}
	
	public JLabel getProfessorNome() {
		if(professorNome == null) {
			professorNome = new JLabel("Nome Professor");
			professorNome.setBounds(60, 200, 310, 25);
			professorNome.setForeground(Color.decode("#a2c8cf"));
		}
		return professorNome;
	}

	public JLabel getProfessorMatricula() {
		if(professorMatricula == null) {
			professorMatricula = new JLabel("Nº Matricula do Professor");
			professorMatricula.setBounds(420, 200, 310, 25);
			professorMatricula.setForeground(Color.decode("#a2c8cf"));
		}
		return professorMatricula;
	}

	public JTextField getTxtNomeA() {
		if (txtNomeA == null) {
			txtNomeA = new JTextField();
			txtNomeA.setBackground(Color.decode("#f4fcfc"));
			txtNomeA.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtNomeA.setBounds(60, 365, 270, 24);
		}
		return txtNomeA;
	}

	public JTextField getTxtMatriculaA() {
		if (txtMatriculaA == null) {
			txtMatriculaA = new JTextField();
			txtMatriculaA.setBackground(Color.decode("#f4fcfc"));
			txtMatriculaA.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtMatriculaA.setBounds(420, 365, 155, 24);
		}
		return txtMatriculaA;
	}

	public JTextField getTxtNomeP() {
		if (txtNomeP == null) {
			txtNomeP = new JTextField();
			txtNomeP.setBackground(Color.decode("#f4fcfc"));
			txtNomeP.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtNomeP.setBounds(60, 225, 245, 24);
		}
		return txtNomeP;
	}

	public JTextField getTxtMatriculaP() {
		if (txtMatriculaP == null) {
			txtMatriculaP = new JTextField();
			txtMatriculaP.setBackground(Color.decode("#f4fcfc"));
			txtMatriculaP.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(153, 204, 204)));
			txtMatriculaP.setBounds(420, 225, 155, 24);
		}
		return txtMatriculaP;
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
			tituloPrograma = new JLabel("Cadastro Classe");
			tituloPrograma.setBounds(275, 28, 310, 25);
			tituloPrograma.setFont(new Font("Serif", Font.BOLD, 35));
			tituloPrograma.setForeground(Color.WHITE);
		}

		return tituloPrograma;
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

}
