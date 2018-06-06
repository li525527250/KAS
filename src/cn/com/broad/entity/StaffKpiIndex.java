package cn.com.broad.entity;
/*
 * ĳһ��Ա��KPIָ������
 * */
public class StaffKpiIndex {
	private String staffName;// Ա������
	private String postName;// ��λ����
	private String moduleName;// ģ������
	private String kpiIndexName;// kpi����
	private String weight;// Ȩ��
	private String span;// ȡֵ��Χ
	private String indexDefinition;// ָ������
	private String dateSources;// ������Դ
	private String computationalFormula;// ���㹫ʽ
	private String annualObjectives;// ���Ŀ��
	private String quarterlyAccounting;// ���Ⱥ���
	private String currentTarget;// ����Ŀ��
	private String currentReality;// ����ʵ��
	private String currentYieldRate;// ���ڴ����
	private String currentScore;// ���ڵ÷�
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getKpiIndexName() {
		return kpiIndexName;
	}
	public void setKpiIndexName(String kpiIndexName) {
		this.kpiIndexName = kpiIndexName;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSpan() {
		return span;
	}
	public void setSpan(String span) {
		this.span = span;
	}
	public String getIndexDefinition() {
		return indexDefinition;
	}
	public void setIndexDefinition(String indexDefinition) {
		this.indexDefinition = indexDefinition;
	}
	public String getDateSources() {
		return dateSources;
	}
	public void setDateSources(String dateSources) {
		this.dateSources = dateSources;
	}
	public String getComputationalFormula() {
		return computationalFormula;
	}
	public void setComputationalFormula(String computationalFormula) {
		this.computationalFormula = computationalFormula;
	}
	public String getAnnualObjectives() {
		return annualObjectives;
	}
	public void setAnnualObjectives(String annualObjectives) {
		this.annualObjectives = annualObjectives;
	}
	public String getQuarterlyAccounting() {
		return quarterlyAccounting;
	}
	public void setQuarterlyAccounting(String quarterlyAccounting) {
		this.quarterlyAccounting = quarterlyAccounting;
	}
	public String getCurrentTarget() {
		return currentTarget;
	}
	public void setCurrentTarget(String currentTarget) {
		this.currentTarget = currentTarget;
	}
	public String getCurrentReality() {
		return currentReality;
	}
	public void setCurrentReality(String currentReality) {
		this.currentReality = currentReality;
	}
	public String getCurrentYieldRate() {
		return currentYieldRate;
	}
	public void setCurrentYieldRate(String currentYieldRate) {
		this.currentYieldRate = currentYieldRate;
	}
	public String getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(String currentScore) {
		this.currentScore = currentScore;
	}
	public StaffKpiIndex(String staffName, String postName, String moduleName, String kpiIndexName, String weight,
			String span, String indexDefinition, String dateSources, String computationalFormula,
			String annualObjectives, String quarterlyAccounting, String currentTarget, String currentReality,
			String currentYieldRate, String currentScore) {
		super();
		this.staffName = staffName;
		this.postName = postName;
		this.moduleName = moduleName;
		this.kpiIndexName = kpiIndexName;
		this.weight = weight;
		this.span = span;
		this.indexDefinition = indexDefinition;
		this.dateSources = dateSources;
		this.computationalFormula = computationalFormula;
		this.annualObjectives = annualObjectives;
		this.quarterlyAccounting = quarterlyAccounting;
		this.currentTarget = currentTarget;
		this.currentReality = currentReality;
		this.currentYieldRate = currentYieldRate;
		this.currentScore = currentScore;
	}
	public StaffKpiIndex() {
		super();
	}
	@Override
	public String toString() {
		return "StaffKpiIndex [staffName=" + staffName + ", postName=" + postName + ", moduleName=" + moduleName
				+ ", kpiIndexName=" + kpiIndexName + ", weight=" + weight + ", span=" + span + ", indexDefinition="
				+ indexDefinition + ", dateSources=" + dateSources + ", computationalFormula=" + computationalFormula
				+ ", annualObjectives=" + annualObjectives + ", quarterlyAccounting=" + quarterlyAccounting
				+ ", currentTarget=" + currentTarget + ", currentReality=" + currentReality + ", currentYieldRate="
				+ currentYieldRate + ", currentScore=" + currentScore + "]";
	}
	
}
