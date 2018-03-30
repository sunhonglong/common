package com.upyoo.cloud.common.api.ucmpmodel;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.upyoo.cloud.common.entity.ResultModel;

@FeignClient("tablemodel")
@RequestMapping("/table")
public interface TableModelAPI {

	@GetMapping(value="/object/name/{name}")
	public ResultModel getObjectByName(@PathVariable String name);
	
	@GetMapping(value="/object/{sysId}")
	public ResultModel getObjectBySysId(@PathVariable String sysId);
	
	@GetMapping(value="/dictionary/table/{tableName}")
	public ResultModel getListDic(@PathVariable String tableName);
	
	@GetMapping(value="/dictionary/{sysId}")
	public ResultModel getDicBySysId(@PathVariable String sysId);
}
