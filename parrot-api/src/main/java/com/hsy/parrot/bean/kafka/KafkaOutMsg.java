package com.hsy.parrot.bean.kafka;

import java.io.Serializable;
import java.util.Date;

/**
 * pojo
 * @author hsy
 */
public class KafkaOutMsg implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private long id;
    /**
	 * ������ 
	 */
	private long fwBh;
    /**
	 * ������ 0 ʧ�� 1 �ɹ� 
	 */
	private boolean dealFlag;
    /**
	 * ����ʱ�� 
	 */
	private Date gmtCreate;
    /**
	 * ����ʱ�� 
	 */
	private Date gmtUpdate;

	/**
	 * ����
	 */
	public KafkaOutMsg() {
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFwBh() {
		return fwBh;
	}

	public void setFwBh(long fwBh) {
		this.fwBh = fwBh;
	}
	public boolean getDealFlag() {
		return dealFlag;
	}

	public void setDealFlag(boolean dealFlag) {
		this.dealFlag = dealFlag;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtUpdate() {
		return gmtUpdate;
	}

	public void setGmtUpdate(Date gmtUpdate) {
		this.gmtUpdate = gmtUpdate;
	}

}