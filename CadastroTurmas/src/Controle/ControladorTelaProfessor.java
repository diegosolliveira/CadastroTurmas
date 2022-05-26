package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Professor;
import Visao.PainelCadastroProfessor;
import Visao.TelaInicial;

public class ControladorTelaProfessor implements ActionListener {

	PainelCadastroProfessor telaProfessor;
	TelaInicial telaInicial;
	
	static ArrayList<Professor> professores = new ArrayList<Professor>();
	
	public ControladorTelaProfessor(PainelCadastroProfessor telaProfessor) {
		this.telaProfessor = telaProfessor;
		addEventos();
	}

	private void addEventos() {

		PainelCadastroProfessor.botaoVoltar.addActionListener((ActionListener) this);
		PainelCadastroProfessor.botaoCadastrar.addActionListener((ActionListener) this);
		PainelCadastroProfessor.botaoLimpar.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == PainelCadastroProfessor.botaoVoltar) {

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

		if (e.getSource() == PainelCadastroProfessor.botaoCadastrar) {

			String nome = telaProfessor.getTxtNome().getText();
			String rg = telaProfessor.getTxtRG().getText();
			String dataNascimento = telaProfessor.getTxtDtnasc().getText();
			String cpf = telaProfessor.getTxtCPF().getText();
			String matricula = telaProfessor.getTxtMatricula().getText();
			String regimeTrabalho = telaProfessor.getTxtRegime().getText();
			String titulacao = telaProfessor.getTxtTitulacao().getText();
			String area = telaProfessor.getTxtArea().getText();
			int index = telaProfessor.getComboSexo().getSelectedIndex();
			String sexo = telaProfessor.getComboSexo().getActionCommand();
			
			//condição para pegar o valor do combobox e saber qual sexo será para adicionar na string.
			
			if(index == 1) {
				sexo = "Feminino";
			}
			else if(index == 2) {
				sexo = "Masculino";
			}
			
			Professor dadosProfessor = new Professor(nome, cpf, rg, dataNascimento, matricula, area, titulacao, regimeTrabalho, sexo);
			professores.add(dadosProfessor);

			if (nome.length() == 0 || matricula.length() == 0 || regimeTrabalho.length() == 0 || titulacao.length() == 0
					|| sexo == "comboBoxChanged" || area.length() == 0) {

				JOptionPane.showMessageDialog(telaProfessor, "Campos vazios!");
			}

			else {
				if(ValidacaoCPF.isCPF(cpf) == false) {
					
					JOptionPane.showMessageDialog(telaProfessor, "CPF Inválido!");
				}
				
				else if(ValidacaoDATA.isDate(dataNascimento) == false) {
					
					JOptionPane.showMessageDialog(telaProfessor, "Data de Nascimento Inválida!");
				}
				
				else {
					JOptionPane.showMessageDialog(telaProfessor, "CADASTRO REALIZADO!"
							+ "\n\n\nNome: " + dadosProfessor.getNome() 
								+ "\n" + "RG: " +  dadosProfessor.getRg() + "\n" 
								+ "CPF: " + dadosProfessor.getCpf() + "\n"
								+ "Data Nascimento: " +  dadosProfessor.getDataNascimento() + "\n" 
								+ "Matrícula: " + dadosProfessor.getMatricula() + "\n"
								+ "Area: " +  dadosProfessor.getArea() + "\n"
								+ "Regime de Trabalho: " + dadosProfessor.getRegimeTrabalho() + "\n"
								+ "Titulação: " + dadosProfessor.getTitulacao() + "\n"
								+ "Sexo: " +  dadosProfessor.getSexo() + "\n\n");
				} 
			}
		}

		if (e.getSource() == PainelCadastroProfessor.botaoLimpar) {

			telaProfessor.getTxtArea().setText(null);
			telaProfessor.getTxtCPF().setText(null);
			telaProfessor.getTxtDtnasc().setText(null);
			telaProfessor.getTxtMatricula().setText(null);
			telaProfessor.getTxtNome().setText(null);
			telaProfessor.getTxtRegime().setText(null);
			telaProfessor.getTxtRG().setText(null);
			telaProfessor.getTxtTitulacao().setText(null);
			telaProfessor.getComboSexo().setSelectedIndex(0);
			JOptionPane.showMessageDialog(telaProfessor, "Campos Limpos!");
		}

	}
}
