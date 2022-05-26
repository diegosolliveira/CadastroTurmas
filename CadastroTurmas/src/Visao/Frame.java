package Visao;

import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private JMenuBar menuBarra;
	private JMenu menuCadastrar;
	private JMenuItem menuCadastroProfessor;
	private JMenuItem menuCadastroAluno;
	private JMenuItem menuCadastroClasse;
	private JMenuItem menuCadastroDisciplina;
	private JMenuItem menuCadastroPL;

	private static final long serialVersionUID = 1L;

	public Frame() throws ParseException {
		super("Cadastro");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 720);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setLayout(null);
		setResizable(false);
		setJMenuBar(getMenuBarra());
		repaint();

	}

	public JMenuBar getMenuBarra() {
		if (menuBarra == null) {
			menuBarra = new JMenuBar();
			menuBarra.add(getMenuCadastrar());
		}
		return menuBarra;
	}

	public JMenu getMenuCadastrar() {
		if (menuCadastrar == null) {
			menuCadastrar = new JMenu("Cadastrar");
			menuCadastrar.add(getMenuCadastrar());
			menuCadastrar.add(getMenuCadastroProfessor());
			menuCadastrar.add(getMenuCadastroAluno());
			menuCadastrar.add(getMenuCadastroDisciplina());
			menuCadastrar.add(getMenuCadastroPL());
			menuCadastrar.add(getMenuCadastroClasse());
		}

		return menuCadastrar;
	}

	public JMenuItem getMenuCadastroProfessor() {
		if (menuCadastroProfessor == null) {
			menuCadastroProfessor = new JMenuItem("Professor");
		}

		return menuCadastroProfessor;
	}

	public JMenuItem getMenuCadastroAluno() {
		if (menuCadastroAluno == null) {
			menuCadastroAluno = new JMenuItem("Aluno");
		}

		return menuCadastroAluno;
	}

	public JMenuItem getMenuCadastroClasse() {
		if (menuCadastroClasse == null) {
			menuCadastroClasse = new JMenuItem("Classe");
		}

		return menuCadastroClasse;
	}

	public JMenuItem getMenuCadastroDisciplina() {
		if (menuCadastroDisciplina == null) {
			menuCadastroDisciplina = new JMenuItem("Disciplina");
		}

		return menuCadastroDisciplina;
	}

	public JMenuItem getMenuCadastroPL() {
		if (menuCadastroPL == null) {
			menuCadastroPL = new JMenuItem("Período Letivo");
		}

		return menuCadastroPL;
	}
}
