package bombapatch;
import java.util.Date;
import java.util.Random;
import java.util.Collection;
import java.util.Arrays;

public class campeonato  {
    
    private clubes timeLocal;
	private clubes timeVisitante;
	private clubes times[]; 
    clubes aux;

    public campeonato(clubes times[] ) {
        this.times = times;
    }


	Random random = new Random();

    public void iniciarPartida(clubes casa, clubes fora) {
		
		int goltimedecasa = random.nextInt(5);
		int goltimedefora = random.nextInt(5);

		if(goltimedecasa > goltimedefora){
			
			casa.timeganhou(goltimedecasa-goltimedefora);
			fora.timeperdeu(goltimedecasa-goltimedefora);
			casa.setQtdVitorias(casa.getQtdVitorias()+1);
			fora.setQtdDerrotas(fora.getQtdDerrotas()+1);
		}
		//Vitória do Time de fora
		else if(goltimedefora > goltimedecasa){ 
			
			fora.timeganhou(goltimedefora-goltimedecasa);
			casa.timeperdeu(goltimedefora-goltimedecasa);
			fora.setQtdVitorias(fora.getQtdVitorias()+1);
			casa.setQtdDerrotas(casa.getQtdDerrotas()+1);		
		}
		// Empate
		else if (goltimedecasa == goltimedefora) { 
			casa.timeempatou();
			fora.timeempatou();
			fora.setQtdEmpates(fora.getQtdEmpates()+1);
			casa.setQtdEmpates(casa.getQtdEmpates()+1);
		}
		System.out.println("-----------------------------------------------------");
        System.out.println("Final da partida");
		System.out.println(casa.getNome() + " "
		+ goltimedecasa 
		+ " x " 
		+ goltimedefora + " " + fora.getNome());
		System.out.println("-----------------------------------------------------");
		}

		public void ordenacaotimes(){
            for (int i = 0; i < times.length; i++) {
                for (int j = i + 1; j < times.length;j++ ){
                     if(times[i].getQtdPontos() < times[j].getQtdPontos()){
                        aux = times[i];
                        times[i] = times[j];
                        times[j] = aux;


                     }
					 else if(times[i].getsadodegols() < times[j].getsadodegols()){
						aux = times[i];
                        times[i] = times[j];
                        times[j] = aux;
					 }
                    }
		
				}
                } 

		
	    public clubes campeao(){
			
			return times[0];
		}

		public void jogarCampeonato() {
			for (int i = 0; i < times.length; i++) {
				for (int j = i + 1; j < times.length; j++) {
					iniciarPartida(times [i], times[j]);
					iniciarPartida(times [j], times[i]);
			}
		    }		
        }
}   
			



		

		
	
     
	
	
