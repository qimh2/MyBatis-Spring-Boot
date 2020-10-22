package tk.mybatis.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.springboot.service.SqlScriptService;

@RestController
@RequestMapping("/sqlScript")
public class SqlScriptController {

    @Autowired
    private SqlScriptService sqlScriptService;

    @RequestMapping("/generatorSqlScript")
    public String generatorSqlScript(){

        return sqlScriptService.generatorSqlScript();
    }

    @RequestMapping("/analysisSqlScript")
    public String analysisSqlScript(){

        return sqlScriptService.analysisSqlScript();
    }
}
