package ec.com.se.demo2015.comercial;

import java.util.List;

public interface Comercial {
	public boolean crearOrden(OrdenCompra ordenCompra)
			throws ComercialIntegratorException;

	public List<Cliente> getClientes() throws ComercialIntegratorException;

	public OrdenCompra getOrdenCompra(Long ordenCompraId)
			throws ComercialIntegratorException;

	public List<OrdenCompra> getOrdenesCompra()
			throws ComercialIntegratorException;
}
