package cn.darlen.elec.service;

import cn.darlen.elec.domain.ElecText;

/**
 * User: darlen
 * Date: 13-12-25
 * Time: 下午11:10
 */
public interface ElecTextServiceI {
    public final static String SERVICE_NAME = "cn.darlen.elec.service.ElecTextServiceImpl";
    public void saveElecText(ElecText elecText);
}
