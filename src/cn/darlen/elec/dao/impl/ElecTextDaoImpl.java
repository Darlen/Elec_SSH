package cn.darlen.elec.dao.impl;

import cn.darlen.elec.dao.ElecTextDaoI;
import cn.darlen.elec.domain.ElecText;
import org.springframework.stereotype.Repository;

/**
 * User: darlen liu
 * Date: 13-12-25
 * Time: 下午10:27
 */
//*******Repository 注解：注入实现方法（服务节点对象）
@Repository(ElecTextDaoI.SERVICE_NAME)
public class ElecTextDaoImpl extends CommonDaoImpl<ElecText> implements ElecTextDaoI{

}
