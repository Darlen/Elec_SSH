package cn.darlen.elec.dao;

/**
 * Created with IntelliJ IDEA.
 * User: acer
 * Date: 13-12-25
 * Time: 下午9:55
 * To change this template use File | Settings | File Templates.
 */
public interface CommonDaoI<T> {
    public void save(T entity);
}
