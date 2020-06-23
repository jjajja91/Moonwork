package alz.classes.mapper;

import java.util.List;

import alz.classes.domain.ClassDTO;
import alz.classes.domain.ClassTmpDTO;

public interface ClassMapper {

	public int insertTmp(ClassTmpDTO classTmp);
	public int insert(ClassDTO classDto);
	public List<ClassDTO> getList();
	public List<ClassDTO> getListByCategory(long category_id);
	public List<ClassDTO> getListByTeacher(long teacher_id);
	public int updateTmp(ClassTmpDTO classTmp);
	public int deleteTmp(ClassTmpDTO classTmp);
	public int update(ClassDTO classDto);
	public int delete(ClassDTO classDto);
	public int 
	
	
}
