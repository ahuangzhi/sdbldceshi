package com.cqbld.serviceImpl;

import com.cqbld.dao.AuditLogDao;
import com.cqbld.po.AuditLogPo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AuditLogServiceImpl {

    @Resource
    private AuditLogDao auditLogDao;

    /**
     *
     * @param a
     * @return
     */
    public List<AuditLogPo> getAuditLogLists(AuditLogPo a){
        return auditLogDao.getAuditLogLists(a);
    }
}
