package generator.controller;

import com.focus.framework.base.response.Response;
import generator.properties.DevtoolsProperties;
import generator.service.GenerateService;
import generator.service.TableService;
import generator.task.GenerateTask;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 代码生成控制器
 *
 * @author LIQIU
 * @Date 2017年11月30日16:39:19
 */
@RestController
@Api(value="/generator",tags = "代码生成器接口")
@RequestMapping("/generator")
public class GeneratorController  {

    @Autowired
    private TableService tableService;

    @Autowired
    private GenerateService generateService;

    @Autowired
    private DevtoolsProperties devtoolsProperties;

    /**
     * 获取环境信息
     */
    @GetMapping("/env")
    @ApiOperation("获取代码生成器配置")
    public Response blackboard() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("tables",tableService.getAllTables());
        hashMap.put("params",devtoolsProperties);
        return Response.ok(hashMap);
    }

    /**
     * 生成代码
     */
    @ApiOperation("生成代码")
    @PostMapping("/generate")
    public Response generate(GenerateTask generateTask){
        generateService.generate(generateTask);
        return Response.ok();
    }
}
