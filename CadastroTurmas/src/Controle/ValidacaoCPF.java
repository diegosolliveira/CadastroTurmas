package Controle;

import java.util.InputMismatchException;

public class ValidacaoCPF {
	
	public static boolean isCPF(String CPF) {
		
		String novoCPF = CPF.replaceAll("\\p{Punct}", "");

        // considera-se erro CPF's formados por uma sequencia de numeros iguais
		
        if (novoCPF.equals("00000000000") ||
        	novoCPF.equals("11111111111") ||
        	novoCPF.equals("22222222222") || novoCPF.equals("33333333333") ||
        	novoCPF.equals("44444444444") || novoCPF.equals("55555555555") ||
        	novoCPF.equals("66666666666") || novoCPF.equals("77777777777") ||
        	novoCPF.equals("88888888888") || novoCPF.equals("99999999999") ||
            (novoCPF.length() != 11)) {
        	
        	return false;
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int
        
        try {
        	
        // Calculo do 1o. Digito Verificador
        	
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
            	
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            	
            num = (int)(novoCPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(novoCPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            
            if ((dig10 == novoCPF.charAt(9)) && (dig11 == novoCPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }

        public static String imprimeCPF(String novoCPF) {
            return(novoCPF.substring(0, 3) + "." + novoCPF.substring(3, 6) + "." +
            		novoCPF.substring(6, 9) + "-" + novoCPF.substring(9, 11));
        }
}
