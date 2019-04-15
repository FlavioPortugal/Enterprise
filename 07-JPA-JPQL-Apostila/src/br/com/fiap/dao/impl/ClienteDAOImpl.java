package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> listar() {
		TypedQuery<Cliente> query = em.createQuery("From Cliente", Cliente.class);
		// TODO Auto-generated method stub
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorNome(String nome) {		
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente c Where c.nome like '%:name%' ", Cliente.class)
				.setParameter("name", "%" + nome + "%")
				.getResultList();
	}

	@Override
	public List<Cliente> buscarPorEstado(String estado) {
		// TODO Auto-generated method stub
		return em.createQuery("From Cliente c where c.endereco.cidade.uf = :P",Cliente.class)
				.setParameter("P", estado)
				.getResultList();
	}

	@Override
	public List<Cliente> buscarPorDiasReserva(int dias) {
		// TODO Auto-generated method stub
		return em.createQuery("select r.cliente from Reserva r where r.numeroDias = :d",Cliente.class)
				.setParameter("d", dias)
				.getResultList();
	}

}
