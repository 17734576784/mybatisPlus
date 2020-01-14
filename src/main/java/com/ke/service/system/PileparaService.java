package com.ke.service.system;

import com.ke.bean.system.Pilepara;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dbr
 * @since 2020-01-14
 */
public interface PileparaService extends IService<Pilepara> {
	List<Map<String, Object>> listPile(Map<String, Object> param);
}
