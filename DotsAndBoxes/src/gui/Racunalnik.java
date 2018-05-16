package gui;

import logika.Poteza;

import javax.swing.SwingWorker;

import logika.Igra;


public class Racunalnik extends Strateg {
	private GlavnoOkno okno;
	private SwingWorker<Poteza, Object> mislec;
	private boolean prekini;
	
	public Racunalnik(GlavnoOkno okno) {
		this.okno = okno;
	}

	@Override
	public void na_potezi() {
		// Zacnemo razmisljati
		//mislec = new NakljucnaInteligenca(okno); // TODO v inteligenci
		//mislec.execute();	
	}

	@Override
	public void prekini() {
		if (mislec != null) {
			mislec.cancel(true);
		}
	}

	@Override
	public void klikni(int i, int j) {
	}

}