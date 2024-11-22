package br.edu.principal;
import java.util.Calendar;
import java.util.Date;
public class Principal {

	public static void main(String[] args) {

		        Calendar cal = Calendar.getInstance();
		        Date d = new Date();
		        cal.setTime(d);

		        int dia = cal.get(Calendar.DAY_OF_MONTH);
		        int mes = cal.get(Calendar.MONTH) + 1;
		        int ano = cal.get(Calendar.YEAR);
		        int hora = cal.get(Calendar.HOUR_OF_DAY); 
		        int min = cal.get(Calendar.MINUTE);

		        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

		        switch (mes) {
		            case 1: System.out.print("janeiro"); break;
		            case 2: System.out.print("fevereiro"); break;
		            case 3: System.out.print("março"); break;
		            case 4: System.out.print("abril"); break;
		            case 5: System.out.print("maio"); break;
		            case 6: System.out.print("junho"); break;
		            case 7: System.out.print("julho"); break;
		            case 8: System.out.print("agosto"); break;
		            case 9: System.out.print("setembro"); break;
		            case 10: System.out.print("outubro"); break;
		            case 11: System.out.print("novembro"); break;
		            case 12: System.out.print("dezembro"); break;
		        }

		        System.out.println("\nHora Atual: " + hora + ":" + String.format("%02d", min));
		    }
		}
