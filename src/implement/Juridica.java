package implement;

import java.util.Date;

public abstract class Juridica extends Pessoa {

  private String cnpj;

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  private String inscricaoEstadual;

  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  private Date fundacao;

  public Date getFundacao() {
    return fundacao;
  }

  public void setFundacao(Date fundacao) {
    this.fundacao = fundacao;
  }

}
