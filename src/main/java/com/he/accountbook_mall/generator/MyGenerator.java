package com.he.accountbook_mall.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.*;

public class MyGenerator {

    public static void main(String[] args) {
        // 自定义需要填充的字段
        List<TableFill> tableFillList = new ArrayList<>();
        tableFillList.add(new TableFill("ASDD_SS", FieldFill.INSERT_UPDATE));

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator()
                .setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                        .setOutputDir("D:\\it\\accountbook_mall\\src\\main\\java\\com\\he\\accountbook_mall")//输出目录
                        .setFileOverride(true)// 是否覆盖文件
                        .setActiveRecord(true)// 开启 activeRecord 模式
                        .setEnableCache(false)// XML 二级缓存
                        .setBaseResultMap(true)// XML ResultMap
                        .setBaseColumnList(true)// XML columList
                        //.setKotlin(true) 是否生成 kotlin 代码
                        .setAuthor("BaoZhou")
                // 自定义文件命名，注意 %s 会自动填充表实体属性！
                 .setEntityName("%sEntity")
                 .setMapperName("%sDao")
                // .setXmlName("%sDao")
                // .setServiceName("MP%sService")
                // .setServiceImplName("%sServiceDiy")
                // .setControllerName("%sAction")
        ).setDataSource(
                // 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.MYSQL)// 数据库类型
                        //.setTypeConvert(new MySqlTypeConvert() {
                        //    // 自定义数据库表字段类型转换【可选】
                        //    @Override
                        //    public DbColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                        //        System.out.println("转换类型：" + fieldType);
                        //        // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
                        //        //    return DbColumnType.BOOLEAN;
                        //        // }
                        //        return super.processTypeConvert(globalConfig, fieldType);
                        //    }
                        //})
                        .setDriverName("com.mysql.cj.jdbc.Driver")
                        .setUsername("root")
                        .setPassword("root")
                        .setUrl("jdbc:mysql://localhost:3306/account?characterEncoding=utf8")
        ).setStrategy(
                // 策略配置
                new StrategyConfig()
                         .setCapitalMode(true)// 全局大写命名
                        // .setDbColumnUnderline(true)//全局下划线命名
//                        .setTablePrefix(new String[]{"tbl_", "mp_"})// 此处可以修改为您的表前缀
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                         .setInclude(new String[] { "book","total" }) // 需要生成的表
                        // .setExclude(new String[]{"test"}) // 排除生成的表
                        // 自定义实体父类
                        // .setSuperEntityClass("com.baomidou.demo.TestEntity")
                        // 自定义实体，公共字段
//                        .setTableFillList(tableFillList)
                // 自定义 mapper 父类
                // .setSuperMapperClass("com.baomidou.demo.TestMapper")
                // 自定义 service 父类
                // .setSuperServiceClass("com.baomidou.demo.TestService")
                // 自定义 service 实现类父类
                // .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")
                // 自定义 controller 父类
                // .setSuperControllerClass("com.baomidou.demo.TestController")
                // 【实体】是否生成字段常量（默认 false）
                // public static final String ID = "test_id";
                // .setEntityColumnConstant(true)
                // 【实体】是否为构建者模型（默认 false）
                // public User setName(String name) {this.name = name; return this;}
                // .setEntityBuilderModel(true)
                // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
                // .setEntityLombokModel(true)
                // Boolean类型字段是否移除is前缀处理
                // .setEntityBooleanColumnRemoveIsPrefix(true)
                // .setRestControllerStyle(true)
                // .setControllerMappingHyphenStyle(true)
        ).setPackageInfo(
                // 包配置
                new PackageConfig()
                        .setModuleName("accountbook_mall")
                        .setParent("com.he.accountbook_mall")// 自定义包路径
                        .setController("controller")// 这里是控制器包名，默认 we
                        .setService("service")
                        .setServiceImpl("service.impl")
                        .setEntity("domain")
                .setXml("controller")

        ).setTemplateEngine(
                new FreemarkerTemplateEngine()
                );
        mpg.execute();

    }

}
