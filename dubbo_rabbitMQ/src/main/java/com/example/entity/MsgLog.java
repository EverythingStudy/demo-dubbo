package com.example.entity;

import java.io.Serializable;
import java.util.Date;

public class MsgLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.msg_id
     *
     * @mbg.generated
     */
    private String msgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.exchange
     *
     * @mbg.generated
     */
    private String exchange;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.routing_key
     *
     * @mbg.generated
     */
    private String routingKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.try_count
     *
     * @mbg.generated
     */
    private Integer tryCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.next_try_time
     *
     * @mbg.generated
     */
    private Date nextTryTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_log.msg
     *
     * @mbg.generated
     */
    private String msg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table msg_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.msg_id
     *
     * @return the value of msg_log.msg_id
     *
     * @mbg.generated
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.msg_id
     *
     * @param msgId the value for msg_log.msg_id
     *
     * @mbg.generated
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.exchange
     *
     * @return the value of msg_log.exchange
     *
     * @mbg.generated
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.exchange
     *
     * @param exchange the value for msg_log.exchange
     *
     * @mbg.generated
     */
    public void setExchange(String exchange) {
        this.exchange = exchange == null ? null : exchange.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.routing_key
     *
     * @return the value of msg_log.routing_key
     *
     * @mbg.generated
     */
    public String getRoutingKey() {
        return routingKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.routing_key
     *
     * @param routingKey the value for msg_log.routing_key
     *
     * @mbg.generated
     */
    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey == null ? null : routingKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.status
     *
     * @return the value of msg_log.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.status
     *
     * @param status the value for msg_log.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.try_count
     *
     * @return the value of msg_log.try_count
     *
     * @mbg.generated
     */
    public Integer getTryCount() {
        return tryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.try_count
     *
     * @param tryCount the value for msg_log.try_count
     *
     * @mbg.generated
     */
    public void setTryCount(Integer tryCount) {
        this.tryCount = tryCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.next_try_time
     *
     * @return the value of msg_log.next_try_time
     *
     * @mbg.generated
     */
    public Date getNextTryTime() {
        return nextTryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.next_try_time
     *
     * @param nextTryTime the value for msg_log.next_try_time
     *
     * @mbg.generated
     */
    public void setNextTryTime(Date nextTryTime) {
        this.nextTryTime = nextTryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.create_time
     *
     * @return the value of msg_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.create_time
     *
     * @param createTime the value for msg_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.update_time
     *
     * @return the value of msg_log.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.update_time
     *
     * @param updateTime the value for msg_log.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_log.msg
     *
     * @return the value of msg_log.msg
     *
     * @mbg.generated
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_log.msg
     *
     * @param msg the value for msg_log.msg
     *
     * @mbg.generated
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_log
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MsgLog other = (MsgLog) that;
        return (this.getMsgId() == null ? other.getMsgId() == null : this.getMsgId().equals(other.getMsgId()))
            && (this.getExchange() == null ? other.getExchange() == null : this.getExchange().equals(other.getExchange()))
            && (this.getRoutingKey() == null ? other.getRoutingKey() == null : this.getRoutingKey().equals(other.getRoutingKey()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTryCount() == null ? other.getTryCount() == null : this.getTryCount().equals(other.getTryCount()))
            && (this.getNextTryTime() == null ? other.getNextTryTime() == null : this.getNextTryTime().equals(other.getNextTryTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_log
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMsgId() == null) ? 0 : getMsgId().hashCode());
        result = prime * result + ((getExchange() == null) ? 0 : getExchange().hashCode());
        result = prime * result + ((getRoutingKey() == null) ? 0 : getRoutingKey().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTryCount() == null) ? 0 : getTryCount().hashCode());
        result = prime * result + ((getNextTryTime() == null) ? 0 : getNextTryTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_log
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", msgId=").append(msgId);
        sb.append(", exchange=").append(exchange);
        sb.append(", routingKey=").append(routingKey);
        sb.append(", status=").append(status);
        sb.append(", tryCount=").append(tryCount);
        sb.append(", nextTryTime=").append(nextTryTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", msg=").append(msg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}