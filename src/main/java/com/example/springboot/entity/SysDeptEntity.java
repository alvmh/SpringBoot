package com.example.springboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_dept", schema = "springboot")
public class SysDeptEntity {
    private long deptId;
    private Long pid;
    private String pids;
    private String simpleName;
    private String fullName;
    private String description;
    private Integer version;
    private Integer sort;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Long createUser;
    private Long updateUser;

    @Id
    @Column(name = "dept_id")
    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "pid")
    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pids")
    public String getPids() {
        return pids;
    }

    public void setPids(String pids) {
        this.pids = pids;
    }

    @Basic
    @Column(name = "simple_name")
    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    @Basic
    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
    @Column(name = "create_user")
    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "update_user")
    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysDeptEntity that = (SysDeptEntity) o;
        return deptId == that.deptId &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(pids, that.pids) &&
                Objects.equals(simpleName, that.simpleName) &&
                Objects.equals(fullName, that.fullName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(version, that.version) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptId, pid, pids, simpleName, fullName, description, version, sort, createTime, updateTime, createUser, updateUser);
    }
}
