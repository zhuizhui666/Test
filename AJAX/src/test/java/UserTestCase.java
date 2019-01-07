import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.ajax.entity.User;
import cn.tedu.ajax.mapper.UserMapper;

public class UserTestCase {
	AbstractApplicationContext ac;
	UserMapper userMapper;
	@Before
	public void doBefore(){
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		userMapper = ac.getBean("userMapper",UserMapper.class);
	}
	@After
	public void doAfter(){
		ac.close();
	}
	@Test
	public void findByName(){
		User user = userMapper.findByName("Ã∆…Æ");
		System.out.println(user.getId()+"-"+user.getPassword()+"-"+user.getIs_delete());
	}
	
	@Test
	public void insert(){
		User user = new User("’‘‘∆","123456",25,"121321321","645@465465",0,1);
		Integer row = userMapper.insert(user);
		System.out.println("row:"+row);
	}
	
}
