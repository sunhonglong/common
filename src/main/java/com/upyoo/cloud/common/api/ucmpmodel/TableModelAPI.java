package com.upyoo.cloud.common.api.ucmpmodel;

import com.upyoo.cloud.common.entity.ResultModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("model")
@RequestMapping("/table")
public interface TableModelAPI {

	@GetMapping(value="/object/name/{name}")
	public ResultModel getObjectByName(@PathVariable("name") String name);
	
	@GetMapping(value="/object/{sysId}")
	public ResultModel getObjectBySysId(@PathVariable("sysId") String sysId);
	
	@GetMapping(value="/dictionary/table/{tableName}")
	public ResultModel getListDic(@PathVariable("tableName") String tableName);
	
	@GetMapping(value="/dictionary/{sysId}")
	public ResultModel getDicBySysId(@PathVariable("sysId") String sysId);
	
	@GetMapping(value="/object/parent/{tableNname}")
	public ResultModel getAncestorByName(@PathVariable("tableName") String tableName);
	
	@GetMapping(value="/object/inherit/{tableName}")
	public ResultModel getInheritByName(@PathVariable("tableName") String tableName,@RequestParam("onlyLeaf") boolean onlyLeaf);
}
