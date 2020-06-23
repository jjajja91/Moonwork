package alz.user.service;

import java.util.List;

import alz.user.domain.UserDTO;
import alz.user.domain.UserStateDTO;

public interface UserService {

	public boolean register(UserDTO user);
	
	public UserDTO getById(long id);
	
	public UserDTO getByEmail(String email);
	
	public UserDTO getByNickname(String nick_name);
	
	public List<UserDTO> getList();
	
	public boolean modify(UserDTO user);
	
	public boolean remove(long id);
	
	public boolean updateState(UserStateDTO userState);
	
}
