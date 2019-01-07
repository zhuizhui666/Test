package cn.tedu.ajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.ajax.entity.ResponseResult;
import cn.tedu.ajax.entity.User;
import cn.tedu.ajax.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/reg.do")
	@ResponseBody
	public ResponseResult handleReg(User user){
		ResponseResult rr = new ResponseResult();
		
		Integer result = userService.reg(user);
		if(result == 1){
			rr.setState(1);
			rr.setMessage("ע��ɹ�!");
		}else if(result == 2){
			rr.setState(2);
			rr.setMessage("ע��ʧ��!����ע����û���("+
					user.getUsername()+")�Ѵ���!");
		}else if(result == 3){
			rr.setState(3);
			rr.setMessage("ע��ʧ��!����ϵ����Ա");
		}
		
		return rr;
		
	}
	
	@PostMapping("login.do") //@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public ResponseResult handleLogin(String username,String password){
		ResponseResult rr = new ResponseResult();
		Integer result = userService.login(username, password);
		if(result == 1){
			rr.setState(1);
			rr.setMessage("��¼�ɹ�!");
		}else if(result == 2){
			rr.setState(2);
			rr.setMessage("���û�������!");
		}else if(result == 3){
			rr.setState(3);
			rr.setMessage("���벻��ȷ!");
		}
		
		
		
		
//		//����root/1234����ȷ���˺�����
//		if("root".equals(username)){
//			if("1234".equals(password)){
//				rr.setState(1);
//				rr.setMessage("��¼�ɹ�!");
//			}else{
//				rr.setState(3);
//				rr.setMessage("��¼ʧ��!�������!");
//			}
//		}else{
//			rr.setState(2);
//			rr.setMessage("��¼ʧ��!�û�������!");
//		}
		
		
		return rr;
	}
}
