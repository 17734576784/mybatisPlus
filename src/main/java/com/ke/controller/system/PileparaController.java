package com.ke.controller.system;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dbr
 * @since 2020-01-14
 */
@RestController
public class PileparaController {
	@Value("${name}")
	public String name;
	
	@RequestMapping("/name")
	public String getName() {
		return name +" ? ";
	}
}
