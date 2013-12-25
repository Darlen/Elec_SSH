package cn.darlen.elec.junit;

import cn.darlen.elec.dao.ElecTextDaoI;
import cn.darlen.elec.domain.ElecText;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * It is used to test Dao
 * User: darlen liu
 * Date: 13-12-24
 * Time: 下午11:03
 */
public class TestDao {

    /**
     * 二、测试Dao层搭建
     * 1.得到applicationContext
     * 2.获取服务节点（注入implementation）
     * 3.hibernate.cfg.xml自动提交
     */
    @Test
    public void saveElecText(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ElecTextDaoI dao = (ElecTextDaoI) ac.getBean(ElecTextDaoI.SERVICE_NAME);//获取服务节点
        //实例化PO对象复制并执行
        ElecText elecText = new ElecText();
        elecText.setTextName("测试Dao");
        elecText.setTextDate(new Date());
        elecText.setTextRemark("测试Dao");

        dao.save(elecText);
    }
}
