package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Aluno;
import Visao.PainelCadastroAluno;
import Visao.TelaInicial;

public class ControladorTelaAluno implements ActionListener {

	PainelCadastroAluno telaAluno;
	TelaInicial telaInicial;

	static ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public ControladorTelaAluno(PainelCadastroAluno telaAluno) {
		this.telaAluno = telaAluno;
		addEventos();
	}

	private void addEventos() {

		PainelCadastroAluno.botaoVoltar.addActionListener((ActionListener) this);
		PainelCadastroAluno.botaoCadastrar.addActionListener((ActionListener) this);
		PainelCadastroAluno.botaoLimpar.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == PainelCadastroAluno.botaoVoltar) {

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

		if (e.getSource() == PainelCadastroAluno.botaoCadastrar) {

			String nome = telaAluno.getTxtNomeA().getText();
			String rg = telaAluno.getTxtRGA().getText();
			String dataNascimento = telaAluno.getTxtDtnascA().getText();
			String cpf = telaAluno.getTxtCPFA().getText();
			String matricula = telaAluno.getTxtMatriculaA().getText();
			String curso = telaAluno.getTxtCurso().getText();
			int index = telaAluno.getComboSexoA().getSelectedIndex();
			String sexo = telaAluno.getComboSexoA().getActionCommand();

			// condição para pegar o valor do combobox e saber qual sexo será para adicionar
			// na string.

			if (index == 1) {
				sexo = "Feminino";
			} else if (index == 2) {
				sexo = "Masculino";
			}

			Aluno dadosAluno = new Aluno(nome, cpf, rg, dataNascimento, matricula, sexo, curso);
			alunos.add(dadosAluno);

			if (nome.length() == 0 || matricula.length() == 0 || curso.length() == 0 || sexo == "comboBoxChanged") {

				JOptionPane.showMessageDialog(telaAluno, "Campos vazios!");
			}

			else {
				if (ValidacaoCPF.isCPF(cpf) == false) {

					JOptionPane.showMessageDialog(telaAluno, "CPF Inválido!");
				}
				
				else if(ValidacaoDATA.isDate(dataNascimento) == false) {
					
					JOptionPane.showMessageDialog(telaAluno, "Data de Nascimento Inválida!");
				}

				else {
					
					JOptionPane.showMessageDialog(telaAluno,"CADASTRO REALIZADO!" + "\n\n\nNome: " + dadosAluno.getNome() + "\n" + "RG: "
														+ dadosAluno.getRg() + "\n" + "CPF: " + dadosAluno.getCpf() + "\n"
														+ "Data Nascimento: " + dadosAluno.getDataNascimento() + "\n" + "Matrícula: "
														+ dadosAluno.getMatricula() + "\n" + "Curso: " + dadosAluno.getCurso() + "\n"
														+ "Sexo: " + dadosAluno.getSexo() + "\n\n");
				}
			}
		}

		if (e.getSource() == PainelCadastroAluno.botaoLimpar) {

			telaAluno.getTxtNomeA().setText(null);
			telaAluno.getTxtCPFA().setText(null);
			telaAluno.getTxtCurso().setText(null);
			telaAluno.getTxtDtnascA().setText(null);
			telaAluno.getTxtRGA().setText(null);
			telaAluno.getTxtMatriculaA().setText(null);
			telaAluno.getComboSexoA().setSelectedIndex(0);
			JOptionPane.showMessageDialog(telaAluno, "Campos Limpos!");
		}

	}
}
