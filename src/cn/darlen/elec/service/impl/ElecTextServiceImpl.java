package cn.darlen.elec.service.impl;

import cn.darlen.elec.dao.ElecTextDaoI;
import cn.darlen.elec.domain.ElecText;
import cn.darlen.elec.service.ElecTextServiceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: Darlen liu
 * Date: 13-12-25
 * Time: 下午11:10
 */
@Service(ElecTextServiceI.SERVICE_NAME)
public class ElecTextServiceImpl implements ElecTextServiceI {
    @Resource(name = ElecTextDaoI.SERVICE_NAME)
    private ElecTextDaoI dao;

    @Override
    public void saveElecText(ElecText elecText) {
        dao.save(elecText);
    }
}
