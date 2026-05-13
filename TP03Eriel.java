TP03Eriel

import java.util.scanner

Scanner scanner = new Scanner(system.in);

public class TP03{

    public class Hora{

         private int hora, min, seg;

        Hora(){
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }

        Hora(int h, int m, int s){
        this.hora = h;
        this.min = m;
        this.seg = s;
        }

        setHor(int h){
            this.hora = h;
        }
        setMin(int m){
            this.min = m;
        }
        setSeg(int s){
            this.seg = s 
        }

        setHor(){
            system.out.println("Insira o valor das horas:")
            this.hora = scanner.next();
        }
        setMin(){
            system.out.println("Insira o valor dos minutos:")
            this.min = scanner.next();
        }
        setSeg(){
            system.out.println("Insira o valor dos segundos:")
            this.seg = scanner.next();
        }

        getHor(){
            return this.hora;
        }
        getMin(){
            return this.min;
        }
        getSeg(){   
            return this.seg;
        }


    }


}