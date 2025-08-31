public class Horario {
    int horas = 0;
    short minutos = 0 , segundos = 0;

    public void avance (int qtdSegundos) throws Exception{
        if (qtdSegundos < 0){
            throw new Exception("numero invalido para ser adicionado");
        }
        this.segundos +=(short)(qtdSegundos % 60); //aqui o código insere os segundos
        this.minutos += (short)(((qtdSegundos / 60) % 60) + (this.segundos / 60)); //aqui o código insere os minutos
        this.segundos %= 60;  //aqui o código arruma os segundos para no máximo 60
        this.horas += (short)((qtdSegundos /3600) + (this.minutos / 60));  //aqui o código adiciona as horas
        this.minutos %= 60;  // aqui o código arruma os minutos para no máximo 60

    }

    public void retroceda (int qtdSegundos) throws Exception{
        if (qtdSegundos < 0){
            throw new Exception("numero invalido para ser retrocedido");
        }
        else if(qtdSegundos > (this.segundos + (this.minutos * 60) + (this.horas * 3600))){
            throw new Exception("retroceder mais que a quantidade armazenada resultara em valor negativo");
        }
        int totalSegundos = this.horas * 3600 + this.minutos * 60 + this.segundos - qtdSegundos;

        this.horas   = (short)(totalSegundos / 3600);
        this.minutos = (short)((totalSegundos / 60) % 60);
        this.segundos= (short)(totalSegundos % 60 );
    }

     /*aqui tem os getters*/
     public int getHoras(){
         return horas;
     }
     public int getMinutos(){
         return minutos;
     }
     public int getSegundos(){
         return segundos;
     }

     /*aqui tem os setters*/
     public void setHoras(short horas) throws Exception{
         if(0 <= horas){this.horas = horas;}
         else{throw new Exception("Hora invalida");}
     }
     public void setMinutos(short minutos) throws Exception{
         if(0 <= minutos && minutos < 60){this.minutos = minutos;}
         else{throw new Exception("Minutos invalidos");}
     }
     public void setSegundos(short segundos) throws Exception{
         if(0 <= segundos && segundos < 60){this.segundos = segundos;}
         else{throw new Exception("Segundos invalidos");}
     }

     @Override
     public String toString(){
         if (horas < 100){
             return String.format("%02d:%02d:%02d", horas, minutos,  segundos);
         }
         else{
             return String.format("%d:%02d:%02d", horas, minutos, segundos);
         }
     }
}
