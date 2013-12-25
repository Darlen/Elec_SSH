package cn.darlen.elec.dao.impl;

import cn.darlen.elec.dao.CommonDaoI;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.annotation.Resource;

/**
 * Common dao
 * User: darlen liu
 * Date: 13-12-25
 * Time: 下午9:56
 */
public class CommonDaoImpl<T>  extends HibernateDaoSupport implements CommonDaoI<T>{

    public void save(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    /**
     *************** 得到hibernateTemplate
     * 1.xml方式注入sessionFactory
      <bean id="xxxxx" class="cn.itcast.elec.dao.impl.CommonDaoImpl">
     <property name="sessionFactory" ref="sessionFactory"></property>
     </bean>
     * 2.注解方式注入sessionFactory(@Resource(name="sessionFactory"))
     */
    @Resource(name="sessionFactory")
    public final void setSessionFactoryDi(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
