package alz.classes.service;

import java.util.List;

import alz.classes.domain.ClassDTO;
import alz.classes.domain.ClassTmpDTO;

public interface ClassService {
	
	public boolean registerTmp(ClassTmpDTO classTmp);
	
	public boolean register(ClassDTO classDto);
	
	public List<ClassDTO> getList();
	
	public List<ClassDTO> getListByCategory(long category_id);
	
	public List<ClassDTO> getListByTeacher(long teacher_id);
	
	public boolean modifyTmp(ClassTmpDTO classTmp);
	
	public boolean removeTmp(ClassTmpDTO classTmp);
	
	public boolean modify(ClassDTO classDto);
	
	public boolean remove(ClassDTO classDto);
	

}
