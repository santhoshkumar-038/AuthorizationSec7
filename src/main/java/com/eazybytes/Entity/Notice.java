package com.eazybytes.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notice_details")
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "notice_id")
	private int noticeId;
	
	@Column(name = "notice_summary")
	private String noticeSummary;
	
	@Column(name = "notice_details")
	private String noticeDetails;
	
	@Column(name = "notice_beg_dt")
	private Date noticeBegDt;
	
	@Column(name = "notice_end_dt")
	private Date noticeEndDt;
	
	@Column(name = "create_dt")
	private Date createDt;
	
	@Column(name = "update_dt")
	private Date updateDt;

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeSummary() {
		return noticeSummary;
	}

	public void setNoticeSummary(String noticeSummary) {
		this.noticeSummary = noticeSummary;
	}

	public String getNoticeDetails() {
		return noticeDetails;
	}

	public void setNoticeDetails(String noticeDetails) {
		this.noticeDetails = noticeDetails;
	}

	public Date getNoticeBegDt() {
		return noticeBegDt;
	}

	public void setNoticeBegDt(Date noticeBegDt) {
		this.noticeBegDt = noticeBegDt;
	}

	public Date getNoticeEndDt() {
		return noticeEndDt;
	}

	public void setNoticeEndDt(Date noticeEndDt) {
		this.noticeEndDt = noticeEndDt;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeSummary=" + noticeSummary + ", noticeDetails=" + noticeDetails
				+ ", noticeBegDt=" + noticeBegDt + ", noticeEndDt=" + noticeEndDt + ", createDt=" + createDt
				+ ", updateDt=" + updateDt + "]";
	}
	
}
