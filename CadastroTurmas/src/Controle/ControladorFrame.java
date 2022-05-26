package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import Visao.Frame;
import Visao.PainelCadastroAluno;
import Visao.PainelCadastroProfessor;
import Visao.PainelCadastroDisciplina;
import Visao.PainelCadastroPL;
import Visao.PainelCadastroClasse;
import Visao.TelaInicial;

public class ControladorFrame implements ActionListener {

	static Frame frame;

	private TelaInicial telaInicial;
	private PainelCadastroAluno telaAluno;
	private PainelCadastroProfessor telaProfessor;
	private PainelCadastroDisciplina telaDisciplina;
	private PainelCadastroPL telaPL;
	private PainelCadastroClasse telaClasse;
	
	public ControladorFrame() throws ParseException {
		frame = new Frame();
		
		telaInicial = new TelaInicial();
		telaAluno = new PainelCadastroAluno();
		telaProfessor = new PainelCadastroProfessor();
		telaClasse = new PainelCadastroClasse();
		telaDisciplina = new PainelCadastroDisciplina();
		telaPL = new PainelCadastroPL();
		
		new ControladorTelaInicial(telaInicial);
		new ControladorTelaAluno(telaAluno);
		new ControladorTelaProfessor(telaProfessor);
		new ControladorTelaDisciplina(telaDisciplina);
		new ControladorTelaPL(telaPL);
		new ControladorTelaClasse(telaClasse);

		new ControladorTelaInicial(telaInicial);
		frame.setContentPane(telaInicial);
		frame.repaint();
		frame.validate();
		addEventos();
	}

	public static void main(String[] args) throws ParseException {
		new ControladorFrame();
	}

	public void addEventos() {

		frame.getMenuCadastroAluno().addActionListener(this);
		frame.getMenuCadastroProfessor().addActionListener(this);
		frame.getMenuCadastroDisciplina().addActionListener(this);
		frame.getMenuCadastroDisciplina().addActionListener(this);
		frame.getMenuCadastroPL().addActionListener(this);
		frame.getMenuCadastroClasse().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == frame.getMenuCadastroAluno()) {
			frame.setContentPane(telaAluno);
			frame.repaint();
			frame.validate();
		}

		else if (e.getSource() == frame.getMenuCadastroProfessor()) {
			frame.setContentPane(telaProfessor);
			frame.repaint();
			frame.validate();
		}

		else if (e.getSource() == frame.getMenuCadastroDisciplina()) {
			frame.setContentPane(telaDisciplina);
			frame.repaint();
			frame.validate();
		}

		else if (e.getSource() == frame.getMenuCadastroPL()) {
			frame.setContentPane(telaPL);
			frame.repaint();
			frame.validate();
		}

		else if (e.getSource() == frame.getMenuCadastroClasse()) {
			frame.setContentPane(telaClasse);
			frame.repaint();
			frame.validate();
		}

	}
}
