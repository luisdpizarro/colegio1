import java.io.*;
public class arreglos {

	public static void main(String args[]) throws java.io.IOException
	   {
	   	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   	PrintStream out = System.out;
	   	
	   	int cantEst,
	   	    cantNotas,
	   		prom,
	   	    totalnota = 0;
	   	
	   
	   	out.println("Digite cantidad de estudiantes");
	   	cantEst = Integer.parseInt(in.readLine());
		   	
	   	out.println("Digite cantidad de notas");
	   	cantNotas = Integer.parseInt(in.readLine());
			
	   	
	   	String[] nomEstus;
	   	nomEstus = new String[cantEst];
	   	
	   	int[] nota;
	   	nota = new int[cantNotas];
	
		   	for(int i=0;i<cantEst;i++)
		   	{
		   		totalnota = 0;
		   		out.println("Digite los nombres de los estudiantes");
		   		nomEstus[i] = (in.readLine());
		   	
		   	for(int o=0;o<cantNotas;o++)
		   	{
		   		
		   		out.println("Digite la nota");
		   		nota[o] = Integer.parseInt(in.readLine());
		   		totalnota = totalnota + nota[o];
		   		
		   	}
		   	prom = totalnota/cantNotas;
	   		out.println("El promedio de "+nomEstus[i]+" es de "+prom+".");
	   	}
		   	
	   }
	   
	   
}
