package com.entity.vo;

import com.entity.ZhegncewenjianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 政策文件
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhegncewenjian")
public class ZhegncewenjianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 政策文件名称
     */

    @TableField(value = "zhegncewenjian_name")
    private String zhegncewenjianName;


    /**
     * 政策文件编号
     */

    @TableField(value = "zhegncewenjian_uuid_number")
    private String zhegncewenjianUuidNumber;


    /**
     * 政策文件照片
     */

    @TableField(value = "zhegncewenjian_photo")
    private String zhegncewenjianPhoto;


    /**
     * 文件
     */

    @TableField(value = "zhegncewenjian_file")
    private String zhegncewenjianFile;


    /**
     * 政策文件类型
     */

    @TableField(value = "zhegncewenjian_types")
    private Integer zhegncewenjianTypes;


    /**
     * 政策文件热度
     */

    @TableField(value = "zhegncewenjian_clicknum")
    private Integer zhegncewenjianClicknum;


    /**
     * 政策文件内容
     */

    @TableField(value = "zhegncewenjian_content")
    private String zhegncewenjianContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "zhegncewenjian_delete")
    private Integer zhegncewenjianDelete;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "fabu_time")
    private Date fabuTime;


    /**
     * 执行时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zhixing_time")
    private Date zhixingTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：政策文件名称
	 */
    public String getZhegncewenjianName() {
        return zhegncewenjianName;
    }


    /**
	 * 获取：政策文件名称
	 */

    public void setZhegncewenjianName(String zhegncewenjianName) {
        this.zhegncewenjianName = zhegncewenjianName;
    }
    /**
	 * 设置：政策文件编号
	 */
    public String getZhegncewenjianUuidNumber() {
        return zhegncewenjianUuidNumber;
    }


    /**
	 * 获取：政策文件编号
	 */

    public void setZhegncewenjianUuidNumber(String zhegncewenjianUuidNumber) {
        this.zhegncewenjianUuidNumber = zhegncewenjianUuidNumber;
    }
    /**
	 * 设置：政策文件照片
	 */
    public String getZhegncewenjianPhoto() {
        return zhegncewenjianPhoto;
    }


    /**
	 * 获取：政策文件照片
	 */

    public void setZhegncewenjianPhoto(String zhegncewenjianPhoto) {
        this.zhegncewenjianPhoto = zhegncewenjianPhoto;
    }
    /**
	 * 设置：文件
	 */
    public String getZhegncewenjianFile() {
        return zhegncewenjianFile;
    }


    /**
	 * 获取：文件
	 */

    public void setZhegncewenjianFile(String zhegncewenjianFile) {
        this.zhegncewenjianFile = zhegncewenjianFile;
    }
    /**
	 * 设置：政策文件类型
	 */
    public Integer getZhegncewenjianTypes() {
        return zhegncewenjianTypes;
    }


    /**
	 * 获取：政策文件类型
	 */

    public void setZhegncewenjianTypes(Integer zhegncewenjianTypes) {
        this.zhegncewenjianTypes = zhegncewenjianTypes;
    }
    /**
	 * 设置：政策文件热度
	 */
    public Integer getZhegncewenjianClicknum() {
        return zhegncewenjianClicknum;
    }


    /**
	 * 获取：政策文件热度
	 */

    public void setZhegncewenjianClicknum(Integer zhegncewenjianClicknum) {
        this.zhegncewenjianClicknum = zhegncewenjianClicknum;
    }
    /**
	 * 设置：政策文件内容
	 */
    public String getZhegncewenjianContent() {
        return zhegncewenjianContent;
    }


    /**
	 * 获取：政策文件内容
	 */

    public void setZhegncewenjianContent(String zhegncewenjianContent) {
        this.zhegncewenjianContent = zhegncewenjianContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getZhegncewenjianDelete() {
        return zhegncewenjianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setZhegncewenjianDelete(Integer zhegncewenjianDelete) {
        this.zhegncewenjianDelete = zhegncewenjianDelete;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getFabuTime() {
        return fabuTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setFabuTime(Date fabuTime) {
        this.fabuTime = fabuTime;
    }
    /**
	 * 设置：执行时间
	 */
    public Date getZhixingTime() {
        return zhixingTime;
    }


    /**
	 * 获取：执行时间
	 */

    public void setZhixingTime(Date zhixingTime) {
        this.zhixingTime = zhixingTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
