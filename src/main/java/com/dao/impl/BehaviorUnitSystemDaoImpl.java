package com.dao.impl;

import com.dao.BehaviorUnitSystemDao;
import com.entity.BehaviorUnitSystem;
import org.apache.commons.collections.CollectionUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BehaviorUnitSystemDaoImpl implements BehaviorUnitSystemDao {

    @Resource
    SessionFactory sf = null;

    @Override
    public BehaviorUnitSystem getBehaviorUnitSystemById(String id) {
        Session session = null;
        BehaviorUnitSystem behaviorUnitSystem = null;
        try {
            //实例化Session
            session = sf.openSession();
            String hql = "from BehaviorUnitSystem where id=:id ";
            Query query = session.createQuery(hql);
            query.setString("id",id);
            List list = query.list();
            if (CollectionUtils.isNotEmpty(list)){
                behaviorUnitSystem = (BehaviorUnitSystem) list.get(0);
            }

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return behaviorUnitSystem;
    }

    @Override
    public List<BehaviorUnitSystem> getBehaviorUnitSystems(String id,int offset,int length) {
        Session session = null;
        List<BehaviorUnitSystem> result = null;
        try {
            //实例化Session
            session = sf.openSession();
            String hql = "from BehaviorUnitSystem order by id desc";
            Query query = session.createQuery(hql);
            //query.setString("id",id);
            query.setFirstResult(offset);
            query.setMaxResults(length);
            result = query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public Long getAllRowCount() {
        String hql = "select count(*) from BehaviorUnitSystem";
        Session session = sf.openSession();
        Query query = session.createQuery(hql);
        return Long.parseLong(query.uniqueResult().toString());
    }
}
