import java.io.*;
public class arreglos {

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
		int[] promedios;
		promedios=new int[cantEst];//son misma cantidad de estudiantes y de Promedios
	
			//ciclo estudiantes
		   	for(int i=0;i<cantEst;i++)
		   	{
		   		totalnota = 0;
		   		out.println("Digite los nombres de los estudiantes");
		   		nomEstus[i] = (in.readLine());
				
		   	//ciclo de notas
		   	for(int o=0;o<cantNotas;o++)
		   	{
		   		
		   		out.println("Digite la nota");
		   		nota[o] = Integer.parseInt(in.readLine());
		   		totalnota = totalnota + nota[o];
		   		
		   	}
			
			//ciclo calculo promedios
			int promedio;
			for(int i=0;i<cantEst;i++){
				//ojo esto hace la magia veamos esto el primer estudiante tiene las notas en el arreglo 0,1,2 esas 3 notas, el 					siguiente estudiante la tiene en 3,4,5 x eso se hace i*cantNotas xq ojo 
				//primera iteracion i=0 cantNotas=3 j=0 ve al ser 0 este ciclo va ser 0,1,2
				//segunda iteracion i=1 cantNotas=3 j=3 y aca al empezar en 3 ntonces va ser 3,4,5
				for(int j=i*cantNotas;j<cantNotas;j++){ 
					 promedio+=nota[j];
				}
				promedios[i]=promedio;
				promedio=0;
			}
			
			out.println("Digite Nombre del estudiante para cononcer el promedio");
			String estud = (in.readLine());
				
			int prom;
			for(int j=0;j<cantEst;j++){
				if(cantEst[i].equals(estud)){
					prom=promedios[j];
					break;
				}
			}
			
			out.println("El promedio de "+estud" es de "+prom+".");
				
		   	/*prom = totalnota/cantNotas;
	   		out.println("El promedio de "+nomEstus[i]+" es de "+prom+".");*/
	   	}
		   	
	   }
	   
	   
}

