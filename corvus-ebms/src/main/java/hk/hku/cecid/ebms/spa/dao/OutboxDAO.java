package hk.hku.cecid.ebms.spa.dao;

import hk.hku.cecid.piazza.commons.dao.DAO;
import hk.hku.cecid.piazza.commons.dao.DAOException;

import java.util.List;

/**
 * @author Donahue Sze
 * 
 */
public interface OutboxDAO extends DAO {
    public boolean findOutbox(OutboxDVO data) throws DAOException;

    public void addOutbox(OutboxDVO data) throws DAOException;

    public boolean updateOutbox(OutboxDVO data) throws DAOException;

    public void deleteOutbox(OutboxDVO data) throws DAOException;
    
    public List selectOutbox() throws DAOException;
}