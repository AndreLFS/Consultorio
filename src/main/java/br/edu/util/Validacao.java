/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author cra-dti-04
 */
public class Validacao {
    Date  nascimento = null;
    //converte a data para o tipo date
    public Date converterIdade(String dataNascimento){
        //usado para testar se a data esta valida
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        //configuração para o teste
        df.setLenient(false);
        try {
            //linha que testa se esta certo
            df.parse (dataNascimento);
            //armazena na variavel nascimento
            nascimento = (java.util.Date)df.parse(dataNascimento);
        } catch (ParseException e) {
            //mostra o erro
           System.out.println("Erro na conversao da data "+ e);
           return null;
        }
        return nascimento;
    }
    
    public boolean isCPF(String CPF) {
        //tirar a mascara do cpf
    	StringBuffer pkWithoutMask = new StringBuffer("");
    	String pk = CPF;
    	try {
            if (pk != null) {
            for (int i = 0; pk.length() > i; i++) {
                    //carcter de mascara q ele vai remover
                    if (pk.charAt(i) != '-') {
                            pkWithoutMask.append(pk.charAt(i));
                    }
            }
            }
        }catch (Exception e) {
                e.printStackTrace();			
        }
        //salvando o cpf sem mascara na sua variavel
        CPF = pkWithoutMask.toString().trim();
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
           (CPF.length() != 11))
           return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
          sm = 0;
          peso = 10;
          for (i=0; i<9; i++) {              
            // converte o i-esimo caractere do CPF em um numero:
            // por exemplo, transforma o caractere '0' no inteiro 0         
            // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(CPF.charAt(i) - 48); 
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
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
          }

          r = 11 - (sm % 11);
          if ((r == 10) || (r == 11))
             dig11 = '0';
          else dig11 = (char)(r + 48);

          // Verifica se os digitos calculados conferem com os digitos informados.
          if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
             return(true);
          else return(false);
        } catch (InputMismatchException e) {
            System.out.println("Erro na conversao do cpf " + e);
            return(false);
        }
    }
    
}
