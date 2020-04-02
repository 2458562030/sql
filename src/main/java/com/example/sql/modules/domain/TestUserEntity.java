package com.example.sql.modules.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "test_user", schema = "test_today", catalog = "")
public class TestUserEntity {
    private long id;
    private String name;
    private Timestamp birthTime;
    private byte sex;
    private String idNum;
    private String createBy;
    private String updateBy;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte dr;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "birth_time")
    public Timestamp getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(Timestamp birthTime) {
        this.birthTime = birthTime;
    }

    @Basic
    @Column(name = "sex")
    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "id_num")
    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    @Basic
    @Column(name = "create_by")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "update_by")
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "dr")
    public Byte getDr() {
        return dr;
    }

    public void setDr(Byte dr) {
        this.dr = dr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestUserEntity that = (TestUserEntity) o;
        return id == that.id &&
                sex == that.sex &&
                Objects.equals(name, that.name) &&
                Objects.equals(birthTime, that.birthTime) &&
                Objects.equals(idNum, that.idNum) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(dr, that.dr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthTime, sex, idNum, createBy, updateBy, createTime, updateTime, dr);
    }
}
