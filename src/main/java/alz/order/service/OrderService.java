package alz.order.service;

import java.util.List;

import alz.order.domain.OrderDTO;

public interface OrderService {

	public int register(OrderDTO order);
	
	public int modify(OrderDTO order);
	
	public int remove(OrderDTO order);
	
	public OrderDTO getById(long id);
	
	public List<OrderDTO> getListByUser(long user_id);
	
}
