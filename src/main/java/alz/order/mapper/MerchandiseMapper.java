package alz.order.mapper;

import alz.order.domain.MerchandiseDTO;

public interface MerchandiseMapper {
	
	public int insert(MerchandiseDTO merchandise);
	public int update(MerchandiseDTO merchandise);
	public int delete(MerchandiseDTO merchandise);
	public MerchandiseDTO readByUser(long user_id);
	public MerchandiseDTO readById(long id);

}
