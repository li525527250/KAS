package cn.com.broad.entity;
/*
 * 员工得分表
 * */
public class Staffscore {
	private int staffScoreID;// 员工分数ID
	private String staffJobNumber;// 员工工号
	private int staffScore;// 员工分数
	private String startDate;// 员工分数查询开始时间
	private String endDate;// 员工分数查询结束时间
	private int ifDelete;//是否删除0-否、1-是  --------新增

	public int getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(int ifDelete) {
		this.ifDelete = ifDelete;
	}

	public int getStaffScoreID() {
		return staffScoreID;
	}

	public void setStaffScoreID(int staffScoreID) {
		this.staffScoreID = staffScoreID;
	}

	public String getStaffJobNumber() {
		return staffJobNumber;
	}

	public void setStaffJobNumber(String staffJobNumber) {
		this.staffJobNumber = staffJobNumber;
	}

	public int getStaffScore() {
		return staffScore;
	}

	public void setStaffScore(int staffScore) {
		this.staffScore = staffScore;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Staffscore(int staffScoreID, String staffJobNumber, int staffScore, String startDate, String endDate,int ifdelete) {
		super();
		this.staffScoreID = staffScoreID;
		this.staffJobNumber = staffJobNumber;
		this.staffScore = staffScore;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ifDelete=ifdelete;
	}

	public Staffscore() {
		super();
	}

}
