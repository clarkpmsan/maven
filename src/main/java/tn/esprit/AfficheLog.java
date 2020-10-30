package tn.esprit;

import org.apache.log4j.Logger;

public class AfficheLog {

	private static final Logger l = Logger.getLogger(AfficheLog.class);
	public static void main(String[] args) { AfficheLog al = new AfficheLog(); al.getAllPrducts(); }
	public void getAllPrducts ()
	{
	try {
	l.info("In getAllPrducts() : ");
	l.debug("Je vais lancer la divsion.");
	int i = 1/0;
	l.debug("Je viens de lancer la divsion. " + i);
	l.debug("Je viens de finir l'opération X.");
	l.info("Out getAllPrducts() without errors.");
	}
	catch (Exception e) { l.error("Erreur dans getAllPrducts() : " + e); }
	}
}
