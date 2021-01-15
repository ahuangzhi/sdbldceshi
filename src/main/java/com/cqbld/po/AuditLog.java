package com.cqbld.po;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
@TableName("audit_log")
public class AuditLog {
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    private String tenantId;
    private String customerId;
    private String entityId;
    private String entityType;
    private String entityName;
    private String userId;
    private String userName;
    private String actionType;
    private String actionData;
    private String actionStatus;
    private String actionFailureDetails;
}
