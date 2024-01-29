
	/*
	 
	En este programa se define la clase Fecha con campos para el dia, mes y año.
	Se entra por teclado dos Fechas y el programa dice cual es la Fecha menor.
	 
	Salida del programa:
	------------------------------
	 
	Entra la primera Fecha dd/mm/aaaa: 
	15/3/2005
	Entra la segunda Fecha dd/mm/aaaa: 
	20/2/2005
	La fecha menor es 20/2/2005
	 
	*/
	 
	import java.util.Scanner;
	 
	/**
	 * Definición de la clase Fecha
	 *
	 */
	class Fecha {
	    /**
	     * atributos
	     */
	    int dia;
	    int mes;
	    int año;
	     
	    /**
	     * Constructor por defecto
	     */
	    Fecha(){
	         
	    }
	     
	    /**
	     * Constructor que asigna la Fecha pasada por parámetro
	     * @param d  dia
	     * @param m  mes
	     * @param a  año
	     */
	    Fecha(int d, int m, int a){
	        dia=d;
	        mes=m;
	        año=a;
	    }
	         
	    /**
	     * Constructor que asigna la fecha pasada por parámetro en
	     * formato dd/mm/aaaa
	     * @param fechaTexto  fecha "dd/mm/aaaa"
	     */
	    Fecha(String fechaTexto) {
	        String partes[]=fechaTexto.split("/");
	        dia=Integer.parseInt(partes[0]);
	        mes=Integer.parseInt(partes[1]);
	        año=Integer.parseInt(partes[2]);
	    }
	 
	}
	 
	 
	public class E02_Fecha {
	    public static void main(String []args) {
	         
	        Scanner tec=new Scanner(System.in);
	 
	        System.out.println("Entra la primera Fecha dd/mm/aaaa: ");
	        Fecha f1=new Fecha(tec.nextLine());
	         
	        System.out.println("Entra la segunda Fecha dd/mm/aaaa: ");
	        Fecha f2=new Fecha(tec.nextLine());
	         
	        int menor=0;
	 
	        if (f1.año<f2.año) menor=1;
	        else if (f2.año<f1.año) menor=2;
	        else if (f1.mes<f2.mes) menor=1;
	        else if (f2.mes<f1.mes) menor=2;
	        else if (f1.dia<f2.dia) menor=1;
	        else if (f2.dia<f1.dia) menor=2;
	 
	        if (menor==1) System.out.println("La data menor es:"+f1.dia+"/"+f1.mes+"/"+f1.año);
	        if (menor==2) System.out.println("La data menor es:"+f2.dia+"/"+f2.mes+"/"+f2.año);
	        if (menor==0) System.out.println("Fechas iguales");
	 
	    }
	}
