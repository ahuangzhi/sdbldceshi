package com.cqbld.po;

import lombok.Data;

@Data
public class AuditLogPo {
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
