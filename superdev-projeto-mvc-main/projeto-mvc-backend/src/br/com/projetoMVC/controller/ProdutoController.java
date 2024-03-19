package br.com.projetoMVC.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.projetoMVC.DAO.GenericDAO;
import br.com.projetoMVC.DAO.ProdutoDAOImpl;
import br.com.projetoMVC.model.Produto;

public class ProdutoController {

	public List<Produto> listarTodos() {
		try {
			GenericDAO dao = new ProdutoDAOImpl();
			List<Produto> lista = new ArrayList<Produto>();

			for (Object object : dao.listarTodos()) {
				lista.add((Produto) object);
			}

			return lista;

		} catch (Exception ex) {
			System.out.println("Problemas na Controller para listar Produtos " + ex.getMessage());
			ex.printStackTrace();
			return null;
		}
	}
	
	public boolean caadstrar() {
		try {
			GenericDAO dao = new ProdutoDAOImpl();
			dao.cadastrar(dao);
			return true;
			
		}catch (Exception e) {
			System.out.println("Problemas na Controller para cadastrar Produto" + e.getMessage());
			e.printStackTrace();
			return false;
			
			public class Main{
				public static void main(String[] args) {
					ProdutoController controller = new ProdutoController();
					Produto p = new Produto();
					p.setDescricao("Headset");
					controller.cadastrar(p);
					
					
				}
			}
		}
	}

}
