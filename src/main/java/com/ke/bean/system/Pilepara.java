package com.ke.bean.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author dbr
 * @since 2020-01-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Pilepara implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer substId;

    private String name;

    private Integer useFlag;

    private String serialCode;

    private Integer rtuId;

    private String pileaddr;

    private String imageUrl;

    private Integer type;

    private Integer gunNum;

    private Integer bikeGunNum;

    private Integer cpFlag;

    private Integer gunFlag;

    private Integer factoryId;

    private Integer rateId;

    private Integer rateperiodId;

    private Float limitP;

    private Integer rv;

    private Float ri;

    private Integer wiringMode;

    private Integer vUp;

    private Integer vDown;

    private LocalDateTime runDate;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private Integer pileIdx;

    private String pileNo;


}
