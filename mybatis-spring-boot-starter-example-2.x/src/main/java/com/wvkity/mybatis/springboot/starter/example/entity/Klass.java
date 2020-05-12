package com.wvkity.mybatis.springboot.starter.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 班级信息表
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@EqualsAndHashCode
@Accessors(chain = true)
public class Klass implements Serializable {
    
    private static final long serialVersionUID = -8171090337461272720L;

    /**
     * 主键
     */
    private Long id;
    
    /**
     * 班级名称
     */
    private String name;

    /**
     * 删除标识
     */
    private Boolean deleted;

    /**
     * 创建人
     */
    private String createdUserName;

    /**
     * 创建人ID
     */
    private Long createdUserId;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreated;

    /**
     * 最后更新人
     */
    private String lastModifiedUserName;

    /**
     * 最后更新人ID
     */
    private Long lastModifiedUserId;

    /**
     * 最后更新时间
     */
    private LocalDateTime gmtLastModified;

    /**
     * 删除人ID
     */
    private Long deletedUserId;

    /**
     * 删除人名称
     */
    private String deletedUserName;

    /**
     * 删除时间
     */
    private LocalDateTime gmtDeleted;
}
