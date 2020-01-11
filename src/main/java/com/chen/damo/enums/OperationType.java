package com.chen.damo.enums;

public enum  OperationType {
    QUERY,
    ADD,
    MODIFY,
    DELETE,
    AUDIT,
    UPLOAD,
    DOWNLOAD,
    EXPORT,
    BACKUP;
    private OperationType() {
    }
}
