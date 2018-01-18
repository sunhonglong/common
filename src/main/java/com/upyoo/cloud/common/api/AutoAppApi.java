package com.upyoo.cloud.common.api;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("automation")
@RequestMapping("/autoapp")
public interface AutoAppApi {
	@GetMapping(value="/{owner}",produces ="application/json; charset=utf-8")
	public Map<String, Object> queryAllAutoApp(@PathVariable("owner") String owner) ;
	
	@GetMapping(value="/app",produces ="application/json; charset=utf-8")
	public Map<String, Object> get(@RequestParam("id") String id) ;
	
	@PostMapping(value="/{owner}")
	public Map<String, Object> createAutoApp(@PathVariable("owner")  String owner,@RequestBody Map<String, String> autoApp);
}
