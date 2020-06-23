package alz.order.service;

import alz.order.domain.PaymentDTO;

public interface PaymentService {
	
	public int register(PaymentDTO payment);
	
	public int modify(PaymentDTO payment);
	
	public int remove(PaymentDTO payment);
	
	public PaymentDTO getById(long id);
	
	public PaymentDTO getByPayment(long payment_id);

}
