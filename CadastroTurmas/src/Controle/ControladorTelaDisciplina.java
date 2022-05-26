package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Disciplina;
import Visao.PainelCadastroDisciplina;
import Visao.TelaInicial;

public class ControladorTelaDisciplina implements ActionListener {

	PainelCadastroDisciplina telaDisciplina;
	TelaInicial telaInicial;
	
	static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public ControladorTelaDisciplina(PainelCadastroDisciplina telaDisciplina) {
		this.telaDisciplina = telaDisciplina;
		addEventos();
	}
	
	private void addEventos() {

		PainelCadastroDisciplina.botaoVoltar.addActionListener((ActionListener) this);
		PainelCadastroDisciplina.botaoCadastrar.addActionListener((ActionListener) this);
		PainelCadastroDisciplina.botaoLimpar.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == PainelCadastroDisciplina.botaoVoltar) {

			
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

		if (e.getSource() == PainelCadastroDisciplina.botaoCadastrar) {

			String codigo = telaDisciplina.getTxtCodigo().getText();
			String ementa = telaDisciplina.getEmentaPane().getText();
			String nome = telaDisciplina.getTxtDisciplina().getText();
			String cargaHoraria = telaDisciplina.getTxtCargaHoraria().getText();

			Disciplina dadosDisciplina = new Disciplina(nome, ementa, cargaHoraria, codigo);
			disciplinas.add(dadosDisciplina);

			if (codigo.length() == 0 || ementa.length() == 0 || nome.length() == 0 || cargaHoraria.length() == 0) {

				JOptionPane.showMessageDialog(telaDisciplina, "Campos vazios!");
			}

			else {

				JOptionPane.showMessageDialog(telaDisciplina, "Cadastro realizado!"
															+ "\n\n\nNome: " + dadosDisciplina.getNome()
															+ "\nCarga Horária: " + dadosDisciplina.getCargaHorario()
															+ "\nCodigo: " + dadosDisciplina.getCodigo()
															+ "\nEmenta: " + dadosDisciplina.getEmenta());
			}
		}

		if (e.getSource() == PainelCadastroDisciplina.botaoLimpar) {

			telaDisciplina.getTxtCodigo().setText(null);
			telaDisciplina.getTxtDisciplina().setText(null);
			telaDisciplina.getEmentaPane().setText(null);
			JOptionPane.showMessageDialog(telaDisciplina, "Campos Limpos!");
		}

	}
}
