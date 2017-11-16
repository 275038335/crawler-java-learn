package com.chinaredstar.jc.crawler.common.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 可为字典的 业务实现类与Key映射
 * (key,implName)
 * key ：前端传过来的标志
 * implName：实现可字典展示的接口 实现类 注入到spring中的 id（name）
 * Created by fangjian on 2017/8/2.
 */
public enum DictAbleImplMapEnum {

    BIZ_PROJECT_NAME("BIZ_PROJECT_NAME", "projectServiceImpl"),//项目名称
    BIZ_PROJECT_LAYOUT("BIZ_PROJECT_LAYOUT", "projectLayoutService"),//项目户型
    BIZ_SYSTEM_LOG("BIZ_SYSTEM_LOG", "systemLogServiceImpl"),//项目名称
    BIZ_PRODUCT_NAME("BIZ_PRODUCT_NAME", "productServiceImpl"),//自己创建的商品名称
    BIZ_ALL_PRODUCT_NAME("BIZ_ALL_PRODUCT_NAME", "getProductServiceImpl"),//全部商品名称

    BIZ_SUPPLIER_CATEGORY("BIZ_SUPPLIER_CATEGORY", "supplierCategoryService"),//供应商类目

    BIZ_SUPPLIER_NAME("BIZ_SUPPLIER_NAME", "supplierService"),//供应商名称

    BIZ_BUDGET_PRODUCT("BIZ_BUDGET_PRODUCT", "budgetSumProductService"),//预算汇总产品

    BIZ_BUDGET_PROJECT("BIZ_BUDGET_PROJECT", "budgetSumProjectService"),//预算汇总项目

    BIZ_ING_PROJECT("BIZ_ING_PROJECT", "projectServiceImpl"),//状态筛选项目名称列表

    BIZ_MATERIAL_APPLICATION("BIZ_MATERIAL_APPLICATION", "materialServiceImpl"),//项目下的物料申请单列表

    BIZ_SUPPLIER_APPLICATION("BIZ_SUPPLIER_APPLICATION", "supplierQueryService"),//物料申请单下供应商列表

    BIZ_PROJECT_PURCHASE_ORDER("BIZ_PROJECT_PURCHASE_ORDER", "purchaseService"),//项目下的采购单列表

    BIZ_SUPPLIER_NAME_ALL("BIZ_SUPPLIER_NAME_ALL", "supplierNameAllQueryService"),//所有供应名称
    ;

    private String key;
    private String implName;

    DictAbleImplMapEnum(String key, String implName) {
        this.key = key;
        this.implName = implName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getImplName() {
        return implName;
    }

    public void setImplName(String implName) {
        this.implName = implName;
    }


    private static final Map<String, String> KEY_IMPL_MAP;

    static {
        KEY_IMPL_MAP = new LinkedHashMap<>();
        for (DictAbleImplMapEnum e : DictAbleImplMapEnum.values()) {
            KEY_IMPL_MAP.put(e.getKey(), e.getImplName());
        }
    }

    //根据 key 获取 实现类名字（Spring bean 管理的 id）
    public static String getImplNameByKey(String key) {
        if (containsKey(key)) {
            return KEY_IMPL_MAP.get(key);
        }
        return null;
    }

    //判断 key 是否在其中
    public static boolean containsKey(String key) {
        return KEY_IMPL_MAP.containsKey(key);
    }


}
