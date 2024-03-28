package teste;

import dao.GarrafaDao;
import entidades.Garrafa;

public class Principal {
	public static void main(String[] args) {
//		Garrafa g = new Garrafa();
//		g.setMarca("PACCO");
//		g.setVolume(500);
//		g.setCor("azul");
//		
//		GarrafaDao.salvar(g);
		System.out.println(GarrafaDao.listar());
	}
}
