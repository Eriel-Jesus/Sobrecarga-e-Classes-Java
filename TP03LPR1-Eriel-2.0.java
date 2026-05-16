import java.util.Scanner;

Scanner scanner = new Scanner();

    public class Hora
    {
         private int hora, min, seg;

        public Hora(){
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }

        public Hora(int h, int m, int s){
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
            this.seg = s; 
        }

        public void setHor(){       
            do
            {
            System.out.println("Insira o valor das horas:");
            this.hora = scanner.next();
            } while (this.hora > 24 || this.hora < 0);

        }
        public void setMin(){
            do
            {
            System.out.println("Insira o valor dos minutos:");
            this.min = scanner.next();
            } while (this.min >= 60 || this.min < 0);
        }
        public void setSeg(){
            do
            {
            System.out.println("Insira o valor dos segundos:");
            this.seg = scanner.next();
            } while (this.seg >= 60 || this.seg < 0);
        }

        int getHor(){
            return this.hora;
        }
        int getMin(){
            return this.min;
        }
        int getSeg(){   
            return this.seg;
        }

        public getHora1(){
            System.out.println(this.hora + ":" + this.min + ":" + this.seg);
        }

        public getHora2(){
            int segundostotais, horapm;
            if (this.hora > 12)
                {   
                    horapm = this.hora - 12;
                    System.out.println(horapm + ":" + this.min + ":" + this.seg + " PM");
                }
            else
                {
                System.out.println(this.hora + ":" + this.min + ":" + this.seg + " AM");
                }
        }

        int getSegundos(){
            int segundostotais;
            segundostotais = this.hora * 3600 + this.min * 60 + this.seg;
            return segundostotais;
        }

    

    }
    
    public static void main(String[] args)
    {
        
        Hora hora = new Hora(0,0,0);
        int opcao = 0, h = 0, m = 0 , s = 0; 

        do{
        System.out.println("######################## BEM VINDO ########################");
        System.out.println("");
        System.out.println("Vamos utilizar o programa para definir as horas, e exibir, até mesmo em segundos.");
        System.out.println("DEFINIR NOVO HORÁRIO - 1");
        System.out.println("MOSTRAR HORÁRIO - 2");
        System.out.println("ENCERRAR PROGRAMA - 0");
        opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                case 1:
                    hora.setHor();
                    hora.setMin();
                    hora.setSeg();
                    break;

                case 2:
                    if(h != 0 && m != 0 && s != 0) {
                        System.out.print("Hora atual inserida: ");
                        hora.getHora1();
                        System.out.print("Hora atual formatada: ");
                        hora.getHora2();
                        System.out.println("Hora atual em segundos: " + hora.getSegundos() + " segundos");
                    }
                    else
                        {
                         System.out.println("Defina um horário antes de usar esta função!");
                    }
                    break;

                default:
                     System.out.println("Opção inválida, tente novamente.");
                    break;
                }    
        } while (opcao != 0);
    }


    
