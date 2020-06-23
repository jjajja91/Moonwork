package alz.user.mapper;

import java.util.List;

import alz.user.domain.UserDTO;
import alz.user.domain.UserStateDTO;

public interface UserMapper {
	
	public int insert(UserDTO user);
	public UserDTO readByEmail(String email);
	public UserDTO readById(long id);
	public UserDTO readByNickname(String nick_name);
	public List<UserDTO> getList();
	public int update(UserDTO user);
	public int updateState(UserStateDTO userState);
	public int delete(long id);
	
}
