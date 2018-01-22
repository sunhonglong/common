package com.upyoo.cloud.common.api;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.upyoo.cloud.common.entity.ResultModel;

@FeignClient("automation")
@RequestMapping("/autoapp")
public interface CooperationAppApi {
	@GetMapping(value="/{owner}",produces ="application/json; charset=utf-8")
	public ResultModel queryAllCooperationAppByOwner(@PathVariable("owner") String owner) ;
	
	@GetMapping(value="/app")
	public ResultModel get(@RequestParam("id") String id) ;
	
	@PostMapping(value="/{owner}")
	public ResultModel create(@PathVariable("owner")  String owner,@RequestBody Map<String, String> autoApp);
	
	@DeleteMapping(value="/{id}")
	public ResultModel  delete(@PathVariable("id") String id) ;
}
