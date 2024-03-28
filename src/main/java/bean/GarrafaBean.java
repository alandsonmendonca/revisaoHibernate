package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.GarrafaDao;
import entidades.Garrafa;

@ManagedBean
public class GarrafaBean {
	private Garrafa garrafa = new Garrafa();
	private List<Garrafa> lista;
	
	public String salvar() {
		GarrafaDao.salvar(garrafa);
		garrafa = new Garrafa();
		return null;
	}

	public Garrafa getGarrafa() {
		return garrafa;
	}

	public void setGarrafa(Garrafa garrafa) {
		this.garrafa = garrafa;
	}

	public List<Garrafa> getLista() {
		if (lista == null) {
			lista = GarrafaDao.listar();
		}
		return lista;
	}

	public void setLista(List<Garrafa> lista) {
		this.lista = lista;
	}
}
