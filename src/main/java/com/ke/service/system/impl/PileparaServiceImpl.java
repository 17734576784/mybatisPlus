package com.ke.service.system.impl;

import com.ke.bean.system.Pilepara;
import com.ke.mapper.system.PileparaMapper;
import com.ke.service.system.PileparaService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dbr
 * @since 2020-01-14
 */
@Service
public class PileparaServiceImpl extends ServiceImpl<PileparaMapper, Pilepara> implements PileparaService {
	@Autowired
    private PileparaMapper pileparaMapper;
	
	public List<Map<String,Object>> listPile(Map<String,Object> param) {
			Page<Map<String,Object>> page = new Page<>(1, 1);
	        return this.pileparaMapper.listPile(page,param);
	    }
}
