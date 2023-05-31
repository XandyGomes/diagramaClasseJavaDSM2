package implement;

public class Parceiro extends Juridica {

  private String tipoPessoa;
  private float desempenho;

  //método cadatrar
  public void cadastrar() {
    System.out.println("Parceiro cadastrado com sucesso!");
  }

  public void bloquear() {
    System.out.println("Parceiro bloqueado com sucesso!");
  } 

  public void excluir() {
    System.out.println("Parceiro excluído com sucesso!");
  }

  public String getTipoPessoa() {
    return tipoPessoa;
  }

  public void setTipoPessoa(String tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  public float getDesempenho() {
    return desempenho;
  }

  public void setDesempenho(float desempenho) {
    this.desempenho = desempenho;
  }

}
