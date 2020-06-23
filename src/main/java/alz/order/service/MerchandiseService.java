package alz.order.service;

import alz.order.domain.MerchandiseDTO;

public interface MerchandiseService {

	public boolean register(MerchandiseDTO merchandise);
	
	public boolean modify(MerchandiseDTO merchandise);
	
	public boolean remove(MerchandiseDTO merchandise);
	
	public MerchandiseDTO getByUser(long user_id);
	
	public MerchandiseDTO getById(long id);
	
}
