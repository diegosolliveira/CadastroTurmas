package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.PeriodoLetivo;
import Visao.PainelCadastroPL;
import Visao.TelaInicial;

public class ControladorTelaPL implements ActionListener{

	PainelCadastroPL telaPL;
	TelaInicial telaInicial;
	
	static ArrayList<PeriodoLetivo> periodos = new ArrayList<PeriodoLetivo>();
	
	public ControladorTelaPL (PainelCadastroPL telaPL) {
		this.telaPL = telaPL;
		addEventos();
	}

	private void addEventos() {

		PainelCadastroPL.botaoVoltar.addActionListener((ActionListener) this);
		PainelCadastroPL.botaoCadastrar.addActionListener((ActionListener) this);
		PainelCadastroPL.botaoLimpar.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == PainelCadastroPL.botaoVoltar) {
			
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

		if(e.getSource() == PainelCadastroPL.botaoCadastrar) {
			
			String diasLetivos = telaPL.getTxtDiasPL().getText();
			String dataFim = telaPL.getTxtFimPL().getText();
			String dataInicio = telaPL.getTxtInicioPL().getText();
			String nome = telaPL.getTxtPeriodoL().getText();

			PeriodoLetivo dadosPL = new PeriodoLetivo(nome, dataInicio, dataFim, diasLetivos);
			periodos.add(dadosPL);

			if (diasLetivos.length() == 0 || nome.length() == 0) {

				JOptionPane.showMessageDialog(telaPL, "Campos vazios!");
			}

			else {
				if(ValidacaoDATA.isDate(dataInicio) == ValidacaoDATA.isDate(dataFim)) {
					
					JOptionPane.showMessageDialog(telaPL, "Datas Inválidas!");
				}
				
				else if(ValidacaoDATA.isDate(dataInicio) == false || ValidacaoDATA.isDate(dataFim) == false) {
					
					JOptionPane.showMessageDialog(telaPL, "Data Inválida!");
				}
				else{
					
					JOptionPane.showMessageDialog(telaPL, "Cadastro realizado!"
													+ "\n\n\nNome: " + dadosPL.getNome()
													+ "\nData Inicio: " + dadosPL.getDataInicio()
													+ "\nDataFim: " + dadosPL.getDataFim()
													+ "\nDias Letivos: " + dadosPL.getDiasLetivos());
				}
			}
		}
		
		if (e.getSource() == PainelCadastroPL.botaoLimpar) {

			telaPL.getTxtDiasPL().setText(null);
			telaPL.getTxtFimPL().setText(null);
			telaPL.getTxtInicioPL().setText(null);
			telaPL.getTxtPeriodoL().setText(null);
			
			JOptionPane.showMessageDialog(telaPL, "Campos Limpos!");
		}
	}
}
