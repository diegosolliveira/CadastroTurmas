package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Aluno;
import Modelo.Classe;
import Modelo.Disciplina;
import Modelo.PeriodoLetivo;
import Modelo.Professor;
import Visao.PainelCadastroAluno;
import Visao.PainelCadastroClasse;
import Visao.PainelCadastroDisciplina;
import Visao.PainelCadastroPL;
import Visao.PainelCadastroProfessor;
import Visao.TelaInicial;

public class ControladorTelaClasse implements ActionListener{

	PainelCadastroClasse telaClasse;
	PainelCadastroAluno telaAluno;
	PainelCadastroProfessor telaProfessor;
	PainelCadastroDisciplina telaDisciplina;
	PainelCadastroPL telaPL;
	TelaInicial telaInicial;
	
	static ArrayList<Classe> classes = new ArrayList<Classe>();
	
	public ControladorTelaClasse (PainelCadastroClasse telaClasse) {
		this.telaClasse = telaClasse;
		addEventos();
	}

	private void addEventos() {

		PainelCadastroClasse.botaoVoltar.addActionListener((ActionListener) this);
		PainelCadastroClasse.botaoCadastrar.addActionListener((ActionListener) this);
		PainelCadastroClasse.botaoLimpar.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == PainelCadastroClasse.botaoVoltar) {

			try {
				telaInicial = new TelaInicial();
			} catch (ParseException e1) {

				e1.printStackTrace();
			}
			ControladorFrame.frame.setContentPane(telaInicial);
			new ControladorTelaInicial(telaInicial);
			ControladorFrame.frame.repaint();
			ControladorFrame.frame.validate();
		}

		if(e.getSource() == PainelCadastroClasse.botaoCadastrar) {
			
			Aluno alunos = new Aluno(null, null, null, null, null, null, null);
			Professor professor = new Professor(null, null, null, null, null, null, null, null, null);
			Disciplina disciplina = new Disciplina(null, null, null, null);
			PeriodoLetivo periodoLetivo = new PeriodoLetivo(null, null, null, null);
			
			alunos = new Aluno(telaClasse.getTxtNomeA().getText(), alunos.getCpf(), alunos.getRg(), alunos.getDataNascimento(), telaClasse.getTxtMatriculaA().getText(), 
									alunos.getSexo(), alunos.getCurso());
			
			professor = new Professor(telaClasse.getTxtNomeP().getText(), professor.getArea(), professor.getRg(), professor.getDataNascimento(), 
										telaClasse.getTxtMatriculaP().getText(), professor.getArea(), professor.getTitulacao(),professor.getRegimeTrabalho(), professor.getSexo());
			
			disciplina = new Disciplina(telaClasse.getTxtDisciplina().getText(), disciplina.getEmenta(), disciplina.getCargaHorario(), disciplina.getCodigo());
			
			periodoLetivo = new PeriodoLetivo(telaClasse.getTxtPeriodoL().getText(), periodoLetivo.getDataInicio(), periodoLetivo.getDataFim(), periodoLetivo.getDiasLetivos());

			Classe dadosClasse = new Classe(alunos, alunos, professor, professor, disciplina, periodoLetivo);
			classes.add(dadosClasse);

			if (alunos.getNome().length() == 0 || alunos.getMatricula().length() == 0 || professor.getNome().length() == 0 || professor.getMatricula().length() == 0 || 
					disciplina.getNome().length() == 0 || periodoLetivo.getNome().length() == 0) {

				JOptionPane.showMessageDialog(telaClasse, "Campos vazios!");
			}
			
			else if(alunos.getMatricula() != telaClasse.getTxtMatriculaA().getText()) {
				
				JOptionPane.showMessageDialog(telaClasse, "Aluno não encontrado!");
				
			}
			else if(professor.getMatricula() != telaClasse.getTxtMatriculaP().getText()) {
							
				JOptionPane.showMessageDialog(telaClasse, "Professor não encontrado!");
							
			}
			else if(disciplina.getNome() != telaClasse.getTxtDisciplina().getText()) {
				
				JOptionPane.showMessageDialog(telaClasse, "Disciplina não encontrado!");
							
			}
			else if(periodoLetivo.getNome() != telaClasse.getTxtPeriodoL().getText()) {
				
				JOptionPane.showMessageDialog(telaClasse, "Periodo letivo não encontrado!");
							
			}
			else {

				JOptionPane.showMessageDialog(telaClasse, "Cadastro realizado!");
			}
		}
		
		if (e.getSource() == PainelCadastroClasse.botaoLimpar) {
			
			telaClasse.getTxtNomeA().setText(null);
			telaClasse.getTxtDisciplina().setText(null);
			telaClasse.getTxtMatriculaA().setText(null);
			telaClasse.getTxtMatriculaP().setText(null);
			telaClasse.getTxtNomeP().setText(null);
			telaClasse.getTxtPeriodoL().setText(null);
			JOptionPane.showMessageDialog(telaClasse, "Campos Limpos!");
		}
	}
}
