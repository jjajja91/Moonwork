package alz.order.mapper;

import java.util.List;

import alz.order.domain.OrderDTO;

public interface OrderMapper {
	
	public int insert(OrderDTO order);
	public int update(OrderDTO order);
	public int delete(OrderDTO order);
	public OrderDTO readById(long id);
	public List<OrderDTO> getListByUser(long user_id);

}
