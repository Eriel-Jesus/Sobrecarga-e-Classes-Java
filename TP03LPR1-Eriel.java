TP03Eriel

import java.util.scanner;

Scanner scanner = new Scanner(system.in);

    public class Hora{

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

        public void setHor(int h){
            this.hora = h;
        }
        public void setMin(int m){
            this.min = m;
        }
        setSeg(int s){
            this.seg = s; 
        }

        setHor(){       
            do
            {
            system.out.println("Insira o valor das horas:");
            this.hora = scanner.next();
            } while (this.hora > 24 || this.hora < 0);

        }
        setMin(){
            do
            {
            system.out.println("Insira o valor dos minutos:");
            this.min = scanner.next();
            } while (this.min >= 60 || this.min < 0);
        }
        setSeg(){
            do
            {
            system.out.println("Insira o valor dos segundos:");
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

        string getHora1(){
            system.out.println(this.hora + ":" +this.min + ":" + this.seg);
        }

        string getHora2(){
            int segundostotais, horapm;
            if (this.hora > 12)
                {   
                    segundostotais = this.hora * 3600 + this.min * 60 + this.seg;
                    horapm = this.hora - 12;
                    system.out.println(horapm + ":" + this.min + ":" + this.seg + " PM");
                }
            else
                {
                segundostotais = this.hora * 3600 + this.min * 60 + this.seg;
                system.out.println(this.hora + ":" + this.min + ":" + this.seg + " AM");
                }

        }

        int getSegundos(){
            int segundostotais;
            segundostotais = this.hora * 3600 + this.min * 60 + this.seg;
            return segundostotais;
        }
    }

    public main()
    
    {
        Hora hora = new Hora();
        int opcao, h, m , s;

        do{
        system("cls");
        System.out.println("######################## BEM VINDO ########################");
        System.out.println("");
        system.out.println("Vamos utilizar o programa para definir as horas, e exibir, até mesmo em segundos.");
        system.out.println("DEFINIR NOVO HORÁRIO - 1");
        system.out.println("MOSTRAR EM SEGUNDOS - 2");
        system.out.println("EXIBIR HORÁRIO ATUAL - 3");
        system.out.println("ENCERRAR PROGRAMA - 0");
        opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    hora.setHor();
                    hora.setMin();
                    hora.setSeg();
                    break;
            
                default:
                    break;
            }


        } while (opcao != 0);


    }
