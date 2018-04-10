package com.upyoo.cloud.common.api.view;

import com.upyoo.cloud.common.entity.ResultModel;
import com.upyoo.cloud.common.entity.view.UiForm;
import com.upyoo.cloud.common.entity.view.UiList;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("view")
@RequestMapping("/view")
public interface ViewAPI {

    @PostMapping("/form")
    public ResultModel saveForm(@RequestBody UiForm form);

    @GetMapping("/form/{id}")
    public ResultModel queryFormById(@PathVariable("id") String id);

    @DeleteMapping("/form/{id}")
    public ResultModel deleteFormById(@PathVariable("id") String id);

    @DeleteMapping("/form/{objectName}")
    public ResultModel deleteFormByObjectName(@PathVariable("objectName") String objectName);

    @GetMapping("/table/{objectName}/form")
    public ResultModel queryFormByObjectName(@PathVariable("objectName") String objectName);

    @GetMapping("/table/one/{objectName}/form")
    public ResultModel queryOneFormByObjectName(@PathVariable("objectName") String objectName);

    @GetMapping("/task/{userId}/{taskId}")
    public ResultModel queryFormByTask(@PathVariable("userId") String userId, @PathVariable("taskId") String taskId);

    @PostMapping("/list")
    public ResultModel saveList(@RequestBody UiList list);

    @GetMapping("/list/{id}")
    public ResultModel queryListById(@PathVariable("id") String id);

    @DeleteMapping("/list/{id}")
    public ResultModel deleteListById(@PathVariable("id") String id);

    @DeleteMapping("/list/{objectName}")
    public ResultModel deleteListByObjectName(@PathVariable("objectName") String objectName);

    @PostMapping("/init/{superObjectName}/{objectName}/{owner}")
    public ResultModel initView(@PathVariable("superObjectName") String superObjectName, @PathVariable("objectName") String objectName, @PathVariable("owner") String owner);

    @GetMapping("/test")
    public ResultModel test();

}