package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	
	private IDao dao;
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public double calcul() {
		double nb = dao.getValue();
		return nb*6;
	}
	

}
