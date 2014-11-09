import java.io.*;
public class Main {

    public static void main(String args[]) throws java.io.IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        int cantEst,
                cantNotas,
                totalnota = 0;


        out.println("Digite cantidad de estudiantes");
        cantEst = Integer.parseInt(in.readLine());

        out.println("Digite cantidad de notas");
        cantNotas = Integer.parseInt(in.readLine());


        String[] nomEstus;
        nomEstus = new String[cantEst];

        int[] nota;
        nota = new int[cantNotas*cantEst];//hay que multiplicarlo ya que si si fuera 10 estudiantes 3 notas di son 30 notas en total
        double[] promedios;
        promedios=new double[cantEst];//son misma cantidad de estudiantes y de Promedios

        //ciclo estudiantes
        for(int i=0;i<cantEst;i++) {
            out.println("Digite los nombres de los estudiantes");
            nomEstus[i] = (in.readLine());

            //ciclo de notas
            for (int o = i*cantNotas,y=cantNotas; y>0;o++,y--) {//mae hay q usar 2 variables 1 para llevar para moverse en el arrelo de notas y otro para solo para preguntar las notas del estudiante

                out.println("Digite la nota");
                nota[o] = Integer.parseInt(in.readLine());
                totalnota = totalnota + nota[o];

            }
        }
            //ciclo calculo promedios
            int promedio = 0;
            for( int i=0;i<cantEst;i++){

                //ojo esto hace la magia veamos esto el primer estudiante tiene las notas en el arreglo 0,1,2 esas 3 notas, el 					siguiente estudiante la tiene en 3,4,5 x eso se hace i*cantNotas xq ojo
                //primera iteracion i=0 cantNotas=3 j=0 ve al ser 0 este ciclo va ser 0,1,2
                //segunda iteracion i=1 cantNotas=3 j=3 y aca al empezar en 3 ntonces va ser 3,4,5
                for(int j=i*cantNotas,z=cantNotas;z>0;j++,z--){//al igual q arriba se ocupan 2 variables 1 para moverse en arreglo de notas y otra para saber cauntas notas son de cada estusitante
                    promedio+=nota[j];
                }
                promedios[i]=(promedio/cantNotas);
                promedio=0;
            }

            out.println("Digite Nombre del estudiante para cononcer el promedio");
            String estud = (in.readLine());

            double prom=0;
            for(int j=0;j<cantEst;j++){
                out.println(promedios[j]);
                if(nomEstus[j].equals(estud)){
                    prom=promedios[j];
                    break;
                }
            }

            out.println("El promedio de "+estud+" es de "+ Double.toString(prom)+".");

		   	/*prom = totalnota/cantNotas;
	   		out.println("El promedio de "+nomEstus[i]+" es de "+prom+".");*/


    }


}

