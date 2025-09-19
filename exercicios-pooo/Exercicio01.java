public class Exercicio01 {
     public class Vendedor {
          private int codigo;
          private String nome;
          private double percentualComissao;
      
          public Vendedor(int codigo, String nome, double percentualComissao) {
              this.codigo = codigo;
              this.nome = nome;
              this.percentualComissao = percentualComissao;
          }
      
          public int getCodigo() {
              return codigo;
          }
      
          public void setCodigo(int codigo) {
              this.codigo = codigo;
          }
      
          public String getNome() {
              return nome;
          }
      
          public void setNome(String nome) {
              this.nome = nome;
          }
      
          public double getPercentualComissao() {
              return percentualComissao;
          }
      
          public void setPercentualComissao(double percentualComissao) {
              this.percentualComissao = percentualComissao;
          }
      
          public double calcularPagamentoComissao(double valorVenda) {
              return valorVenda * percentualComissao / 100;
          }
      
          public double calcularPagamentoComissao(double valorVenda, double desconto) {
              return calcularPagamentoComissao(valorVenda) - desconto;
          }
      
          public String imprimir() {
              return "Código: " + codigo + "\nNome: " + nome + "\n% Comissão: " + percentualComissao;
          }
      
          public String imprimir(double valorVenda) {
              return imprimir() + "\nComissão: " + calcularPagamentoComissao(valorVenda);
          }
      
          public String imprimir(double valorVenda, double desconto) {
              return imprimir(valorVenda) + "\nComissão com desconto: " + calcularPagamentoComissao(valorVenda, desconto);
          }
      
          public static void main(String[] args) {
              Vendedor vendedor = new Vendedor(101, "João", 10.0);
      
              System.out.println(vendedor.imprimir());
              System.out.println(vendedor.imprimir(1000.0));
              System.out.println(vendedor.imprimir(1000.0, 50.0));
          }
      }
}
