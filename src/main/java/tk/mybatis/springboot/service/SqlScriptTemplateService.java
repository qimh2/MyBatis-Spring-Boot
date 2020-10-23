package tk.mybatis.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SqlScriptTemplateService {
    @Autowired
    private MaintenanceOrderSaicAssessInfoOldService maintenanceOrderSaicAssessInfoOldService;
    @Autowired
    private MaintenanceOrderSaicAssessOldService maintenanceOrderSaicAssessOldService;
    @Autowired
    private  MaintenanceOrderSaicAssessTobOldService maintenanceOrderSaicAssessTobOldService;
    @Autowired
    private PickGiveCarOrderImgOldService pickGiveCarOrderImgOldService;
    @Autowired
    private PickGiveCarOrderOldService pickGiveCarOrderOldService;

    /**
     * 生成sql Json 脚本
     *
     * @return
     */
    public String generatorSqlScript(){
        maintenanceOrderSaicAssessInfoOldService.generatorSqlScript();
        maintenanceOrderSaicAssessOldService.generatorSqlScript();
        maintenanceOrderSaicAssessTobOldService.generatorSqlScript();
        pickGiveCarOrderImgOldService.generatorSqlScript();
        pickGiveCarOrderOldService.generatorSqlScript();
        return "success";
    }

    /**
     * 解析sql Json文件
     *
     * @return
     */
    public String analysisSqlScript(){
        maintenanceOrderSaicAssessInfoOldService.analysisSqlScript();
        maintenanceOrderSaicAssessOldService.analysisSqlScript();
        maintenanceOrderSaicAssessTobOldService.analysisSqlScript();
        pickGiveCarOrderImgOldService.analysisSqlScript();
        pickGiveCarOrderOldService.analysisSqlScript();
        return "success";
    }
}
