package com.upyoo.cloud.common.api.ucmpmodel;

import com.upyoo.cloud.common.entity.ResultModel;
import com.upyoo.cloud.common.entity.model.DbObject;
import com.upyoo.cloud.common.entity.model.Dictionary;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("model")
@RequestMapping("/table")
public interface TableModelAPI {

	@GetMapping(value="/object/name/{name}")
	public ResultModel<DbObject> getObjectByName(@PathVariable("name") String name);
	
	@GetMapping(value="/object/{sysId}")
	public ResultModel<DbObject> getObjectBySysId(@PathVariable("sysId") String sysId);
	
	@GetMapping(value="/dictionary/all/{tableName}")
	public ResultModel<List<Dictionary>> getAllListDic(@PathVariable("tableName") String tableName);
	
	@GetMapping(value="/dictionary/visible/{tableName}")
	public ResultModel<List<Dictionary>> getVisibleListDic(@PathVariable("tableName") String tableName);
	
	@GetMapping(value="/dictionary/{sysId}")
	public ResultModel<Dictionary> getDicBySysId(@PathVariable("sysId") String sysId);
	
	@GetMapping(value="/object/parent/{tableNname}")
	public ResultModel<List<DbObject>> getAncestorByName(@PathVariable("tableName") String tableName);
	
	@GetMapping(value="/object/inherit/{tableName}")
	public ResultModel<List<DbObject>> getInheritByName(@PathVariable("tableName") String tableName,@RequestParam(value="onlyLeaf",required=false) boolean onlyLeaf);
}
