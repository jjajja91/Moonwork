package alz.order.mapper;

import alz.order.domain.PaymentDTO;

public interface PaymentMapper {

	public int insert(PaymentDTO payment);
	public int update(PaymentDTO payment);
	public int delete(PaymentDTO payment);
	public PaymentDTO readById(long id);
	public PaymentDTO readByPayment(long payment_id);
	
}
