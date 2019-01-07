package cn.tedu.ajax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ajax.entity.User;
import cn.tedu.ajax.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	//ҵ�񷽷�:��Controller���õķ���
	//ֻ�����Լ��ķ���,����ֱ�ӵ��ó־ò����ķ���
	public Integer reg(User user){
		//1.����user.getUsername()��ѯ�û�
		User data = findByName(user.getUsername());
		//�жϲ�ѯ����Ƿ�Ϊnull
		if(data == null){
			//��:�û���û�б�ռ��,ִ��ע��
			Integer rows = insert(user);
			if(rows == 1){
				return 1;
			}else{
				return 3;
			}
		}else{
			//��:�û����ѱ�ռ��,���ش������
			return 2;
		}
	}
	
	//��¼ҵ��
	public Integer login(String username,String password){
		//����username��ѯ�û�
		User user = findByName(username);
		//�жϲ�ѯ����Ƿ�Ϊnull
		if(user == null){
			//��:�û�������,���ش������
			return 2;
		}else{
			//��:�鿴�����Ƿ���ȷ
			if(user.getPassword().equals(password)){
				//��ȷ:ִ�е�¼�ɹ�
				return 1;
			}else{
				//����ȷ:�������,���ش������
				return 3;
			}
		}
	}
	
	
	private Integer insert(User user){
		
		return userMapper.insert(user);
	}
	
	
	private User findByName(String username){
		
		return userMapper.findByName(username);
	}
}
