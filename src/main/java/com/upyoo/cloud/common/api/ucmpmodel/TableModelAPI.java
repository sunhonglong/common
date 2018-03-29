package com.upyoo.cloud.common.api.ucmpmodel;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.upyoo.cloud.common.entity.ResultModel;

@FeignClient("tablemodel")
@RequestMapping("/table")
public interface TableModelAPI {

	@RequestMapping(value="/object/{name}")
	public ResultModel getObjectByName(@PathVariable String name);
	
	@RequestMapping(value="/dictionary/{tableName}")
	public ResultModel getListDic(@PathVariable String tableName);
}
