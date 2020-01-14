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
public class Rtupara implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer substid;

    private String name;

    private Integer useflag;

    private Integer protocol;

    private Integer rtuAddr;

    private String areaCode;

    private String authCode;

    private Integer authCodelen;

    private Integer authCodeFano;

    private Integer authCodeFacs;

    private Integer safeInter;

    private Integer encryptType;

    private Integer encryptId;

    private String softVersion;

    private String hardVersion;

    private String simcard;

    private Integer concurrencyF;

    private Integer pilenum;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;


}
