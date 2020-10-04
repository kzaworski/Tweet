package dao;

import hibernate.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

public class AbstractAppUserDao {
    protected final HibernateUtil hibernateUtil = HibernateUtil.getInstance();
    protected final EntityManager em = hibernateUtil.getEm();
}
