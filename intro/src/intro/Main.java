package intro;

public class Main {

	public static void main(String[] args) {
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if(dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}else if(dolarBugun>dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		}else {
			okYonu = "equals.svg";
			System.out.println(okYonu);
		}

	}

}
