package implement;

import java.util.Calendar;
import java.util.Date;

public abstract class Fisica extends Pessoa {

  private String cpf;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  private String rg;

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  private String genero;

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  private Date nasc;

  public Date getNasc() {
    return nasc;
  }
  
  public void setNasc(int ano, int mes, int dia) {
    Calendar calendar = Calendar.getInstance(); // Cria um objeto Calendar
    calendar.set(Calendar.YEAR, ano);   // Define o ano
    calendar.set(Calendar.MONTH, mes - 1); // Janeiro é representado pelo valor 0
    calendar.set(Calendar.DAY_OF_MONTH, dia);   // Define o dia do mês
    this.nasc = calendar.getTime();   // getTime() retorna um objeto java.util.Date
  }
  
}
