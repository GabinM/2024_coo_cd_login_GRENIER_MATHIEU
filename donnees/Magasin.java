package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	public void trier(ComparateurCd cpr){

		for(CD c : this.listeCds){
			System.out.println(c.getTitre());
		}
		System.out.println("(((((((((((((((((())))))))))))))))))");

		ArrayList<CD> res = new ArrayList<CD>();

		while(this.listeCds.size() >0){
			CD cd = this.listeCds.get(0);
			for(int i = 0;i< this.listeCds.size();i++){
				if (!cpr.etreAvant(this.listeCds.get(i),cd)){
					cd = this.listeCds.get(i);
					
				}
				
			}

			res.add(cd);
			this.listeCds.remove(cd);
			
		}
		this.listeCds = res;
		System.out.println("size : "+res.size());
		for(CD c : res){
			System.out.println(c.getTitre());
		}
	}

}
