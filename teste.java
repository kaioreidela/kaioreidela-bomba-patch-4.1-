import bombapatch.campeonato;
import bombapatch.clubes;

public class teste {
    public static void main(String[] args) throws Exception {
       clubes times[] = new clubes[4];
       times[0] = new clubes("\033[34m"+"Corvinal\033[0m");
       times[1] = new clubes("\033[33m"+"Lufa Lufa\033[0m");
       times[2] = new clubes("\033[32m"+"Sonserina\033[0m");
       times[3] = new clubes("\033[31m"+"Grifinoria\033[0m");

       System.out.println("-----------------------------------------------------");
       System.out.println("BOMBA PATCH TAÇA DAS CASAS 4.1");
       System.out.println("Time:" + times[0].getNome() +"\n"
       +"Time:" + times[1].getNome() +"\n"
       +"Time:" + times[2].getNome() +"\n"
       +"Time:" + times[3].getNome() +"\n");
       System.out.println("-----------------------------------------------------");

       System.out.println("Inicio do campeonato de casas"); 
       campeonato campeonato = new campeonato(times);
       campeonato.jogarCampeonato();


       System.out.println("Classificação:");
       for (int i = 0; i < times.length; i++) {
        
             campeonato.ordenacaotimes();
             System.out.println("-----------------------------------------------------");
             System.out.println("Time:" + times[i].getNome() +"\n"
             +"Pontos:" + times[i].getQtdPontos()+"\n"
             +"Numero de vitorias:" + times[i].getQtdVitorias()+"\n"
             +"Numero de derrotas:" + times[i].getQtdDerrotas());
             System.out.println("-----------------------------------------------------");
             System.out.println(campeonato.ordenacaotimes());
            }
        
       System.out.println("\033[97m" + campeonato.campeao().getNome() +"\033[97m" + " é o campeão!\033[0m");

    }
}
