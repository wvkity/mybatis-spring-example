package com.wvkity.mybatis.example.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class GradeVo implements Serializable {

    private static final long serialVersionUID = 446838895774432290L;
    /**
     * 年级编号
     */
    private Long id;

    /**
     * 年级名称
     */
    private String name;

    /**
     * 删除标识
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreated;
}
