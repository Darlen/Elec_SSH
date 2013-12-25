package cn.darlen.elec.junit;

import cn.darlen.elec.domain.ElecText;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Date;

/**
 * It is used to test hibernate configuration is correct?
 * User: darlen liu
 * Date: 13-12-24
 * Time: 下午11:03
 *
 */
public class TestHibernate {

    /**
     * 一、测试持久层搭建
     * 1.获取configuration
     * 2.创建session factory
     * 3.打开session
     * 4.开启事物
     * 5.实例化对象
     * 6.保存对象
     * 7.提交事务
     * 8关闭session
     */
    @Test
    public void testElecText(){
        Configuration cfg = new Configuration();
        cfg.configure();
        //创建SessionFactory
        SessionFactory sf =  cfg.buildSessionFactory();
        //打开session
        Session session = sf.openSession();
        //开启事物
        Transaction ts = session.beginTransaction();
        //实例化ElecText
        ElecText elecText = new ElecText();
        elecText.setTextName("测试hibernate");
        elecText.setTextDate(new Date());
        elecText.setTextRemark("测试remark");
        //保存electext
        session.save(elecText);
        //提交事务
        ts.commit();
        //关闭session
        session.close();

    }
}
