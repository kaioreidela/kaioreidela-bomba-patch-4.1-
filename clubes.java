package bombapatch;

public class clubes {

    private String nome;
    private int qtdPontos;
    private int qtdVitorias;
    private int qtdEmpates;
    private int qtdDerrotas;
    private int saldodegols;

    public clubes(String nome) {
        this.nome = nome;
        qtdPontos = 0;
        qtdVitorias = 0;
        qtdEmpates = 0;
        qtdDerrotas = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdPontos() {
        return qtdPontos;
    }
    public void setQtdPontos(int qtdPontos) {
        this.qtdPontos = qtdPontos;
    }
    public int getQtdVitorias() {
        return qtdVitorias;
    }
    public void setQtdVitorias(int qtdVitorias) {
        this.qtdVitorias = qtdVitorias;
    }
    public int getQtdEmpates() {
        return qtdEmpates;
    }
    public void setQtdEmpates(int qtdEmpates) {
        this.qtdEmpates = qtdEmpates;
    }
    public int getQtdDerrotas() {
        return qtdDerrotas;
    }
    public void setQtdDerrotas(int qtdDerrotas) {
        this.qtdDerrotas = qtdDerrotas;
    }
    public void timeganhou(int saldodegols) {
        this.qtdPontos+= 3;
        this.saldodegols += saldodegols;
    }
    public int getsadodegols() {
        return saldodegols;
    }

    public void timeempatou() {
        this.qtdPontos += 1;
    }

    public void timeperdeu(int saldodegols) {
        this.saldodegols -= saldodegols;
    }

}
    


