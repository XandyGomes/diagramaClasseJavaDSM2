package test;

import java.util.Date;

import implement.Colaborador;
import implement.Parceiro;

public class Test {
  
  public static void main(String[] args) {

    Colaborador c1 = new Colaborador();
    c1.setBairro("centro");
    c1.setCidade("São Paulo");
    c1.setCpf("123456789");
    c1.setNasc(1980,10,3);
 
    Parceiro p1 = new Parceiro();
    p1.setBairro("Tião");
    p1.setFundacao(new Date(1980/10/3));

    System.out.println("Bairro: "+ c1.getBairro());
    System.out.println("Cidade: "+ c1.getCidade());
    System.out.println("CPF: "+ c1.getCpf());
    System.out.println("Bairro: "+ p1.getBairro());
    System.out.println("Fundação: "+ p1.getFundacao());
    System.out.println("Nascimento: "+ c1.getNasc());

  }

}
