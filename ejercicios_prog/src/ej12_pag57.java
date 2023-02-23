package ejercicios_java;

public class ej12_pag57 {
	  private int kilosPapas;
	  private int kilosChocos;

	  public ej12_pag57(int kilosPapas, int kilosChocos) {
	    this.kilosPapas = kilosPapas;
	    this.kilosChocos = kilosChocos;
	  }

	  public void addChocos(int x) {
	    this.kilosChocos += x;
	  }

	  public void addPapas(int x) {
	    this.kilosPapas += x;
	  }

	  public int getComensales() {
	    int clientesAtendidos = 0;
	    int papasUsadas = 0;
	    int chocosUsados = 0;

	    while (this.kilosPapas >= 1 && this.kilosChocos >= 0.5) {
	      papasUsadas += 1;
	      this.kilosPapas -= 1;
	      chocosUsados += 1;
	      this.kilosChocos -= 0.5;

	      if (papasUsadas % 3 == 0 && chocosUsados % 2 == 0) {
	        clientesAtendidos += 3;
	      }
	    }
	    return clientesAtendidos;
	  }

	  public void showChocos() {
	    System.out.println("En el almacén hay " + this.kilosChocos + " kilos de chocos.");
	  }

	  public void showPapas() {
	    System.out.println("En el almacén hay " + this.kilosPapas + " kilos de papas.");
	  }

	  public static void main(String[] args) {
	    ej12_pag57 ej12_pag57 = new ej12_pag57(0, 0);
	    ej12_pag57.showChocos();
	    ej12_pag57.showPapas();
	    System.out.println("El restaurante puede atender a " + ej12_pag57.getComensales() + " clientes.");
	    System.out.println();
	    ej12_pag57.addChocos(20);
	    ej12_pag57.addPapas(30);
	    ej12_pag57.showChocos();
	    ej12_pag57.showPapas();
	    System.out.println("El restaurante puede atender a " + ej12_pag57.getComensales() + " clientes.");
	  }
	}

