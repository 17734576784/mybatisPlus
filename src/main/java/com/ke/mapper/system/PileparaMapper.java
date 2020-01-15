package com.ke.mapper.system;

import com.ke.bean.system.Pilepara;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dbr
 * @since 2020-01-14
 */
public interface PileparaMapper extends BaseMapper<Pilepara> {
	
	List<Map<String, Object>> listPile(Page<Map<String, Object>> pagination, Map<String,Object> param);
}
