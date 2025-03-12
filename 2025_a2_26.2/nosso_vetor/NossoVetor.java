
public class NossoVetor {
   private int ocupacao;
   private int[] vetor;
   public NossoVetor(int tamanho) {
         vetor = new int [tamanho];
         ocupacao = 0 ;// por clareza 
   }
   public  NossoVetor() {
      this(10) ;
      
   }
   // public boolean insere (int i) {
   //    if (!estaCheio()) {
   //       vetor[ocupacao++] = i;
   //       return true;
   //    }
   //    return false;
   // }
   public void insere (int i ){
      if (estaCheio())  redimensonaVetor(vetor.length*2);
      vetor[ocupacao++] = i;
   }

   public boolean estaCheio() {
      if (ocupacao == vetor.length){
         return true ;
      }
      return false;
   }
   public boolean estaVazio(){
      return ocupacao==0 ;
   }
   // public int remove(){
   //    if (!estaVazio()){
   //       return vetor[--ocupacao];
   //    }
   //    return -1;
   // }
   public int remove (){
      int i = -1;
      if (!estaVazio()){
          i =  vetor[--ocupacao];
         if (vetor.length >= 4 && ocupacao <= vetor.length/4) redimensonaVetor(vetor.length/2);
      }
      return i ; 
      
   }
   @Override
   public String toString(){
      String s = "ocupacao = " + ocupacao + "\n";
      for (int i=0 ; i< ocupacao; i++){
         s += vetor[i] + " ";
      }
      return s + "\n";
   }
   private void redimensonaVetor(int novoTamanho){
      //  intancia um temporario com o dobro do tamanho
      int[] temp = new int[novoTamanho];
      // copiar todoa os elementos do vetor para o temporario
      for (int i=0; i< ocupacao; i++){ // ocupação = length, pois esta cheio
         temp[i] =  vetor[i];
      }
      //  vetor passa a referemciar o temporario
      vetor =  temp;
   }
   // private void reduzVetor(){
   //    int[] temp =  new int[vetor.length/2];
   //    for (int i=0; i < ocupacao; i++) {
   //       temp[i] =  vetor[i];
   //    vetor = temp ;
   //    }

   // }
   public int getTamanho () {
      return vetor.length;
   }

}
