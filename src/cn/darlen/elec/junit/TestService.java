package cn.darlen.elec.junit;

import cn.darlen.elec.dao.ElecTextDaoI;
import cn.darlen.elec.domain.ElecText;
import cn.darlen.elec.service.ElecTextServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author Darlen liu
 * @Date 2013-12-25
 * @Time 23:20
 */
public class TestService {

    /**
     * 三、测试Service层搭建
     * 1.得到applicationContext
     * 2.获取服务节点（注入implementation）
     * 3.hibernate.cfg.xml自动提交
     */
    @Test
    public void saveElecText(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ElecTextServiceI service = (ElecTextServiceI) ac.getBean(ElecTextServiceI.SERVICE_NAME);//获取服务节点
        //实例化PO对象复制并执行
        ElecText elecText = new ElecText();
        elecText.setTextName("测试service");
        elecText.setTextDate(new Date());
        elecText.setTextRemark("测试service");

        service.saveElecText(elecText);
    }
}
