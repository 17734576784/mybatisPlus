package com.ke;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ke.bean.system.Pilepara;
import com.ke.mapper.system.PileparaMapper;
import com.ke.service.system.PileparaService;

@SpringBootTest
@RunWith(SpringRunner.class)
class MybatisPlusApplicationTests {

	@Autowired
    private PileparaMapper pileparaMapper;

	@Autowired
	private PileparaService pileparaService;	
//	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
//		QueryWrapper<Pilepara> queryWrapper = new QueryWrapper<>();
//		queryWrapper.eq("subst_Id", 244);
//		
//		Page<Pilepara> page = new Page<>(1, 10);
//		IPage<Pilepara> userIPage = pileparaMapper.selectPage(page, queryWrapper);
//		List<User> userList = userMapper.selectPage(page, queryWrapper);//.selectList(queryWrapper);//.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//		System.out.println("return selectPageLoads value = " + userIPage.getSize());
//		List<Pilepara> userList = userIPage.getRecords();
//		System.out.println(userList.size());
//		userList.forEach(System.out::println);
//		queryWrapper.eq("substId", 244
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("substId", 244);
		try {
//			// 当前页，总条数 构造 page 对象
			Page<Map<String, Object>> page = new Page<>(1, 10);
			List<Map<String, Object>> pileList = pileparaService.listPile(param);
			System.out.println(pileList.size());
			pileList.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}      
	}
	
	@Test
	public void pageandSearch() {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("substId", 244);
		Page<Map<String, Object>> page = new Page<>(1, 10);
		try {
			List<Map<String, Object>> pileList = pileparaService.listPile(param);
			System.out.println(pileList.size());
			pileList.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
     * <p>
     *     insert 插入测试
     * </p>
     */
//    @Test
    public void insertLoads() {
    	Pilepara pilepara = new Pilepara();
    	pilepara.setSerialCode("1000010000");
    	pilepara.setName("test3218");
    	pilepara.setSubstId(111);
    	pilepara.setUseFlag(1);
    	pilepara.setId(3218);
    	try {
			Integer insert = pileparaMapper.updateById(pilepara);
			System.out.println("return insert value = " + insert);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
    
    
    
}
