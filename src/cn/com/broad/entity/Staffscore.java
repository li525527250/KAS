package cn.com.broad.entity;
/*
 * Ա���÷ֱ�
 * */
public class Staffscore {
	private int staffScoreID;// Ա������ID
	private String staffJobNumber;// Ա������
	private int staffScore;// Ա������
	private String startDate;// Ա��������ѯ��ʼʱ��
	private String endDate;// Ա��������ѯ����ʱ��
	private int ifDelete;//�Ƿ�ɾ��0-��1-��  --------����

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
