package com.upyoo.cloud.common.api.ucmpview;

import com.upyoo.cloud.common.entity.ResultModel;
import com.upyoo.cloud.common.entity.itsmview.SysUiView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("itsmview")
@RequestMapping("/uiview")
public interface UiViewAPI {

    @PostMapping("/create")
    public ResultModel createUiView(@RequestBody SysUiView sysUiView);

    @PostMapping("/update")
    public ResultModel updateUiView(@RequestBody SysUiView sysUiView);

    @GetMapping("/query/{sysId}")
    public ResultModel queryUiViewBySysId(@PathVariable("sysId") String sysId);

    @GetMapping("/query/{owner}")
    public ResultModel queryUiViewBySysOwner(@PathVariable("owner") String owner);

    @DeleteMapping("/delete/{sysId}")
    public ResultModel deleteUiViewBySysId(@PathVariable("sysId") String sysId);
}
